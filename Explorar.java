public class Explorar {

    // Objeto "Página explorar"

    private String trending;

    private String news;

    private String entertainment;

    private String sports;

    public Explorar() {
        this.trending = "Mosta o que está em alta";
        this.news = "Mostra notícias";
        this.entertainment = "Mostra conteúdos envolvendo entretenimento";
        this.sports = "Mostra conteúdos envolvendo esporte";
    }

    public Explorar(String trending, String news, String entertainment, String sports) {
        this.trending = trending;
        this.news = news;
        this.entertainment = entertainment;
        this.sports = sports;
    }

}
