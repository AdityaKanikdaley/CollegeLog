package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class Result_page extends AppCompatActivity {

    TextView tv;
    Typeface face;

    Button Save_btn, load_btn, calc_btn;
    EditText e1,e2;
    ListView lv;
    DBHelper_Result db;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        window=this.getWindow();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        if(Build.VERSION.SDK_INT>=21) {
            window.setStatusBarColor(this.getResources().getColor(R.color.timetable));
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Save_btn=findViewById(R.id.button);
        load_btn=findViewById(R.id.button2);
//        calc_btn=findViewById(R.id.button3);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        lv=findViewById(R.id.list);

        tv = findViewById(R.id.result_1);
        face = Typeface.createFromAsset(this.getAssets(), "fonts/SEASRN__.ttf");
        tv.setTypeface(face);

        db=new DBHelper_Result(this);

        Save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Result result;
                String subject;
                String grade;

                subject=e1.getText().toString();
                grade=e2.getText().toString();

                if(subject.isEmpty() || grade.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Input is Blank! Check Again", Toast.LENGTH_LONG).show();
                }
                else {
                    boolean isInserted=db.addone(subject,grade);
                    if(isInserted = true) {
                        Toast.makeText(getApplicationContext(),"Data Inserted Successfully", Toast.LENGTH_LONG).show();
                        e1.setText("");
                        e2.setText("");
                    }
                }

                //DataBaseHelper dataBaseHelper=new DataBaseHelper(MainActivity.this);
                //dataBaseHelper.addone(result);

            }
        });

        load_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DataBaseHelper dataBaseHelper=new DataBaseHelper(MainActivity.this);

                List<String> everyone= db.getSubject();


                ArrayAdapter resultArray=new ArrayAdapter<String>(Result_page.this, R.layout.list_layout, R.id.text1 ,everyone);
                lv.setAdapter(resultArray);

            }
        });




    }
}