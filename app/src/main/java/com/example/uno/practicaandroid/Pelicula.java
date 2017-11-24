package com.example.uno.practicaandroid;


public class Pelicula {
    private int titulo;
    private int nacionalidad;
    private int duracion;
    private int anio;
    private int director;
    private int sinopsis;
    private int imagen;
    private int urlFil;
    private int urlImdb;
    private int urlRt;

    public Pelicula(int titulo, int nacionalidad, int duracion, int anio, int director, int sinopsis, int imagen, int urlFil, int urlImdb, int urlRt) {
        this.titulo = titulo;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.anio = anio;
        this.director = director;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
        this.urlFil = urlFil;
        this.urlImdb = urlImdb;
        this.urlRt = urlRt;
    }

    public int getTitulo() {
        return titulo;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    public int getDirector() {
        return director;
    }

    public int getSinopsis() {
        return sinopsis;
    }

    public int getImagen() {
        return imagen;
    }

    public int getUrlFil() {
        return urlFil;
    }

    public int getUrlImdb() {
        return urlImdb;
    }

    public int getUrlRt() {
        return urlRt;
    }
}
