package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String escolhaMachine, escolhaUser;
    private int machi,user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //vamos criar um metodo para que quando o usuario clicar em uma imagem
    // as referencias sobre onclick serao especificadas
    public void escolhaPedra(View view) {
        escolhaMachine(view);
        vencedor(view);

        this.escolhaUser="pedra";
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.pedra);

    }
    public void escolhaPapel(View view) {
        escolhaMachine(view);
        vencedor(view);

        this.escolhaUser="papel";
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.papel);
    }

    public void escolhaTesoura(View view) {
        escolhaMachine(view);
        vencedor(view);

        this.escolhaUser="tesoura";
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.tesoura);
    }

    public void escolhaMachine(View view) {
        ImageView imgMachine = findViewById(R.id.imagemachine);

        int i=new Random().nextInt(3);
        if(i==0){
            imgMachine.setImageResource(R.drawable.pedra);
            this.escolhaMachine = "pedra";
        } else if (i==1) {
            imgMachine.setImageResource(R.drawable.papel);
            this.escolhaMachine = "papel";
        } else  if (i==2) {
            imgMachine.setImageResource(R.drawable.tesoura);
            this.escolhaMachine = "tesoura";
        }
    }

    public void vencedor (View view) {
        TextView res = findViewById(R.id.textResultado);

       if (this.escolhaMachine=="papel" && this.escolhaUser=="pedra" ||
                this.escolhaMachine=="tesoura" && this.escolhaUser=="papel" ||
                this.escolhaMachine=="pedra" && this.escolhaUser=="tesoura"){
            res.setText("Você perdeu!");
            machi++;
        }
        else if (this.escolhaUser=="papel" && this.escolhaMachine=="pedra" ||
                this.escolhaUser=="tesoura" && this.escolhaMachine=="papel" ||
                this.escolhaUser=="pedra" && this.escolhaMachine=="tesoura"){
            res.setText("Você ganhou!");
            user++;
        }
        else res.setText("Empate!");

        TextView textScoreYou = findViewById(R.id.textScoreYou);
        textScoreYou.setText("You Score: "+user);

        TextView textScoreMachi = findViewById(R.id.textScoreMachi);
        textScoreMachi.setText("Machine Score: "+machi);
    }
}