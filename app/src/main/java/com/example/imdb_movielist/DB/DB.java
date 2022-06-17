package com.example.imdb_movielist.DB;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.imdb_movielist.Entity.MovieResult;

import java.util.ArrayList;

public class DB extends SQLiteOpenHelper {

    private final static String databaseName = "MovieDB";
    private final static int databaseVersion = 1;
    private String MOVIE_TABLE = "movies";
    private static DB dbInstance = null;


    private DB(Context context)
    {
        super(context,databaseName,null,databaseVersion);
    }

    public synchronized static DB getInstance(Context context)
    {
        if(dbInstance == null)
        {
            dbInstance = new DB(context.getApplicationContext());
        }

        return dbInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
      /*  String createQuery = "CREATE TABLE " + MOVIE_TABLE + " ("
                + " ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " searchType TEXT,"
                + " expression TEXT,"
                + " resultType TEXT,"
                + " image TEXT,"
                + " title TEXT,"
                + " description TEXT,"
                + " )";*/

     //   sqLiteDatabase.execSQL(createQuery);
    }



    public ArrayList<MovieResult> getWeatherList()
    {
        ArrayList<MovieResult> movieArrayList = new ArrayList<MovieResult>();

        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query(MOVIE_TABLE,null,null,null,null,null,null);

        if(cursor.moveToFirst())
        {
            do {

            }
            while(cursor.moveToNext());
        }
        sqLiteDatabase.close();
        return movieArrayList;
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

}
