public class Q2ConversorMoeda {
    private double cotacaoDolar;

    public Q2ConversorMoeda(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterParaReal(double valorDolar) {
        return valorDolar * cotacaoDolar;
    }

    public double converterParaDolar(double valorReal) {
        return valorReal / cotacaoDolar;
    }


    public void atualizarCotacaoDolar(double novaCotacao) {
        this.cotacaoDolar = novaCotacao;
    }

    public String toString() {
        return "ConversorMoeda{" +
                "cotacaoDolar=" + cotacaoDolar +
                '}';
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }
}
