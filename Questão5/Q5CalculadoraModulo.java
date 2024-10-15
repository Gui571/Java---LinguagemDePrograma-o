public class Q5CalculadoraModulo {
    private int numero;

    public Q5CalculadoraModulo(int numero) {
        this.numero = numero;
    }

    public int calcularModulo() {
        return (numero >= 0) ? numero : numero * (-1);
    }

    public void exibirModulo() {
        System.out.println("Módulo de " + numero + ": " + calcularModulo());
    }
}
