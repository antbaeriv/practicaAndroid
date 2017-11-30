package com.example.uno.practicaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FichaPeliculas extends AppCompatActivity {
    Pelicula[] info = new Pelicula[5];
    int posicion;
    TextView lblSinopsis, lblTitulo, lblDirector, lblPais, lblAnio;
    ImageView imgPelicula;
    ImageButton atras, home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_peliculas);
        posicion = getIntent().getIntExtra("posicion",0);
        info= (Pelicula[]) getIntent().getSerializableExtra("pelicula");
        inicializarUI();
        lblSinopsis.setMovementMethod(new ScrollingMovementMethod());
        lblSinopsis.setText(info[posicion].getSinopsis());
        lblTitulo.setText(info[posicion].getTitulo());
        lblAnio.setText(info[posicion].getAnio());
        lblDirector.setText(info[posicion].getDirector());
        lblPais.setText(info[posicion].getNacionalidad());
        imgPelicula.setImageResource(info[posicion].getImagen());
        atras = (ImageButton)findViewById(R.id.iBtn4Back);
        home = (ImageButton)findViewById(R.id.iBtn4Home);
    }
    public void inicializarUI() {
     lblSinopsis = (TextView) findViewById(R.id.lbl4SinopsisPelicula);
     lblTitulo = (TextView) findViewById(R.id.lbl4TituloPelicula);
     lblDirector = (TextView) findViewById(R.id.lbl4TituloPelicula);
     lblPais = (TextView) findViewById(R.id.lbl4TituloPelicula);
     lblAnio = (TextView) findViewById(R.id.lbl4TituloPelicula);
     imgPelicula = (ImageView) findViewById(R.id.img4Pelicula);

    }
}
