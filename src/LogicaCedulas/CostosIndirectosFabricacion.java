package LogicaCedulas;

public class CostosIndirectosFabricacion {

    private final int mesesA = 12;
    private double[] aguaCFC;
    private double[] energiaElectricaCFC;
    private double[] serviciosComunicacionCFC;
    private double[] gastosGerencialesCFC;
    private double[] materialesSuministrosCFC;
    private double[] rentasCFC;
    private double[] depreciacionesCFC;
    private double[] gastosSupervicion;
    private double[] depreciaciones;
    private double[] unidadesProducir;
    private double tasaGIF;

    public CostosIndirectosFabricacion() {
    }

    public CostosIndirectosFabricacion(double[] aguaCFC, double[] energiaElectricaCFC, double[] serviciosComunicacionCFC, double[] gastosGerencialesCFC, double[] materialesSuministrosCFC, double[] rentasCFC, double[] depreciacionesCFC, double[] gastosSupervicion, double[] depreciaciones, double[] unidadesProducir, double tasaGIF) {
        this.aguaCFC = aguaCFC;
        this.energiaElectricaCFC = energiaElectricaCFC;
        this.serviciosComunicacionCFC = serviciosComunicacionCFC;
        this.gastosGerencialesCFC = gastosGerencialesCFC;
        this.materialesSuministrosCFC = materialesSuministrosCFC;
        this.rentasCFC = rentasCFC;
        this.depreciacionesCFC = depreciacionesCFC;
        this.gastosSupervicion = gastosSupervicion;
        this.depreciaciones = depreciaciones;
        this.unidadesProducir = unidadesProducir;
        this.tasaGIF = tasaGIF;
    }

    public double[] getAguaCFC() {
        return aguaCFC;
    }

    public void setAguaCFC(double[] aguaCFC) {
        this.aguaCFC = aguaCFC;
    }

    public double[] getEnergiaElectricaCFC() {
        return energiaElectricaCFC;
    }

    public void setEnergiaElectricaCFC(double[] energiaElectricaCFC) {
        this.energiaElectricaCFC = energiaElectricaCFC;
    }

    public double[] getServiciosComunicacionCFC() {
        return serviciosComunicacionCFC;
    }

    public void setServiciosComunicacionCFC(double[] serviciosComunicacionCFC) {
        this.serviciosComunicacionCFC = serviciosComunicacionCFC;
    }

    public double[] getGastosGerencialesCFC() {
        return gastosGerencialesCFC;
    }

    public void setGastosGerencialesCFC(double[] gastosGerencialesCFC) {
        this.gastosGerencialesCFC = gastosGerencialesCFC;
    }

    public double[] getMaterialesSuministrosCFC() {
        return materialesSuministrosCFC;
    }

    public void setMaterialesSuministrosCFC(double[] materialesSuministrosCFC) {
        this.materialesSuministrosCFC = materialesSuministrosCFC;
    }

    public double[] getRentasCFC() {
        return rentasCFC;
    }

    public void setRentasCFC(double[] rentasCFC) {
        this.rentasCFC = rentasCFC;
    }

    public double[] getDepreciacionesCFC() {
        return depreciacionesCFC;
    }

    public void setDepreciacionesCFC(double[] depreciacionesCFC) {
        this.depreciacionesCFC = depreciacionesCFC;
    }

    public double[] getGastosSupervicion() {
        return gastosSupervicion;
    }

    public void setGastosSupervicion(double[] gastosSupervicion) {
        this.gastosSupervicion = gastosSupervicion;
    }

    public double[] getDepreciaciones() {
        return depreciaciones;
    }

    public void setDepreciaciones(double[] depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public double[] getUnidadesProducir() {
        return unidadesProducir;
    }

    public void setUnidadesProducir(double[] unidadesProducir) {
        this.unidadesProducir = unidadesProducir;
    }

    public double getTasaGIF() {
        return tasaGIF;
    }

    public void setTasaGIF(double tasaGIF) {
        this.tasaGIF = tasaGIF;
    }

    public double[] calcularCostoFijosProduccion() {
        double[] costosFijosProduccionCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costosFijosProduccionCalculado[i] = this.aguaCFC[i] + this.energiaElectricaCFC[i] + this.serviciosComunicacionCFC[i]
                    + this.gastosGerencialesCFC[i] + this.materialesSuministrosCFC[i] + this.rentasCFC[i] + this.depreciacionesCFC[i]
                    + this.gastosSupervicion[i] + this.depreciaciones[i];
        }
        return costosFijosProduccionCalculado;
    }

    public double[] calcularCostoVarablesProduccion() {
        double[] costoVarablesProduccionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            costoVarablesProduccionCalculado[i] = this.unidadesProducir[i] * this.tasaGIF;
        }
        return costoVarablesProduccionCalculado;
    }
    
    public double[] calcularCostoTotalIndirectosProduccion(){
        double[] costosFijosProduccionCalculado = calcularCostoFijosProduccion();
        double[] costoVarablesProduccionCalculado = calcularCostoVarablesProduccion();
        double[] costoTotalIndirectosProduccionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            costoTotalIndirectosProduccionCalculado[i] = costosFijosProduccionCalculado[i] + costoVarablesProduccionCalculado[i];
        }
        return costoTotalIndirectosProduccionCalculado;
    }
}
