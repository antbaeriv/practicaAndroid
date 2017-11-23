package com.example.uno.practicaandroid;


public class Pelicula {
    private String titulo;
    private String nacionalidad;
    private String duracion;
    private int imagen;
    private String urlFil;
    private String urlImdb;
    private String urlRt;

    public Pelicula(String titulo, String nacionalidad, String duracion, int imagen, String urlFil, String urlImdb, String urlRt) {
        this.titulo = titulo;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.imagen = imagen;
        this.urlFil = urlFil;
        this.urlImdb = urlImdb;
        this.urlRt = urlRt;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getUrlFil() {
        return urlFil;
    }

    public String getUrlImdb() {
        return urlImdb;
    }

    public String getUrlRt() {
        return urlRt;
    }
}
