package com.aluracursos.screenmatch.calculos;

import aguirre.screenmatch.modelos.Titulo;


public class CalculadoraDeTiempo {
    private int tiempoTotal;

    /*Se comenzo teniendo la clase pelicula para crear el objeto, pero al también tener series se crearía una
    * redundancia de código al crear otro metodo para hacer la misma función.
    * Por lo que se pasa a hacer uso del Polimorfismo, donde en este caso se utiliza Titulo como objeto, ya que
    * este puede ser TANTO una Pelicula como una Serie.*/
    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();//Va sumando el tiempo de cada titulo elegido
    }

    public int getTiempoTotal(){ return tiempoTotal; }
}
