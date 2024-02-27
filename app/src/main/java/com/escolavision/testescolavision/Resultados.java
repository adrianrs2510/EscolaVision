package com.escolavision.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

@SuppressLint("MissingInflatedId")
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


}

}