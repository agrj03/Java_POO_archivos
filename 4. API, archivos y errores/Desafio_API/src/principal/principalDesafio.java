package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Conexion;
import modelos.ConsultaPelicula;
import modelos.ConsultaSWAPI;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principalDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String peli = "";
        List<ConsultaPelicula> peliculas = new ArrayList<>();
        Conexion con = new Conexion();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting()
                .create();

        //ConsultaSWAPI consulta =
        /**
         * Crear app para consultar las películas de Star Wars mediante SWAPI
         * Menú para que el usuario elija la película a buscar
         * Generar archivo .JSON con los datos de la película*/

        while (true){
            System.out.println("¿Qué película de Star Wars, de la 1 a la 7, deseas buscar?");
            peli = input.nextLine();
            System.out.println("Peli: "+peli);
            if (peli.equalsIgnoreCase("salir")){
                break;
            }

            String json = con.conectar(peli);
            System.out.println(json);

            ConsultaSWAPI miSwapi = gson.fromJson(json, ConsultaSWAPI.class);
            System.out.println("SWAPI: "+ miSwapi);

            ConsultaPelicula miPeli = new ConsultaPelicula(miSwapi);
            System.out.println("Peli ya convertida: "+miPeli);
            peliculas.add(miPeli);

        }
        System.out.println(peliculas);

        try{
            FileWriter escritura = new FileWriter("pelis.json");
            escritura.write(gson.toJson(peliculas));
            escritura.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
