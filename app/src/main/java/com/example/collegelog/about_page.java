package com.example.collegelog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class about_page extends AppCompatActivity {

    TextView heading1, heading2, content1, content2;
    Typeface about, usage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        heading1 = findViewById(R.id.about);
        heading2 = findViewById(R.id.usage);
        content1 = findViewById(R.id.roles);
        content2 = findViewById(R.id.using);

        about = Typeface.createFromAsset(this.getAssets(), "fonts/Amatic-Bold.ttf");
        usage = Typeface.createFromAsset(this.getAssets(), "fonts/KaushanScript-Regular.otf");

        heading1.setTypeface(about);
        heading2.setTypeface(about);
        content1.setTypeface(usage);
        content2.setTypeface(usage);

    }
}