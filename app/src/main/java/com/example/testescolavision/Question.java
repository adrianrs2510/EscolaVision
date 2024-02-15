package com.example.testescolavision;

public class Question {
    private int mTextResId;
    private int mAnswerValue;
    public Question(int textResId, int answerValue) {
        mTextResId = textResId;
        mAnswerValue = answerValue;
    }
    public int getTextResId() {
        return mTextResId;
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
