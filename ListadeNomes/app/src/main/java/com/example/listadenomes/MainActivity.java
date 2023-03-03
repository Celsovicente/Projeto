package com.example.listadenomes;

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
    ArrayList<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        lista = new ArrayList();

        lista.add("Weza");
        lista.add("Eleonora");
        lista.add("Morena");
        lista.add("Chelcia");
        lista.add("Epifânia");
        lista.add("Carlos");
        lista.add("Muteka");
        lista.add("António");
        lista.add("Angela");
        lista.add("Núria");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1
        );

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Olá" +lista.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}