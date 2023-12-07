package LogicaCedulas;

public class DistribucionCostosFijosComunes {
    private final int mesesA = 12;
    private double[] agua;
    private double[] energiaElectrica;
    private double[] serviciosComunicacion;
    private double[] gastosGerenciales;
    private double[] materialesSuministros;
    private double[] rentas;
    private double[] depreciaciones;

    public DistribucionCostosFijosComunes() {
    }

    public DistribucionCostosFijosComunes(double[] agua, double[] energiaElectrica, double[] serviciosComunicacion, double[] gastosGerenciales, double[] materialesSuministros, double[] rentas, double[] depreciaciones) {
        this.agua = agua;
        this.energiaElectrica = energiaElectrica;
        this.serviciosComunicacion = serviciosComunicacion;
        this.gastosGerenciales = gastosGerenciales;
        this.materialesSuministros = materialesSuministros;
        this.rentas = rentas;
        this.depreciaciones = depreciaciones;
    }

    public void setAgua(double[] agua) {
        this.agua = agua;
    }

    public void setEnergiaElectrica(double[] energiaElectrica) {
        this.energiaElectrica = energiaElectrica;
    }

    public void setServiciosComunicacion(double[] serviciosComunicacion) {
        this.serviciosComunicacion = serviciosComunicacion;
    }

    public void setGastosGerenciales(double[] gastosGerenciales) {
        this.gastosGerenciales = gastosGerenciales;
    }

    public void setMaterialesSuministros(double[] materialesSuministros) {
        this.materialesSuministros = materialesSuministros;
    }

    public void setRentas(double[] rentas) {
        this.rentas = rentas;
    }

    public void setDepreciaciones(double[] depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public double[] calularCostoTotalCostosIndirectos() {
        double[] costoTotalCostosIndirectos = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalCostosIndirectos[i] = this.agua[i] + this.energiaElectrica[i] + this.serviciosComunicacion[i]
                    + this.gastosGerenciales[i] + this.materialesSuministros[i] + this.rentas[i] + this.depreciaciones[i];
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
    public double[] calcularAguaProduccion(double porcentaje) {
        double[] aguaProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            aguaProduccion[i] = this.agua[i] * porcentaje;
        }
        return aguaProduccion;
    }

    public double[] calcularEnergiaElectricaProduccion(double porcentaje) {
        double[] energiaElectricaProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaProduccion[i] = this.energiaElectrica[i] * porcentaje;
        }
        return energiaElectricaProduccion;
    }

    public double[] calcularServiciosComunicacionProduccion(double porcentaje) {
        double[] serviciosComunicacionProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionProduccion[i] = this.serviciosComunicacion[i] * porcentaje;
        }
        return serviciosComunicacionProduccion;
    }

    public double[] calcularGastosGerencialesProduccion(double porcentaje) {
        double[] gastosGerencialesProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesProduccion[i] = this.gastosGerenciales[i] * porcentaje;
        }
        return gastosGerencialesProduccion;
    }

    public double[] calcularMaterialesSuministrosProduccion(double porcentaje) {
        double[] materialesSuministrosProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosProduccion[i] = this.materialesSuministros[i] * porcentaje;
        }
        return materialesSuministrosProduccion;
    }

    public double[] calcularRentasProduccion(double porcentaje) {
        double[] rentasProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasProduccion[i] = this.rentas[i] * porcentaje;
        }
        return rentasProduccion;
    }

    public double[] calcularDepreciacionesProduccion(double porcentaje) {
        double[] depreciacionesProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesProduccion[i] = this.depreciaciones[i] * porcentaje;
        }
        return depreciacionesProduccion;
    }

    public double[] calcularCostoFijosComunesProduccion(double porcentaje) {
        double[] costoTotalCostosIndirectos = calularCostoTotalCostosIndirectos();
        double[] costoTotalProduccion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costoTotalProduccion[i] = costoTotalCostosIndirectos[i] * porcentaje;
        }
        return costoTotalProduccion;
    }

    // Calcular Costos Fijos Comunes de Ventas
    public double[] calcularAguaVentas(double porcentaje) {
        double[] aguaVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            aguaVentas[i] = this.agua[i] * porcentaje;
        }
        return aguaVentas;
    }

    public double[] calcularEnergiaElectricaVentas(double porcentaje) {
        double[] energiaElectricaVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaVentas[i] = this.energiaElectrica[i] * porcentaje;
        }
        return energiaElectricaVentas;
    }

    public double[] calcularServiciosComunicacionVentas(double porcentaje) {
        double[] serviciosComunicacionVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionVentas[i] = this.serviciosComunicacion[i] * porcentaje;
        }
        return serviciosComunicacionVentas;
    }

    public double[] calcularGastosGerencialesVentas(double porcentaje) {
        double[] gastosGerencialesVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesVentas[i] = this.gastosGerenciales[i] * porcentaje;
        }
        return gastosGerencialesVentas;
    }

    public double[] calcularMaterialesSuministrosVentas(double porcentaje) {
        double[] materialesSuministrosVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosVentas[i] = this.materialesSuministros[i] * porcentaje;
        }
        return materialesSuministrosVentas;
    }

    public double[] calcularRentasVentas(double porcentaje) {
        double[] rentasVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasVentas[i] = this.rentas[i] * porcentaje;
        }
        return rentasVentas;
    }

    public double[] calcularDepreciacionesVentas(double porcentaje) {
        double[] depreciacionesVentas = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesVentas[i] = this.depreciaciones[i] * porcentaje;
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
            aguaAdministracion[i] = this.agua[i] * porcentaje;
        }
        return aguaAdministracion;
    }

    public double[] calcularEnergiaElectricaAdministracion(double porcentaje) {
        double[] energiaElectricaAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            energiaElectricaAdministracion[i] = this.energiaElectrica[i] * porcentaje;
        }
        return energiaElectricaAdministracion;
    }

    public double[] calcularServiciosComunicacionAdministracion(double porcentaje) {
        double[] serviciosComunicacionAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            serviciosComunicacionAdministracion[i] = this.serviciosComunicacion[i] * porcentaje;
        }
        return serviciosComunicacionAdministracion;
    }

    public double[] calcularGastosGerencialesAdministracion(double porcentaje) {
        double[] gastosGerencialesAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            gastosGerencialesAdministracion[i] = this.gastosGerenciales[i] * porcentaje;
        }
        return gastosGerencialesAdministracion;
    }

    public double[] calcularMaterialesSuministrosAdministracion(double porcentaje) {
        double[] materialesSuministrosAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            materialesSuministrosAdministracion[i] = this.materialesSuministros[i] * porcentaje;
        }
        return materialesSuministrosAdministracion;
    }

    public double[] calcularRentasAdministracion(double porcentaje) {
        double[] rentasAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            rentasAdministracion[i] = this.rentas[i] * porcentaje;
        }
        return rentasAdministracion;
    }

    public double[] calcularDepreciacionesAdministracion(double porcentaje) {
        double[] depreciacionesAdministracion = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            depreciacionesAdministracion[i] = this.depreciaciones[i] * porcentaje;
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