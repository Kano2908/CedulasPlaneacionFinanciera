package LogicaCedulas;

public class PresupuestoCostoProduccion {
    private final int mesesA = 12;
    private double[] costoTotalUsoMaterial;
    private double[] costoTotalManoObra;
    private double[] costoTotalCostosIndirectosFabricacion;
    private double[] produccionRequerida;

    public PresupuestoCostoProduccion() {
    }
    
    public PresupuestoCostoProduccion(double[] costoTotalUsoMaterial, double[] costoTotalManoObra, double[] costoTotalCostosIndirectosFabricacion, double[] produccionRequerida){
        this.costoTotalUsoMaterial = costoTotalUsoMaterial;
        this.costoTotalManoObra = costoTotalManoObra;
        this.costoTotalCostosIndirectosFabricacion = costoTotalCostosIndirectosFabricacion;
        this.produccionRequerida = produccionRequerida;
    }

    public double[] getCostoTotalUsoMaterial() {
        return costoTotalUsoMaterial;
    }

    public void setCostoTotalUsoMaterial(double[] costoTotalUsoMaterial) {
        this.costoTotalUsoMaterial = costoTotalUsoMaterial;
    }

    public double[] getCostoTotalManoObra() {
        return costoTotalManoObra;
    }

    public void setCostoTotalManoObra(double[] costoTotalManoObra) {
        this.costoTotalManoObra = costoTotalManoObra;
    }

    public double[] getCostoTotalCostosIndirectosFabricacion() {
        return costoTotalCostosIndirectosFabricacion;
    }

    public void setCostoTotalCostosIndirectosFabricacion(double[] costoTotalCostosIndirectosFabricacion) {
        this.costoTotalCostosIndirectosFabricacion = costoTotalCostosIndirectosFabricacion;
    }
    
    public double[] getProduccionRequerida() {
        return produccionRequerida;
    }

    public void setProduccionRequerida(double[] produccionRequerida) {
        this.produccionRequerida = produccionRequerida;
    }
    
    public double[] calcularCostoTotalProduccion(){
        double[] costoTotalProduccionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            costoTotalProduccionCalculado[i] = this.costoTotalUsoMaterial[i] + this.costoTotalManoObra[i] + this.costoTotalCostosIndirectosFabricacion[i];
        }
        return costoTotalProduccionCalculado;
    }
    
    public double[] calcularCostoUnitarioProduccion(){
        double[] costoTotalProduccionCalculado = calcularCostoTotalProduccion();
        double[] costoUnitarioproduccionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            costoUnitarioproduccionCalculado[i] = costoTotalProduccionCalculado[i] / this.produccionRequerida[i];
        }
        return costoUnitarioproduccionCalculado;
    }
}
