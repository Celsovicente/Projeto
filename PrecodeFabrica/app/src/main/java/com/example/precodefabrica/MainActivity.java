package com.example.precodefabrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView preco_de_fabrica, percentual_lucro, percentual_imposto, lucro_distribuidor, valor_imposto, preco_final;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preco_de_fabrica = findViewById(R.id.tv_preco_fabrica);
        percentual_lucro = findViewById(R.id.tv_percentual_lucro);
        percentual_imposto = findViewById(R.id.tv_percentual_imposto);
        lucro_distribuidor = findViewById(R.id.tv_lucro_distribuidor);
        valor_imposto = findViewById(R.id.tv_valor_imposto);
        preco_final = findViewById(R.id.tv_preco_final);
        calcular = findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Preco_de_Fabrica = Double.parseDouble(preco_de_fabrica.getText().toString());
                double Percentual_de_Lucro = Double.parseDouble(percentual_lucro.getText().toString());
                double Percentual_Imposto = Double.parseDouble(percentual_imposto.getText().toString());

                double Lucro = ((Preco_de_Fabrica * Percentual_de_Lucro) /100);
                double Imposto = ((Preco_de_Fabrica * Percentual_Imposto) / 100);
                double Preco_Final = Preco_de_Fabrica + Lucro - Imposto;

                lucro_distribuidor .setText(String.valueOf(Lucro));
                valor_imposto.setText(String.valueOf(Imposto));
                preco_de_fabrica.setText(String.valueOf(Preco_Final));
            }
        });
    }
}