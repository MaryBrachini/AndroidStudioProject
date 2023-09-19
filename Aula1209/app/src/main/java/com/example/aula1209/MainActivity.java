package com.example.aula1209;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //vamos criar um metodo para mudar o text view da interface
    public void trocaTexto(View view){

        //Vamos criar a referencia para campo textview que esta a interface
        TextView texto = findViewById(R.id.textViewTexto);

        //apos a criação da refencia podemos usar o metodo que escreve um conjunto de caracteres no campo texto
        if (texto.getText().equals("Não clique no botão")) {
            texto.setText("Mudei seu texto 3:D");
        } else
            if(texto.getText().equals("Mudei seu texto 3:D")){
                texto.setText("Não clique no botão");
            }
        }
    }