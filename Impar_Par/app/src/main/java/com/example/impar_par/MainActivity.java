package com.example.impar_par;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String escolha;
    private int Ptmachi = 0, Ptuser = 0, j = 0, escolhaMachine = 0, escolhaUser = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolhaUm(View view) {
        escolhaMachine(view);


        this.escolhaUser = 1;
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.umdedo);
        vencedor(view);
    }

    public void escolhaDois(View view) {
        escolhaMachine(view);


        this.escolhaUser = 2;
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.doisdedos);
        vencedor(view);
    }

    public void escolhaTres(View view) {
        escolhaMachine(view);

        this.escolhaUser = 3;
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.tresdedos);
        vencedor(view);
    }

    public void escolhaQuatro(View view) {
        escolhaMachine(view);


        this.escolhaUser = 4;
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.quatrodedos);
        vencedor(view);
    }

    public void escolhaCinco(View view) {
        escolhaMachine(view);


        this.escolhaUser = 5;
        ImageView imgUser = findViewById(R.id.imageUser);
        imgUser.setImageResource(R.drawable.cincodedos);
        vencedor(view);
    }

    public void escolhaImpar(View view) {
        TextView tipo = findViewById(R.id.tipo);
        this.escolha = "impar";
        tipo.setText("Opção é impar");
    }

    public void escolhaPar(View view) {
        TextView tipo = findViewById(R.id.tipo);
        this.escolha = "par";
        tipo.setText("Opção é par");
    }

    public void escolhaMachine(View view) {
        ImageView imgMachine = findViewById(R.id.imagemMachine);

        int i = new Random().nextInt(5);
        if (i == 0) {
            imgMachine.setImageResource(R.drawable.umdedo);
            this.escolhaMachine = 1;
        } else if (i == 1) {
            imgMachine.setImageResource(R.drawable.doisdedos);
            this.escolhaMachine = 2;
        } else if (i == 2) {
            imgMachine.setImageResource(R.drawable.tresdedos);
            this.escolhaMachine = 3;
        } else if (i == 3) {
            imgMachine.setImageResource(R.drawable.quatrodedos);
            this.escolhaMachine = 4;
        } else if (i == 4) {
            imgMachine.setImageResource(R.drawable.cincodedos);
            this.escolhaMachine = 5;
        }
    }

    public void vencedor(View view) {
        int total;
        TextView res = findViewById(R.id.textResultado);
        TextView txtUser = findViewById(R.id.textViewUser);
        TextView txtMaq = findViewById(R.id.textViewMaq);

        total = escolhaMachine + escolhaUser;

        if (escolha.equals("par")) {
            j++;
            if ((total % 2) == 0) {
                Ptuser++;
                txtUser.setText("Usu" + Ptuser);
            } else {
                Ptmachi++;
                txtMaq.setText("Maq:" + Ptmachi);
            }
        }
        else if (escolha.equals("impar")) {
            j++;
            if ((total % 2) == 1) {
                Ptuser++;
                txtUser.setText("Usu" + Ptuser);
            } else {
                Ptmachi++;
                txtMaq.setText("Maq:" + Ptmachi);
            }
        }

        if (j==5) {
            if (Ptuser > Ptmachi) {
                res.setText("Você Ganhou!!!");
            } else if (Ptmachi > Ptuser) {
                res.setText("Você Perdeu!!!");
            } else if (Ptmachi == Ptuser) {
                res.setText("Empate!!!");
            }
        }
    }
}