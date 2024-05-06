package com.aguirre.modelos;

//Resolución del desafio
public class Compra implements Comparable<Compra>{
    private String descripcion;
    private double valor;

    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("""
                Compra: descripción= %s
                valor= %.2f
                """, this.descripcion, this.valor);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(this.getValor()));
    }
}
