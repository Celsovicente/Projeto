package com.example.peso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView peso, emagrecer, engordar;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.txt_peso);
        emagrecer = findViewById(R.id.txt_peso_emagrecer);
        engordar = findViewById(R.id.txt_peso_engordar);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso_pessoa = Double.parseDouble(peso.getText().toString());
                double novo_peso = ((peso_pessoa*15) / 100);
                double novo_peso1 = ((peso_pessoa*20) / 100);
                
                engordar.setText(String.valueOf(novo_peso));
                emagrecer.setText(String.valueOf(novo_peso1));
            }
        });
    }
}