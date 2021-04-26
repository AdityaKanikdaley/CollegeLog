package com.example.collegelog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper_Result extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "subjectrecords.db";
    private static final String TABLE_NAME = "result";
    //private static final String COL_1 = "sno";
    private static final String COL_1 = "Subject";
    private static final String COL_2 = "Grade";

    public DBHelper_Result(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // String Query="CREATE TABLE "+ TABLE_NAME+ "(" +COL_1 +" INT PRIMARY KEY AUTOINCREMENT, "+COL_2+" TEXT,"+COL_3+" TEXT)";
        String Query="CREATE TABLE "+ TABLE_NAME+ "(Subject TEXT, Grade TEXT)";

        db.execSQL(Query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);

    }


    public boolean addone(String Subject, String Grade) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();

        cv.put(COL_1,Subject);
        cv.put(COL_2,Grade);

        long insert = db.insert(TABLE_NAME, null, cv);
        if (insert == -1){
            return false;
        }
        else{
            return true;
        }
    }
    public List<String> getSubject(){
        List<String> returnList=new ArrayList<String>();
        String queryString="SELECT * FROM "+TABLE_NAME;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString,null);

        while(cursor.moveToNext()){
            String subjectname=cursor.getString(0);
            String grade=cursor.getString(1);
            String z;
            z = "\n" + subjectname + "   -   " + grade + "\n";
            returnList.add(z);
        }


        return returnList;
    }/*public List<String> getGrade(){
        List<String> returnList=new ArrayList<String>();
        String queryString="SELECT * FROM "+TABLE_NAME;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString,null);

        while(cursor.moveToNext()){
            String Grade=cursor.getString(1);
            returnList.add(Grade);
        }

        return returnList;
    }*/
}



