package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Utilizador> lista;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        lista = new ArrayList<Utilizador>();

        Utilizador usuario = new Utilizador();
        usuario.setUsername("Username");
        usuario.setPassord("Password");

        Utilizador usuario1 = new Utilizador("user","pass");

        Utilizador use = new Utilizador(usuario1);
        usuario1.setUsername("Novo Nome");

        lista.add(usuario);
        lista.add(usuario1);
        lista.add(use);

        ArrayAdapter<Utilizador> adapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1
        );

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, lista.get(i).getPassord(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}