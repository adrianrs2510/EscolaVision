package com.escolavision.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Resultados extends AppCompatActivity {

    TextView resultadoArea1;
    TextView resultadoArea2;
    TextView resultadoArea3;
    TextView resultadoArea4;
    TextView resultadoArea5;

    TextView area11;
    TextView area22;
    TextView area33;
    TextView area44;
    TextView area55;
    Bundle bundle;
    ImageView informacionArea1;
    ImageView informacionArea2;
    ImageView informacionArea3;
    ImageView informacionArea4;
    ImageView informacionArea5;
    Button repetirTest;
    Button irAInicio;





@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.resultados);


    bundle  = getIntent().getExtras();
    assert bundle != null;
    String area1 = bundle.getString("area1");
    String area2 = bundle.getString("area2");
    String area3 = bundle.getString("area3");
    String area4 = bundle.getString("area4");
    String area5 = bundle.getString("area5");

    resultadoArea1 = (TextView) findViewById(R.id.resultadoArea1);
    resultadoArea2 = (TextView) findViewById(R.id.resultadoArea2);
    resultadoArea3 = (TextView) findViewById(R.id.resultadoArea3);
    resultadoArea4 = (TextView) findViewById(R.id.resultadoArea4);
    resultadoArea5 = (TextView) findViewById(R.id.resultadoArea5);
    repetirTest = (Button) findViewById(R.id.repetirTest);
    irAInicio = (Button) findViewById(R.id.volverInicio);
    area11 = (TextView) findViewById(R.id.textView71);
    area22 = (TextView) findViewById(R.id.textView67);
    area33 = (TextView) findViewById(R.id.textView69);
    area44 = (TextView) findViewById(R.id.area4);
    area55 = (TextView) findViewById(R.id.area5);


    resultadoArea1.setText(area1);
    resultadoArea2.setText(area2);
    resultadoArea3.setText(area3);
    resultadoArea4.setText(area4);
    resultadoArea5.setText(area5);
    area11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area1.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });

    informacionArea1 = findViewById(R.id.infoArea1);
    informacionArea1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area1.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });
    area22.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area2.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });

    informacionArea2 = findViewById(R.id.infoArea2);
    informacionArea2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area2.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });

    area33.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area3.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });
    informacionArea3 = findViewById(R.id.infoArea3);
    informacionArea3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area3.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });
    area44.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area4.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });
    informacionArea4 = findViewById(R.id.infoArea4);
    informacionArea4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area4.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });

    area55.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area5.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });
    informacionArea5 = findViewById(R.id.infoArea5);
    informacionArea5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area5.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });

    irAInicio.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            irInicio();
        }
    });
    repetirTest.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EmpezarTest();
        }
    });
}

    private void irInicio(){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }
    private void EmpezarTest(){
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }
}