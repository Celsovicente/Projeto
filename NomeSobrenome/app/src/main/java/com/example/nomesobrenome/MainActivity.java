package com.example.nomesobrenome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView nome, sobrenome, mostrar;
    Button concatenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.tv_nome);
        sobrenome = findViewById(R.id.tv_sobrenome);
        mostrar = findViewById(R.id.tv_resultado);
        concatenar = findViewById(R.id.btn_concatenar);

        concatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nome = nome.getText().toString();
                String Sobrenome = sobrenome.getText().toString();

                if(Nome.isEmpty() || Sobrenome.isEmpty())
                {
                    mostrar.setText("Nome não Inserido!");
                }
                else
                    {
                        mostrar.setText("Olá " +Nome+ " "+Sobrenome);
                    }

            }
        });
    }
}