package LogicaCedulas;

public class EstadoResultados {
    private final int mesesA = 12;
    private double[] ventas;
    private double[] precioVentas;
    private double[] costoVentas;
    private double[] gastoVentas;
    private double[] gastoAdministracion;

    public EstadoResultados() {
    }

    public EstadoResultados(double[] ventas, double[] precioVentas, double[] costoVentas, double[] gastoVentas, double[] gastoAdministracion) {
        this.ventas = ventas;
        this.precioVentas = precioVentas;
        this.costoVentas = costoVentas;
        this.gastoVentas = gastoVentas;
        this.gastoAdministracion = gastoAdministracion;
    }

    public double[] getGastoAdministracion() {
        return gastoAdministracion;
    }

    public void setGastoAdministracion(double[] gastoAdministracion) {
        this.gastoAdministracion = gastoAdministracion;
    }

    public double[] getVentas() {
        return ventas;
    }

    public void setVentas(double[] ventas) {
        this.ventas = ventas;
    }

    public double[] getPrecioVentas() {
        return precioVentas;
    }

    public void setPrecioVentas(double[] precioVentas) {
        this.precioVentas = precioVentas;
    }

    public double[] getCostoVentas() {
        return costoVentas;
    }

    public void setCostoVentas(double[] costoVentas) {
        this.costoVentas = costoVentas;
    }

    public double[] getGastoVentas() {
        return gastoVentas;
    }

    public void setGastoVentas(double[] gastoVentas) {
        this.gastoVentas = gastoVentas;
    }

    public double[] calcularIngresoVentas(){
        double[] ingresoVentasCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            ingresoVentasCalculado[i] = this.ventas[i] * this.precioVentas[i];
        }
        return ingresoVentasCalculado;
    }
    
    public double[] calcularUtilidadBruta(){
        double[] ingresoVentasCalculado = calcularIngresoVentas();
        double[] utilidadBrutaCalculada = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            utilidadBrutaCalculada[i] = ingresoVentasCalculado[i] / this.costoVentas[i];
        }
        return utilidadBrutaCalculada;
    }
    
    public double[] calcularUtilidadOperacion(){
        double[] utilidadBrutaCalculada = calcularUtilidadBruta();
        double[] utilidadOperacionCalculada = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            utilidadOperacionCalculada[i] = utilidadBrutaCalculada[i] - this.gastoVentas[i] - this.gastoAdministracion[i];
        }
        return utilidadOperacionCalculada;
    }
}