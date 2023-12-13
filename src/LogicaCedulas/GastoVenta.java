package LogicaCedulas;

public class GastoVenta {

    private final int mesesA = 12;
    private double[] totalCostoIndirectosVentas;
    private double[] promocionMercadeo;
    private double[] salarios;
    private double[] distribuciones;
    private double depreciaciones;
    private int[] ventasRequeridas;
    private double tasaGastoVentas;

    public GastoVenta() {
    }

    public void setTotalCostoIndirectosVentas(double[] totalCostoIndirectosVentas) {
        this.totalCostoIndirectosVentas = totalCostoIndirectosVentas;
    }

    public void setPromocionMercadeo(double[] promocionMercadeo) {
        this.promocionMercadeo = promocionMercadeo;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setDistribuciones(double[] distribuciones) {
        this.distribuciones = distribuciones;
    }

    public void setDepreciaciones(double depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public void setVentasRequeridas(int[] ventasRequeridas) {
        this.ventasRequeridas = ventasRequeridas;
    }

    public void setTasaGastoVentas(double tasaGastoVentas) {
        this.tasaGastoVentas = tasaGastoVentas;
    }

    public double[] calcularGastosFijosVentas() {
        double[] gastosFijosVentasCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosFijosVentasCalculado[i] = this.totalCostoIndirectosVentas[i] + this.promocionMercadeo[i] + this.salarios[i] + this.distribuciones[i] + this.depreciaciones;
        }
        return gastosFijosVentasCalculado;
    }

    public double calcularTotalGastosFijosVentas() {
        double[] gastosFijosVentasCalculado = calcularGastosFijosVentas();
        double totalGFV = 0;

        for (double gastosFVC : gastosFijosVentasCalculado) {
            totalGFV += gastosFVC;
        }
        return totalGFV;
    }

    public double[] calcularGastosVariablesVentas() {
        double[] gastosVariablesVentasCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosVariablesVentasCalculado[i] = this.ventasRequeridas[i] * this.tasaGastoVentas;
        }
        return gastosVariablesVentasCalculado;
    }

    public double calcularTotalGastosVariablesVentas() {
        double[] gastosVariablesVentasCalculado = calcularGastosVariablesVentas();
        double totalGVV = 0;

        for (double gastosVVC : gastosVariablesVentasCalculado) {
            totalGVV += gastosVVC;
        }
        return totalGVV;
    }

    public double[] calcularTotalGastoVentas() {
        double[] gastosFijosVentasCalculado = calcularGastosFijosVentas();
        double[] gastosVariablesVentasCalculado = calcularGastosVariablesVentas();
        double[] gastosVentaCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosVentaCalculado[i] = gastosFijosVentasCalculado[i] + gastosVariablesVentasCalculado[i];
        }
        return gastosVentaCalculado;
    }

    public double calcularTotalGastoV() {
        double[] gastosVentaCalculado = calcularTotalGastoVentas();
        double totalGV = 0;

        for (double gastosVC : gastosVentaCalculado) {
            totalGV += gastosVC;
        }
        return totalGV;
    }
}
