package com.example.uno.practicaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InfoPeliculas extends AppCompatActivity {
    Pelicula[] info = new Pelicula[5];
    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.InfoPeliculas);
        posicion = getIntent().getIntExtra("posicion",0);
        info= (Pelicula[]) getIntent().getSerializableExtra("pelicula");
    }
}
