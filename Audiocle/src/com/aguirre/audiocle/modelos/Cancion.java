package com.aguirre.audiocle.modelos;

public class Cancion extends Audio {
    private String artista;
    private String album;
    private String genero;
    private int fechaLanzamiento;


    public void setArtista(String artista){
        this.artista = artista;
    }

    public String getArtista(){ return this.artista; }

    public void setAlbum(String album){ this.album = album; }

    public String getAlbum(){ return this.album;}

    public void setFechaLanzamiento(int fecha){ this.fechaLanzamiento = fecha; }

    public int getFechaLanzamiento(){ return this.fechaLanzamiento; }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
