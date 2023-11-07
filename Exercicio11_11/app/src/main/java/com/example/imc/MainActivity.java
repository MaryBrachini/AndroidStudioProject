package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResultado1,textViewResultado2,textViewResCheck;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox checkboxAtivar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        switch1 = findViewById(R.id.switch1);
        textViewResultado1 = findViewById(R.id.textViewResultado1);
        textViewResultado2 = findViewById(R.id.textViewResultado2);
        textViewResCheck = findViewById(R.id.textViewResCheck);
        checkboxAtivar = findViewById(R.id.checkboxAtivar);
    }

    public void verifica(View v) {
        if (switch1.isChecked()){
            textViewResultado1.setText("Ligado");
        }else {
            textViewResultado1.setText("Desligado");
        }

        if (toggleButton.isChecked()){
            textViewResultado2.setText("Toggle Ligado");
        }else {
            textViewResultado2.setText("Toggle Desligado");
        }

        if (checkboxAtivar.isChecked()){
            textViewResCheck.setText("CheckBox Ligado");
        }else {
            textViewResCheck.setText("CheckBox Desligado");
        }
    }

}