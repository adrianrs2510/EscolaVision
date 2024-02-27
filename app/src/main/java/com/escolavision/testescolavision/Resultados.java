package com.escolavision.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Resultados extends AppCompatActivity {
/*
    private RecyclerView recyclerView;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);

        recyclerView = findViewById(R.id.recyclerView);

        // Supongamos que dataList es una lista de enteros que quieres mostrar
        List<Integer> dataList = obtenerDatos(); // Debes implementar este método

        adapter = new CustomAdapter(dataList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Método de ejemplo para obtener datos
    private List<Integer> obtenerDatos() {
        List<Integer> datos = new ArrayList<>();
        datos.add(1);
        datos.add(2);
        datos.add(3);
        // Agrega más datos según sea necesario
        return datos;
    }
 */
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.fragment_resultados_list, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent intent = new Intent(Resultados.this, Inicio.class);
        startActivity(intent);
        return true;
    }


    TextView resultadoArea1;
    TextView resultadoArea2;
    TextView resultadoArea3;
    TextView resultadoArea4;
    TextView resultadoArea5;
    Bundle bundle;
    ImageView informacionArea1;
    ImageView informacionArea2;
    ImageView informacionArea3;
    ImageView informacionArea4;
    ImageView informacionArea5;


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

    resultadoArea1.setText(area1);
    resultadoArea2.setText(area2);
    resultadoArea3.setText(area3);
    resultadoArea4.setText(area4);
    resultadoArea5.setText(area5);


    informacionArea1 = findViewById(R.id.infoArea1);
    informacionArea1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area1.html");
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

    informacionArea3 = findViewById(R.id.infoArea3);
    informacionArea3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area3.html");
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

    informacionArea5 = findViewById(R.id.infoArea5);
    informacionArea5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("https://escolavision.github.io/EscolaVision/area5.html");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    });



}

}