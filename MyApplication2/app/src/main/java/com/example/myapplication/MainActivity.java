package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    double var1 = 0;
    boolean store = false;
    double var2 = 0;
    double ans = 0;
    int operation = 0;
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, eq, C, dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.sample);  
        // initialising variables
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textViewSecondary);

        // initialising buttons
        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        zero = findViewById(R.id.button0);
        eq = findViewById(R.id.buttoneq);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        mul = findViewById(R.id.buttonMul);
        div = findViewById(R.id.buttonDiv);
        C = findViewById(R.id.buttonC);
        dot = findViewById(R.id.buttonDot);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Chal nikal pehli fursat me", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        // adding onClickListeners
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView.getText().toString();
                textView.setText(str.substring(0, str.length()-1));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 1;
                if(!textView.getText().toString().equals(""))
                {
                    var1 = Double.parseDouble(textView.getText().toString());
                }
                textView.setText("");
                textView2.setText(Double.toString(var1) + "+");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 2;
                if(!textView.getText().toString().equals(""))
                {
                    var1 = Double.parseDouble(textView.getText().toString());
                }
                textView.setText("");
                textView2.setText(Double.toString(var1) + "-");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 3;
                if(!textView.getText().toString().equals(""))
                {
                    var1 = Double.parseDouble(textView.getText().toString());
                }
                textView.setText("");
                textView2.setText(Double.toString(var1) + "*");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 4;
                if(!textView.getText().toString().equals(""))
                {
                    var1 = Double.parseDouble(textView.getText().toString());
                }
                textView.setText("");
                textView2.setText(Double.toString(var1) + "/");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(textView.getText().toString()!="")
                    {
                        var2 = Double.parseDouble(textView.getText().toString());
                    }
                    if(var2==0)
                    {
                        textView.setText(Double.toString(var1));
                    }
                    else
                    {
                        textView.setText(Double.toString(var1));
                        var1 = operate(operation, var1, var2);
                    }
                    textView.setText(Double.toString(var1));
                    textView2.setText(Double.toString(var1));
                }
                catch (Exception e)
                {
                    textView.setText("");
                    Toast toast = Toast.makeText(getApplicationContext(),"ERROR", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    public double operate(int operation, double var1, double var2)
    {
        switch (operation)
        {
            case 1 : return var1+var2;
            case 2 : return var1-var2;
            case 3 : return var1*var2;
            case 4 : return var1/var2;
        }
        return 0;
    }
}