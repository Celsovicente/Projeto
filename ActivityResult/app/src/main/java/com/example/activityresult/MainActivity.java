package com.example.activityresult;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    Button trocar_nome;
    String Name = "Utilizador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.et_nome);
        trocar_nome = findViewById(R.id.btn_nome);

        nome.setText("Olá " +Name);

        trocar_nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nome", Name);
                startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ( requestCode == 1 && resultCode == 2 && data != null)
        {
            Name = data.getExtras().getString("nome");
            nome.setText("Olá " +Name);
        }
        else
            {
                Toast.makeText(MainActivity.this,"Resultcod Inválido",Toast.LENGTH_SHORT).show();
            }
    }
}