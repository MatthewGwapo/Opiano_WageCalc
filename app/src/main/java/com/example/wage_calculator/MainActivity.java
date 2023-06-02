package com.example.wage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.CharBuffer;

public class MainActivity extends AppCompatActivity {
    EditText editTextWage, editTextHours;
    Button buttonCalculate;
    TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWage = findViewById(R.id.editTextWage);
        editTextHours = findViewById(R.id.editTextHours);
        textViewInfo = findViewById(R.id.textViewInfo);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float wage = Float.parseFloat(editTextWage.getText().toString());
                float hours = Float.parseFloat(editTextWage.getText().toString());

                float weekly = wage * hours;
                float monthly = weekly * 4.33f;
                float annual = monthly * 12;

                StringBuilder builder = new StringBuilder();
                builder.append("Annual salary: ");
                builder.append(annual);
                builder.append("\r\n");
                builder.append("Monthly salary: ");
                builder.append(monthly);
                builder.append("\r\n");
                builder.append("Weekly salary: ");
                builder.append(weekly);
                builder.append("\r\n");

                textViewInfo.setText(builder.toString());
            }
        });
    }
}