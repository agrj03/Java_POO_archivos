package modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion {
    private Busqueda direccion = new Busqueda();
    private HttpResponse<String> response = null;

    public String conectar(String film){
        //HttpResponse<String> response = null;

        try {
            HttpClient cliente = HttpClient.newHttpClient();


            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create(direccion.buscar(film))).build();

            this.response = cliente.send(solicitud,HttpResponse.BodyHandlers.ofString());

            System.out.println(solicitud);
            return this.response.body();
        }catch (IllegalArgumentException | IOException | InterruptedException e){
            return e.getMessage();
        }
    }

}
