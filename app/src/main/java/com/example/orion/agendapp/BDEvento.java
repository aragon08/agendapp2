package com.example.orion.agendapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Orion on 11/04/2017.
 */

public class BDEvento extends SQLiteOpenHelper {

    String SQL1="create table evento(idevent int primary key autoincrement, evento varchar(80),fecha TEXT, hora TEXT,descripcion varchar(113),nombre varchar(30),telefono char(15))";

    public BDEvento(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
