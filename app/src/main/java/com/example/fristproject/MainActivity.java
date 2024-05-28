package com.example.fristproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1, editText2;
    private Button addButton, subButton;

    private TextView ResultEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText1 =(EditText) findViewById(R.id.textEt);
        editText2 =(EditText) findViewById(R.id.text2Et);

        addButton =(Button) findViewById(R.id.addBtn);
        subButton =(Button) findViewById(R.id.subBtn);

        ResultEt = (TextView) findViewById(R.id.resultEt);

    addButton.setOnClickListener(this);
    subButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String number1 =editText1.getText().toString();
        String number2 =editText2.getText().toString();

        //convert into double
        double num1= Double.parseDouble(number1);
        double num2= Double.parseDouble(number2);

        if (v.getId()==R.id.addBtn){
            double sum = num1 + num2;
            ResultEt.setText("Result: " + sum);
        }
        if (v.getId()==R.id.subBtn){
            double sub = num1 - num2;
            ResultEt.setText("Result: " + sub);
        }

    }
}