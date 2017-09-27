package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        final ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("onde você está indo?", "minto wuksus", R.raw.phrase_where_are_you_going));
        palavras.add(new Palavra("qual o seu nome?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        palavras.add(new Palavra("meu nome é...", "oyaaset...", R.raw.phrase_my_name_is));
        palavras.add(new Palavra("como está se sentindo?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        palavras.add(new Palavra("estou me sentindo bem", "kuchi achit", R.raw.phrase_im_feeling_good));
        palavras.add(new Palavra("você está vindo?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        palavras.add(new Palavra("sim, estou indo", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        palavras.add(new Palavra("estou indo", "әәnәm", R.raw.phrase_im_coming));
        palavras.add(new Palavra("vamos", "yoowutis", R.raw.phrase_lets_go));
        palavras.add(new Palavra("venha aqui", "әnni'nem", R.raw.phrase_come_here));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras, R.color.categoria_frases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                Palavra palavraClicada = palavras.get(position);
                mMediaPlayer = MediaPlayer
                        .create(FrasesActivity.this, palavraClicada.getReferenciaAudio());
                mMediaPlayer.start();
            }
        });
    }
}
