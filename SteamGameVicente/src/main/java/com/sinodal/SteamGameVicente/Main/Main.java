package main;

import controller.GameController;
import model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GameController controller = new GameController();

        Conquista conquista1 = new Conquista("Derrotar o Dragão");
        Conquista conquista2 = new Conquista("Explorar a Floresta Proibida");

        Jogo jogo1 = controller.criarJogo("The Witcher 3", Arrays.asList(conquista1, conquista2));

        Usuario usuario = controller.criarUsuario("Vicente");
        usuario.adicionarJogo(jogo1);

        controller.atualizarTempoDeJogo(jogo1, 5.0);
        controller.obterConquista(conquista1);

        controller.exibirProgresso(jogo1);
    }
}
