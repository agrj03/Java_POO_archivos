package com.aluracursos.screenmatch.principal;

import aguirre.screenmatch.modelos.Pelicula;
import aguirre.screenmatch.modelos.Serie;
import aguirre.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Matrix", 1999);
        miPelicula.evaluar(8);
        Pelicula laOtraPeli = new Pelicula("Dune parte dos", 2024);
        laOtraPeli.evaluar(6);
        var peliculaDeJes = new Pelicula("El señor de los anillos", 2001);
        peliculaDeJes.evaluar(10);
        Serie lost = new Serie("Lost", 2000);
        Serie casaDragon = new Serie("La casa del Dragón", 2022);

        /*
        1. Modificar la listaDePeliculas a una lista de Titulos (super)
        2. Cambiamos la declaración ArrayList por la interface List, que incluye los métodos add, get, etc.
           Al usar dicha interfaz, permite la modificación a futuro de las clases a usar.
        */
        List<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeJes);
        lista.add(miPelicula);
        lista.add(laOtraPeli);
        lista.add(lost);
        lista.add(casaDragon);

        for (Titulo item: lista){//Loop forEach - Ya no lo reconoce Java :P
            System.out.println("Nombre: "+ item.getNombre());
            //Si el objeto es una peli y no serie, y tiene una valoracion mayor a 2 estrellas, ejecuta codigo
            if (item instanceof Pelicula pelicula && pelicula.getClasificable() > 2) {
                System.out.println("Clasificación: "+ pelicula.getClasificable());
            }
        }

        ////////////Ordenar listas////////////////////
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("Lista no ordenada: "+ listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista ordenada: "+ listaDeArtistas);

        //use el método Collections.sort para realizar la ordenación:
        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados "+ lista);

        /*Ordenar mediante fecha | Interfaz.metodoEstatico(etc) | Lambda
        * https://www.aluracursos.com/blog/ordenando-colecciones-con-comparable-y-comparator?utm_source=gnarus&utm_medium=timeline
        * */
        lista.sort(Comparator.comparing(Titulo::getLaunchDate));
        System.out.println("Lista ordenada por fecha "+ lista);
    }


}
