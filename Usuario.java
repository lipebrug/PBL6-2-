import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Usuario {
    // Objeto Usuário
    private String nomeConta;
    private String nomeUsuario;
    private int idade;
    private String genero;
    private String local;
    private ArrayList<Tweet> tweets;


    public Usuario() {
        this.nomeConta = "Nome imutável da conta";
        this.nomeUsuario = "Nome mutável de usuário";
        this.idade = 0;
        this.genero = "Gênero do usuário";
        this.local = "Localização do usuário";
        tweets = new ArrayList<>();
    }

    public Usuario(String nomeConta, String nomeUsuario, int idade, String genero, String local) {
        this.nomeConta = nomeConta;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.genero = genero;
        this.local = local;
        tweets = new ArrayList<>();

    }

    // Ação "Ver dados do usuário"

    public String getNomeConta() {return nomeConta;}

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLocal() {
        return local;
    }


    // Ação "Editar" (edita as informações mutáveis de uma conta, como o nome de usuário e a localização)
    public void setNomeUsuario(String NomeUsuario) {
        this.nomeUsuario = NomeUsuario;
    }

    public void setLocal(String Local) {
        this.local = Local;
    }

    public static int calculoIdade(int dia, int mes, int ano) {
        return (int) ChronoUnit.YEARS.between(LocalDate.of(ano, mes, dia), LocalDate.now());
    }

    public void adicionarTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void criarUsuario() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----Criar Usuário----");
            System.out.println(" ");
            System.out.println("Digite o nome da conta:");
            String nomeConta = "@" + scanner.nextLine();
            System.out.println("Digite o nome de usuário:");
            String nomeUsuario = scanner.nextLine();
            System.out.println("Digite seu dia de nascimento:");
            int dia = scanner.nextInt();
            System.out.println("Digite seu mês de nascimento:");
            int mes = scanner.nextInt();
            System.out.println("Digite seu ano de nascimento:");
            int ano = scanner.nextInt();
            int idade = calculoIdade(dia, mes, ano);
            System.out.println("Selecione seu gênero (1: Masculino. 2: Feminino. 3: Não-binário. 4: Não desejo informar. 5: Outro):");
            int numGen = scanner.nextInt();
            String genero = "";
            if(numGen == 1) {
                genero = "Masculino";
            }
            else if (numGen == 2) {
                genero = "Feminino";
            }
            else if (numGen == 3) {
                genero = "Não-binário";
            }
            else if (numGen == 4) {
                genero = "Não informado";
            }else if (numGen == 5) {
                System.out.println("Digite o gênero: ");
                genero = scanner.next();
            }
            System.out.println("Digite sua cidade:");
            String cidade = scanner.next();
            System.out.println("Digite a sigla de seu estado:");
            String estado = scanner.next();
            System.out.println("Digite seu país:");
            String pais = scanner.next();
            String local = cidade + " - " + estado + ", " + pais;
            Usuario usuario = new Usuario(nomeConta, nomeUsuario, idade, genero, local);
            System.out.println("Usuário criado com sucesso!");
            System.out.println(" ");
            System.out.println("Dados do usuário:");
            System.out.println(usuario.getNomeConta());
            System.out.println("Nome de usuário: " + usuario.getNomeUsuario());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Gênero: " + usuario.getGenero());
            System.out.println("Local: " + usuario.getLocal());
            System.out.println(" ");
    }

}
