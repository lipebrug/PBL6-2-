// Felipe Fumagalli, Jose Gabriel Kojo, Nicole Fatuch

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 5;
        System.out.println("----- Bem vindo! -----");
        Usuario user;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Tweet> listwt = new ArrayList<>();
        while (contador != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("O que você deseja fazer? (1: Criar usuário. 2: Tweetar. 3: Criar comunidade. 4: Ver tweets 0: Sair.)");
            int numInteiro = scanner.nextInt();
            if(numInteiro == 1) {
                user = new Usuario();
                user.criarUsuario();
                usuarios.add(user);
            }
            else if (numInteiro == 2) {
                if (usuarios.isEmpty()) {
                    System.out.println("Crie um usuário primeiro.");
                    continue;
                }
                Scanner tweetScanner = new Scanner(System.in);
                System.out.println("Digite o nome do usuário:");
                for (int i = 0; i < usuarios.size(); i++) {
                    System.out.println((i + 1) + ": " + usuarios.get(i).getNomeUsuario());
                }
                System.out.println("Digite o número do usuário:");
                int userIndex = tweetScanner.nextInt();
                tweetScanner.nextLine(); // Consumir a quebra de linha pendente
                Usuario usuarioSelecionado = usuarios.get(userIndex - 1);
                Conteudo tweet = new Tweet();
                tweet.criarTweet();
                usuarioSelecionado.adicionarTweet(tweet);
            }
            else if (numInteiro == 3) {
                Comunidade comunidade = new Comunidade();
                comunidade.criarComunidade();
            }
            else if (numInteiro == 4) {
                System.out.println("Tweets de todos os usuários:");
                for (Usuario usuario : usuarios) {
                    System.out.println(usuario.getNomeUsuario() + ":");
                    for (Tweet tweet : usuario.getTweets()) {
                        System.out.println("- " + tweet.getTexto());
                    }
                }
            }
            else if (numInteiro == 0) {
                System.out.println("Até mais!");
                break;
            }
            else {
                System.out.println("Por favor, digite uma opção válida");
            }
        }
    }
}