package com.example.loginregistosobre;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity2 extends AppCompatActivity {
    Button login, voltar, registrar, sobre;
    String nome = "", password = "";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == 2 && data != null)
        {
            data.getExtras().getString("username");
            data.getExtras().getString("password");
            Toast.makeText(this, "Dados de login Atualizados", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        login = findViewById(R.id.btn_login);
        registrar = findViewById(R.id.btn_registro);
        voltar = findViewById(R.id.btn_voltar);
        sobre = findViewById(R.id.btn_voltar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(nome.equals("") || password.equals(""))
             {
                 Toast.makeText(MenuActivity2.this, "Registre o utilizador antes de entrar", Toast.LENGTH_SHORT).show();
             }
                else
             {
                Intent i = new Intent(MenuActivity2.this, LoginActivity.class);
                i.putExtra("name", nome);
                i.putExtra("password", password);
                startActivity(i);
            }

            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity2.this, RegistroActivity.class);
                startActivityForResult( i, 1);
            }
        });

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity2.this, SobreActivity.class);
                startActivity(i);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}