package com.example.collegelog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import static com.example.collegelog.R.color.calculator;


public class Calculator extends AppCompatActivity {

    Button b1;
    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8,spinner9,spinner10,spinner11,spinner12,spinner13,spinner14,spinner15,spinner16,spinner17,spinner18,spinner19,spinner20;
    Window window;
    gpa_calculations calculations;
    int grad1=0,grad2=0,grad3=0,grad4=0,grad5=0,grad6=0,grad7=0,grad8=0,grad9=0,grad10=0;
    int cred1=0,cred2=0,cred3=0,cred4=0,cred5=0,cred6=0,cred7=0,cred8=0,cred9=0,cred10=0;
    int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,x7=0,x8=0,x9=0,x10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        window=this.getWindow();
        calculations=new gpa_calculations();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button) findViewById(R.id.button_one);
        if(Build.VERSION.SDK_INT>=21) {
            window.setStatusBarColor(this.getResources().getColor(calculator));
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        spinner1=(Spinner)findViewById(R.id.spinner_1);
        spinner2=(Spinner)findViewById(R.id.spinner_2);
        spinner3=(Spinner)findViewById(R.id.spinner_3);
        spinner4=(Spinner)findViewById(R.id.spinner_4);
        spinner5=(Spinner)findViewById(R.id.spinner_5);
        spinner6=(Spinner)findViewById(R.id.spinner_6);
        spinner7=(Spinner)findViewById(R.id.spinner_7);
        spinner8=(Spinner)findViewById(R.id.spinner_8);
        spinner9=(Spinner)findViewById(R.id.spinner_9);
        spinner10=(Spinner)findViewById(R.id.spinner_10);
        spinner11=(Spinner)findViewById(R.id.spinner_11);
        spinner12=(Spinner)findViewById(R.id.spinner_12);
        spinner13=(Spinner)findViewById(R.id.spinner_13);
        spinner14=(Spinner)findViewById(R.id.spinner_14);
        spinner15=(Spinner)findViewById(R.id.spinner_15);
        spinner16=(Spinner)findViewById(R.id.spinner_16);
        spinner17=(Spinner)findViewById(R.id.spinner_17);
        spinner18=(Spinner)findViewById(R.id.spinner_18);
        spinner19=(Spinner)findViewById(R.id.spinner_19);
        spinner20=(Spinner)findViewById(R.id.spinner_20);

        List<String> list1=new ArrayList<String>();
        list1.add(0,"GRADE");
        list1.add("S");
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");

        List<String> list2=new ArrayList<String>();
        list2.add(0,"CREDIT");
        list2.add("4");
        list2.add("3");
        list2.add("2");
        list2.add("1");

        ArrayAdapter<String> arrayAdapter_one=new ArrayAdapter<String>(this,R.layout.gpa_background,list1);
        arrayAdapter_one.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter_one);
        spinner3.setAdapter(arrayAdapter_one);
        spinner5.setAdapter(arrayAdapter_one);
        spinner7.setAdapter(arrayAdapter_one);
        spinner9.setAdapter(arrayAdapter_one);
        spinner11.setAdapter(arrayAdapter_one);
        spinner13.setAdapter(arrayAdapter_one);
        spinner15.setAdapter(arrayAdapter_one);
        spinner17.setAdapter(arrayAdapter_one);
        spinner19.setAdapter(arrayAdapter_one);

        ArrayAdapter<String> arrayAdapter_two=new ArrayAdapter<String>(this, R.layout.gpa_background,list2);
        arrayAdapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter_two);
        spinner4.setAdapter(arrayAdapter_two);
        spinner6.setAdapter(arrayAdapter_two);
        spinner8.setAdapter(arrayAdapter_two);
        spinner10.setAdapter(arrayAdapter_two);
        spinner12.setAdapter(arrayAdapter_two);
        spinner14.setAdapter(arrayAdapter_two);
        spinner16.setAdapter(arrayAdapter_two);
        spinner18.setAdapter(arrayAdapter_two);
        spinner20.setAdapter(arrayAdapter_two);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_1=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_1);
                grad1=calculations.getGradeValue();
                if(grad1!=0)
                    x1=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad1=0;
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_2=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_2);
                cred1=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred1=0;
            }

        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String item_3=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_3);
                grad2=calculations.getGradeValue();
                if(grad2!=0)
                    x2=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad2=0;
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String item_4=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_4);
                cred2=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred2=0;
            }

        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_5=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_5);
                grad3=calculations.getGradeValue();
                if(grad3!=0)
                    x3=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad3=0;
            }
        });
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String item_6=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_6);
                cred3=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred3=0;
            }

        });
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_7=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_7);
                grad4=calculations.getGradeValue();
                if(grad4!=0)
                    x4=1;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad4=0;
            }
        });
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_8=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_8);
                cred4=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred4=0;
            }

        });
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_9=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_9);
                grad5=calculations.getGradeValue();
                if(grad5!=0)
                    x5=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad5=0;
            }
        });
        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_10=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_10);
                cred5=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred5=0;
            }

        });
        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_11=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_11);
                grad6=calculations.getGradeValue();
                if(grad6!=0)
                    x6=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad6=0;
            }
        });
        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_12=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_12);
                cred6=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred6=0;
            }

        });
        spinner13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_13=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_13);
                grad7=calculations.getGradeValue();
                if(grad7!=0)
                    x7=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad7=0;
            }
        });
        spinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_14=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_14);
                cred7=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred7=0;
            }

        });
        spinner15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_15=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_15);
                grad8=calculations.getGradeValue();
                if(grad8!=0)
                    x8=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad8=0;
            }
        });
        spinner16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_16=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_16);
                cred8=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred8=0;
            }

        });
        spinner17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_17=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_17);
                grad9=calculations.getGradeValue();
                if(grad9!=0)
                    x9=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad9=0;
            }
        });
        spinner18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_18=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_18);
                cred9=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred9=0;
            }

        });
        spinner19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_19=adapterView.getItemAtPosition(position).toString();
                calculations.putGradeValue(item_19);
                grad10=calculations.getGradeValue();
                if(grad10!=0)
                    x10=1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                grad10=0;
            }
        });
        spinner20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item_20=adapterView.getItemAtPosition(position).toString();
                calculations.putCreditValue(item_20);
                cred10=calculations.getCreditValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                cred10=0;
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gpa=(grad1*cred1)+(grad2*cred2)+(grad3*cred3)+(grad4*cred4)+(grad5*cred5)+(grad6*cred6)+(grad7*cred7)+(grad8*cred8)+(grad9*cred9)+(grad10*cred10);
                int total=((cred1*x1)+(cred2*x2)+(cred3*x3)+(cred4*x4)+(cred5*x5)+(cred6*x6)+(cred7*x7)+(cred8*x8)+(cred9*x9)+(cred10*x10))*10;
                String msg="";
                if(total==0) {
                    msg="Please check the Input."+"\n"+"Input is Wrong!";
                }
                else {
                    double cgpa=(gpa*10.0)/total;
                    String s=String.format("%.2f",cgpa);
                    msg="GPA :  "+s;
                }
                final AlertDialog.Builder builder = new AlertDialog.Builder(Calculator.this);
                builder.setMessage("\n"+msg).setNegativeButton("CANCEL",null);
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("MESSAGE :");
                alertDialog.show();

            }
        });

    }
}