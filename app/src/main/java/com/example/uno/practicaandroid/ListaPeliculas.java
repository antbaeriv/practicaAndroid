package com.example.uno.practicaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaPeliculas extends AppCompatActivity {
    int categoria=R.string.cat1;
    ListView lista;
    Pelicula[] info = new Pelicula[5];
    AdaptadorPeliculas adapta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_peliculas);
        //categoria = getIntent().getStringExtra("Usuario");
        rellenarArray(categoria);
        inicializarUI();
        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(
                            AdapterView<?> adapter, View v, int position, long id) {
                        Intent intencion = new Intent(getApplicationContext(), FichaPeliculas.class);
                        intencion.putExtra("pelicula",info);
                        intencion.putExtra("posicion",position);
                        startActivity(intencion);
                    }
                }
        );
    }

    public void inicializarUI() {
        adapta = new AdaptadorPeliculas(this, info);
        lista = (ListView) findViewById(R.id.lst3Peliculas);
        lista.setAdapter(adapta);
    }

    public void rellenarArray(int cat) {
        if (cat==(R.string.cat1)) {
            info[0] = (new Pelicula(R.string.tituloAC1, R.string.paisAC1, R.string.duracionAC1, R.string.anioAC1, R.string.directorAC1, R.string.sinopsisAC1, R.drawable.gladiator, R.string.urlFilmAC1, R.string.urlIMDBAC1, R.string.urlIRTAC1));
            info[1] = (new Pelicula(R.string.tituloAC2, R.string.paisAC2, R.string.duracionAC2, R.string.anioAC2, R.string.directorAC2, R.string.sinopsisAC2, R.drawable.reservoirdogs, R.string.urlFilmAC2, R.string.urlIMDBAC2, R.string.urlIRTAC2));
            info[2] = (new Pelicula(R.string.tituloAC3, R.string.paisAC3, R.string.duracionAC3, R.string.anioAC3, R.string.directorAC3, R.string.sinopsisAC3, R.drawable.terminator, R.string.urlFilmAC3, R.string.urlIMDBAC3, R.string.urlIRTAC3));
            info[3] = (new Pelicula(R.string.tituloAC4, R.string.paisAC4, R.string.duracionAC4, R.string.anioAC4, R.string.directorAC4, R.string.sinopsisAC4, R.drawable.shooter, R.string.urlFilmAC4, R.string.urlIMDBAC4, R.string.urlIRTAC4));
            info[4] = (new Pelicula(R.string.tituloAC5, R.string.paisAC5, R.string.duracionAC5, R.string.anioAC5, R.string.directorAC5, R.string.sinopsisAC5, R.drawable.leon, R.string.urlFilmAC5, R.string.urlIMDBAC5, R.string.urlIRTAC5));

        } else if (cat==(R.string.cat2)) {
            info[0] = (new Pelicula(R.string.tituloDM1, R.string.paisDM1, R.string.duracionDM1, R.string.anioDM1, R.string.directorDM1, R.string.sinopsisDM1, R.drawable.gladiator, R.string.urlFilmAC1, R.string.urlIMDBAC1, R.string.urlIRTAC1));
            info[1] = (new Pelicula(R.string.tituloAC2, R.string.paisAC2, R.string.duracionAC2, R.string.anioAC2, R.string.directorAC2, R.string.sinopsisAC2, R.drawable.reservoirdogs, R.string.urlFilmAC2, R.string.urlIMDBAC2, R.string.urlIRTAC2));
            info[2] = (new Pelicula(R.string.tituloAC3, R.string.paisAC3, R.string.duracionAC3, R.string.anioAC3, R.string.directorAC3, R.string.sinopsisAC3, R.drawable.terminator, R.string.urlFilmAC3, R.string.urlIMDBAC3, R.string.urlIRTAC3));
            info[3] = (new Pelicula(R.string.tituloAC4, R.string.paisAC4, R.string.duracionAC4, R.string.anioAC4, R.string.directorAC4, R.string.sinopsisAC4, R.drawable.shooter, R.string.urlFilmAC4, R.string.urlIMDBAC4, R.string.urlIRTAC4));
            info[4] = (new Pelicula(R.string.tituloAC5, R.string.paisAC5, R.string.duracionAC5, R.string.anioAC5, R.string.directorAC5, R.string.sinopsisAC5, R.drawable.leon, R.string.urlFilmAC5, R.string.urlIMDBAC5, R.string.urlIRTAC5));

        } else if (cat==(R.string.cat3)) {
            info[0] = (new Pelicula(R.string.tituloAC1, R.string.paisAC1, R.string.duracionAC1, R.string.anioAC1, R.string.directorAC1, R.string.sinopsisAC1, R.drawable.gladiator, R.string.urlFilmAC1, R.string.urlIMDBAC1, R.string.urlIRTAC1));
            info[1] = (new Pelicula(R.string.tituloAC2, R.string.paisAC2, R.string.duracionAC2, R.string.anioAC2, R.string.directorAC2, R.string.sinopsisAC2, R.drawable.reservoirdogs, R.string.urlFilmAC2, R.string.urlIMDBAC2, R.string.urlIRTAC2));
            info[2] = (new Pelicula(R.string.tituloAC3, R.string.paisAC3, R.string.duracionAC3, R.string.anioAC3, R.string.directorAC3, R.string.sinopsisAC3, R.drawable.terminator, R.string.urlFilmAC3, R.string.urlIMDBAC3, R.string.urlIRTAC3));
            info[3] = (new Pelicula(R.string.tituloAC4, R.string.paisAC4, R.string.duracionAC4, R.string.anioAC4, R.string.directorAC4, R.string.sinopsisAC4, R.drawable.shooter, R.string.urlFilmAC4, R.string.urlIMDBAC4, R.string.urlIRTAC4));
            info[4] = (new Pelicula(R.string.tituloAC5, R.string.paisAC5, R.string.duracionAC5, R.string.anioAC5, R.string.directorAC5, R.string.sinopsisAC5, R.drawable.leon, R.string.urlFilmAC5, R.string.urlIMDBAC5, R.string.urlIRTAC5));

        }
    }
}
