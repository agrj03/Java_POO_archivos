package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepciones.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    //httpResponse requiere de tener exceptions, pero el IDE nos ofrece implementarlo en automatico al main
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();


        while(true) {
            System.out.println("Nombre de la pelicula:");
            var busqueda = input.nextLine();
            String clave = "6723b06e";
            //var test = URLEncoder.encode(busqueda);
            //equivale a "salir", sin importar si lo escribe en mayúsculas o minúsculas
            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            /*Hago uso de URLEncoder para convertir los espacios en blanco como carácteres especiales, a un formato
            adecuado ya que las direcciones web requieren de una estructura predefinida.*/
            String direccion = "https://www.omdbapi.com/?t=" +
                    URLEncoder.encode(busqueda, StandardCharsets.UTF_8)
                    + "&apikey=" + clave;

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                //Gson gson = new Gson();
                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);//Clase intermediaria para almacenar datos
                System.out.println("Titulo: " + miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: " + miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException exception) {
                System.out.println("Ocurrio un error:");
                System.out.println(exception.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la dirección.:");
                System.out.println(e.getMessage());
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();



        System.out.println("Finalizo la ejecución del programa!");
    }
}
// https://www.omdbapi.com/?i=tt3896198&apikey=6723b06e
/*
* 1. Para Gson primero se busca en Maven repository: Gson y se descargar el JAR
* 2. En Google se busca el GitHub de Gson para obtener la documentación
* 3. En este caso al tener un Jar, se da en File/Project Structura/Modules/Dependencies/Jar or directories
* 4. Listo para usar.*/