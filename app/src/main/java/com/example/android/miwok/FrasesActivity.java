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

        palavras.add(new Palavra("onde você está indo?", "minto wuksus", R.mipmap.ic_launcher));
        palavras.add(new Palavra("qual o seu nome?", "tinnә oyaase'nә", R.mipmap.ic_launcher));
        palavras.add(new Palavra("meu nome é...", "oyaaset...", R.mipmap.ic_launcher));
        palavras.add(new Palavra("como está se sentindo?", "michәksәs?", R.mipmap.ic_launcher));
        palavras.add(new Palavra("estou me sentindo bem", "kuchi achit", R.mipmap.ic_launcher));
        palavras.add(new Palavra("você está vindo?", "әәnәs'aa?", R.mipmap.ic_launcher));
        palavras.add(new Palavra("sim, estou indo", "hәә’ әәnәm", R.mipmap.ic_launcher));
        palavras.add(new Palavra("estou indo", "әәnәm", R.mipmap.ic_launcher));
        palavras.add(new Palavra("vamos", "yoowutis", R.mipmap.ic_launcher));
        palavras.add(new Palavra("venha aqui", "әnni'nem", R.mipmap.ic_launcher));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);
    }
}
