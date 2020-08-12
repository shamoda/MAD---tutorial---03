package com.app.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1, num2, answer;
    float  no1, no2;
    float result;
    Button plus, subs, multiply, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.number1_activity2);
        num2 = findViewById(R.id.number2_activity2);

        no1 = getIntent().getFloatExtra("number1", 0);
        no2 = getIntent().getFloatExtra("number2", 0);

        plus = findViewById(R.id.plus);
        subs = findViewById(R.id.substract);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);

        answer = findViewById(R.id.answer);

        num1.setText(String.valueOf(no1));
        num2.setText(String.valueOf(no2));


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = no1 + no2;
                answer.setText(String.valueOf(result));
            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = no1 - no2;
                answer.setText(String.valueOf(result));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = no1 * no2;
                answer.setText(String.valueOf(result));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = no1 / no2;
                answer.setText(String.valueOf(result));
            }
        });

    }

}