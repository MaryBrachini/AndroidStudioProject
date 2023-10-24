package com.example.elemetosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //vamos criar variaveis globais
    private EditText editTextRoupa;
    private TextView textViewEscolha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionar(View view){
        editTextRoupa=findViewById(R.id.editTextRoupa);
        textViewEscolha=findViewById(R.id.textViewEscolha);

        textViewEscolha.setText(editTextRoupa.getText());


    }




}