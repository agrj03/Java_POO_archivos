package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

//Clase especifica para Serie
public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones(){ return totalVisualizaciones; }

    public void setTotalVisualizaciones(int totalVisualizaciones){
        this.totalVisualizaciones = totalVisualizaciones;
    }

    /*
    * 1.- Pelicula:
    * 2.-Mismo caso que en la clase Pelicula, tan solo que aquí la "Evaluación" de los episodios se extrapola de
    * la cantidad de visualizaciones que tenga un episodio, y no de evaluaciones propias de usuarios
    * 3. FiltroRecomendacion*/
    @Override
    public int getClasificable() {
        if (totalVisualizaciones > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
