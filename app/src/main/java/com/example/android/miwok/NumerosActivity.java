package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("um", "lutti", R.drawable.number_one, R.raw.number_one));
        palavras.add(new Palavra("dois", "otiiko", R.drawable.number_two, R.raw.number_two));
        palavras.add(new Palavra("três", "tolookosu", R.drawable.number_three, R.raw.number_three));
        palavras.add(new Palavra("quatro", "oyyisa", R.drawable.number_four, R.raw.number_four));
        palavras.add(new Palavra("cindo", "massokka", R.drawable.number_five, R.raw.number_five));
        palavras.add(new Palavra("seis", "temmokka", R.drawable.number_six, R.raw.number_six));
        palavras.add(new Palavra("sete", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        palavras.add(new Palavra("oito", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        palavras.add(new Palavra("nove", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        palavras.add(new Palavra("dez", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras, R.color.categoria_numeros);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mMediaPlayer = MediaPlayer
                        .create(NumerosActivity.this, R.raw.number_one);
                mMediaPlayer.start();
            }
        });
    }
}
