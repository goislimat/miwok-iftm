package com.example.android.miwok;

/**
 * Created by goisl on 14/09/2017.
 */

public class Palavra {

    private String mTraducaoPadrao;
    private String mTraducaoMiwok;
    private int mReferenciaImagem = SEM_IMAGEM_FORNECIDA;
    private int mReferenciaAudio;
    private static final int SEM_IMAGEM_FORNECIDA = -1;

    public Palavra(String traducaoPadrao, String traducaoMiwok,
                   int referenciaAudio) {
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
        mReferenciaAudio = referenciaAudio;
    }

    public Palavra(String traducaoPadrao, String traducaoMiwok,
                   int referenciaImagem, int referenciaAudio) {
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
        mReferenciaImagem = referenciaImagem;
        mReferenciaAudio = referenciaAudio;
    }

    public String getTraducaoPadrao() {
        return mTraducaoPadrao;
    }

    public String getTraducaoMiwok() {
        return mTraducaoMiwok;
    }

    public int getReferenciaImagem() { return mReferenciaImagem; }

    public boolean hasImagem() {
        return mReferenciaImagem != SEM_IMAGEM_FORNECIDA;
    }
}
