package com.aluracursos.screenmatch.principal;

import aguirre.screenmatch.modelos.Episodio;
import aguirre.screenmatch.modelos.Pelicula;
import aguirre.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){

        //Creo una instancia de la clase pelicula
        Pelicula miPelicula = new Pelicula("Matrix", 1999);

        //miPelicula.setNombre("Matrix");
        //miPelicula.setLaunchDate(1999);
        miPelicula.setDuracionEnMinutos(180);

        miPelicula.mostrarFichaTecnica();

        Pelicula laOtraPeli = new Pelicula("Dune parte dos", 2024);
        //laOtraPeli.setNombre("Dune parte dos");
        //laOtraPeli.setLaunchDate(2024);
        laOtraPeli.setDuracionEnMinutos(180);

        miPelicula.evaluar(9);
        miPelicula.evaluar(8.8);
        miPelicula.evaluar(7.2);
        System.out.println("Media: "+miPelicula.calculaMedia());
        //--------------------
        Serie casaDragon = new Serie("La casa del Dragón", 2022);

        //casaDragon.setNombre("La casa del Dragón");
        //casaDragon.setLaunchDate(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.mostrarFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(laOtraPeli);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo total para ver los titulos: "+ calculadora.getTiempoTotal());

        //test filtro recomendacion
        FiltroRecomendacion filtroReco = new FiltroRecomendacion();
        filtroReco.filtra(miPelicula);
        filtroReco.filtra(laOtraPeli);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de Targeryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroReco.filtra(episodio);

        //Var concluye el tipo de dato que estamos declarando en base a lo que hay despues de new
        var peliculaDeJes = new Pelicula("El señor de los anillos", 2001);
        //peliculaDeJes.setNombre("El señor de los anillos");
        peliculaDeJes.setDuracionEnMinutos(180);
        //peliculaDeJes.setLaunchDate(2001);

        //declarando un arreglo que recibe objetos
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeJes);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(laOtraPeli);

        System.out.println("Tamaño de la lista: "+ listaDePeliculas.size());
        /*Si solo llamamos la lista de peliculas, obtenemos una posición en memoría debido a la clase Object
        que hace uso del método toString.*/
        System.out.println(listaDePeliculas);
        System.out.println("Primer elemento de la lista: "+ listaDePeliculas.get(0).getNombre());

        //Sobreescribimos el método padrón en la clase pelicula



    }
}
