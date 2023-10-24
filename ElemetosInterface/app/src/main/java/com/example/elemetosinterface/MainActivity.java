package com.example.elemetosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //vamos criar variaveis globais
    private EditText editTextRoupa;
    private TextView textViewEscolha;
    private CheckBox checkBoxBranco;
    private CheckBox checkBoxVerde;
    private CheckBox checkBoxAzul;
    private TextView textViewCores;

    List<String> checked = new ArrayList<String>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextRoupa=findViewById(R.id.editTextRoupa);
        textViewEscolha=findViewById(R.id.textViewEscolha);
        checkBoxBranco = findViewById(R.id.checkBoxBranco);
        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        textViewCores = findViewById(R.id.textViewCores);
    }
    public void selecionar(View view){
        textViewEscolha.setText(editTextRoupa.getText());
        verifica(view);
    }
    public void verifica(View view) {
        checked.clear();
        if (checkBoxVerde.isChecked()){
            checked.add(checkBoxVerde.getText().toString());
        }
        if (checkBoxBranco.isChecked()){
            checked.add(checkBoxBranco.getText().toString());
        }
        if (checkBoxAzul.isChecked()){
            checked.add(checkBoxAzul.getText().toString());
        }
        textViewCores.setText(checked.toString());
    }

}