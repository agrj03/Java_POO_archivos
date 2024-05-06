package aguirre.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //constructor requerido por la super clase (Titulo)
    public Serie(String nombre, int launchDate) {
        super(nombre, launchDate);
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas(){ return temporadas; }

    public int getEpisodiosPorTemporada(){ return episodiosPorTemporada; }

    public int getMinutosPorEpisodio(){ return minutosPorEpisodio; }

    //Se sobreescribe el método padre, para así poder ser utilizado por la clase hija
    @Override
    public int getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return String.format("Serie: %s (%d)", this.getNombre(), this.getLaunchDate());
    }
}
