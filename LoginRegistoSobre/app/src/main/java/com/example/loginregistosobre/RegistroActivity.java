package com.example.loginregistosobre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {
    EditText username, password;
    Button Registrar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        Registrar = findViewById(R.id.btn_Registrar);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = username.getText().toString().trim();
                String senha = password.getText().toString().trim();

                if(nome.equals("") || senha.equals(""))
                {
                    Toast.makeText(RegistroActivity.this, "Preencha ambos os Campos", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    i.getIntent();
                    i.putExtra("nome", nome);
                    i.putExtra("username", senha);
                    setResult(1, i);
                    finish();
                }
            }
        });
    }
}