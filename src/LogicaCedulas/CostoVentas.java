package LogicaCedulas;

public class CostoVentas {
    private final int mesesA = 12;
    private double[] unidadesInventarioI;
    private double[] valorUnitarioInventarioI;
    private double[] unidadesInventarioF;
    private double[] valorUnitarioInventarioF;
    private double[] costoTotalproduccion;

    public CostoVentas() {
    }

    public CostoVentas(double[] unidadesInventarioI, double[] valorUnitarioInventarioI, double[] unidadesInventarioF, double[] valorUnitarioInventarioF, double[] costoTotalproduccion) {
        this.unidadesInventarioI = unidadesInventarioI;
        this.valorUnitarioInventarioI = valorUnitarioInventarioI;
        this.unidadesInventarioF = unidadesInventarioF;
        this.valorUnitarioInventarioF = valorUnitarioInventarioF;
        this.costoTotalproduccion = costoTotalproduccion;
    }

    public double[] getUnidadesInventarioI() {
        return unidadesInventarioI;
    }

    public void setUnidadesInventarioI(double[] unidadesInventarioI) {
        this.unidadesInventarioI = unidadesInventarioI;
    }

    public double[] getValorUnitarioInventarioI() {
        return valorUnitarioInventarioI;
    }

    public void setValorUnitarioInventarioI(double[] valorUnitarioInventarioI) {
        this.valorUnitarioInventarioI = valorUnitarioInventarioI;
    }

    public double[] getUnidadesInventarioF() {
        return unidadesInventarioF;
    }

    public void setUnidadesInventarioF(double[] unidadesInventarioF) {
        this.unidadesInventarioF = unidadesInventarioF;
    }

    public double[] getValorUnitarioInventarioF() {
        return valorUnitarioInventarioF;
    }

    public void setValorUnitarioInventarioF(double[] valorUnitarioInventarioF) {
        this.valorUnitarioInventarioF = valorUnitarioInventarioF;
    }

    public double[] getCostoTotalproduccion() {
        return costoTotalproduccion;
    }

    public void setCostoTotalproduccion(double[] costoTotalproduccion) {
        this.costoTotalproduccion = costoTotalproduccion;
    }
    
    public double[] calcularvalorTotalInventarioI(){
        double[] valorTotalInventarioICalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            valorTotalInventarioICalculado[i] = this.unidadesInventarioI[i] * this.valorUnitarioInventarioI[i];
        }
        return valorTotalInventarioICalculado;
    }
    
    public double[] calcularvalorTotalInventarioF(){
        double[] valorTotalInventarioFCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            valorTotalInventarioFCalculado[i] = this.unidadesInventarioF[i] * this.valorUnitarioInventarioF[i];
        }
        return valorTotalInventarioFCalculado;
    }
    
    public double[] calcularTotalVentas(){
        double[] valorTotalInventarioICalculado = calcularvalorTotalInventarioI();
        double[] valorTotalInventarioFCalculado = calcularvalorTotalInventarioF();
        double[] totalventasCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            totalventasCalculado[i] = valorTotalInventarioICalculado[i] + this.costoTotalproduccion[i] - valorTotalInventarioFCalculado[i];
        }
        return totalventasCalculado;
    }
}
