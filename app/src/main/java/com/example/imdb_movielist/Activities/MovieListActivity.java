package com.example.imdb_movielist.Activities;


import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.util.Log;

import com.example.imdb_movielist.Adapter.MovieResultAdapter;
import com.example.imdb_movielist.Entity.MovieResult;
import com.example.imdb_movielist.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MovieListActivity extends AppCompatActivity {


    private RecyclerView movie_list_recyclerview;
    private String movie_name="inception";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        movie_list_recyclerview = findViewById(R.id.movie_list_recyclerview);


        Bundle bundle = getIntent().getExtras();

        movie_name = "";

        if(bundle != null)
        {
            movie_name = bundle.getString("movie_name");
        }

        getMovieListFromNetwork(movie_name);

    }

    private void getMovieListFromNetwork(String cityName)
    {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://imdb-api.com/en/API/SearchMovie/k_ule4ey2l/"
                +movie_name)
                .method("GET", body)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.d(TAG, "onFailure:");
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if(response.isSuccessful())
                {
                    final String responseBody = response.body().string();
                   MovieResult  movieResult = new Gson().fromJson(responseBody, MovieResult.class);





                    Log.d(TAG, "onResponse: ");
                }
            }
        });
    }

    private void setAdapterRecyclerView(List<MovieResult> resultList)
    {
        MovieResultAdapter adapter = new MovieResultAdapter(resultList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        movie_list_recyclerview.setLayoutManager(mLayoutManager);
        movie_list_recyclerview.setAdapter(adapter);

    }



}