package com.example.uno.practicaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FichaPeliculas extends AppCompatActivity {
    String titulo, anio, director, pais, sinopsis, url1, url2, url3;
    int imagen;
    TextView lblSinopsis, lblTitulo, lblDirector, lblPais, lblAnio;
    ImageView imgPelicula;
    ImageButton atras, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_peliculas);
        titulo = getIntent().getStringExtra("titulo");
        anio = getIntent().getStringExtra("anio");
        pais = getIntent().getStringExtra("pais");
        director = getIntent().getStringExtra("director");
        sinopsis = getIntent().getStringExtra("sinopsis");
        imagen = getIntent().getIntExtra("imagen", 0);
        url1 = getIntent().getStringExtra("url1");
        url2 = getIntent().getStringExtra("url2");
        url3 = getIntent().getStringExtra("url3");
        inicializarUI();
        lblSinopsis.setMovementMethod(new ScrollingMovementMethod());
        lblTitulo.setText(titulo);
        lblAnio.setText(anio);
        lblDirector.setText(director);
        lblPais.setText(pais);
        lblSinopsis.setText(sinopsis);
        imgPelicula.setImageResource(imagen);


    }

    public void inicializarUI() {

        lblTitulo = (TextView) findViewById(R.id.lbl4TituloPelicula);
        lblDirector = (TextView) findViewById(R.id.lbl4DirectorPelicula);
        lblPais = (TextView) findViewById(R.id.lbl4PaisPelicula);
        lblAnio = (TextView) findViewById(R.id.lbl4AnioPelicula);
        imgPelicula = (ImageView) findViewById(R.id.img4Pelicula);
        lblSinopsis = (TextView) findViewById(R.id.lbl4SinopsisPelicula);
        atras = (ImageButton) findViewById(R.id.iBtn4Back);
        home = (ImageButton) findViewById(R.id.iBtn4Home);

    }
}
