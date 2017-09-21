package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("um", "lutti", R.drawable.number_one));
        palavras.add(new Palavra("dois", "otiiko", R.drawable.number_two));
        palavras.add(new Palavra("três", "tolookosu", R.drawable.number_three));
        palavras.add(new Palavra("quatro", "oyyisa", R.drawable.number_four));
        palavras.add(new Palavra("cindo", "massokka", R.drawable.number_five));
        palavras.add(new Palavra("seis", "temmokka", R.drawable.number_six));
        palavras.add(new Palavra("sete", "kenekaku", R.drawable.number_seven));
        palavras.add(new Palavra("oito", "kawinta", R.drawable.number_eight));
        palavras.add(new Palavra("nove", "wo’e", R.drawable.number_nine));
        palavras.add(new Palavra("dez", "na’aacha", R.drawable.number_ten));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);
    }
}
