import java.util.Scanner;

public class Comunidade {

    // Objeto comunidade, onde se pode adentrar e sair, seus tweets enviados na comunidade aparecem apenas nela e não publicamente

    private String nomeCom;

    private String tema;

    private int numMembros;

    public Comunidade() {
        this.nomeCom = "Nome imutável da comunidade";
        this.tema = "Tema imutável da comunidade";
        this.numMembros = 0; // Número de membros da comunidade
    }

    public Comunidade(String nomeCom, String tema, int numMembros) {
        this.nomeCom = nomeCom;
        this.tema = tema;
        this.numMembros = numMembros;
    }

    public String getNomeCom() {return nomeCom;}
    public String getTema() {return tema;}
    public int getNumMembros() {return numMembros;}

    public int setNumMembrosInicial() {return this.numMembros = 1;}

    // Ação "Entrar na comunidade"
    public void entrar() {System.out.println("Você entrou na comunidade!");}

    // Ação "Sair da comunidade"
    public void sair() {System.out.println("Você saiu da comunidade!");}

    public void criarComunidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Criar comunidade----");
        System.out.println(" ");
        System.out.println("Digite o nome da comunidade que deseja criar:");
        String nomeCom = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Digite o tema da comunidade que deseja criar:");
        String tema = scanner.nextLine();
        System.out.println(" ");
        setNumMembrosInicial();
        System.out.println("Comunidade criada!");
        System.out.println(" ");
        Comunidade comunidade = new Comunidade(nomeCom, tema, numMembros);
        System.out.println(comunidade.getNomeCom());
        System.out.println("Tema: " + comunidade.getTema());
        System.out.println("Número de membros: " + comunidade.getNumMembros());
        System.out.println(" ");
    }

}
