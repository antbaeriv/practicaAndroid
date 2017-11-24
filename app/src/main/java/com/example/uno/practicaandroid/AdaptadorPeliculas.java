package com.example.uno.practicaandroid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JSureda on 23/11/2017.
 */

public class AdaptadorPeliculas extends ArrayAdapter {
    Activity act;
    Pelicula[] info;

    AdaptadorPeliculas(Activity act, Pelicula[] info) {
        super(act, R.layout.info_peliculas, info);
        this.act = act;
        this.info = info;
    };

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        PeliculaHolder holder;

        if (item == null) {
            LayoutInflater inflater = act.getLayoutInflater();

            item = inflater.inflate(R.layout.info_peliculas, null);
            holder = new PeliculaHolder();
            holder.titulo = (TextView) item.findViewById(R.id.lblTitulo);
            holder.anio = (TextView) item.findViewById(R.id.lblAnio);
            holder.duracion = (TextView) item.findViewById(R.id.lblDuracion);
            holder.pais = (TextView) item.findViewById(R.id.lblPais) ;
            holder.imagen = (ImageView) item.findViewById(R.id.imgLista) ;
            item.setTag(holder);
        } else {
            holder = (PeliculaHolder) item.getTag();
        }


        holder.titulo.setText(info[position].getTitulo());
        holder.anio.setText(info[position].getAnio());
        holder.duracion.setText(info[position].getDuracion());
        holder.pais.setText(info[position].getNacionalidad());
        holder.imagen.setImageResource(info[position].getImagen());
        return (item);
    }
}
