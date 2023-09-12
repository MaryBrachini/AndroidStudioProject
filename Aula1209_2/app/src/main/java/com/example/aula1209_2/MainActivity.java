package com.example.aula1209_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma(View view) {
        TextView resultado = findViewById(R.id.resultado);
        EditText n1  = findViewById(R.id.n1);
        EditText n2  = findViewById(R.id.n2);

        double num1,num2,res;

        num1=Integer.parseInt(n1.getText().toString());
        num2=Integer.parseInt(n2.getText().toString());

        res = num1+num2;

        resultado.setText("Resultado: "+res);
    }
}