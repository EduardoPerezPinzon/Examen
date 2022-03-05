package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private TextView welcome;
    private ImageView buttonPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome = (TextView)findViewById(R.id.welcome);
        buttonPizza = (ImageView)findViewById(R.id.buttonPizza);

        String username = getIntent().getStringExtra("USERNAME");
        String message = "Hola estimado " + username + " ¿Qué te podemos llevar hasta tu casa este día?. Por favor selecciona:";
        welcome.setText(message);

        buttonPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Pizzas.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}