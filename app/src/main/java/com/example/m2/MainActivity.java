package com.example.m2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_NOME = "com.example.myfirstapp.MESSAGE_NOME";
    public static final String EXTRA_MESSAGE_TELEFONE = "com.example.myfirstapp.MESSAGE_TELEFONE";
    public static final String EXTRA_MESSAGE_EMAIL = "com.example.myfirstapp.MESSAGE_EMAIL";
    public static final String EXTRA_MESSAGE_IDADE = "com.example.myfirstapp.MESSAGE_IDADE";
    public static final String EXTRA_MESSAGE_PESO = "com.example.myfirstapp.MESSAGE_PESO";
    public static final String EXTRA_MESSAGE_ALTURA = "com.example.myfirstapp.MESSAGE_ALTURA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        EditText editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);

        String Nome = editTextName.getText().toString();
        String Telefone = editTextTelefone.getText().toString();
        String Email = editTextEmail.getText().toString();
        String Idade = editTextIdade.getText().toString();
        String Peso = editTextPeso.getText().toString();
        String Altura = editTextAltura.getText().toString();

        if (Nome.length()<1){
            editTextName.setError("Preencha o nome");
            editTextName.requestFocus();
            return;
        }
        if (Telefone.length()<=0){
            editTextTelefone.setError("Preencha o Telefone");
            editTextTelefone.requestFocus();
            return;
        }
        if (Email.length()<1){
            editTextEmail.setError("Preencha o Email");
            editTextEmail.requestFocus();
            return;
        }
        if (Idade.length()<=0){
            editTextIdade.setError("Preencha o Idade");
            editTextIdade.requestFocus();
            return;
        }
        if (Peso.length()<=0){
            editTextPeso.setError("Preencha o Peso");
            editTextPeso.requestFocus();
            return;
        }
        if (Altura.length()<=0){
            editTextAltura.setError("Preencha o Altura");
            editTextAltura.requestFocus();
            return;
        }

        intent.putExtra(EXTRA_MESSAGE_NOME, Nome);
        intent.putExtra(EXTRA_MESSAGE_TELEFONE, Telefone);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, Email);
        intent.putExtra(EXTRA_MESSAGE_IDADE, Idade);
        intent.putExtra(EXTRA_MESSAGE_PESO, Peso);
        intent.putExtra(EXTRA_MESSAGE_ALTURA, Altura);

        startActivity(intent);
    }
}

