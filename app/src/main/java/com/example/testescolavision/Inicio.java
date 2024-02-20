package com.example.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        boton = (Button) findViewById(R.id.buttonInicio);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irInicio(v);
            }
        });
    }
    public void irInicio(View v){
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }
}