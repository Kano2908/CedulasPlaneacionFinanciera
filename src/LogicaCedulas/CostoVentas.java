package LogicaCedulas;

public class CostoVentas {

    private final int mesesA = 12;
    private double valorUnitarioDado;
    private double[] unidadesInventarioI;
    private double[] valorUnitario;
    private double[] unidadesInventarioF;
    private double[] costoTotalproduccion;

    public CostoVentas() {
    }

    public void setValorUnitarioDado(double valorUnitarioDado) {
        this.valorUnitarioDado = valorUnitarioDado;
    }

    public void setUnidadesInventarioI(double[] unidadesInventarioI) {
        this.unidadesInventarioI = unidadesInventarioI;
    }

    public void setValorUnitario(double[] valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setUnidadesInventarioF(double[] unidadesInventarioF) {
        this.unidadesInventarioF = unidadesInventarioF;
    }

    public void setCostoTotalproduccion(double[] costoTotalproduccion) {
        this.costoTotalproduccion = costoTotalproduccion;
    }

    public double[] calcularvalorTotalInventarioI() {
        double[] valorTotalInventarioICalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            if (i == 0) {
                valorTotalInventarioICalculado[i] = this.unidadesInventarioI[i] * this.valorUnitarioDado;
            } else {
                valorTotalInventarioICalculado[i] = this.unidadesInventarioI[i] * this.valorUnitario[i - 1];
            }
        }
        return valorTotalInventarioICalculado;
    }

    public double calcularTotalInventarioI() {
        double[] valorTotalInventarioICalculado = calcularvalorTotalInventarioI();
        double totalInveI = 0;

        for (double valorTInveI : valorTotalInventarioICalculado) {
            totalInveI += valorTInveI;
        }
        return totalInveI;
    }

    public double[] calcularvalorTotalInventarioF() {
        double[] valorTotalInventarioFCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            valorTotalInventarioFCalculado[i] = this.unidadesInventarioF[i] * this.valorUnitario[i];
        }
        return valorTotalInventarioFCalculado;
    }

    public double calcularTotalInventarioF() {
        double[] valorTotalInventarioFCalculado = calcularvalorTotalInventarioF();
        double totalInveF = 0;

        for (double valorTInveI : valorTotalInventarioFCalculado) {
            totalInveF += valorTInveI;
        }
        return totalInveF;
    }

    public double[] calcularTotalVentas() {
        double[] valorTotalInventarioICalculado = calcularvalorTotalInventarioI();
        double[] valorTotalInventarioFCalculado = calcularvalorTotalInventarioF();
        double[] totalventasCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            totalventasCalculado[i] = valorTotalInventarioICalculado[i] + this.costoTotalproduccion[i] - valorTotalInventarioFCalculado[i];
        }
        return totalventasCalculado;
    }

    public double calcularTotalAnualVentas() {
        double[] totalventasCalculado = calcularTotalVentas();
        double totalV = 0;

        for (double valorTotalV : totalventasCalculado) {
            totalV += valorTotalV;
        }
        return totalV;
    }
}
