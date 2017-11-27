package com.example.uno.practicaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class FichaPeliculas extends AppCompatActivity {
    Pelicula[] info = new Pelicula[5];
    int posicion;
    TextView lblsinopsis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_peliculas);
        posicion = getIntent().getIntExtra("posicion",0);
        info= (Pelicula[]) getIntent().getSerializableExtra("pelicula");
        inicializarUI();
        lblsinopsis.setMovementMethod(new ScrollingMovementMethod());
    }
    public void inicializarUI() {
     lblsinopsis = (TextView) findViewById(R.id.lbl4SinopsisPelicula);
    }
}
