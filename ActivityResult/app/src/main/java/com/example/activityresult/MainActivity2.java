package com.example.activityresult;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText nome;
    Button alterar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nome = findViewById(R.id.et_nome);
        alterar = findViewById(R.id.btn_concluir);

        i.getIntent();
        nome.setText(i.getExtras().getString("nome"));
        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("nome", nome.getText().toString());
                finish();
            }
        });
    }

}