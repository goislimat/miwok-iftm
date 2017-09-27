package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("vermelho", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        palavras.add(new Palavra("verde", "chokokki", R.drawable.color_green, R.raw.color_green));
        palavras.add(new Palavra("marrom", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        palavras.add(new Palavra("cinza", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        palavras.add(new Palavra("preto", "kululli", R.drawable.color_black, R.raw.color_black));
        palavras.add(new Palavra("branco", "kelelli", R.drawable.color_white, R.raw.color_white));
        palavras.add(new Palavra("amarelo areia", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        palavras.add(new Palavra("amarelo mostarda", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras, R.color.categoria_cores);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);
    }
}
