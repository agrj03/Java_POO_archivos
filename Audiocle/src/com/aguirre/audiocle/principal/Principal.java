package com.aguirre.audiocle.principal;

import com.aguirre.audiocle.modelos.Cancion;
import com.aguirre.audiocle.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion nuevaCancion = new Cancion();

        nuevaCancion.setTitulo("Forever");
        nuevaCancion.setArtista("Kiss");

        Podcast elPodcas = new Podcast();
        miPodcas.setPresentador("Gabriela Aguiar");
        miPodcas.setTitulo("Café.Tech");

        for (int i = 0; i < 100 ; i++) {
            nuevaCancion.meGusta();
        }

        for (int i = 0; i < 5000 ; i++) {
            nuevaCancion.reproducir();
        }

        System.out.println(String.format("Me gusta totales: ", nuevaCancion.getMeGusta() ));
        System.out.println(String.format("Reproducciones totales: ", nuevaCancion.getReproduccionesTotales() ));
    }
}
