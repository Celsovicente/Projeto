package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerandonumero(View view)
    {
        Random a = new Random(11);
        int i = a.nextInt();
        TextView texto = findViewById(R.id.textResultado);
        texto.setText("O número gerado é " +i);
    }
}