package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input_1st, input_2nd;
    Button add, sub, mul, div;
    TextView res_dis;
    Double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add_btn);
        sub = findViewById(R.id.sub_btn);
        mul = findViewById(R.id.mul_btn);
        div = findViewById(R.id.div_btn);
        input_1st = findViewById(R.id.input_1);
        input_2nd = findViewById(R.id.input_2);
        res_dis = findViewById(R.id.btn_res);
        ClickListner();
    }
    public void ClickListner(){
            add.setOnClickListener(new View.OnClickListener() { // Addition task
                @Override
                public void onClick(View v) {
                    if ((input_1st.getText().toString()).equals("") || (input_2nd.getText().toString()).equals(""))
                    {  res_dis.setText("Input All Fields!");
                        Toast.makeText(getApplicationContext(),"Please enter all Values", Toast.LENGTH_LONG).show();
                    }else{
                        num1 = Double.parseDouble(input_1st.getText().toString());
                        num2 = Double.parseDouble(input_2nd.getText().toString());
                        Double result = num1 + num2 ;
                        result = Math.round(result * 10000000) / 10000000.0;
                        res_dis.setText(String.valueOf(result));
                    }
                }
            });

            sub.setOnClickListener(new View.OnClickListener() { // Subtraction task
                @Override
                public void onClick(View v) {
                    if ((input_1st.getText().toString()).equals("") || (input_2nd.getText().toString()).equals(""))
                    {
                        res_dis.setText("Input All Fields!");
                    }else {
                        num1 = Double.parseDouble(input_1st.getText().toString());
                        num2 = Double.parseDouble(input_2nd.getText().toString());
                        Double result = num1 - num2;
                        result = Math.round(result * 10000000) / 10000000.0;
                        res_dis.setText(String.valueOf(result));
                    }
                }
            });


        mul.setOnClickListener(new View.OnClickListener() { // Multiplication task
            @Override
            public void onClick(View v) {
                if ((input_1st.getText().toString()).equals("") || (input_2nd.getText().toString()).equals(""))
                {
                    res_dis.setText("Input All Fields!");
                }else {
                    num1 = Double.parseDouble(input_1st.getText().toString());
                    num2 = Double.parseDouble(input_2nd.getText().toString());
                    Double result = num1 * num2;
                    result = Math.round(result * 10000000) / 10000000.0;
                    res_dis.setText(String.valueOf(result));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() { // Divide task
            @Override
            public void onClick(View v) {
                if ((input_1st.getText().toString()).equals("") || (input_2nd.getText().toString()).equals(""))
                {
                    res_dis.setText("Input All Fields!");
                }else {
                    num1 = Double.parseDouble(input_1st.getText().toString());
                    num2 = Double.parseDouble(input_2nd.getText().toString());
                    if (num2 == 0) {
                        res_dis.setText("Math Error");
                    } else {
                        Double result = num1 / num2;
                        result = Math.round(result * 10000000) / 10000000.0;
                        res_dis.setText(String.valueOf(result));
                    }
                }
            }
        });
    }

}