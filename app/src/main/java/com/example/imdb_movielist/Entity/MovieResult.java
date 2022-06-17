package com.example.imdb_movielist.Entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MovieResult {
    String searchType;
    String expression;
    List<MovieArrayObject>  results=null;

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public List<MovieArrayObject> getResults() {
        return results;
    }

    public void setResults(List<MovieArrayObject> results) {
        this.results = results;
    }


}