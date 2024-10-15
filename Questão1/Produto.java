public class Produto {
    private int codigo;
    private String nome;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private int quantidadeAtual;

    // Construtor
    public Produto(int codigo, String nome, int quantidadeMinima, int quantidadeMaxima) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.quantidadeAtual = 0;
    }

    public double calcularEstoqueMedio() {
        return (quantidadeMinima + quantidadeMaxima) / 2.0;
    }

    // Método para repor o estoque
    public void reporEstoque() {
        if (quantidadeAtual < quantidadeMinima) {
            quantidadeAtual = quantidadeMaxima;
        }
    }

    public String toString() {
        return "Produto{" +
                "codigo=" + codigo + ", nome='" + nome + '\'' + ", quantidadeMinima=" + quantidadeMinima + ", quantidadeMaxima=" + quantidadeMaxima + ", quantidadeAtual=" + quantidadeAtual + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}
