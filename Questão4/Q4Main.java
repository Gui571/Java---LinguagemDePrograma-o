//4 - Troca de Valores com Objetos

public class Q4Main {
    public static void main(String[] args) {
        Q4TrocadorValores trocador = new Q4TrocadorValores(5, 10);
        System.out.println("Valores antes da troca:");
        trocador.exibirValores();

        trocador.trocarValores();
        System.out.println("Valores depois da troca:");
        trocador.exibirValores();
    }
}
