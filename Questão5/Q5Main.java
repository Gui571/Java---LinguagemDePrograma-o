//5 - Cálculo do Módulo com Objetos

public class Q5Main {
    public static void main(String[] args) {
        Q5CalculadoraModulo calculadora = new Q5CalculadoraModulo(-10);
        calculadora.exibirModulo();

        Q5CalculadoraModulo calculadoraPositiva = new Q5CalculadoraModulo(10);
        calculadoraPositiva.exibirModulo();
    }
}
