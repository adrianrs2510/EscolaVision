package com.escolavision.testescolavision;

public class Question {
    private int mTextResId;
    private int mAnswerValue;
    private int numeroPregunta;
    public Question(int textResId, int answerValue, int nPregunta) {
        mTextResId = textResId;
        mAnswerValue = answerValue;
        numeroPregunta = nPregunta;
    }
    public int getTextResId() {
        return mTextResId;
    }
    public int getNumeroPregunta(){
        return this.numeroPregunta;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getAnswerValue() {
        return mAnswerValue;
    }

    public void setAnswerValue(int answerValue) {
        mAnswerValue = answerValue;
    }

}
