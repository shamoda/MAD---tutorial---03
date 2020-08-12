package com.app.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button ok_btn;
    EditText num1, num2;
    float number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ok_btn = findViewById(R.id.ok);
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("number1", number1);
                intent.putExtra("number2", number2);
                startActivity(intent);


                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
                toast.show();

            }
        });

    }
}