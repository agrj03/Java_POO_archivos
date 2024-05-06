package com.aguirre.audiocle.modelos;

public class Podcast extends Audio {
    private String descripcion;
    private String presentador;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }
}
