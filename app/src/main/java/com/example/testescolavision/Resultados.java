package com.example.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

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

 */
    TextView result;
@SuppressLint("MissingInflatedId")
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.resultados);
    Bundle recibeDatos = getIntent().getExtras();
    int area1 = recibeDatos.getInt("area1");
    int area2 = recibeDatos.getInt("area2");
    int area3 = recibeDatos.getInt("area3");
    int area4 = recibeDatos.getInt("area4");
    int area5 = recibeDatos.getInt("area5");
    /*
    result = findViewById(R.id.resultadosint);

    result.setText(area1);

     */
}

}