package com.aguirre.principal;

import com.aguirre.modelos.Compra;
import com.aguirre.modelos.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el límite de la tarjeta:");
        double limite = input.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir=1;

        while (salir != 0){
            System.out.println("Escribe la descripción de la compra:");
            String descripcion = input.next();

            System.out.println("Escribe el valor de la compra:");
            double valor = Double.valueOf(input.next());

            Compra compra = new Compra(descripcion, valor);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Escribe 0 para salir Ó 1 para continuar");
                salir=input.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                salir=0;
            }
            System.out.println("*******************************");
            System.out.println("COMPRAS REALIZADAS:\n");
            Collections.sort(tarjeta.getListaDeCompras());
            for (Compra compras: tarjeta.getListaDeCompras()){
                System.out.println(compras.getDescripcion() + " - " + compras.getValor());
            }
            System.out.println("*******************************");
            System.out.println("Saldo de la tarjeta: "+ tarjeta.getSaldo());

        }
    }
}
