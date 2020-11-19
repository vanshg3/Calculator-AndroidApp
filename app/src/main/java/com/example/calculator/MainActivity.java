package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculatorarithmetic.ArithmeticLogic;


public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six,
            seven, eight, nine, addition, subtraction, division,
            multiplication, decimal, clear, equal, sine, cosine, tangent, pi;
    EditText text;

    double mValueOne, mValueTwo;

    boolean added, subtracted, multiplied, divided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.button0);
        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        pi = findViewById(R.id.button10);
        addition = findViewById(R.id.buttonadd);
        subtraction = findViewById(R.id.buttonsub);
        multiplication = findViewById(R.id.buttonmul);
        division = findViewById(R.id.buttondiv);
        clear = findViewById(R.id.buttonC);
        equal = findViewById(R.id.buttoneql);
        text = findViewById(R.id.edit);
        sine = findViewById(R.id.buttonsin);
        cosine = findViewById(R.id.buttoncos);
        tangent = findViewById(R.id.buttontan);
        decimal = findViewById(R.id.buttondecimal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s0", text.getText()));
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s1", text.getText()));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s2", text.getText()));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s3", text.getText()));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s4", text.getText()));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s5", text.getText()));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s6", text.getText()));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s7", text.getText()));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s8", text.getText()));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s9", text.getText()));
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null) {
                    text.setText("");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    added = true;
                    text.setText(null);
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                subtracted = true;
                text.setText(null);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                multiplied = true;
                text.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                divided = true;
                text.setText(null);
            }
        });

        sine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingSin(mValueOne));
            }
        });

        cosine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingCos(mValueOne));
            }
        });

        tangent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingTan(mValueOne));
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(String.format("%s", text.getText()));

                if (added) {
                    text.setText(ArithmeticLogic.adder(mValueOne, mValueTwo));
                    added = false;
                }

                if (subtracted) {
                    text.setText(ArithmeticLogic.subtracter(mValueOne, mValueTwo));
                    subtracted = false;
                }

                if (multiplied) {
                    text.setText(ArithmeticLogic.multiplier(mValueOne, mValueTwo));
                    multiplied = false;
                }

                if (divided) {
                    text.setText(ArithmeticLogic.divider(mValueOne, mValueTwo));
                    divided = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s3.14", text.getText()));
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s.", text.getText()));
            }
        });
    }
}