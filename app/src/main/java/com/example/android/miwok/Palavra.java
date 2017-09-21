package com.example.android.miwok;

/**
 * Created by goisl on 14/09/2017.
 */

public class Palavra {

    private String mTraducaoPadrao;
    private String mTraducaoMiwok;
    private int mReferenciaImagem;

    public Palavra(String traducaoPadrao, String traducaoMiwok) {
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
    }

    public Palavra(String traducaoPadrao, String traducaoMiwok, int referenciaImagem) {
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
        mReferenciaImagem = referenciaImagem;
    }

    public String getTraducaoPadrao() {
        return mTraducaoPadrao;
    }

    public String getTraducaoMiwok() {
        return mTraducaoMiwok;
    }

    public int getReferenciaImagem() { return mReferenciaImagem; }
}
