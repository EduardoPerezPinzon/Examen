package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private Button buttonLogin;
    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin=(Button)findViewById(R.id.buttonLogin);
        user = (EditText)findViewById(R.id.user);

        buttonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Home.class);
                intent.putExtra("USERNAME", user.getText().toString());
                startActivity(intent);
                // startActivity(new Intent(Login.this, Home.class));
            }
        });
    }
}