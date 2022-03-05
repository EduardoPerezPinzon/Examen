package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class End extends AppCompatActivity {
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        info = (TextView) findViewById(R.id.info);

        String pizzas = getIntent().getStringExtra("PIZZAS");
        String drinks = getIntent().getStringExtra("DRINKS");
        String total = getIntent().getStringExtra("TOTAL");
        String username = getIntent().getStringExtra("USERNAME");

        info.setText(pizzas + drinks + total + username);
    }
}