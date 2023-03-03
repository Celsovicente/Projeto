package com.example.listadealunos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<Aluno> lista;
    ArrayAdapter<Aluno> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.lv);

        lista = new ArrayList<>();
        lista.add(new Aluno("Celso", "Cassequel", "celsovicente222@gmail.com"));
        lista.add(new Aluno("António", "Gamek", "elpidromuteka@gmail.com"));
        lista.add(new Aluno("Etiandro", "Sapú2", "etiandrojovenal@gmail.com"));
        lista.add(new Aluno("Chelcia", "Gamekl", "chelciamateusmateus@gmail.com"));
        lista.add(new Aluno("Jerónimo", "Viana", "paulopinto@gmail.com"));

        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, lista
        );

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a = new Intent(MainActivity.this, DetalhesActivity.class);
                a.putExtra("Nome", lista.get(i).getNome());
                a.putExtra("Morada", lista.get(i).getNome());
                a.putExtra("Email", lista.get(i).getEmail());
                startActivity(a);
            }
        });
    }
}