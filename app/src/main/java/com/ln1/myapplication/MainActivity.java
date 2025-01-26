package com.ln1.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue,etsecondvalue;
    Button btnadd,btnsubs,btnmult,btndiv;
    Double num1,num2;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstvalue=findViewById(R.id.etfirstvalue);
        etsecondvalue=findViewById(R.id.etsecondvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubs=findViewById(R.id.btnsubs);
        btnmult=findViewById(R.id.btnmult);
        btndiv=findViewById(R.id.btndiv);
        tvresult=findViewById(R.id.tvresult);
        Clicklistener();
    }
    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Double.parseDouble(etfirstvalue.getText().toString());
                    num2 = Double.parseDouble(etsecondvalue.getText().toString());
                    Double result = num1 + num2;
                    tvresult.setText(String.valueOf(result));
                } catch (NumberFormatException e) {
                    tvresult.setText("Invalid input");
                }
            }
        });

        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Double.parseDouble(etfirstvalue.getText().toString());
                    num2 = Double.parseDouble(etsecondvalue.getText().toString());
                    Double result = num1 - num2;
                    tvresult.setText(String.valueOf(result));
                } catch (NumberFormatException e) {
                    tvresult.setText("Invalid input");
                }
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Double.parseDouble(etfirstvalue.getText().toString());
                    num2 = Double.parseDouble(etsecondvalue.getText().toString());
                    Double result = num1 * num2;
                    tvresult.setText(String.valueOf(result));
                } catch (NumberFormatException e) {
                    tvresult.setText("Invalid input");
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Double.parseDouble(etfirstvalue.getText().toString());
                    num2 = Double.parseDouble(etsecondvalue.getText().toString());
                    if (num2 != 0) {
                        Double result = num1 / num2;
                        tvresult.setText(String.valueOf(result));
                    } else {
                        tvresult.setText("Cannot divide by zero");
                    }
                } catch (NumberFormatException e) {
                    tvresult.setText("Invalid input");
                }
            }
        });
    }
}