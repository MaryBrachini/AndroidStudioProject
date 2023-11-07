package com.example.ex1_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.imc.R;

public class MainActivity extends AppCompatActivity {
private TextView altura,peso,res;
private RadioButton feminino,masculino;

private double IMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = findViewById(R.id.textViewAltura);
        peso  = findViewById(R.id.textViewPeso);
        feminino   = findViewById(R.id.radioButtonFeminino);
        masculino = findViewById(R.id.radioButtonMasculino);
        res = findViewById(R.id.textViewRes);
    }

    public void calcula (View v){
        if (IMC<"18,5"){
            res.setText("Abaixo do peso");
        }else if (IMC){
            res.setText("Peso normal");
        }if (IMC){
            res.setText("Sobrepeso");
        }if (IMC){
            res.setText("Obesidade Grau I");
        }if (IMC){
            res.setText("Obesidade Grau II");
        }if (IMC){
            res.setText("– Obesidade Grau III");
        }
    }
}