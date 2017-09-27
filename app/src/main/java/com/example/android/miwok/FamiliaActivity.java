package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavra> palavras = new ArrayList<>();

        palavras.add(new Palavra("pai", "әpә", R.drawable.family_father, R.raw.family_father));
        palavras.add(new Palavra("mãe", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        palavras.add(new Palavra("filho", "angsi", R.drawable.family_son, R.raw.family_son));
        palavras.add(new Palavra("filha", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        palavras.add(new Palavra("irmão mais velho", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        palavras.add(new Palavra("irmão mais novo", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        palavras.add(new Palavra("irmã mais velha", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        palavras.add(new Palavra("irmã mais nova", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        palavras.add(new Palavra("avó", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        palavras.add(new Palavra("avô", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        PalavraAdapter itensAdapter = new PalavraAdapter(this, palavras, R.color.categoria_familia);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itensAdapter);
    }
}
