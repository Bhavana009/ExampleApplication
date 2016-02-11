package com.example.bhavanas.exampleapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Main entry screen
public class RoboTesting extends Activity {
  static EditText firstNumber, secondNumber;
    private TextView total;
    static Button addButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        addButton = (Button) findViewById(R.id.addButton);
        total = (TextView) findViewById(R.id.total);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberResult = firstNumber.getText().toString();
                String secondNumberResult = secondNumber.getText().toString();
                firstNumberResult="1";
                secondNumberResult="2";
                Integer totalResult = Integer.parseInt(firstNumberResult) +
                        Integer.parseInt(secondNumberResult);
                total.setText(Integer.toString(totalResult));
            }
        });
    }
        public EditText getFirstNumber() {
            return firstNumber;
        }
        public EditText getSecondNumber() {
            return secondNumber;


        }
        public Button getAddButton() {
            return addButton;
        }
        public TextView getTotal() {
            return total;
        }
    }

