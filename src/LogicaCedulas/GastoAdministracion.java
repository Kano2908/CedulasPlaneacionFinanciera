package LogicaCedulas;

public class GastoAdministracion {

    private final int mesesA = 12;
    private double[] totalCostoIndirectosAdmin;
    private double articulosOficina;
    private double[] administracionSistemas;
    private double[] salarios;
    private double depreciaciones;
    private int[] ventasRequeridas;
    private double tasaGastoAdm;

    public GastoAdministracion() {
    }

    public void setTotalCostoIndirectosAdmin(double[] totalCostoIndirectosAdmin) {
        this.totalCostoIndirectosAdmin = totalCostoIndirectosAdmin;
    }

    public void setArticulosOficina(double articulosOficina) {
        this.articulosOficina = articulosOficina;
    }

    public void setAdministracionSistemas(double[] administracionSistemas) {
        this.administracionSistemas = administracionSistemas;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setDepreciaciones(double depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public void setVentasRequeridas(int[] ventasRequeridas) {
        this.ventasRequeridas = ventasRequeridas;
    }

    public void setTasaGastoAdm(double tasaGastoAdm) {
        this.tasaGastoAdm = tasaGastoAdm;
    }

    public double[] calcularGastosFijosAdm() {
        double[] gastosFijosAdmCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosFijosAdmCalculado[i] = this.totalCostoIndirectosAdmin[i] + this.articulosOficina + this.administracionSistemas[i] + this.salarios[i] + this.depreciaciones;
        }
        return gastosFijosAdmCalculado;
    }

    public double calcularTotalGastosFijosAdm() {
        double[] gastosFijosAdmCalculado = calcularGastosFijosAdm();
        double totalGFA = 0;

        for (double gastosFAC : gastosFijosAdmCalculado) {
            totalGFA += gastosFAC;
        }
        return totalGFA;
    }

    public double[] calcularGastosVariablesAdm() {
        double[] gastosVariablesAdmCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosVariablesAdmCalculado[i] = this.ventasRequeridas[i] * this.tasaGastoAdm;
        }
        return gastosVariablesAdmCalculado;
    }

    public double calcularTotalGastosVariablesAdm() {
        double[] gastosVariablesAdmCalculado = calcularGastosVariablesAdm();
        double totalGVA = 0;

        for (double gastosVAC : gastosVariablesAdmCalculado) {
            totalGVA += gastosVAC;
        }
        return totalGVA;
    }

    public double[] calcularGastosAdministracion() {
        double[] gastosFijosAdmCalculado = calcularGastosFijosAdm();
        double[] gastosVariablesAdmCalculado = calcularGastosVariablesAdm();
        double[] gastosAdministracionCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosAdministracionCalculado[i] = gastosFijosAdmCalculado[i] + gastosVariablesAdmCalculado[i];
        }
        return gastosAdministracionCalculado;
    }

    public double calcularTotalGastoA() {
        double[] gastosAdministracionCalculado = calcularGastosAdministracion();
        double totalGA = 0;

        for (double gastosAC : gastosAdministracionCalculado) {
            totalGA += gastosAC;
        }
        return totalGA;
    }
}
