package LogicaCedulas;

public class DeterminacionDeProduccion {

    private final int mesesA = 12;
    private double porcentaje;
    private int[] ventas;
    private int inventarioFinal;
    private int inventarioInicial;

    public DeterminacionDeProduccion() {
    }

    public DeterminacionDeProduccion(double porcentaje, int[] ventas, int inventarioFinal, int inventarioInicial) {
        this.porcentaje = porcentaje;
        this.ventas = ventas;
        this.inventarioFinal = inventarioFinal;
        this.inventarioInicial = inventarioInicial;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public void setInventarioFinal(int inventarioFinal) {
        this.inventarioFinal = inventarioFinal;
    }

    public void setInventarioInicial(int inventarioInicial) {
        this.inventarioInicial = inventarioInicial;
    }

    public int calcularTotalVentas() {
        int totalVentas = 0;

        for (double venta : this.ventas) {
            totalVentas += venta;
        }
        return totalVentas;
    }

    public double[] calcularDeterminacionProduccion() {
        double[] determinacionproduccionCalculada = new double[this.mesesA];
        double[] inveFinal = new double[this.mesesA];
        double[] inveInicial = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            if (i == 0) {
                determinacionproduccionCalculada[i] = this.ventas[i] + this.inventarioFinal - this.inventarioInicial;
            } else {
                inveFinal[i - 1] = this.ventas[i - 1] * this.porcentaje;
                inveInicial[i - 1] = (i == 1) ? this.inventarioFinal : inveFinal[i - 2];
                determinacionproduccionCalculada[i] = this.ventas[i] + inveFinal[i - 1] - inveInicial[i - 1];
            }
        }
        return determinacionproduccionCalculada;
    }

    public double calcularProduccionAnual() {
        double produccionAnual = 0;

        for (double ventasMen : calcularDeterminacionProduccion()) {
            produccionAnual += ventasMen;
        }
        return produccionAnual;
    }
}