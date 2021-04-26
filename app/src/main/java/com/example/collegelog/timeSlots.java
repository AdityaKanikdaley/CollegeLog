package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;

public class timeSlots extends AppCompatActivity {

    TextView tv;
    Typeface face;

    Window window;
    DatabaseHelper mydDb;
    TextView A11,B11,C11,A21,E13,B21,C21,D11,E11,F11,D21,C23,E21,F21;
    TextView A12,B12,C12,A22,F13,B22,C22,D12,E12,F12,D22,B23,E22,F22;
    TextView A13,B13,C13,A23,D13,E23,D23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_slots);
        window=this.getWindow();
        if(Build.VERSION.SDK_INT>=21) {
            window.setStatusBarColor(this.getResources().getColor(R.color.timetable));
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        tv = findViewById(R.id.timetable);
        face = Typeface.createFromAsset(this.getAssets(), "fonts/SEASRN__.ttf");
        tv.setTypeface(face);

        A11=(TextView) findViewById(R.id.A11);
        B11=(TextView) findViewById(R.id.B11);
        C11=(TextView) findViewById(R.id.C11);
        A21=(TextView) findViewById(R.id.A21);
        E13=(TextView) findViewById(R.id.E13);
        B21=(TextView) findViewById(R.id.B21);
        C21=(TextView) findViewById(R.id.C21);
        D11=(TextView) findViewById(R.id.D11);
        E11=(TextView) findViewById(R.id.E11);
        F11=(TextView) findViewById(R.id.F11);
        D21=(TextView) findViewById(R.id.D21);
        C23=(TextView) findViewById(R.id.C23);
        E21=(TextView) findViewById(R.id.E21);
        F21=(TextView) findViewById(R.id.F21);
        A12=(TextView) findViewById(R.id.A12);
        B12=(TextView) findViewById(R.id.B12);
        C12=(TextView) findViewById(R.id.C12);
        A22=(TextView) findViewById(R.id.A22);
        F13=(TextView) findViewById(R.id.F13);
        B22=(TextView) findViewById(R.id.B22);
        C22=(TextView) findViewById(R.id.C22);
        D12=(TextView) findViewById(R.id.D12);
        E12=(TextView) findViewById(R.id.E12);
        F12=(TextView) findViewById(R.id.F12);
        D22=(TextView) findViewById(R.id.D22);
        B23=(TextView) findViewById(R.id.B23);
        E22=(TextView) findViewById(R.id.E22);
        F22=(TextView) findViewById(R.id.F22);
        A13=(TextView) findViewById(R.id.A13);
        B13=(TextView) findViewById(R.id.B13);
        C13=(TextView) findViewById(R.id.C13);
        A23=(TextView) findViewById(R.id.A23);
        D13=(TextView) findViewById(R.id.D13);
        E23=(TextView) findViewById(R.id.E23);
        D23=(TextView) findViewById(R.id.D23);

        mydDb=new DatabaseHelper(this);
        ArrayList<String> course_list=new ArrayList<String>();
        course_list=mydDb.getCourse_list();
        ArrayList<String> first_slot_name=new ArrayList<String>();
        first_slot_name=mydDb.getFirst_slot_name_list();
        ArrayList<String> first_slot_day=new ArrayList<String>();
        first_slot_day=mydDb.getFirst_slot_day_list();
        ArrayList<String> first_slot_time=new ArrayList<String>();
        first_slot_time=mydDb.getFirst_slot_time_list();
        ArrayList<String> second_slot_name=new ArrayList<String>();
        second_slot_name=mydDb.getSecond_slot_name_list();
        ArrayList<String> second_slot_day=new ArrayList<String>();
        second_slot_day=mydDb.getSecond_slot_day_list();
        ArrayList<String> second_slot_time=new ArrayList<String>();
        second_slot_time=mydDb.getSecond_slot_time_list();
        ArrayList<String> third_slot_name=new ArrayList<String>();
        third_slot_name=mydDb.getThird_slot_name_list();
        ArrayList<String> third_slot_day=new ArrayList<String>();
        third_slot_day=mydDb.getThird_slot_day_list();
        ArrayList<String> third_slot_time=new ArrayList<String>();
        third_slot_time=mydDb.getThird_slot_time_list();

        for (int i=0;i<course_list.size();i++) {

            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("8:30-10:00")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A11.setText(z);
                A11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("13:15-14:45")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A21.setText(z);
                A21.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("10:05-11:35")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B11.setText(z);
                B11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("16:25-17:55")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B21.setText(z);
                B21.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("11:40-13:10")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C11.setText(z);
                C11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("MONDAY") && first_slot_time.get(i).equalsIgnoreCase("18:00-19:30")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C21.setText(z);
                C21.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("8:30-10:00")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D11.setText(z);
                D11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("13:15-14:45")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D21.setText(z);
                D21.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("10:05-11:35")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E11.setText(z);
                E11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("16:25-17:55")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E21.setText(z);
                E21.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("11:40-13:10")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                F11.setText(z);
                F11.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(first_slot_day.get(i).equalsIgnoreCase("TUESDAY") && first_slot_time.get(i).equalsIgnoreCase("18:00-19:30")) {
                String x=first_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                F21.setText(z);
                F21.setBackgroundColor(Color.parseColor("#87E115"));
            }
        }

        for (int i=0;i<course_list.size();i++) {

            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("8:30-10:00")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A12.setText(z);
                A12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("13:15-14:45")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A22.setText(z);
                A22.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("10:05-11:35")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B12.setText(z);
                B12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("16:25-17:55")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B22.setText(z);
                B22.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("11:40-13:10")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C12.setText(z);
                C12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && second_slot_time.get(i).equalsIgnoreCase("18:00-19:30")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C22.setText(z);
                C22.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("8:30-10:00")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D12.setText(z);
                D12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("13:15-14:45")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D22.setText(z);
                D22.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("10:05-11:35")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E12.setText(z);
                E12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("16:25-17:55")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E22.setText(z);
                E22.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("11:40-13:10")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                F12.setText(z);
                F12.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(second_slot_day.get(i).equalsIgnoreCase("THURSDAY") && second_slot_time.get(i).equalsIgnoreCase("18:00-19:30")) {
                String x=second_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                F22.setText(z);
                F22.setBackgroundColor(Color.parseColor("#87E115"));
            }
        }

        for (int i=0;i<course_list.size();i++) {

            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("8:30-10:00")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A13.setText(z);
                A13.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("13:15-14:45")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                A23.setText(z);
                A23.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("10:05-11:35")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B13.setText(z);
                B13.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("THURSDAY") && third_slot_time.get(i).equalsIgnoreCase("14:50-16:20")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                B23.setText(z);
                B23.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("11:40-13:10")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C13.setText(z);
                C13.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("TUESDAY") && third_slot_time.get(i).equalsIgnoreCase("14:50-16:20")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                C23.setText(z);
                C23.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("14:50-16:20")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D13.setText(z);
                D13.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("18:00-19:30")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                D23.setText(z);
                D23.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("MONDAY") && third_slot_time.get(i).equalsIgnoreCase("14:50-16:20")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E13.setText(z);
                E13.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("FRIDAY") && third_slot_time.get(i).equalsIgnoreCase("16:25-17:55")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                E23.setText(z);
                E23.setBackgroundColor(Color.parseColor("#87E115"));
            }
            if(third_slot_day.get(i).equalsIgnoreCase("WEDNESDAY") && third_slot_time.get(i).equalsIgnoreCase("14:50-16:20")) {
                String x=third_slot_name.get(i);
                String y=course_list.get(i);
                String z=x+" - "+y;
                F13.setText(z);
                F13.setBackgroundColor(Color.parseColor("#87E115"));
            }
        }

    }
}