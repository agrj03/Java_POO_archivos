package com.aguirre.principal;

import com.aguirre.modelos.ArticulosHM;

import java.util.*;

public class Principal2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        double limiteCredito = 0;
        String keyHash = "";
        double valor = 0;
        List<ArticulosHM> lista = new ArrayList<>();

        System.out.println("Dígita el límite de tu tarjeta de crédito:");
        limiteCredito = teclado.nextDouble();
        double saldoRestante = limiteCredito;
        teclado.nextLine();//limpiar salto de linea

        while (opcion!=0){
            if (opcion==1 && saldoRestante>0){
                System.out.println("Escribe el articulo adquirido:");
                keyHash = teclado.nextLine();

                if (!keyHash.isBlank()){//si no esta vacia hara...
                    System.out.println("Escriba el valor de la compra");
                    valor = teclado.nextDouble();
                    teclado.nextLine();
                    if (valor <= saldoRestante) {
                        ArticulosHM objeto = new ArticulosHM(keyHash, valor);
                        saldoRestante -= valor;
                        lista.add(objeto);
                    }else {
                        System.out.println("Saldo insuficiente, terminando el programa.");
                        break;
                    }
                }else{
                    System.out.println("No escribio nada, cancelando procedimiento");
                    break;
                }

                System.out.println("""
                Escribe 0 para terminar las compras.
                Escribe 1 para seguir comprando.
                """);
                opcion = teclado.nextInt();
                teclado.nextLine();
            }else{
                break;
            }

        }
        //System.out.println("Lista normal: "+ lista.toString());
        lista.sort(Comparator.comparing(ArticulosHM::getValor));//this
        //System.out.println("Lista ordenada por valor: " + lista);//this
        System.out.println("\n ***********************************");
        System.out.println("""
                   RESUMEN DE COMPRAS
                Articulo  -  Precio
                """);
        for (ArticulosHM articulo: lista){
            System.out.println(String.format("""
                    %s  ---  $%.2f
                    """, articulo.getLlave(), articulo.getValor()));
        }
        System.out.println(String.format("""
                ***********************************
                
                Saldo de la tarjeta: $%.0f
                """, limiteCredito));


        /*System.out.println(articulosHM.keySet());
        System.out.println(articulosHM.values());
        /*Map<String, Double> TestHashMap = new HashMap<>();

        TestHashMap.put("Zapato", (double) 120);
        TestHashMap.put("Juego", (double) 60);
        TestHashMap.put("Cap", (double) 25);
        TestHashMap.put("Notebooks", (double) 99);
        TestHashMap.put("Laptop", (double) 300);

        int resul = 120 + 60 + 25 + 99 + 300;
        System.out.println("Suma: "+resul);

        System.out.println(TestHashMap.values()); //valor sin key
        System.out.println(TestHashMap.keySet()); //keys sin valor
        System.out.println(TestHashMap.get("Juego")); //Valor de la llave especificada

        for (String llave : TestHashMap.keySet()){
            System.out.println("Clave: "+ llave);
            System.out.println("Valor: "+ TestHashMap.get(llave));
            contador+= TestHashMap.get(llave);
        }
        for (String llave : TestHashMap.keySet()){
            contador+= TestHashMap.get(llave);
        }*/

    }
}
