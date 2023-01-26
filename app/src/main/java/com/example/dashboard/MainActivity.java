package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void help(View view)
    {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);

    }
    public void risk(View view)
    {
        Intent intent = new Intent(this, riskassessment.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}