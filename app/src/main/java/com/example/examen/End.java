package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class End extends AppCompatActivity {
    private TextView info;
    private Button pedirpedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        info = (TextView) findViewById(R.id.info);

        String pizzas = getIntent().getStringExtra("PIZZAS");
        String drinks = getIntent().getStringExtra("DRINKS");
        String total = getIntent().getStringExtra("TOTAL");
        String username = getIntent().getStringExtra("USERNAME");

        info.setText(pizzas  +  drinks  +  total  +  username);

        pedirpedido=(Button)findViewById(R.id.pedirpedido);
        pedirpedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(End.this, Graciasporvenir.class);
                startActivity(intent);
            }
        });
        }

    }