package LogicaCedulas;

public class CostosIndirectosFabricacion {

    private final int mesesA = 12;
    private double[] totalCostoIndirectosProduccion;
    private double gastosSupervicion;
    private double depreciaciones;
    private double unidadesProducir[];
    private double tasaGIF;

    public CostosIndirectosFabricacion() {
    }

    public CostosIndirectosFabricacion(double[] totalCostoIndirectosProduccion, double gastosSupervicion, double depreciaciones, double[] unidadesProducir, double tasaGIF) {
        this.totalCostoIndirectosProduccion = totalCostoIndirectosProduccion;
        this.gastosSupervicion = gastosSupervicion;
        this.depreciaciones = depreciaciones;
        this.unidadesProducir = unidadesProducir;
        this.tasaGIF = tasaGIF;
    }

    public void setTotalCostoIndirectosProduccion(double[] totalCostoIndirectosProduccion) {
        this.totalCostoIndirectosProduccion = totalCostoIndirectosProduccion;
    }

    public void setGastosSupervicion(double gastosSupervicion) {
        this.gastosSupervicion = gastosSupervicion;
    }

    public void setDepreciaciones(double depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public void setUnidadesProducir(double[] unidadesProducir) {
        this.unidadesProducir = unidadesProducir;
    }

    public void setTasaGIF(double tasaGIF) {
        this.tasaGIF = tasaGIF;
    }

    public double[] calcularCostoFijosProduccion() {
        double[] costosFijosProduccionCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            costosFijosProduccionCalculado[i] = this.totalCostoIndirectosProduccion[i] + this.gastosSupervicion + this.depreciaciones;
        }
        return costosFijosProduccionCalculado;
    }
    
    public double calcularTotalCostoFijosProduccion(){
        double[] costosFijosProduccionCalculado = calcularCostoFijosProduccion();
        double totalCostoFijoP = 0;
        
        for (double costoFijoP : costosFijosProduccionCalculado) {
            totalCostoFijoP += costoFijoP;
        }
        return totalCostoFijoP;
    }

    public double[] calcularCostoVarablesProduccion() {
        double[] costoVarablesProduccionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            costoVarablesProduccionCalculado[i] = this.unidadesProducir[i] * this.tasaGIF;
        }
        return costoVarablesProduccionCalculado;
    }
    
    public double calcularTotalCostoVarablesProduccion(){
        double[] costoVarablesProduccionCalculado = calcularCostoVarablesProduccion();
        double totalCostoVar = 0;
        
        for (double costoVar : costoVarablesProduccionCalculado) {
            totalCostoVar += costoVar;
        }
        return totalCostoVar;
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
    
    public double calcularTotalCostoTotalIndirectosProduccion(){
        double[] costoTotalIndirectosProduccionCalculado = calcularCostoTotalIndirectosProduccion();
        double totalCostoTotal = 0;
        
        for (double totalCostoT : costoTotalIndirectosProduccionCalculado) {
            totalCostoTotal += totalCostoT;
        }
        return totalCostoTotal;
    }
}
