package com.example.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrollView extends AppCompatActivity {
    private Button mboton3;
    private Button mboton2;
    private Button[] botones = {



    };
    int area1;
    int area2;
    int area3;
    int area4;
    int area5;
    public static int[] botonesId = {
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button6,
            R.id.button7,
            R.id.button8
    };

    private static final String TAG = "ScrollView";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);


        mboton3 = (Button) findViewById(R.id.button3);
        mboton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                area1 += 0;
                Log.d(TAG, "+0");
                mboton2.setEnabled(false);
            }
        });

        mboton2 = (Button) findViewById(R.id.button2);
        mboton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mboton3.setEnabled(false);
            }
        });

        /*private void addValueAnswer(int answerValue) {
            for (int botonId : botonesId){
                switch (botonId){
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
            }



        }
         */
    }
}