package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class ListaPeliculas extends AppCompatActivity {
    String nombre;
    Integer categoria;
    ListView lista;
    ImageButton atras, home;
    Pelicula[] info = new Pelicula[5];
    AdaptadorPeliculas adapta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_peliculas);
        nombre = getIntent().getStringExtra("usuario");
        categoria = getIntent().getIntExtra("genero", 0);
        rellenarArray(categoria);
        adapta= new AdaptadorPeliculas(this, info);
        inicializarUI();
        lista.setAdapter(adapta);
        lista.setOnItemClickListener(

        new AdapterView.OnItemClickListener() {
            public void onItemClick(
                    AdapterView<?> adapter, View v, int position, long id) {
                Intent intencion = new Intent(getApplicationContext(), FichaPeliculas.class);
                intencion.putExtra("titulo", getString(info[position].getTitulo()));
                intencion.putExtra("anio", getString(info[position].getAnio()));
                intencion.putExtra("pais", getString(info[position].getNacionalidad()));
                intencion.putExtra("director", getString(info[position].getDirector()));
                intencion.putExtra("sinopsis", getString(info[position].getSinopsis()));
                intencion.putExtra("imagen", info[position].getImagen());
                intencion.putExtra("url1", getString(info[position].getUrlFil()));
                intencion.putExtra("url2", getString(info[position].getUrlImdb()));
                intencion.putExtra("url3", getString(info[position].getUrlRt()));
                intencion.putExtra("usuario",nombre);
                startActivity(intencion);
            }
        }
        );
    }

    public void inicializarUI() {
        adapta = new AdaptadorPeliculas(this, info);
        atras = (ImageButton) findViewById(R.id.btn3Back);
        home = (ImageButton) findViewById(R.id.btn3Home);
        lista = (ListView) findViewById(R.id.lst3Peliculas);
        lista.setAdapter(adapta);
    }

    public void rellenarArray(Integer categ) {
        if (categ == 1) {
            info[0] = (new Pelicula(R.string.tituloAC1, R.string.paisAC1, R.string.duracionAC1, R.string.anioAC1, R.string.directorAC1, R.string.sinopsisAC1, R.drawable.gladiator, R.string.urlFilmAC1, R.string.urlIMDBAC1, R.string.urlRTAC1));
            info[1] = (new Pelicula(R.string.tituloAC2, R.string.paisAC2, R.string.duracionAC2, R.string.anioAC2, R.string.directorAC2, R.string.sinopsisAC2, R.drawable.reservoirdogs, R.string.urlFilmAC2, R.string.urlIMDBAC2, R.string.urlRTAC2));
            info[2] = (new Pelicula(R.string.tituloAC3, R.string.paisAC3, R.string.duracionAC3, R.string.anioAC3, R.string.directorAC3, R.string.sinopsisAC3, R.drawable.terminator, R.string.urlFilmAC3, R.string.urlIMDBAC3, R.string.urlRTAC3));
            info[3] = (new Pelicula(R.string.tituloAC4, R.string.paisAC4, R.string.duracionAC4, R.string.anioAC4, R.string.directorAC4, R.string.sinopsisAC4, R.drawable.shooter, R.string.urlFilmAC4, R.string.urlIMDBAC4, R.string.urlRTAC4));
            info[4] = (new Pelicula(R.string.tituloAC5, R.string.paisAC5, R.string.duracionAC5, R.string.anioAC5, R.string.directorAC5, R.string.sinopsisAC5, R.drawable.leon, R.string.urlFilmAC5, R.string.urlIMDBAC5, R.string.urlRTAC5));

        } else if (categ == 2) {
            info[0] = (new Pelicula(R.string.tituloDM1, R.string.paisDM1, R.string.duracionDM1, R.string.anioDM1, R.string.directorDM1, R.string.sinopsisDM1, R.drawable.cadenaperp, R.string.urlFilmDM1, R.string.urlIMDBDM1, R.string.urlRTDM1));
            info[1] = (new Pelicula(R.string.tituloDM2, R.string.paisDM2, R.string.duracionDM2, R.string.anioDM2, R.string.directorDM2, R.string.sinopsisDM2, R.drawable.casablanca, R.string.urlFilmDM2, R.string.urlIMDBAC2, R.string.urlRTDM2));
            info[2] = (new Pelicula(R.string.tituloDM3, R.string.paisDM3, R.string.duracionDM3, R.string.anioDM3, R.string.directorDM3, R.string.sinopsisDM3, R.drawable.cisnenegro, R.string.urlFilmDM3, R.string.urlIMDBDM3, R.string.urlRTDM3));
            info[3] = (new Pelicula(R.string.tituloDM4, R.string.paisDM4, R.string.duracionDM4, R.string.anioDM4, R.string.directorDM4, R.string.sinopsisDM4, R.drawable.imposible, R.string.urlFilmDM4, R.string.urlIMDBDM4, R.string.urlRTDM4));
            info[4] = (new Pelicula(R.string.tituloDM5, R.string.paisDM5, R.string.duracionDM5, R.string.anioDM5, R.string.directorDM5, R.string.sinopsisDM5, R.drawable.titanic, R.string.urlFilmDM5, R.string.urlIMDBDM5, R.string.urlRTDM5));

        } else if (categ == 3) {
            info[0] = (new Pelicula(R.string.tituloSF1, R.string.paisSF1, R.string.duracionSF1, R.string.anioSF1, R.string.directorSF1, R.string.sinopsisSF1, R.drawable.rogue, R.string.urlFilmSF1, R.string.urlIMDBSF1, R.string.urlRTSF1));
            info[1] = (new Pelicula(R.string.tituloSF2, R.string.paisSF2, R.string.duracionSF2, R.string.anioSF2, R.string.directorSF2, R.string.sinopsisSF2, R.drawable.odisea, R.string.urlFilmSF2, R.string.urlIMDBSF2, R.string.urlRTSF2));
            info[2] = (new Pelicula(R.string.tituloSF3, R.string.paisSF3, R.string.duracionSF3, R.string.anioSF3, R.string.directorSF3, R.string.sinopsisSF3, R.drawable.startrek, R.string.urlFilmSF3, R.string.urlIMDBSF3, R.string.urlRTSF3));
            info[3] = (new Pelicula(R.string.tituloSF4, R.string.paisSF4, R.string.duracionSF4, R.string.anioSF4, R.string.directorSF4, R.string.sinopsisSF4, R.drawable.brunner, R.string.urlFilmSF4, R.string.urlIMDBSF4, R.string.urlRTSF4));
            info[4] = (new Pelicula(R.string.tituloSF5, R.string.paisSF5, R.string.duracionSF5, R.string.anioSF5, R.string.directorSF5, R.string.sinopsisSF5, R.drawable.matrix, R.string.urlFilmSF5, R.string.urlIMDBSF5, R.string.urlRTSF5));

        }
    }

    public void mostrarInicio(View v) {
        Intent i = new Intent(getApplicationContext(),Portada.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void volverAtras(View v) {
        onBackPressed();
    }
}
