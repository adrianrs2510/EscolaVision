package com.example.testescolavision;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    private Button mBoton1;
    private Button mBoton2;
    private Button mBoton3;
    private Button mBoton4;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private Question[] mQuestionBank = new Question[] {
            new Question(R.string.question_text_1, 0),
            new Question(R.string.question_text_2, 0),
            new Question(R.string.question_text_3, 0),
            new Question(R.string.question_text_4, 0),
            new Question(R.string.question_text_5, 0),
            new Question(R.string.question_text_6, 0),
            new Question(R.string.question_text_7, 0),
            new Question(R.string.question_text_8, 0),
            new Question(R.string.question_text_9, 0),
            new Question(R.string.question_text_10, 0),
            new Question(R.string.question_text_11, 0),
            new Question(R.string.question_text_12, 0),
            new Question(R.string.question_text_13, 0),
            new Question(R.string.question_text_14, 0),
            new Question(R.string.question_text_15, 0),
            new Question(R.string.question_text_16, 0),
            new Question(R.string.question_text_17, 0),
            new Question(R.string.question_text_18, 0),
            new Question(R.string.question_text_19, 0),
            new Question(R.string.question_text_20, 0),
            new Question(R.string.question_text_21, 0),
            new Question(R.string.question_text_22, 0),
            new Question(R.string.question_text_23, 0),
            new Question(R.string.question_text_24, 0),
            new Question(R.string.question_text_25, 0),
            new Question(R.string.question_text_26, 0),
            new Question(R.string.question_text_27, 0),
            new Question(R.string.question_text_28, 0),
            new Question(R.string.question_text_29, 0),
            new Question(R.string.question_text_30, 0),
            new Question(R.string.question_text_31, 0),
            new Question(R.string.question_text_32, 0),
            new Question(R.string.question_text_33, 0),
            new Question(R.string.question_text_34, 0),
            new Question(R.string.question_text_35, 0),
            new Question(R.string.question_text_36, 0),
            new Question(R.string.question_text_37, 0),
            new Question(R.string.question_text_38, 0),
            new Question(R.string.question_text_39, 0),
            new Question(R.string.question_text_40, 0),
            new Question(R.string.question_text_41, 0),
            new Question(R.string.question_text_42, 0),
            new Question(R.string.question_text_43, 0),
            new Question(R.string.question_text_44, 0),
            new Question(R.string.question_text_45, 0),
            new Question(R.string.question_text_46, 0),
            new Question(R.string.question_text_47, 0),
            new Question(R.string.question_text_48, 0),
            new Question(R.string.question_text_49, 0),
            new Question(R.string.question_text_50, 0),
            new Question(R.string.question_text_51, 0),
            new Question(R.string.question_text_52, 0),
            new Question(R.string.question_text_53, 0),
            new Question(R.string.question_text_54, 0),
            new Question(R.string.question_text_55, 0),
            new Question(R.string.question_text_56, 0),
            new Question(R.string.question_text_57, 0),
            new Question(R.string.question_text_58, 0),
            new Question(R.string.question_text_59, 0),
            new Question(R.string.question_text_60, 0)

    };
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        mQuestionTextView = (TextView) findViewById(R.id.);
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        mBoton1 = findViewById(R.id.boton1);
        mBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_LONG).show();
            }
        });
        mBoton2 = findViewById(R.id.boton2);
        mBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_LONG).show();
            }
        });
        mBoton3 = findViewById(R.id.boton3);
        mBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_LONG).show();
            }
        });
        mBoton4 = findViewById(R.id.boton4);
        mBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
