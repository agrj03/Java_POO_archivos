package com.aluracursos.screenmatch.modelos;
/*Llego el momento de refactorar la clase pelicula (extraer atributos redundantes) ya que ahora se tendrá la
clase Serie, la cual comparte ciertos atributos con la clase peliculas, por lo que se creará "Titulo"
como clase de herencia*/

import com.aluracursos.screenmatch.excepciones.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo {
    /*Clase modelo con los atributos intrinsecos
    ----------------------------------------------------------------------------------------------
    -Al cambiar la clase de paquete, las variables pasan de ser publicas (default) a ser protegidas
    -Se requiere especificar las variables para ser usadas fuera del paquete modelos.
    ---------------------------------------------------------------------------------------------*/
    private String nombre;
    private int launchDate;
    //@SerializedName("Runtime")
    private int duracionEnMinutos;
    private boolean includaEnElPlan;

    private double sumaDeEvaluaciones;
    private int contadorEvaluaciones = 0;

    //Declaración de constructor de clase
    public Titulo(String nombre, int launchDate) {
        this.nombre = nombre;
        this.launchDate = launchDate;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.launchDate = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duración," +
                    "ya que contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
        //Substring: extraer lo que este en esas posiciones
    }

    @Override
    public String toString() {
        return
                "{ nombre= " + nombre +
                ", launchDate= " + launchDate +
                ", duracionEnMinutos= " + duracionEnMinutos + " }";
    }

    //Declaración de getters y setters para modificar atributos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    //clic derecho, generar, setter, getter ó ambos
    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public int getLaunchDate(){ return this.launchDate; }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getDuracionEnMinutos(){ return duracionEnMinutos; }

    public void setIncludaEnElPlan(boolean includaEnElPlan) {
        this.includaEnElPlan = includaEnElPlan;
    }

    public boolean getIncludaEnElPlan() {
        return includaEnElPlan;
    }

    //Creo un método para mostrar los datos. Void ya que no regresa un resultado.
    public void mostrarFichaTecnica(){
        System.out.println(String.format("Nombre de la película: %s", nombre));
        System.out.println(String.format("Fecha de lanzamiento: %d", launchDate));
        System.out.println(String.format("Duración total: %d minutos", getDuracionEnMinutos()));
    }

    public void evaluar(double nota){
        sumaDeEvaluaciones += nota;
        contadorEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones / contadorEvaluaciones;
    }
}
