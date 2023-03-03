package com.example.sharedpreferenceactivity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt_ok;
    TextView tv_valor;
    EditText et_valor;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_valor = findViewById(R.id.tv_valor);
        et_valor = findViewById(R.id.et_valor);
        bt_ok = findViewById(R.id.btn_ok);
        sp = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        String resultado = sp.getString(getString(R.string.app_name), "");
        tv_valor.setText("Valor: " +resultado);

        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor = sp.edit();
                editor.putString(getString(R.string.app_name), et_valor.getText().toString());
                editor.apply();
                tv_valor.setText("Valor: " +et_valor.getText().toString());
            }
        });
    }
}