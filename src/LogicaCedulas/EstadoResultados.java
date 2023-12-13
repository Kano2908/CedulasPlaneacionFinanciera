package LogicaCedulas;

public class EstadoResultados {

    private final int mesesA = 12;
    private int[] ventas;
    private double[] precioVentas;
    private double[] costoVentas;
    private double[] gastoVentas;
    private double[] gastoAdministracion;

    public EstadoResultados() {
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public void setPrecioVentas(double[] precioVentas) {
        this.precioVentas = precioVentas;
    }

    public void setCostoVentas(double[] costoVentas) {
        this.costoVentas = costoVentas;
    }

    public void setGastoVentas(double[] gastoVentas) {
        this.gastoVentas = gastoVentas;
    }

    public void setGastoAdministracion(double[] gastoAdministracion) {
        this.gastoAdministracion = gastoAdministracion;
    }

    public double[] calcularIngresoVentas() {
        double[] ingresoVentasCalculado = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            ingresoVentasCalculado[i] = this.ventas[i] * this.precioVentas[i];
        }
        return ingresoVentasCalculado;
    }

    public double calcularTotalIngresosVentas() {
        double[] ingresoVentasCalculado = calcularIngresoVentas();
        double totalIngreV = 0;

        for (double ingreVentas : ingresoVentasCalculado) {
            totalIngreV += ingreVentas;
        }
        return totalIngreV;
    }

    public double[] calcularUtilidadBruta() {
        double[] ingresoVentasCalculado = calcularIngresoVentas();
        double[] utilidadBrutaCalculada = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            utilidadBrutaCalculada[i] = ingresoVentasCalculado[i] - this.costoVentas[i];
        }
        return utilidadBrutaCalculada;
    }

    public double calcularTotalUtilidadBruta() {
        double[] utilidadBrutaCalculada = calcularUtilidadBruta();
        double totalUtilidadB = 0;

        for (double utilidadB : utilidadBrutaCalculada) {
            totalUtilidadB += utilidadB;
        }
        return totalUtilidadB;
    }

    public double[] calcularUtilidadOperacion() {
        double[] utilidadBrutaCalculada = calcularUtilidadBruta();
        double[] utilidadOperacionCalculada = new double[this.mesesA];

        for (int i = 0; i < this.mesesA; i++) {
            utilidadOperacionCalculada[i] = utilidadBrutaCalculada[i] - this.gastoVentas[i] - this.gastoAdministracion[i];
        }
        return utilidadOperacionCalculada;
    }

    public double calcularTotalUtilidadOperacion() {
        double[] utilidadOperacionCalculada = calcularUtilidadOperacion();
        double totalUtilidadO = 0;

        for (double utilidadO : utilidadOperacionCalculada) {
            totalUtilidadO += utilidadO;
        }
        return totalUtilidadO;
    }
}
