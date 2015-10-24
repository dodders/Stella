package com.gad.stella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Calculator calc = new Calculator(); //initialize calculator once.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* run the calculation */
    public void doCalc(View view) {

        EditText age = (EditText) findViewById(R.id.age);
        EditText dress = (EditText) findViewById(R.id.dress);
        EditText rating = (EditText) findViewById(R.id.rating);
        TextView pintsView = (TextView) findViewById(R.id.pints);
        TextView errorMsg = (TextView) findViewById(R.id.errorMsg);
        try {
            int pints = calc.calc(getInt(age), getInt(dress), getInt(rating), 4);
            pintsView.setText(String.valueOf(pints));
            errorMsg.setText("");
        } catch (Exception e) {
            pintsView.setText("");
            errorMsg.setText("Please enter all fields!");
        }
    }

    public void doClear(View view) {
        EditText age = (EditText) findViewById(R.id.age);
        EditText dress = (EditText) findViewById(R.id.dress);
        EditText rating = (EditText) findViewById(R.id.rating);
        TextView pintsView = (TextView) findViewById(R.id.pints);
        TextView errorMsg = (TextView) findViewById(R.id.errorMsg);
        age.setText("");
        dress.setText("");
        rating.setText("");
        pintsView.setText("");
        errorMsg.setText("");
    }

    private int getInt(EditText e) {
        return Integer.parseInt(e.getText().toString());
    }
}
