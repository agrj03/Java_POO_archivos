package com.aluracursos.screenmatch.modelos;


import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String director;

    /*Colocar Pelicula miPeli = new Pelicula() en realidad es un constructor (de object) que nos reserva memoria
    para colocar información más adelante.
    *Reescribimos el constructor para que cada instancia que se cree, sea declarando directamente el nombre de
    la pelicula, ya que TODA pelicula tiene nombre.
    */
    public Pelicula(String nombre, int launchDate) {
        super(nombre, launchDate);
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    /*1.- Pelicula:
    Implementa la interfaz clasificable, la cual SOLICITA que la clase (Pelicula) implemente un método
    que tenga el mismo nombre definido en la interfaz, como el tipo de dato (si fue definido) que debe retornar
    * 2.- Episodio:
    */
    @Override
    public int getClasificable() {
        return (int) (calculaMedia() / 2);
        /*El metodo se encarga de convertir el valor de evaluaciones de diez a un total de 5, ya que se
        estaría utilizando para hacer uso de cinco estrellas en lugar de números ambiguos para el usuario.
        * */
    }

    //Sobreescribimos el método padrón en la clase pelicula
    @Override
    public String toString() {
        return String.format("Pelicula: %s (%d)", this.getNombre(), this.getLaunchDate());
    }
}
