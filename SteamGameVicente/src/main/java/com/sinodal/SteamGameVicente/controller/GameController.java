package controller;

import model.*;

import java.util.List;

public class GameController {

    public Usuario criarUsuario(String nome, List<Jogo> jogos) {
        return new Usuario(nome, jogos);
    }

    public Jogo criarJogo(String titulo, List<Conquista> conquistas) {
        return new Jogo(titulo, conquistas, 0.0, 0.0);
    }

    public void adicionarConquistaAoJogo(Jogo jogo, Conquista conquista) {
        jogo.adicionarConquista(conquista);
    }

    public void atualizarTempoDeJogo(Jogo jogo, double horas) {
        jogo.atualizarTempoDeJogo(horas);
    }

    public void obterConquista(Conquista conquista) {
        conquista.obterConquista();
    }

    public void exibirProgresso(Jogo jogo) {
        System.out.println("Jogo: " + jogo.getTitulo());
        System.out.println("Tempo de Jogo: " + jogo.getTempoDeJogo() + " horas");
        System.out.println("Percentual de Conclusão: " + jogo.getPercentualConclusao() + "%");
        for (Conquista conquista : jogo.getConquistas()) {
            System.out.println("- " + conquista.getNome() + (conquista.isObtido() ? " (Obtida)" : " (Não obtida)"));
        }
    }
}
