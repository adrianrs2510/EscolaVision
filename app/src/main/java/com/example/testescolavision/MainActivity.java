package com.example.testescolavision;

import androidx.appcompat.app.*;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements EscolaVisionActivityInterface{
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

    int area1;
    int area2;
    int area3;
    int area4;
    int area5;
    private static final String TAG = "EscolaVisionActivity";
    private static final String KEY_INDEX = "index";
    @Override
    public void onCreat(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_escola_vision);

        if (savedInstanceState != null) {
            mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);

        mBoton1 = findViewById(R.id.boton1);
        mBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addValueAnswer(0);
            }
        });
        mBoton2 = findViewById(R.id.boton2);
        mBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addValueAnswer(1);
            }
        });
        mBoton3 = findViewById(R.id.boton3);
        mBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addValueAnswer(2);
            }
        });
        mBoton4 = findViewById(R.id.boton4);
        mBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addValueAnswer(3);
            }
        });

        mNextButton = (Button) findViewById(R.id.botonNext);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();
            }
        });
    }
    private void updateQuestion(){
        //Log.d(TAG, "Updating question text", new Exception());
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }

    private void addValueAnswer(int answerValue) {
        int answerValue2 = mQuestionBank[mCurrentIndex].getAnswerValue();
        int messageResId = 0;
        switch (mCurrentIndex+1){
            case 1: area1 += answerValue;
            case 2: area2 += answerValue;
            case 3: area3 += answerValue;
            case 4: area4 += answerValue;
            case 5: area5 += answerValue;
            case 6: area1 += answerValue;
            case 7: area2 += answerValue;
            case 8: area3 += answerValue;
            case 9: area4 += answerValue;
            case 10: area5 += answerValue;
            case 11: area1 += answerValue;
            case 12: area2 += answerValue;
            case 13: area3 += answerValue;
            case 14: area4 += answerValue;
            case 15: area5 += answerValue;
            case 16: area1 += answerValue;
            case 17: area2 += answerValue;
            case 18: area3 += answerValue;
            case 19: area4 += answerValue;
            case 20: area5 += answerValue;
            case 21: area1 += answerValue;
            case 22: area2 += answerValue;
            case 23: area3 += answerValue;
            case 24: area4 += answerValue;
            case 25: area5 += answerValue;
            case 26: area1 += answerValue;
            case 27: area2 += answerValue;
            case 28: area3 += answerValue;
            case 29: area4 += answerValue;
            case 30: area5 += answerValue;

        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onCreateOptionsMenu(Menu menu,
                                    MenuInflater inflater) {
        super.onCreateOptionsMenu(menu);
        inflater.inflate(R.menu.fragment_crime_list,
                menu);
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}