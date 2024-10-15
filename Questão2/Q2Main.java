//2 - Conversão de Moeda com Objetos:


public class Q2Main {
    public static void main(String[] args) {

        Q2ConversorMoeda conversor = new Q2ConversorMoeda(5.25);

        double valorDolar = 100.0;
        double valorEmReais = conversor.converterParaReal(valorDolar);
        System.out.println("Valor em dólares: " + valorDolar + " convertido para reais: " + valorEmReais);

        double valorReal = 525.0;
        double valorEmDolares = conversor.converterParaDolar(valorReal);
        System.out.println("Valor em reais: " + valorReal + " convertido para dólares: " + valorEmDolares);

        conversor.atualizarCotacaoDolar(5.50);
        System.out.println("Nova cotação do dólar: " + conversor.getCotacaoDolar());

        valorEmReais = conversor.converterParaReal(valorDolar);
        System.out.println("Valor em dólares: " + valorDolar + " convertido para reais com nova cotação: " + valorEmReais);

        valorEmDolares = conversor.converterParaDolar(valorReal);
        System.out.println("Valor em reais: " + valorReal + " convertido para dólares com nova cotação: " + valorEmDolares);
    }
}
