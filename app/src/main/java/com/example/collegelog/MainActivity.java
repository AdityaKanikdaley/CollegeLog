package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;

import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Window window;
    Button button;
    ImageView calc, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        window=this.getWindow();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT>=21) {
            window.setStatusBarColor(this.getResources().getColor(R.color.timetable));
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        button = (Button)findViewById(R.id.timetableButton);
        calc = (ImageView)findViewById(R.id.calc_icon);
        about = (ImageView)findViewById(R.id.about_Icon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTimeTable = new Intent(MainActivity.this, timeTable_Main.class);
                startActivity(toTimeTable);
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCalc = new Intent(MainActivity.this, Calculator.class);
                startActivity(toCalc);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCalc = new Intent(MainActivity.this, about_page.class);
                startActivity(toCalc);
            }
        });
    }
}