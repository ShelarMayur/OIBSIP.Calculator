package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clear_btn, modulo_btn, divide_btn, clearOne_btn, plus_btn,
            seven_btn, eight_btn, nine_btn, multiply_btn,
            four_btn, five_btn, six_btn, minus_btn,
            one_btn, two_btn, three_btn,
            doubleZero_btn, zero_btn, point_btn, equals_btn;

    private TextView display;
    private boolean plus=false,minus=false,multiply=false,divide=false,modulo=false;

    private double value1,valueInfinite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clear_btn = findViewById(R.id.C);
        modulo_btn = findViewById(R.id.modulo);
        divide_btn = findViewById(R.id.divide);
        clearOne_btn = findViewById(R.id.X);
        plus_btn = findViewById(R.id.plus);
        seven_btn = findViewById(R.id.seven);
        eight_btn =findViewById(R.id.eight);
        nine_btn = findViewById(R.id.nine);
        multiply_btn = findViewById(R.id.multiply);
        four_btn = findViewById(R.id.four);
        five_btn = findViewById(R.id.five);
        six_btn = findViewById(R.id.six);
        minus_btn = findViewById(R.id.minus);
        one_btn = findViewById(R.id.one);
        two_btn = findViewById(R.id.two);
        three_btn = findViewById(R.id.three);
        doubleZero_btn = findViewById(R.id.double_zero);
        zero_btn = findViewById(R.id.zero);
        point_btn = findViewById(R.id.point);
        equals_btn = findViewById(R.id.equals);

        display = findViewById(R.id.display);


    }
    public void btnClearClicked(View view) {
        display.setText("");
        value1=0;
        valueInfinite=0;
        plus_btn.setBackgroundColor(Color.BLACK);
        multiply_btn.setBackgroundColor(Color.BLACK);
        divide_btn.setBackgroundColor(Color.BLACK);
        minus_btn.setBackgroundColor(Color.BLACK);
        modulo_btn.setBackgroundColor(Color.BLACK);
        plus=minus=multiply=divide=modulo=false;
    }
    public void btnPlusClicked(View view) {
        if(minus==true || plus == true || modulo==true || multiply==true|| divide==true || display.getText().toString()==""){
            Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
            return;
        }
      plus_btn.setBackgroundColor(Color.WHITE);
      plus = true;
      value1 = Double.parseDouble(display.getText().toString());
      display.setText("");
    }
    public void btnModuloClicked(View view) {
        if(minus==true || plus == true || modulo==true || multiply==true|| divide==true || display.getText().toString()==""){
            Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
        }
        modulo_btn.setBackgroundColor(Color.WHITE);
        modulo = true;
        value1 = Double.parseDouble(display.getText().toString());
        display.setText("");
    }
    public void btnDivideClicked(View view) {
        if(minus==true || plus == true || modulo==true || multiply==true|| divide==true || display.getText().toString()==""){
            Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
            return;
        }
        divide_btn.setBackgroundColor(Color.WHITE);
        divide = true;
        value1 = Double.parseDouble(display.getText().toString());
        display.setText("");
    }
    public void btnMultiplyClicked(View view) {
        if(minus==true || plus == true || modulo==true || multiply==true|| divide==true || display.getText().toString()==""){
            Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
            return;
        }
        multiply_btn.setBackgroundColor(Color.WHITE);
        multiply = true;
        value1 = Double.parseDouble(display.getText().toString());
        display.setText("");
    }
    public void btnMinusClicked(View view) {
        if(minus==true || plus == true || modulo==true || multiply==true|| divide==true || display.getText().toString()==""){
            Toast.makeText(this, "Not Allowed", Toast.LENGTH_SHORT).show();
            return;
        }
        minus_btn.setBackgroundColor(Color.WHITE);
        minus = true;
        value1 = Double.parseDouble(display.getText().toString());
        display.setText("");
    }
    public void btnEqualsClicked(View view){
        if(display.getText().toString()==""){
            Toast.makeText(this, "Enter some value", Toast.LENGTH_SHORT).show();
            return;
        }
        if(plus==true){
            valueInfinite = Double.parseDouble(display.getText().toString());
            display.setText(String.valueOf(value1+valueInfinite));
            plus_btn.setBackgroundColor(Color.BLACK);
            plus=false;
        }
        else if(minus==true){
            valueInfinite = Double.parseDouble(display.getText().toString());
            display.setText(String.valueOf(value1-valueInfinite));
            minus_btn.setBackgroundColor(Color.BLACK);
            minus=false;
        }
        else if(multiply==true){
            valueInfinite = Double.parseDouble(display.getText().toString());
            display.setText(String.valueOf(value1*valueInfinite));
            multiply_btn.setBackgroundColor(Color.BLACK);
            multiply=false;
        }
        else if(modulo==true){
            valueInfinite = Double.parseDouble(display.getText().toString());
            display.setText(String.valueOf(value1%valueInfinite));
            modulo_btn.setBackgroundColor(Color.BLACK);
            modulo=false;
        }else if(divide==true){
            valueInfinite = Double.parseDouble(display.getText().toString());
            try{
            display.setText(String.valueOf(value1/valueInfinite));}
            catch (ArithmeticException e){
                Toast.makeText(this, "Divide by zero not possible", Toast.LENGTH_SHORT).show();
                btnClearClicked(view);
            }
            divide_btn.setBackgroundColor(Color.BLACK);
            divide=false;
        }
    }
    public void btnNineClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"9");
    }
    public void btnEightClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"8");
    }
    public void btnSevenClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"7");
    }
    public void btnSixClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"6");
    }
    public void btnFiveClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"5");
    }
    public void btnFourClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"4");
    }

    public void btnThreeClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"3");
    }
    public void btnTwoClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"2");
    }
    public void btnOneClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"1");
    }
    public void btnDoubleZeroClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"00");
    }
    public void btnZeroClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+"0");
    }
    public void btnPointClicked(View view) {
        String value = display.getText().toString();
        display.setText(value+".");
    }
    public void btnClearOneClicked(View view) {
        StringBuilder str = new StringBuilder(display.getText().toString());
        display.setText(str.deleteCharAt(str.length()-1));
    }

}