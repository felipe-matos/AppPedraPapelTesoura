package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionarPedra(View view){
        verificarGanhador("Pedra");

    }
    public void selecionarPapel(View view){
        verificarGanhador("Papel");

    }
    public void selecionarTesoura(View view){
        verificarGanhador("Tesoura");

    }

    private String gerarEscolhaAleatoria() {

        String [] opcoes = {"pedra","papel","tesoura"};
        int numeroAletario = new Random().nextInt(3);

        ImageView imagemApp = findViewById(R.id.image_app);
        String escolhaApp = opcoes[numeroAletario];

        switch(escolhaApp){
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
            break;
            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;

        }

        return escolhaApp;
    }

    private void verificarGanhador(String escolhaUsuario){

        String escolhaApp = gerarEscolhaAleatoria();

        //System.out.println("Item clicado" + escolhaUsuario);
    }


}