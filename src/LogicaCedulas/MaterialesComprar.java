package LogicaCedulas;

public class MaterialesComprar {

    private final int mesesA = 12;
    private double porcentaje;
    private double[] unidadesProducir;
    private int materialesUsar;
    private int inventarioFinal;
    private double costoUnitario;

    public MaterialesComprar() {
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje / 100;
    }

    public void setUnidadesProducir(double[] unidadesProducir) {
        this.unidadesProducir = unidadesProducir;
    }

    public void setMaterialesUsar(int materialesUsar) {
        this.materialesUsar = materialesUsar;
    }

    public void setInventarioFinal(int inventarioFinal) {
        this.inventarioFinal = inventarioFinal;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double[] calcularUnidadesRequeridas() {
        double[] unidadesRequeridasCalculadas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            unidadesRequeridasCalculadas[i] = this.unidadesProducir[i] * this.materialesUsar;
        }
        return unidadesRequeridasCalculadas;
    }

    public double calcularTotalUnidadesRequeridas() {
        double[] unidadesRequeridasCalculadas = calcularUnidadesRequeridas();
        double totalUnidadesRequeridas = 0;

        for (double unidadesR : unidadesRequeridasCalculadas) {
            totalUnidadesRequeridas += unidadesR;
        }
        return totalUnidadesRequeridas;
    }

    public double[] calcularUnidadesComprar() {
        double[] unidadesComprarCalculadas = new double[this.mesesA];
        double[] unidadesRequeridasCalculadas = calcularUnidadesRequeridas();
        double[] inveFinal = new double[this.mesesA];
        double[] inveInicial = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            inveInicial[i] = unidadesRequeridasCalculadas[i] * this.porcentaje;
            if (i == 0) {
                inveFinal[i] = 0;
                unidadesComprarCalculadas[i] = unidadesRequeridasCalculadas[i] - this.inventarioFinal + inveInicial[i];
            } else {
                inveFinal[i] = inveInicial[i - 1];
                unidadesComprarCalculadas[i] = unidadesRequeridasCalculadas[i] - inveFinal[i] + inveInicial[i];
            }
        }
        return unidadesComprarCalculadas;
    }

    public double calcularTotalUnidadesComprar() {
        double[] unidadesComprarCalculadas = calcularUnidadesComprar();
        int totalUnidadesComprar = 0;

        for (double unidadesC : unidadesComprarCalculadas) {
            totalUnidadesComprar += unidadesC;
        }
        return totalUnidadesComprar;
    }

    public double[] calcularImporte() {
        double[] importeCalculado = new double[this.mesesA];
        double[] unidadesComprarCalculadas = calcularUnidadesComprar();

        for (int i = 0; i < this.mesesA; i++) {
            importeCalculado[i] = unidadesComprarCalculadas[i] * this.costoUnitario;
        }
        return importeCalculado;
    }

    public double calcularTotalImporte() {
        double[] importeCalculado = calcularImporte();
        double totalImporte = 0;

        for (double importe : importeCalculado) {
            totalImporte += importe;
        }
        return totalImporte;
    }
}
