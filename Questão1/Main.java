//QUESTÃO 1 - Estoque Médio com Orientação a Objetos:


public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Caneta", 10, 100);
        System.out.println(produto.toString());

        System.out.println("Estoque médio: " + produto.calcularEstoqueMedio());

        produto.setQuantidadeAtual(5);
        System.out.println("Quantidade atual antes de repor: " + produto.getQuantidadeAtual());
        produto.reporEstoque();
        System.out.println("Quantidade atual depois de repor: " + produto.getQuantidadeAtual());
    }
}
