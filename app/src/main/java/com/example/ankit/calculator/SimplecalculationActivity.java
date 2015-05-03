package com.example.ankit.calculator;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SimplecalculationActivity extends ActionBarActivity {
    private TextView enterDigit;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDivide;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonPlus;
    private Button buttonDEL;
    private Button buttonDecimal;
    private Button buttonEqual;
    private String resultText;
    private double a, b;
    private Double result=0.0;
    private int operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecalculation);

        enterDigit = (TextView) findViewById(R.id.enterDigit);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDEL = (Button) findViewById(R.id.buttonDEL);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);




        Intent intent = getIntent();
        if (intent.getStringExtra("result") != null) {

            resultText = intent.getStringExtra("result");
            enterDigit.setText(resultText);

            result = Double.valueOf(resultText);
        }

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button0.getText().toString());
                }
            });


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    enterDigit.append(button1.getText().toString());
                /*if(enterDigit.getText()!="") {
                    enterDigit.append(button1.getText().toString());

                    a = Integer.parseInt(enterDigit.getText().toString());
                    System.out.println("a1:"+a);
                }
                else{
                    enterDigit.setText(String.valueOf(btn1));
                    //enterDigit.append(String.valueOf(btn1));
                    b = Integer.parseInt(enterDigit.getText().toString());
                    System.out.println("b1:"+b);
                }*/
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    enterDigit.append(button2.getText().toString());
                /*if(enterDigit.getText()!=""){
                    enterDigit.append(button2.getText().toString());
                    //enterDigit.setText(String.valueOf(btn2));
                    *//*a = Integer.parseInt(enterDigit.getText().toString());*//*
                    System.out.println("a2:"+a);
                }
                else{
                    enterDigit.setText(String.valueOf(btn2));
                    b = Integer.parseInt(enterDigit.getText().toString());
                    System.out.println("b2:"+b);
                }
                System.out.println("button2 :"+enterDigit.getText());*/
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button3.getText().toString());
                /*if(enterDigit.getText()!=null) {
                    a = Integer.parseInt(enterDigit.getText().toString());
                    System.out.println(a);
                }else{
                    b = Integer.parseInt(enterDigit.getText().toString());
                    System.out.println(b);
                }*/
                }
            });


            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button4.getText().toString());
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button5.getText().toString());
                }
            });


            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button6.getText().toString());
                }
            });


            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button7.getText().toString());
                }
            });


            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button7.getText().toString());
                }
            });


            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button8.getText().toString());
                }
            });


            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    enterDigit.append(button9.getText().toString());
                }
            });

            buttonPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Double.parseDouble(enterDigit.getText().toString());
                    enterDigit.setText("");
                    operator = v.getId();
                }
            });

            buttonMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Double.parseDouble(enterDigit.getText().toString());
                    enterDigit.setText("");
                    operator = v.getId();
                }
            });

            buttonMultiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Double.parseDouble(enterDigit.getText().toString());
                    enterDigit.setText("");
                    operator = v.getId();
                }
            });

            buttonDivide.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    a = Double.parseDouble(enterDigit.getText().toString());
                    enterDigit.setText("");
                    operator = v.getId();
                }
            });
            buttonDecimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String d =enterDigit.getText().toString();
                    d =d.concat(".");
                    enterDigit.setText(d);

                }
            });
            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b = Double.parseDouble(enterDigit.getText().toString());


                    switch (operator) {

                        case R.id.buttonPlus:
                            result = a + b;
                            enterDigit.setText(String.valueOf(result));
                            System.out.println("resultPlus Equal= " + result);
                            break;
                        case R.id.buttonMinus:
                            result = a - b;
                            enterDigit.setText(String.valueOf(result));
                            System.out.println("resultMinus Equal= " + result);
                            break;
                        case R.id.buttonMultiply:
                            result = a * b;
                            enterDigit.setText(String.valueOf(result));
                            System.out.println("resultMultiply Equal= " + result);
                            break;
                        case R.id.buttonDivide:
                            result = a / b;
                            enterDigit.setText(String.valueOf(result));
                            System.out.println("resultDivide Equal= " + result);
                            break;
                        default:
                                result = a;
                            break;
                    }
                }
            });

            buttonDEL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(enterDigit.getText().toString().length()>0){
                        int start =0;
                        int end =enterDigit.getText().toString().length()-1;
                        String newText =enterDigit.getText().toString().substring(start,end);
                        enterDigit.setText(newText);
                    }
                }
            });
        }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_simplecalculation, menu);
            return true;
        }

    /**
     * Disable soft keyboard from appearing, use in conjunction with adding the android:windowSoftInputMode="stateAlwaysHidden|adjustNothing" attribute to your activity tag in your manifest
     file.
     * @param editText
     */
    public static void disableSoftInputFromAppearing(EditText editText) {
        if (Build.VERSION.SDK_INT >= 11) {
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        } else {
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(SimplecalculationActivity.this, advancedCalculation.class);
            intent.putExtra("result", enterDigit.getText().toString());
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    }