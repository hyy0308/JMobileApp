package com.hewhywhy.jvocabapp;

public class Vocab {
    private int vocabId;
    private int vocabTransId;
    public Vocab(int vocabId, int vocabTransId)
    {
        this.vocabId = vocabId;
        this.vocabTransId = vocabTransId;
    }

    //Vocab Id setter and getter
    public void setVocabId(int vocab)
    {
        this.vocabId = vocab;
    }
    public int getVocabId()
    {
        return this.vocabId;
    }

    //vocab translation setter and getter
    public void setVocabTransId(int vocabTrans)
    {
        this.vocabTransId = vocabTrans;
    }
    public int getVocabTransId()
    {
        return this.vocabTransId;
    }

}
