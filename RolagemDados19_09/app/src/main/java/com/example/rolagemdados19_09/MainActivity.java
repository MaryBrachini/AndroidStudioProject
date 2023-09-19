package com.example.rolagemdados19_09;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortearDado(View view) {
        //Criamos referencia para o elemento da interface
        TextView textDado = findViewById(R.id.textDado);
        TextView textDado2 = findViewById(R.id.textDado2);

        //vamos criar um vetor de numeros
        String[] dados={
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        };

        String[] dadoMachine={
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        };

        int i=new Random().nextInt(6);
        int j=new Random().nextInt(6);

        //vamos definir o que sera mostrado quando clicarmos no botão
        String valorSorteado=dados[i];
        textDado.setText(dados[i]);

        String valorSorteadoMachine=dadoMachine[j];
        textDado2.setText(dadoMachine[j]);

        //vamos criar a referencia para o resultado
        EditText txtEntrada=findViewById(R.id.DadoUser);

        TextView txtResPU=findViewById(R.id.PU);
        TextView txtResPM=findViewById(R.id.PM);

        //fazer a verificação
        if (valorSorteado.equalsIgnoreCase(""+txtEntrada.getText())){
            txtResPU.setText("Parabéns você teve sorte!!!");
            txtResPU.setTextColor(Color.GREEN);


        }//else
           // txtRes.setText("100 anos de azar para você!!");
        //   txtRes.setTextColor(Color.RED);

    }

}