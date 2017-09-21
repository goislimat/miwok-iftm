package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("onde você está indo?", "minto wuksus"));
        palavras.add(new Palavra("qual o seu nome?", "tinnә oyaase'nә"));
        palavras.add(new Palavra("meu nome é...", "oyaaset..."));
        palavras.add(new Palavra("como está se sentindo?", "michәksәs?"));
        palavras.add(new Palavra("estou me sentindo bem", "kuchi achit"));
        palavras.add(new Palavra("você está vindo?", "әәnәs'aa?"));
        palavras.add(new Palavra("sim, estou indo", "hәә’ әәnәm"));
        palavras.add(new Palavra("estou indo", "әәnәm"));
        palavras.add(new Palavra("vamos", "yoowutis"));
        palavras.add(new Palavra("venha aqui", "әnni'nem"));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras, R.color.categoria_frases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);
    }
}
