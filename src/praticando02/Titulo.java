package praticando02;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private int duracao;

    public Titulo(String nome, int anoLancamento, int duracao) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Nome" + this.nome
                + ", Ano de lançamento: " + this.anoLancamento
                + ", duração: " + this.duracao;
    }
}
