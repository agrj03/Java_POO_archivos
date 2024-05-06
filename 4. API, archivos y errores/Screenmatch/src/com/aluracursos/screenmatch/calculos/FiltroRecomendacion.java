package com.aluracursos.screenmatch.calculos;

/*Mediante la conversión de visualizaciones en las clases pelicula y episodio, se puede obtener un mensaje
* para mostrar el usuario, acción que llevará a cabo esta clase.*/
public class FiltroRecomendacion {

    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4){
            System.out.println("Muy bien evaluado en el momento.");
        } else if(clasificable.getClasificable() >= 2){
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("Agregalo a tu lista de Ver más tarde.");
        }
    }
}
