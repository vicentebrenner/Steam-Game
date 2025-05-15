package model;

import java.util.List;

public class Usuario {
    private String nome;
    private List<Jogo> jogos;

    public Usuario(String nome, List<Jogo> jogos) {
        this.nome = nome;
        this.jogos = jogos;
    }

    public String getNome() {
        return nome;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void adicionarJogo(Jogo jogo) {
        this.jogos.add(jogo);
    }
}
