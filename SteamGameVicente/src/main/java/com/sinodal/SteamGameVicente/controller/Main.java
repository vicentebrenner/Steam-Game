package model;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("Jogador01", "jogador01@email.com");

        ContaSteam conta1 = new ContaSteam(usuario.getNome(), usuario.getEmail());

        System.out.println("Informações do usuário:");
        usuario.exibirInfo();

        conta1.adicionarSaldo(100.0);

        conta1.adicionarJogo("The Witcher 3");
        conta1.adicionarJogo("Cyberpunk 2077");

        conta1.adicionarAmigo("Amigo1");
        conta1.adicionarAmigo("Amigo2");

        System.out.println("\nInformações da conta Steam:");
        conta1.exibirInfoConta();
    }
}
