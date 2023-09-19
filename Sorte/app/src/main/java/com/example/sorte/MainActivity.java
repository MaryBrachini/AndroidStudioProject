package com.example.sorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // vamos criar um metodo paraa sortear um frase

    public void sortearFrase(View view) {
        //Criamos referencia para o elemento da interface
        TextView txtFrase = findViewById(R.id.textFrase);

        //vamos criar um vetor de frases
        String[] frases={
                "Trabalhe bastante!",
                "Continue vivendo!",
                "Sorria mais!",
                "Não fique triste!",
                "Seje menos!",
                "Corra ao vento!"
        };

        int i=new Random().nextInt(6);

        //vamos definir o que sera mostrado quando clicarmos no botão
        txtFrase.setText(frases[i]);

    }

}