package com.example.extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    TextView mostrar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mostrar = findViewById(R.id.tv_mostrar);

        i.getIntent();

        String nome = i.getExtras().getString("nome");
        String telefone = i.getExtras().getString("telefone");
        String morada = i.getExtras().getString("morada");
        String email = i.getExtras().getString("email");
        String sexo = i.getExtras().getString("sexo");

        if(sexo.toLowerCase().equals("masculino")  || sexo.toLowerCase().equals("m"))
        {
            mostrar.setText("O " +nome+ " vive na rua " +morada+ "com o telefone "  +telefone+ "e o email " +email);
        }
        else if(sexo.toLowerCase().equals("feminino") || sexo.toLowerCase().equals("f"))
        {
            mostrar.setText("A " +nome+ " vive na rua " +morada+ "com o telefone "  +telefone+ "e o email " +email);
        }
        else
            {
                mostrar.setText("Genero inválido!");
            }

    }
}