package com.example.ankit.calculator;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class advancedCalculation extends ActionBarActivity implements View.OnClickListener {

    private TextView enterDigit;
    private Button buttonSine;
    private Button buttonCos;
    private Button buttonTan;
    private Button buttonImag;
    private Button buttonNaturalLog;
    private Button buttonLogBase2;
    private Button buttonPI;
    private Button buttonExponent;
    private Button buttonPercnt;
    private Button buttonFact;
    private Button buttonSQRT;
    private Button buttonPower;
    private Button buttonDEL;


    private double result;
    private int result1;
    private String resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calculation);

        enterDigit = (TextView)findViewById(R.id.enterDigit);
        buttonSine = (Button)findViewById(R.id.buttonSine);
        buttonCos = (Button)findViewById(R.id.buttonCos);
        buttonTan = (Button)findViewById(R.id.buttonTan);
        buttonImag = (Button)findViewById(R.id.buttonImag);
        buttonNaturalLog = (Button)findViewById(R.id.buttonNaturalLog);
        buttonLogBase2 = (Button)findViewById(R.id.buttonLogBase2);
        buttonPI = (Button)findViewById(R.id.buttonPI);
        buttonExponent = (Button)findViewById(R.id.buttonExponent);
        buttonPercnt = (Button)findViewById(R.id.buttonPercnt);
        buttonFact = (Button)findViewById(R.id.buttonFact);
        buttonSQRT = (Button)findViewById(R.id.buttonSQRT);
        buttonPower = (Button)findViewById(R.id.buttonPower);
        buttonDEL = (Button)findViewById(R.id.buttonDEL);


        Intent intent = getIntent();
        if(intent!=null) {
            resultText = intent.getStringExtra("result");
        }
        else {
            resultText = "0.0";
            enterDigit.setText(resultText);
            System.out.println("sdsdsd" + resultText);
            result = Double.valueOf(resultText);
            System.out.println("result from other activity" + result);
        }

        buttonSine.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTan.setOnClickListener(this);
        buttonExponent.setOnClickListener(this);
        buttonFact.setOnClickListener(this);
        buttonImag.setOnClickListener(this);
        buttonLogBase2.setOnClickListener(this);
        buttonNaturalLog.setOnClickListener(this);
        buttonPercnt.setOnClickListener(this);
        buttonPI.setOnClickListener(this);
        buttonSQRT.setOnClickListener(this);
        buttonPower.setOnClickListener(this);
        buttonDEL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.buttonSine:
                result = Math.round(Math.sin(Math.toRadians(result))*100.0)/100.0;
                System.out.println("Sine" +result);
                System.out.println(String.format("Precision %.2f",+ result));
                break;
            case R.id.buttonCos:
                result = Math.round(Math.cos(Math.toRadians(result))*100.0)/100.0;
                System.out.println("Cos" +result);
                break;
            case R.id.buttonTan:
                result = Math.round(Math.tan(Math.toRadians(result))*100.0)/100.0;
                System.out.println("Tan: " +result);
                break;
            case R.id.buttonExponent:
                result = 2.71828182846 * result;
                System.out.println("E: " +result);
                break;
            case R.id.buttonImag:
                result =(result*result*result) ;
                System.out.println("Sine" +result);
                break;

            case R.id.buttonFact:
                double n =Double.valueOf(resultText);
                int result1=1;
                for (int i = 1; i <= n; i++) {
                    result1 *= i;
                }
                result=result1;

                System.out.println("Factorail: "  +result);
                break;
            case R.id.buttonPercnt:
                result = result/100.00;
                System.out.println("percentage %: " +result);
                break;
            case R.id.buttonLogBase2:
                result = Math.log10(Double.valueOf(resultText));
                System.out.println("Log: " +result);
                break;
            case R.id.buttonNaturalLog:
                result = Math.log(Double.valueOf(resultText));
                System.out.println("Ln: " +result);
                break;
            case R.id.buttonSQRT:
                result = Math.sqrt(result);
                System.out.println("SQRT: " +result);
                break;
            case R.id.buttonPI:
                result = ((3.14159265359* result)*100.00000)/100.00000;
                System.out.println("Ln: " +result);
                break;
            case R.id.buttonPower:
                result =  Math.pow(result,2);
                System.out.println("Square: " +result);
                break;
            case R.id.buttonDEL:
                enterDigit.setText("");
                break;

            default:
                break;
        }




        enterDigit.setText(String.valueOf(result));

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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_advanced, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(advancedCalculation.this, SimplecalculationActivity.class);
           // intent.putExtra("result", result);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}