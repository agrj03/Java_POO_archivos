package com.aguirre.modelos;

import java.util.HashMap;
import java.util.Map;

public class ArticulosHM implements Comparable<ArticulosHM>{
    private String llave;
    private Double valor;

    public ArticulosHM(String llave, Double valor){
        this.llave = llave;
        this.valor = valor;
    }

    public String getLlave() { return llave;}

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public Double getValor() { return valor;    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(ArticulosHM otraLlave) {
        return this.getLlave().compareTo(otraLlave.getLlave());
    }

    @Override
    public String toString() {
        return String.format("Articulo: %s con precio: %.1f", this.getLlave(), this.getValor());
    }
}
