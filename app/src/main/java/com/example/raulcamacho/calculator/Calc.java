package com.example.raulcamacho.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Calc extends ActionBarActivity implements View.OnClickListener {

    private Button btnAdd, btnMinus, btnMultiply, btnDivide;
    private TextView txtResult;
    private EditText etFirstNumber, etSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }

    private void init() {
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        etFirstNumber = (EditText)findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText)findViewById(R.id.etSecondNumber);
        txtResult = (EditText)findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }

    public void onClick(View view) {
        String num1 = etFirstNumber.getText().toString();
        String num2 = etSecondNumber.getText().toString();
        switch(view.getId()) {
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                txtResult.setText(String.valueOf(addition));
                break;
            case R.id.btnMinus:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                txtResult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    txtResult.setText(String.valueOf(division));
                }catch(Exception e) {
                    txtResult.setText("Cannot divide!");
                }
                break;
            case R.id.btnMultiply:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                txtResult.setText(String.valueOf(multiplication));
                break;
        }
    }

}
