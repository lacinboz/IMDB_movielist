package com.example.imdb_movielist.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.imdb_movielist.Entity.MovieResult;
import com.example.imdb_movielist.R;

public class MovieDetailActivity extends AppCompatActivity {

    private MovieResult result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);



        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            result = bundle.getParcelable("result");


        }







    }


}