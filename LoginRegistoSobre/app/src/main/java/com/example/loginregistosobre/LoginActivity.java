package com.example.loginregistosobre;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText nome, senha;
    Button logar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nome = findViewById(R.id.et_login_username);
        senha = findViewById(R.id.et_login_password);
        logar = findViewById(R.id.btn_login);

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = nome.getText().toString().trim();
                String password = senha.getText().toString().trim();

                if(username.equals(i.getExtras().getString("username")) && password.equals(i.getExtras().getString("password")))
                {
                    Intent a = new Intent(LoginActivity.this, SobreActivity.class);
                    startActivity(a);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Incorrecto", Toast.LENGTH_SHORT).show();
                    nome.setText("");
                    senha.setText("");
                }
            }
        });
    }
}