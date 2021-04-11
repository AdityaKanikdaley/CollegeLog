package com.example.collegelog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import androidx.annotation.Nullable;

public class SavedButtonDB extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "studentinfo.db";
    private static final String TABLE_NAME = "details";
    private static final String COL_1 = "name";
    private static final String COL_2 = "reg";
    private static final String COL_3 = "branch";

    public SavedButtonDB(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (name TEXT,reg TEXT,branch TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData(String name,String reg,String branch) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,name);
        contentValues.put(COL_2,reg);
        contentValues.put(COL_3,branch);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public String getStname() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        String x="";
        while (cursor.moveToNext()) {
            x=cursor.getString(0);
        }
        return x;
    }

    public String getStreg() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        String x="";
        while (cursor.moveToNext()) {
            x=cursor.getString(1);
        }
        return x;
    }

    public String getStbranch() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        String x="";
        while (cursor.moveToNext()) {
            x=cursor.getString(2);
        }
        return x;
    }
}
