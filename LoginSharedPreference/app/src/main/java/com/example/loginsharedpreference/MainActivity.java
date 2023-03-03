package com.example.loginsharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_nome, et_password;
    Button bt_entrar;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String username = "";
    String password = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nome = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        bt_entrar = findViewById(R.id.btn_entrar);
        sp = getSharedPreferences(getString(R.string.username), Context.MODE_PRIVATE);
        username = sp.getString(getString(R.string.username), "");
        et_nome.setText(username);

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = et_nome.getText().toString();
                password = et_password.getText().toString();

                editor = sp.edit();
                editor.putString(getString(R.string.username), username);
                editor.apply();

                if(username.trim().equals("user") && password.trim().equals("pass"))
                {
                    Toast.makeText(MainActivity.this, "Login Válido", Toast.LENGTH_SHORT).show();

                }
                else
                    {
                        Toast.makeText(MainActivity.this, "Login Inválido", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}