package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by goisl on 14/09/2017.
 */

public class PalavraAdapter extends ArrayAdapter<Palavra> {

    public PalavraAdapter(Activity context, ArrayList<Palavra> palavras) {
        super(context, 0, palavras);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemListaView = convertView;

        if(itemListaView == null) {
            itemListaView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        Palavra palavraAtual = getItem(position);

        TextView miwok = (TextView) itemListaView.findViewById(R.id.miwok);
        miwok.setText(palavraAtual.getTraducaoMiwok());

        TextView padrao = (TextView) itemListaView.findViewById(R.id.padrao);
        padrao.setText(palavraAtual.getTraducaoPadrao());

        ImageView imagem = (ImageView) itemListaView.findViewById(R.id.container_imagem);
        imagem.setImageResource(palavraAtual.getReferenciaImagem());

        return itemListaView;
    }
}