package com.example.listadealunos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {
    Intent i;
    TextView nome, morada, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        nome = findViewById(R.id.tv_nome);
        morada = findViewById(R.id.tv_morada);
        email = findViewById(R.id.tv_email);

        i.getIntent();

        nome.setText("Nome " +i.getExtras().getString("Nome"));
        morada.setText("Morada " +i.getExtras().getString("Morada"));
        email.setText("Email " +i.getExtras().getString("Email"));
    }
}