package com.example.imdb_movielist.Activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdb_movielist.R;

public class MainActivity extends Activity {
    SearchView search_view;
    RecyclerView movie_list_recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_view =findViewById(R.id.search_view);
        movie_list_recyclerview=findViewById(R.id.movie_list_recyclerview);

    }




}