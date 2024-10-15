public class Q3ComparadorNumeros {
    private int numeroUM;
    private int numeroDOIS;
    private int numeroTRES;

    public Q3ComparadorNumeros(int numeroUM, int numeroDOIS, int numeroTRES) {
        this.numeroUM = numeroUM;
        this.numeroDOIS = numeroDOIS;
        this.numeroTRES = numeroTRES;
    }

    public void exibirTodasComparacoes() {
        System.out.println("Comparações entre numeroUM e o numeroDOIS:");
        System.out.println("numeroUM == numeroDOIS: " + (numeroUM == numeroDOIS));
        System.out.println("numeroUM != numeroDOIS: " + (numeroUM != numeroDOIS));
        System.out.println("numeroUM > numeroDOIS: " + (numeroUM > numeroDOIS));
        System.out.println("numeroUM < numeroDOIS: " + (numeroUM < numeroDOIS));
        System.out.println("numeroUM >= numeroDOIS: " + (numeroUM >= numeroDOIS));
        System.out.println("numeroUM <= numeroDOIS: " + (numeroUM <= numeroDOIS));

        System.out.println("Comparações entre numeroUM e numeroTRES:");
        System.out.println("numeroUM == numeroTRES: " + (numeroUM == numeroTRES));
        System.out.println("numeroUM != numeroTRES: " + (numeroUM != numeroTRES));
        System.out.println("numeroUM > numeroTRES: " + (numeroUM > numeroTRES));
        System.out.println("numeroUM < numeroTRES: " + (numeroUM < numeroTRES));
        System.out.println("numeroUM >= numeroTRES: " + (numeroUM >= numeroTRES));
        System.out.println("numeroUM <= numeroTRES: " + (numeroUM <= numeroTRES));

        System.out.println("Comparações entre numeroDOIS e numeroTRES:");
        System.out.println("numeroDOIS == numeroTRES: " + (numeroDOIS == numeroTRES));
        System.out.println("numeroDOIS != numeroTRES: " + (numeroDOIS != numeroTRES));
        System.out.println("numeroDOIS > numeroTRES: " + (numeroDOIS > numeroTRES));
        System.out.println("numeroDOIS < numeroTRES: " + (numeroDOIS < numeroTRES));
        System.out.println("numeroDOIS >= numeroTRES: " + (numeroDOIS >= numeroTRES));
        System.out.println("numeroDOIS <= numeroTRES: " + (numeroDOIS <= numeroTRES));
    }
}
