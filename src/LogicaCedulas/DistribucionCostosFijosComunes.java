package LogicaCedulas;

public class DistribucionCostosFijosComunes {

    private final int mesesA = 12;
    private double porcentajeProduccion;
    private double porcentajeVentas;
    private double porcentajeAdministracion;
    private double agua[];
    private double energiaElectrica[];
    private double serviciosComunicacion;
    private double gastosGerenciales[];
    private double rentas;
    private double depreciaciones;

    public DistribucionCostosFijosComunes() {
    }

    public void setPorcentajeProduccion(double porcentajeProduccion) {
        this.porcentajeProduccion = porcentajeProduccion / 100;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas / 100;
    }

    public void setPorcentajeAdministracion(double porcentajeAdministracion) {
        this.porcentajeAdministracion = porcentajeAdministracion / 100;
    }

    public void setAgua(double[] agua) {
        this.agua = agua;
    }

    public void setEnergiaElectrica(double[] energiaElectrica) {
        this.energiaElectrica = energiaElectrica;
    }

    public void setServiciosComunicacion(double serviciosComunicacion) {
        this.serviciosComunicacion = serviciosComunicacion;
    }

    public void setGastosGerenciales(double[] gastosGerenciales) {
        this.gastosGerenciales = gastosGerenciales;
    }

    public void setRentas(double rentas) {
        this.rentas = rentas;
    }

    public void setDepreciaciones(double depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public double[] calularCostoTotalCostosIndirectos() {
        double[] costoTotalCostosIndirectos = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalCostosIndirectos[i] = this.agua[i] + this.energiaElectrica[i] + this.serviciosComunicacion
                    + this.gastosGerenciales[i] + this.rentas + this.depreciaciones;
        }
        return costoTotalCostosIndirectos;
    }

    public double calcularCostoAnualCostosIndirectos() {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double totalCostosIndirectos = 0;

        for (double costoindirecto : costoTotalCostosIndirectos) {
            totalCostosIndirectos += costoindirecto;
        }
        return totalCostosIndirectos;
    }

    // Calular Costos Fijos Comunes de Produccion
    public double[] calcularCostoFijosComunesProduccion() {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalProduccion[i] = costoTotalCostosIndirectos[i] * this.porcentajeProduccion;
        }
        return costoTotalProduccion;
    }

    // Calcular Costos Fijos Comunes de Ventas
    public double[] calcularCostoFijosComunesVentas() {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalVentas[i] = costoTotalCostosIndirectos[i] * this.porcentajeVentas;
        }
        return costoTotalVentas;
    }

    // Calcular Costos Fijos Comunes de Administracion
    public double[] calcularCostoFijosComunesAdministracion() {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalAdministracion[i] = costoTotalCostosIndirectos[i] * this.porcentajeAdministracion;
        }
        return costoTotalAdministracion;
    }
}
