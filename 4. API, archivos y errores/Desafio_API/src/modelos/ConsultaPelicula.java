package modelos;

public class ConsultaPelicula {
    private String titulo;
    private int episodio;
    private String mensajeDeApertura;
    private String director;
    private int fechaDeLanzamiento;


    public ConsultaPelicula(String titulo, int episodio, String mensajeDeApertura, String director, int fechaDeLanzamiento) {
        this.titulo = titulo;
        this.episodio = episodio;
        this.mensajeDeApertura = mensajeDeApertura;
        this.director = director;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public ConsultaPelicula(ConsultaSWAPI consulta){
        this.titulo = consulta.title();
        this.episodio = consulta.episode_id();
        this.mensajeDeApertura = consulta.opening_crawl();
        this.director = consulta.director();
        this.fechaDeLanzamiento = Integer.valueOf(consulta.release_date().substring(0,4).replace(" ", ""));
    }

    @Override
    public String toString() {
        return "ConsultaPelicula{" +
                "titulo='" + titulo + '\'' +
                ", episodio=" + episodio +
                ", mensajeDeApertura='" + mensajeDeApertura + '\'' +
                ", director='" + director + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getMensajeDeApertura() {
        return mensajeDeApertura;
    }

    public void setMensajeDeApertura(String mensajeDeApertura) {
        this.mensajeDeApertura = mensajeDeApertura;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
}
