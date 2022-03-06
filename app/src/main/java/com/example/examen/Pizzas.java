package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizzas extends AppCompatActivity {
    private ImageView button1Add;
    private ImageView button2Add;
    private ImageView button3Add;
    private ImageView button4Add;
    private ImageView button5Add;
    private ImageView button1Remove;
    private ImageView button2Remove;
    private ImageView button3Remove;
    private ImageView button4Remove;
    private ImageView button5Remove;
    private TextView price1;
    private TextView price2;
    private TextView price3;
    private TextView price4;
    private TextView price5;
    private TextView total;
    private TextView total1;
    private TextView total2;
    private TextView total3;
    private TextView total4;
    private TextView total5;
    private Button buttonFinish;


    public void calculateTotal() {
        price1 = (TextView) findViewById(R.id.price1);
        price2 = (TextView) findViewById(R.id.price2);
        price3 = (TextView) findViewById(R.id.price3);
        price4 = (TextView) findViewById(R.id.price4);
        price5 = (TextView) findViewById(R.id.price5);

        total = (TextView) findViewById(R.id.total);
        total1 = (TextView) findViewById(R.id.total1);
        total2 = (TextView) findViewById(R.id.total2);
        total3 = (TextView) findViewById(R.id.total3);
        total4 = (TextView) findViewById(R.id.total4);
        total5 = (TextView) findViewById(R.id.total5);

        buttonFinish = (Button) findViewById(R.id.buttonFinish);

        Integer p1 = Integer.parseInt(price1.getText().toString());
        Integer t1 = Integer.parseInt(total1.getText().toString());

        Integer p2 = Integer.parseInt(price2.getText().toString());
        Integer t2 = Integer.parseInt(total2.getText().toString());

        Integer p3 = Integer.parseInt(price3.getText().toString());
        Integer t3 = Integer.parseInt(total3.getText().toString());

        Integer p4 = Integer.parseInt(price4.getText().toString());
        Integer t4 = Integer.parseInt(total4.getText().toString());

        Integer p5 = Integer.parseInt(price5.getText().toString());
        Integer t5 = Integer.parseInt(total5.getText().toString());

        Integer totalAmount = (p1 * t1) + (p2 * t2) + (p3 * t3) + (p4 * t4) + (p5 * t5);

        if (totalAmount == 0) {
            buttonFinish.setEnabled(false);
        } else {
            buttonFinish.setEnabled(true);
        }

        total.setText(String.valueOf(totalAmount));
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzas);

        button1Add = (ImageView) findViewById(R.id.button1Add);
        button2Add = (ImageView) findViewById(R.id.button2Add);
        button3Add = (ImageView) findViewById(R.id.button3Add);
        button4Add = (ImageView) findViewById(R.id.button4Add);
        button5Add = (ImageView) findViewById(R.id.button5Add);
        button1Remove = (ImageView) findViewById(R.id.button1Remove);
        button2Remove = (ImageView) findViewById(R.id.button2Remove);
        button3Remove = (ImageView) findViewById(R.id.button3Remove);
        button4Remove = (ImageView) findViewById(R.id.button4Remove);
        button5Remove = (ImageView) findViewById(R.id.button5Remove);

        price1 = (TextView) findViewById(R.id.price1);
        price2 = (TextView) findViewById(R.id.price2);
        price3 = (TextView) findViewById(R.id.price3);
        price4 = (TextView) findViewById(R.id.price4);
        price5 = (TextView) findViewById(R.id.price5);

        total = (TextView) findViewById(R.id.total);
        total1 = (TextView) findViewById(R.id.total1);
        total2 = (TextView) findViewById(R.id.total2);
        total3 = (TextView) findViewById(R.id.total3);
        total4 = (TextView) findViewById(R.id.total4);
        total5 = (TextView) findViewById(R.id.total5);


        buttonFinish = (Button) findViewById(R.id.buttonFinish);
        ArrayList<String> selectedPizzas = new ArrayList<String>();
        ArrayList<String> selectedDrinks = new ArrayList<String>();
        buttonFinish.setEnabled(false);

        button1Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer amount = Integer.parseInt(total1.getText().toString());
                amount++;
                total1.setText(String.valueOf(amount));
                calculateTotal();
                selectedPizzas.add("Pastor");
            }
        });

        button2Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total2.getText().toString());
                amount++;
                total2.setText(String.valueOf(amount));
                calculateTotal();
                selectedPizzas.add("Hawaiana");
            }
        });

        button3Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total3.getText().toString());
                amount++;
                total3.setText(String.valueOf(amount));
                calculateTotal();
                selectedPizzas.add("Pepperoni");
            }
        });

        button4Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total4.getText().toString());
                amount++;
                total4.setText(String.valueOf(amount));
                calculateTotal();
                selectedDrinks.add("Coca Cola");
            }
        });

        button5Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total5.getText().toString());
                amount++;
                total5.setText(String.valueOf(amount));
                calculateTotal();
                selectedDrinks.add("Fanta");
            }
        });

        button1Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total1.getText().toString());
                amount--;
                if (amount >= 0) {
                    total1.setText(String.valueOf(amount));
                    calculateTotal();
                    selectedPizzas.remove("Pastor");
                }
            }
        });

        button2Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total2.getText().toString());
                amount--;
                if (amount >= 0) {
                    total2.setText(String.valueOf(amount));
                    calculateTotal();
                    selectedPizzas.remove("Hawaiana");
                }
            }
        });

        button3Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total3.getText().toString());
                amount--;
                if (amount >= 0) {
                    total3.setText(String.valueOf(amount));
                    calculateTotal();
                    selectedPizzas.remove("Pepperoni");
                }
            }
        });

        button4Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total4.getText().toString());
                amount--;
                if (amount >= 0) {
                    total4.setText(String.valueOf(amount));
                    calculateTotal();
                    selectedDrinks.remove("Coca Cola");
                }
            }
        });

        button5Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer amount = Integer.parseInt(total5.getText().toString());
                amount--;
                if (amount >= 0) {
                    total5.setText(String.valueOf(amount));
                    calculateTotal();
                    selectedDrinks.remove("Fanta");
                }
            }
        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = getIntent().getStringExtra("USERNAME");

                Intent intent = new Intent(Pizzas.this, End.class);
                intent.putExtra("PIZZAS", TextUtils.join(", ", selectedPizzas));
                intent.putExtra("DRINKS", TextUtils.join(",", selectedDrinks));
                intent.putExtra("TOTAL", total.getText().toString());
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}