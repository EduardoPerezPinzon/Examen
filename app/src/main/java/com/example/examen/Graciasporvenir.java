package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Graciasporvenir extends AppCompatActivity {
    private Button salirapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_graciasporvenir);
        salirapp=(Button)findViewById(R.id.salirapp);
        salirapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Graciasporvenir.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Has salido de la sesion", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}