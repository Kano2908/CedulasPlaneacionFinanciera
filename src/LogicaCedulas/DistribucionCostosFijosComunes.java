package LogicaCedulas;

public class DistribucionCostosFijosComunes {
    private final int mesesA = 12;
    private double porcentajeProduccion;
    private double porcentajeVentas;
    private double porcentajeAdministracion;
    private double agua;
    private double energiaElectrica;
    private double serviciosComunicacion;
    private double gastosGerenciales;
    private double materialesSuministros;
    private double rentas;
    private double depreciaciones;

    public DistribucionCostosFijosComunes() {
    }

    public DistribucionCostosFijosComunes(double porcentajeProduccion, double porcentajeVentas, double porcentajeAdministracion, double agua, double energiaElectrica, double serviciosComunicacion, double gastosGerenciales, double materialesSuministros, double rentas, double depreciaciones) {
        this.porcentajeProduccion = porcentajeProduccion;
        this.porcentajeVentas = porcentajeVentas;
        this.porcentajeAdministracion = porcentajeAdministracion;
        this.agua = agua;
        this.energiaElectrica = energiaElectrica;
        this.serviciosComunicacion = serviciosComunicacion;
        this.gastosGerenciales = gastosGerenciales;
        this.materialesSuministros = materialesSuministros;
        this.rentas = rentas;
        this.depreciaciones = depreciaciones;
    }

    public void setPorcentajeProduccion(double porcentajeProduccion) {
        this.porcentajeProduccion = porcentajeProduccion;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }

    public void setPorcentajeAdministracion(double porcentajeAdministracion) {
        this.porcentajeAdministracion = porcentajeAdministracion;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public void setEnergiaElectrica(double energiaElectrica) {
        this.energiaElectrica = energiaElectrica;
    }

    public void setServiciosComunicacion(double serviciosComunicacion) {
        this.serviciosComunicacion = serviciosComunicacion;
    }

    public void setGastosGerenciales(double gastosGerenciales) {
        this.gastosGerenciales = gastosGerenciales;
    }

    public void setMaterialesSuministros(double materialesSuministros) {
        this.materialesSuministros = materialesSuministros;
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
            costoTotalCostosIndirectos[i] = this.agua + this.energiaElectrica + this.serviciosComunicacion
                    + this.gastosGerenciales + this.materialesSuministros + this.rentas + this.depreciaciones;
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
    public double[] calcularAguaProduccion() {
        double[] aguaProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            aguaProduccion[i] = this.agua * this.porcentajeProduccion;
        }
        return aguaProduccion;
    }

    public double[] calcularEnergiaElectricaProduccion() {
        double[] energiaElectricaProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaProduccion[i] = this.energiaElectrica * this.porcentajeProduccion;
        }
        return energiaElectricaProduccion;
    }

    public double[] calcularServiciosComunicacionProduccion() {
        double[] serviciosComunicacionProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionProduccion[i] = this.serviciosComunicacion * this.porcentajeProduccion;
        }
        return serviciosComunicacionProduccion;
    }

    public double[] calcularGastosGerencialesProduccion() {
        double[] gastosGerencialesProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesProduccion[i] = this.gastosGerenciales * this.porcentajeProduccion;
        }
        return gastosGerencialesProduccion;
    }

    public double[] calcularMaterialesSuministrosProduccion() {
        double[] materialesSuministrosProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosProduccion[i] = this.materialesSuministros * this.porcentajeProduccion;
        }
        return materialesSuministrosProduccion;
    }

    public double[] calcularRentasProduccion() {
        double[] rentasProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasProduccion[i] = this.rentas * this.porcentajeProduccion;
        }
        return rentasProduccion;
    }

    public double[] calcularDepreciacionesProduccion() {
        double[] depreciacionesProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesProduccion[i] = this.depreciaciones * this.porcentajeProduccion;
        }
        return depreciacionesProduccion;
    }

    public double[] calcularCostoFijosComunesProduccion() {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalProduccion[i] = costoTotalCostosIndirectos[i] * this.porcentajeProduccion;
        }
        return costoTotalProduccion;
    }

    // Calcular Costos Fijos Comunes de Ventas
    public double[] calcularAguaVentas(double porcentaje) {
        double[] aguaVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            aguaVentas[i] = this.agua * porcentaje;
        }
        return aguaVentas;
    }

    public double[] calcularEnergiaElectricaVentas(double porcentaje) {
        double[] energiaElectricaVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaVentas[i] = this.energiaElectrica * porcentaje;
        }
        return energiaElectricaVentas;
    }

    public double[] calcularServiciosComunicacionVentas(double porcentaje) {
        double[] serviciosComunicacionVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionVentas[i] = this.serviciosComunicacion * porcentaje;
        }
        return serviciosComunicacionVentas;
    }

    public double[] calcularGastosGerencialesVentas(double porcentaje) {
        double[] gastosGerencialesVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesVentas[i] = this.gastosGerenciales * porcentaje;
        }
        return gastosGerencialesVentas;
    }

    public double[] calcularMaterialesSuministrosVentas(double porcentaje) {
        double[] materialesSuministrosVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosVentas[i] = this.materialesSuministros * porcentaje;
        }
        return materialesSuministrosVentas;
    }

    public double[] calcularRentasVentas(double porcentaje) {
        double[] rentasVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasVentas[i] = this.rentas * porcentaje;
        }
        return rentasVentas;
    }

    public double[] calcularDepreciacionesVentas(double porcentaje) {
        double[] depreciacionesVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesVentas[i] = this.depreciaciones * porcentaje;
        }
        return depreciacionesVentas;
    }

    public double[] calcularCostoFijosComunesVentas(double porcentaje) {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalVentas[i] = costoTotalCostosIndirectos[i] * porcentaje;
        }
        return costoTotalVentas;
    }

    // Calcular Costos Fijos Comunes de Administracion
    public double[] calcularAguaAdministracion(double porcentaje) {
        double[] aguaAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            aguaAdministracion[i] = this.agua * porcentaje;
        }
        return aguaAdministracion;
    }

    public double[] calcularEnergiaElectricaAdministracion(double porcentaje) {
        double[] energiaElectricaAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaAdministracion[i] = this.energiaElectrica * porcentaje;
        }
        return energiaElectricaAdministracion;
    }

    public double[] calcularServiciosComunicacionAdministracion(double porcentaje) {
        double[] serviciosComunicacionAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionAdministracion[i] = this.serviciosComunicacion * porcentaje;
        }
        return serviciosComunicacionAdministracion;
    }

    public double[] calcularGastosGerencialesAdministracion(double porcentaje) {
        double[] gastosGerencialesAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesAdministracion[i] = this.gastosGerenciales * porcentaje;
        }
        return gastosGerencialesAdministracion;
    }

    public double[] calcularMaterialesSuministrosAdministracion(double porcentaje) {
        double[] materialesSuministrosAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosAdministracion[i] = this.materialesSuministros * porcentaje;
        }
        return materialesSuministrosAdministracion;
    }

    public double[] calcularRentasAdministracion(double porcentaje) {
        double[] rentasAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasAdministracion[i] = this.rentas * porcentaje;
        }
        return rentasAdministracion;
    }

    public double[] calcularDepreciacionesAdministracion(double porcentaje) {
        double[] depreciacionesAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesAdministracion[i] = this.depreciaciones * porcentaje;
        }
        return depreciacionesAdministracion;
    }

    public double[] calcularCostoFijosComunesAdministracion(double porcentaje) {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalAdministracion[i] = costoTotalCostosIndirectos[i] * porcentaje;
        }
        return costoTotalAdministracion;
    }
}