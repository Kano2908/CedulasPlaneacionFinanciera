package LogicaCedulas;

public class ManoDeObra {
    private final int mesesA = 12;
    private double[] unidadesProducir;
    private double tiempoEstandar;
    private double tarifaHora;

    public ManoDeObra() {
    }

    public ManoDeObra(double[] unidadesProducir, double tiempoEstandar, double tarifaHora) {
        this.unidadesProducir = unidadesProducir;;
        this.tiempoEstandar = tiempoEstandar;
        this.tarifaHora = tarifaHora;
    }

    public void setUnidadesProducir(double[] unidadesProducir) {
        this.unidadesProducir = unidadesProducir;
    }

    public void setTiempoEstandar(double tiempoEstandar) {
        this.tiempoEstandar = tiempoEstandar;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    public double[] calcularHorasTrabajar(){
        double[] horasTrabajarCalculadas = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            horasTrabajarCalculadas[i] = this.unidadesProducir[i] * this.tiempoEstandar;
        }
        return horasTrabajarCalculadas;
    }
    
    public double calcularTotalHorasTrabajar(){
        double[] horasTrabajarCalculadas = calcularHorasTrabajar();
        double totalHorasTrabajar = 0;
        
        for (double horasT : horasTrabajarCalculadas) {
            totalHorasTrabajar += horasT;
        }
        return totalHorasTrabajar;
    }
    
    public double[] calcularImporte(){
        double[] horasTrabajarCalculadas = calcularHorasTrabajar();
        double[] importeCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            importeCalculado[i] = horasTrabajarCalculadas[i] * this.tarifaHora;
        }
        return importeCalculado;
    }
    
    public double calcularImporteTotal(){
        double[] importeCalculado = calcularImporte();
        double totalImporte = 0;
        
        for (double importe : importeCalculado) {
            totalImporte += importe;
        }
        return totalImporte;
    }
}
