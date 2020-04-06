package com.example.m2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();

        String nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NOME);
        String telefone = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TELEFONE);
        String email = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_EMAIL);
        String idade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_IDADE);
        String peso = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_PESO);
        String altura = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ALTURA);

        TextView textViewNome = findViewById(R.id.textViewName);
        TextView textViewTelefone = findViewById(R.id.textViewTelefone);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewIdade = findViewById(R.id.textViewIdade);
        TextView textViewPeso = findViewById(R.id.textViewPeso);
        TextView textViewAltura = findViewById(R.id.textViewAltura);

        textViewNome.setText(nome);
        textViewTelefone.setText(telefone);
        textViewEmail.setText(email);
        textViewIdade.setText(idade);
        textViewPeso.setText(peso);
        textViewAltura.setText(altura);
    }

}
