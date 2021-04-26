package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView CollegeLog;
    Typeface face;
    Window window;
    Button button;
    ImageView calc, about;
    EditText e1,e2,e3;
    Button save;
    Button result;
    SavedButtonDB mydb;
    String getname="",getreg="",getbranch="";

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
        mydb=new SavedButtonDB(this);
        button = (Button)findViewById(R.id.timetableButton);
        save=(Button)findViewById(R.id.save);
        result=(Button)findViewById(R.id.resultButton);
        calc = (ImageView)findViewById(R.id.calc_icon);
        about = (ImageView)findViewById(R.id.about_Icon);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.registration);
        e3=(EditText)findViewById(R.id.branch);

        CollegeLog = findViewById(R.id.about);
        face = Typeface.createFromAsset(this.getAssets(), "fonts/KaushanScript-Regular.otf");
        CollegeLog.setTypeface(face);

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

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toresult = new Intent(MainActivity.this, Result_page.class);
                startActivity(toresult);
            }
        });


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name,reg,branch;

                name=e1.getText().toString();
                reg=e2.getText().toString();
                branch=e3.getText().toString();

                if(name.isEmpty() || reg.isEmpty() || branch.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Input is Blank! Check Again", Toast.LENGTH_LONG).show();
                }
                else {
                    boolean isInserted=mydb.insertData(name,reg,branch);
                    if(isInserted = true) {
                        Toast.makeText(getApplicationContext(),"Saved", Toast.LENGTH_LONG).show();
                    }

                }

            }
        });

        getname=mydb.getStname();
        getreg=mydb.getStreg();
        getbranch=mydb.getStbranch();

        if (getname.isEmpty() || getreg.isEmpty() || getbranch.isEmpty()) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
        }
        else {
            e1.setText(getname);
            e2.setText(getreg);
            e3.setText(getbranch);
        }
    }
}