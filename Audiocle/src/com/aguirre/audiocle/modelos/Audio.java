package com.aguirre.audiocle.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int reproduccionesTotales;
    private int totalMeGusta;
    private int clasificacion;

    public void meGusta(){
        //método para poder dar me gusta a un audio
        this.totalMeGusta++;
    }

    public void reproducir(){
        //Método para lograr reproducir un audio
        this.reproduccionesTotales++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getReproduccionesTotales() {
        return reproduccionesTotales;
    }

    public void setReproduccionesTotales(int reproduccionesTotales) {
        this.reproduccionesTotales = reproduccionesTotales;
    }

    public int getMeGusta() {
        return totalMeGusta;
    }

    public void setMeGusta(int meGusta) {
        this.totalMeGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
