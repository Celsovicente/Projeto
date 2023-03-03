package com.example.salariobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView salario_base;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salario_base = findViewById(R.id.tv_salario);
        calcular = findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double salario = Double.parseDouble(salario_base.getText().toString());
                double salario_receber = salario + ((salario * 5)/100) - ((salario * 7)/100);
                Toast.makeText(MainActivity.this,"O Salário a Receber é de:" +salario_receber,Toast.LENGTH_LONG).show();
            }
        });
    }
}