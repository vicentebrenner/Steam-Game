public abstract class Jogo {
    protected String nome;
    protected double preco;

    public Jogo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularPrecoFinal();
}

public class JogoIndie extends Jogo {
    public JogoIndie(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}

public class JogoTripleA extends Jogo {
    public JogoTripleA(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.8;
    }
}

public interface Compravel {
    double getPreco();
}

public class DLC implements Compravel {
    private String nome;
    private double preco;

    public DLC(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
