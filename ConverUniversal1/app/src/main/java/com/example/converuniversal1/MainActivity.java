package com.example.converuniversal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_real, btn_dolar, btn_kwanza;
    EditText et_valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor = findViewById(R.id.et_val);
        btn_dolar = findViewById(R.id.btn_dolar);
        btn_real = findViewById(R.id.btn_real);
        btn_kwanza = findViewById(R.id.btn_kwanza);

        btn_kwanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor_kwanza = Double.parseDouble(et_valor.getText().toString());
                double ValorKwanza = valor_kwanza * 439;
                Toast.makeText(MainActivity.this, valor_kwanza+ "€ são " +ValorKwanza+ "Kz",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor_dolar = Double.parseDouble(et_valor.getText().toString());
                double ValorDolar = valor_dolar * 1.20;
                Toast.makeText(MainActivity.this, valor_dolar+"€ são " +ValorDolar+ "$",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor_real = Double.parseDouble(et_valor.getText().toString());
                double ValorReal = valor_real * 4.4;
                Toast.makeText(MainActivity.this, valor_real+"€ são " +ValorReal+ "R$",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}