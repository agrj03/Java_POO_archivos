package modelos;

public class Busqueda {
    private static String URL = "https://swapi.py4e.com/api/films/";
    private String film;

    public String buscar(String num){
        return URL+num+"/";
    }

    /*public String buscarPorNombre(String peli){
        return "";
    }*/

    public void setFilm(String pelicula) {
        this.film = pelicula;
    }
}
