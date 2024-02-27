package com.escolavision.testescolavision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Instrucciones extends AppCompatActivity {
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrucciones);

        boton1 = (Button) findViewById(R.id.buttonScroll);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmpezarTest(v);
            }
        });
    }
    public void EmpezarTest(View v){
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        finish();
        return true;
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.fragment_resultados_list, menu);
        return true;
    }

}