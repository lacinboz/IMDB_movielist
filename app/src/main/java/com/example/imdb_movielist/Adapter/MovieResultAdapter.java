package com.example.imdb_movielist.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdb_movielist.Entity.MovieResult;


import java.util.List;

public class MovieResultAdapter extends RecyclerView.Adapter<MovieResultAdapter.ViewHolder> {

    private List<MovieResult> movieResultList;
    private MovieResult result;

    public MovieResultAdapter(List<MovieResult> movieResultList) {
        this.movieResultList = movieResultList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        result = movieResultList.get(position);



    }



    @Override
    public int getItemCount() {
        return movieResultList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {



        public ViewHolder(View v) {
            super(v);

        }
    }

}
