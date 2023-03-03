package com.example.listadenumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText et_num;
    Button bt_adicionar;
    ListView list;
    ArrayList<Integer> lista;
    ArrayAdapter<Integer> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num = findViewById(R.id.et_numero);
        list = findViewById(R.id.lv);
        bt_adicionar = findViewById(R.id.btn_adicionar);
        lista = new ArrayList<>();

        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, lista
        );
        list.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer numero = Integer.parseInt(et_num.getText().toString());
                    lista.add(numero);
                    lista.notify();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Insira um Número antes de clicar para Adicionar",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}