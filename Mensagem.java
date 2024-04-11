public class Mensagem extends Conteudo {

    // Objeto mensagem, enviada por DM

    private String destinatario;

    public Mensagem(String texto, int numCarac, int numLike, String destinatario) {
        super(texto, numCarac, numLike);
        this.destinatario = destinatario;
    }

    public String getDestinatario() {return destinatario;}

}
