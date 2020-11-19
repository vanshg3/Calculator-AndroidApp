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

    double val1, val2;

    boolean added, subtracted, multiplied, divided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.button0);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s0", text.getText()));
            }
        });

        one = findViewById(R.id.button1);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s1", text.getText()));
            }
        });

        two = findViewById(R.id.button2);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s2", text.getText()));
            }
        });

        three = findViewById(R.id.button3);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s3", text.getText()));
            }
        });

        four = findViewById(R.id.button4);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s4", text.getText()));
            }
        });

        five = findViewById(R.id.button5);

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s5", text.getText()));
            }
        });

        six = findViewById(R.id.button6);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s6", text.getText()));
            }
        });

        seven = findViewById(R.id.button7);

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s7", text.getText()));
            }
        });

        eight = findViewById(R.id.button8);

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s8", text.getText()));
            }
        });

        nine = findViewById(R.id.button9);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s9", text.getText()));
            }
        });

        pi = findViewById(R.id.button10);

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s3.1415926535898", text.getText()));
            }
        });

        addition = findViewById(R.id.buttonadd);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    added = true;
                    text.setText(null);
                }
            }
        });

        subtraction = findViewById(R.id.buttonsub);

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                subtracted = true;
                text.setText(null);
            }
        });

        multiplication = findViewById(R.id.buttonmul);

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                multiplied = true;
                text.setText(null);
            }
        });

        division = findViewById(R.id.buttondiv);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                divided = true;
                text.setText(null);
            }
        });

        clear = findViewById(R.id.buttonC);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });


        text = findViewById(R.id.edit);
        sine = findViewById(R.id.buttonsin);

        sine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingSin(val1));
            }
        });

        cosine = findViewById(R.id.buttoncos);

        cosine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingCos(val1));
            }
        });

        tangent = findViewById(R.id.buttontan);

        tangent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(text.getText() + "");
                text.setText(ArithmeticLogic.takingTan(val1));
            }
        });

        decimal = findViewById(R.id.buttondecimal);

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.format("%s.", text.getText()));
            }
        });

        equal = findViewById(R.id.buttoneql);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(String.format("%s", text.getText()));

                if (added) {
                    text.setText(ArithmeticLogic.adder(val1, val2));
                    added = false;
                }

                if (subtracted) {
                    text.setText(ArithmeticLogic.subtracter(val1, val2));
                    subtracted = false;
                }

                if (multiplied) {
                    text.setText(ArithmeticLogic.multiplier(val1, val2));
                    multiplied = false;
                }

                if (divided) {
                    text.setText(ArithmeticLogic.divider(val1, val2));
                    divided = false;
                }
            }
        });
    }
}