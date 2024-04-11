import java.util.ArrayList;
import java.util.Scanner;

public class Tweet extends Conteudo {

    // Objeto Tweet, postado publicamente

    private String localTwt;

    private int numView;

    private int numRt;

    public Tweet() {
        this.texto = "";
        this.numCarac = 0;
        this.numLike = 0;
        this.localTwt = "";
        this.numView = 0;
        this.numRt = 0;
    }

    public Tweet(String texto, int numCarac, int numLike, String localTwt, int numView, int numRt) {
        super(texto, numCarac, numLike);
        this.localTwt = localTwt;
        this.numView = numView;
        this.numRt = numRt;
    }


    public String getLocalTwt() {return localTwt;}
    public int getNumView() {return numView;}
    public int getNumRt() {return numRt;}

    public int setNumViewInicial() {return this.numView = 0;}
    public int setNumRtInicial() {return this.numRt = 0;}
    public int retweet() {
        return numRt++;
    }


    public void criarTweet() {
        int contadorTwt = 1;
        while (contadorTwt != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----Tweetar----");
            System.out.println(" ");
            System.out.println("Digite o tweet:");
            String texto = scanner.nextLine();
            System.out.println(" ");
            setNumCarac1(numCarac, texto);
            setNumCarac(numCarac);
            setNumLike(numLike);
            System.out.println("Digite sua cidade atual:");
            String cidade = scanner.next();
            System.out.println(" ");
            System.out.println("Digite a sigla de seu estado atual:");
            String estado = scanner.next();
            System.out.println(" ");
            System.out.println("Digite seu país atual:");
            String pais = scanner.next();
            String localTwt = cidade + " - " + estado + ", " + pais;
            System.out.println(" ");
            System.out.println(" ");
            setNumViewInicial();
            setNumRtInicial();
            Tweet tweet = new Tweet(texto, numCarac, numLike, localTwt, numView, numRt);
            System.out.println("Tweet publicado!");
            System.out.println(" ");
            System.out.println(tweet.getTexto());
            System.out.println("Número de caracteres: " + tweet.getNumCarac());
            System.out.println("Likes: " + tweet.getNumLike());
            System.out.println("Retweets: " + tweet.getNumRt());
            System.out.println("Views: " + tweet.getNumView());
            System.out.println("De: " + tweet.getLocalTwt());
            System.out.println(" ");
            System.out.println("Deseja tweetar novamente? (1: Sim. 2: Não.)");
            int deseja = scanner.nextInt();
            if (deseja == 2) {
                break;
            }
        }
    }

}
