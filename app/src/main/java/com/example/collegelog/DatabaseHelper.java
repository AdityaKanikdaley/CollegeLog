package com.example.collegelog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper{

    ArrayList<String> course_list=new ArrayList<String>();
    ArrayList<String> first_slot_name_list=new ArrayList<String>();
    ArrayList<String> first_slot_day_list=new ArrayList<String>();
    ArrayList<String> first_slot_time_list=new ArrayList<String>();
    ArrayList<String> second_slot_name_list=new ArrayList<String>();
    ArrayList<String> second_slot_day_list=new ArrayList<String>();
    ArrayList<String> second_slot_time_list=new ArrayList<String>();
    ArrayList<String> third_slot_name_list=new ArrayList<String>();
    ArrayList<String> third_slot_day_list=new ArrayList<String>();
    ArrayList<String> third_slot_time_list=new ArrayList<String>();

    private static final String DATABASE_NAME = "studentrecords.db";
    private static final String TABLE_NAME = "timetable";
    private static final String COL_1 = "course";
    private static final String COL_2 = "first_slot_name";
    private static final String COL_3 = "first_slot_day";
    private static final String COL_4 = "first_slot_time";
    private static final String COL_5 = "second_slot_name";
    private static final String COL_6 = "second_slot_day";
    private static final String COL_7 = "second_slot_time";
    private static final String COL_8 = "third_slot_name";
    private static final String COL_9 = "third_slot_day";
    private static final String COL_10 = "third_slot_time";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (course TEXT, first_slot_name TEXT, first_slot_day TEXT, first_slot_time TEXT, second_slot_name TEXT, second_slot_day TEXT, second_slot_time TEXT, third_slot_name TEXT, third_slot_day TEXT, third_slot_time TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData(String course, String first_slot_name, String first_slot_day, String first_slot_time, String second_slot_name, String second_slot_day, String second_slot_time, String third_slot_name, String third_slot_day, String third_slot_time) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,course);
        contentValues.put(COL_2,first_slot_name);
        contentValues.put(COL_3,first_slot_day);
        contentValues.put(COL_4,first_slot_time);
        contentValues.put(COL_5,second_slot_name);
        contentValues.put(COL_6,second_slot_day);
        contentValues.put(COL_7,second_slot_time);
        contentValues.put(COL_8,third_slot_name);
        contentValues.put(COL_9,third_slot_day);
        contentValues.put(COL_10,third_slot_time);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public ArrayList<String> getCourse_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(0);
            course_list.add(a);
        }
        return course_list;
    }
    public ArrayList<String> getFirst_slot_name_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(1);
            first_slot_name_list.add(a);
        }
        return first_slot_name_list;
    }
    public ArrayList<String> getFirst_slot_day_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(2);
            first_slot_day_list.add(a);
        }
        return first_slot_day_list;
    }
    public ArrayList<String> getFirst_slot_time_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(3);
            first_slot_time_list.add(a);
        }
        return first_slot_time_list;
    }
    public ArrayList<String> getSecond_slot_name_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(4);
            second_slot_name_list.add(a);
        }
        return second_slot_name_list;
    }
    public ArrayList<String> getSecond_slot_day_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(5);
            second_slot_day_list.add(a);
        }
        return second_slot_day_list;
    }
    public ArrayList<String> getSecond_slot_time_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(6);
            second_slot_time_list.add(a);
        }
        return second_slot_time_list;
    }
    public ArrayList<String> getThird_slot_name_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(7);
            third_slot_name_list.add(a);
        }
        return third_slot_name_list;
    }
    public ArrayList<String> getThird_slot_day_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(8);
            third_slot_day_list.add(a);
        }
        return third_slot_day_list;
    }
    public ArrayList<String> getThird_slot_time_list() {
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String a=cursor.getString(9);
            third_slot_time_list.add(a);
        }
        return third_slot_time_list;
    }
    /*public boolean deleteData (String id) {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_NAME, "RegNo = ?", new String[]{id}) > 0;
    }*/
}
