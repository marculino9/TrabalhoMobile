package com.unifcv.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSoma,btnDiv,btnSub,btnMult,btnApagar,btnVirgula,btnIgual;

    boolean Soma,Multi,Div,Sub;

    double var1, var2;

    private EditText Result;

    private AlertDialog alerta;

    private float n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.num0);
        btn1 = (Button) findViewById(R.id.num1);
        btn2 = (Button) findViewById(R.id.num2);
        btn3 = (Button) findViewById(R.id.num3);
        btn4 = (Button) findViewById(R.id.num4);
        btn5 = (Button) findViewById(R.id.num5);
        btn6 = (Button) findViewById(R.id.num6);
        btn7 = (Button) findViewById(R.id.num7);
        btn8 = (Button) findViewById(R.id.num8);
        btn9 = (Button) findViewById(R.id.num9);
        btnSoma = (Button) findViewById(R.id.mais);
        btnSub = (Button) findViewById(R.id.menos);
        btnMult = (Button) findViewById(R.id.multiplicar);
        btnIgual = (Button) findViewById(R.id.igual);
        btnDiv = (Button) findViewById(R.id.dividir);
        btnApagar = (Button) findViewById(R.id.apagar);
        btnVirgula = (Button) findViewById(R.id.virgula);
        Result = (EditText) findViewById(R.id.resultado);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + "9");
            }
        });
        btnVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText() + ",");
            }
        });

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(null);
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(Result.getText()+"");
                Soma=true;
                Result.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(Result.getText()+"");
                Sub=true;
                Result.setText(null);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(Result.getText()+"");
                Multi=true;
                Result.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(Result.getText()+"");
                Div=true;
                Result.setText(null);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Integer.parseInt(Result.getText()+"");
                if (Soma==true)
                {
                    Result.setText(var1+var2+"");
                    Soma=false;
                }
                if (Sub==true)
                {
                    Result.setText(var1-var2+"");
                    Sub=false;
                }
                if (Multi==true)
                {
                    Result.setText(var1*var2+"");
                    Multi=false;
                }
                if (Div==true)
                {
                    if ((var1 != 0) && (var2 != 0)){
                        Result.setText(var1/var2+"");
                        Div=false;
                    }
                    else
                    {
                        Result.setText("Nao funciona porra");
                    }
                }
            }
        });
    }

}