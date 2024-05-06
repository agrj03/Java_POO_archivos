package com.aluracursos.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {
}

/*
* Record es una característica que le permite representar una clase inmutable, que contiene solo atributos,
* constructor y métodos de lectura, de una manera muy simple y sencilla.
* Esta característica encaja perfectamente cuando necesitamos crear un objeto solo para representar datos, sin
* ningún tipo de comportamiento.
* */