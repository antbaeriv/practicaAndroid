package com.example.uno.practicaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FichaPeliculas extends AppCompatActivity {
    String titulo, anio, director, pais, sinopsis, url1, url2, url3;
    int imagen;
    TextView lblSinopsis, lblTitulo, lblDirector, lblPais, lblAnio;
    ImageView imgPelicula;
    ImageButton atras, home;
    String[]enlaces = {"Seleccione un enlace para tener mas información:", "Filmaffinity", "IMDB", "Rotten Romatoes"};
    Spinner spnEnlaces;


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
        spnEnlaces.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,enlaces));


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
        spnEnlaces = (Spinner) findViewById(R.id.spn4EnlacesPeliculas);

    }

    public void accederEnlace(View v){
        //String generoS = spnGen.getSelectedItem().toString();
        Integer link = spnEnlaces.getSelectedItemPosition();
        if(link==0){
            Toast.makeText(this, R.string.validez, Toast.LENGTH_SHORT).show();
        }else{
            Intent intento = new Intent();
            intento.putExtra("link",link);
            startActivity(intento);
        }


    }
    public void mostrarInicio(View v) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void volverAtras(View v) {
        Intent intencion = new Intent(getApplicationContext(), ListaPeliculas.class);
        startActivity(intencion);
    }
}
