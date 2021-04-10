package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class timeTable_Main extends AppCompatActivity {

    Window window;
    Spinner spinner1,spinner2,spinner3;
    Calculations calculations;
    String slot_one,slot_two,slot_three;
    String item_1,item_2,item_3;
    String day_one,day_two,day_three;
    Button button1,button2;
    DatabaseHelper mydDb;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        window=this.getWindow();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table__main);
        if(Build.VERSION.SDK_INT>=21) {
            window.setStatusBarColor(this.getResources().getColor(R.color.timetable));
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        calculations=new Calculations();
        mydDb=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.edit1);
        spinner1=(Spinner)findViewById(R.id.spinner_1);
        spinner2=(Spinner)findViewById(R.id.spinner_2);
        spinner3=(Spinner)findViewById(R.id.spinner_3);
        button1=(Button)findViewById(R.id.button_one);
        button2=(Button)findViewById(R.id.button_two);

        List<String> list1=new ArrayList<String>();
        list1.add(0,"SLOTS");
        list1.add("A11");
        list1.add("A21");
        list1.add("B11");
        list1.add("B21");
        list1.add("C11");
        list1.add("C21");
        list1.add("D11");
        list1.add("D21");
        list1.add("E11");
        list1.add("E21");
        list1.add("F11");
        list1.add("F21");

        List<String> list2=new ArrayList<String>();
        list2.add(0,"SLOTS");
        list2.add("A12");
        list2.add("A22");
        list2.add("B12");
        list2.add("B22");
        list2.add("C12");
        list2.add("C22");
        list2.add("D12");
        list2.add("D22");
        list2.add("E12");
        list2.add("E22");
        list2.add("F12");
        list2.add("F22");

        List<String> list3=new ArrayList<String>();
        list3.add(0,"SLOTS");
        list3.add("A13");
        list3.add("A23");
        list3.add("B13");
        list3.add("B23");
        list3.add("C13");
        list3.add("C23");
        list3.add("D13");
        list3.add("D23");
        list3.add("E13");
        list3.add("E23");
        list3.add("F13");

        ArrayAdapter<String> arrayAdapter_one=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list1);
        arrayAdapter_one.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter_one);

        ArrayAdapter<String> arrayAdapter_two=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list2);
        arrayAdapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter_two);

        ArrayAdapter<String> arrayAdapter_three=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list3);
        arrayAdapter_three.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter_three);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                item_1=adapterView.getItemAtPosition(position).toString();
                calculations.putTimetableValue(item_1);
                slot_one=calculations.getTime();
                day_one=calculations.getWeekday();
                if(item_1.equalsIgnoreCase("SLOTS")) {
                    item_1="";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                item_2=adapterView.getItemAtPosition(position).toString();
                calculations.putTimetableValue(item_2);
                slot_two=calculations.getTime();
                day_two=calculations.getWeekday();
                if(item_2.equalsIgnoreCase("SLOTS")) {
                    item_2="";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                item_3=adapterView.getItemAtPosition(position).toString();
                calculations.putTimetableValue(item_3);
                slot_three=calculations.getTime();
                day_three=calculations.getWeekday();
                if(item_3.equalsIgnoreCase("SLOTS")) {
                    item_3="";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String course_name;
                course_name=e1.getText().toString();
                if(course_name.isEmpty() || (slot_one.isEmpty() && slot_two.isEmpty() && slot_three.isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Input is Blank! Check Again", Toast.LENGTH_LONG).show();
                }
                else {
                    boolean isInserted=mydDb.insertData(course_name,item_1,day_one,slot_one,item_2,day_two,slot_two,item_3,day_three,slot_three);
                    if(isInserted = true) {
                        Toast.makeText(getApplicationContext(),"Data Inserted Successfully", Toast.LENGTH_LONG).show();
                        e1.setText("");
                    }
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(timeTable_Main.this, timeSlots.class);
                startActivity(i1);
            }
        });
    }
}