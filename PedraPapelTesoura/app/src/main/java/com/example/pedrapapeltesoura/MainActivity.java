package com.example.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pedra(View view){

    }

    public void papel(View view){

    }

    public void tesoura(View view){

    }

    public void resutado(String escolhaDoUsuario){
        String lista[] = {"Pedra", "Papel", "Tesoura"};
        Random random = new Random();
        int i = random.nextInt(3);

    }
}

    public void pedra(View view){

    }

    public void papel(View view){

    }

    public void tesoura(View view){

    }

    public void resutado(String escolhaDoUsuario){
        String lista[] = {"Pedra", "Papel", "Tesoura"};
        Random random = new Random();
        int i = random.nextInt(3);
    }
}