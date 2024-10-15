public class Q4TrocadorValores {
    private int valorA;
    private int valorB;

    public Q4TrocadorValores(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void trocarValores() {
        int aux = valorA;
        valorA = valorB;
        valorB = aux;
    }

    public void exibirValores() {
        System.out.println("Valor de A: " + valorA);
        System.out.println("Valor de B: " + valorB);
    }
}
