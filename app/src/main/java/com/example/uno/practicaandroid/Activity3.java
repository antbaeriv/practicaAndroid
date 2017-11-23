package com.example.uno.practicaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    final Pelicula[] info = new Pelicula[]{
            (new Pelicula("Gladiator","Estados Unidos","150 min",R.drawable.gladiator,
                    "https://www.filmaffinity.com/es/film392075.html","http://www.imdb.com/title/tt0172495/?ref_=fn_al_tt_1","https://www.rottentomatoes.com/m/gladiator")),
            (new Pelicula("Reservoir Dogs","Estados Unidos","99 min",R.drawable.reservoirdogs,
                    "https://www.filmaffinity.com/es/film392075.html","http://www.imdb.com/title/tt0172495/?ref_=fn_al_tt_1","https://www.rottentomatoes.com/m/gladiator")),
            (new Pelicula("Terminator","Estados Unidos","108 min",R.drawable.terminator,
                    "https://www.filmaffinity.com/es/film392075.html","http://www.imdb.com/title/tt0172495/?ref_=fn_al_tt_1","https://www.rottentomatoes.com/m/gladiator")),
            (new Pelicula("Shooter","Estados Unidos","124 min",R.drawable.shooter,
                    "https://www.filmaffinity.com/es/film392075.html","http://www.imdb.com/title/tt0172495/?ref_=fn_al_tt_1","https://www.rottentomatoes.com/m/gladiator")),
            (new Pelicula("Léon: the professional","Francia","106 min",R.drawable.leon,
                    "https://www.filmaffinity.com/es/film392075.html","http://www.imdb.com/title/tt0172495/?ref_=fn_al_tt_1","https://www.rottentomatoes.com/m/gladiator"))



    };
    AdaptadorPeliculas adapta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        adapta= new AdaptadorPeliculas(this, info);
        ListView lista = (ListView) findViewById(R.id.lstPeliculas);
        lista.setAdapter(adapta);

        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(
                            AdapterView<?> adapter, View v, int position, long id) {
                        Pelicula item = (Pelicula) adapta.getItem(position);
                        visualiza(item.getTitulo());
                    }
                }
        );
    }

    public void visualiza(String texto) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }
}
