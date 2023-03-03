package com.example.extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome, morada, telefone, sexo, email;
    Button mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.et_nome);
        morada = findViewById(R.id.et_morada);
        telefone = findViewById(R.id.et_telefone);
        email = findViewById(R.id.et_email);
        sexo = findViewById(R.id.et_sexo);
        mostrar = findViewById(R.id.btn_mostrar);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nome", nome.getText().toString());
                i.putExtra("morada", morada.getText().toString());
                i.putExtra("telefone", telefone.getText().toString());
                i.putExtra("email", email.getText().toString());
                i.putExtra("sexo", sexo.getText().toString());
                startActivity(i);
            }
        });
    }
}