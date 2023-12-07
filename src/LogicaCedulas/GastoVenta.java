package LogicaCedulas;

public class GastoVenta {
    private final int mesesA = 12;
    private double[] agua;
    private double[] energiaElectrica;
    private double[] serviciosComunicacion;
    private double[] gastosGerenciales;
    private double[] rentas;
    private double[] promocionMercadeo;
    private double[] salarios;
    private double[] depreciaciones;
    private double[] ventasRequeridas;
    private double tasaGastoVentas;

    public GastoVenta() {
    }

    public GastoVenta(double[] agua, double[] energiaElectrica, double[] serviciosComunicacion, double[] gastosGerenciales, double[] rentas, double[] promocionMercadeo, double[] salarios, double[] depreciaciones, double[] ventasRequeridas, double tasaGastoVentas) {
        this.agua = agua;
        this.energiaElectrica = energiaElectrica;
        this.serviciosComunicacion = serviciosComunicacion;
        this.gastosGerenciales = gastosGerenciales;
        this.rentas = rentas;
        this.promocionMercadeo = promocionMercadeo;
        this.salarios = salarios;
        this.depreciaciones = depreciaciones;
        this.ventasRequeridas = ventasRequeridas;
        this.tasaGastoVentas = tasaGastoVentas;
    }

    public double[] getAgua() {
        return agua;
    }

    public void setAgua(double[] agua) {
        this.agua = agua;
    }

    public double[] getEnergiaElectrica() {
        return energiaElectrica;
    }

    public void setEnergiaElectrica(double[] energiaElectrica) {
        this.energiaElectrica = energiaElectrica;
    }

    public double[] getServiciosComunicacion() {
        return serviciosComunicacion;
    }

    public void setServiciosComunicacion(double[] serviciosComunicacion) {
        this.serviciosComunicacion = serviciosComunicacion;
    }

    public double[] getGastosGerenciales() {
        return gastosGerenciales;
    }

    public void setGastosGerenciales(double[] gastosGerenciales) {
        this.gastosGerenciales = gastosGerenciales;
    }

    public double[] getRentas() {
        return rentas;
    }

    public void setRentas(double[] rentas) {
        this.rentas = rentas;
    }

    public double[] getPromocionMercadeo() {
        return promocionMercadeo;
    }

    public void setPromocionMercadeo(double[] promocionMercadeo) {
        this.promocionMercadeo = promocionMercadeo;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double[] getDepreciaciones() {
        return depreciaciones;
    }

    public void setDepreciaciones(double[] depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    public double[] getVentasRequeridas() {
        return ventasRequeridas;
    }

    public void setVentasRequeridas(double[] ventasRequeridas) {
        this.ventasRequeridas = ventasRequeridas;
    }

    public double getTasaGastoVentas() {
        return tasaGastoVentas;
    }

    public void setTasaGastoVentas(double tasaGastoVentas) {
        this.tasaGastoVentas = tasaGastoVentas;
    }
    
    public double[] calcularGastosFijosVentas(){
        double[] gastosFijosVentasCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosFijosVentasCalculado[i] = this.agua[i] + this.energiaElectrica[i] + this.serviciosComunicacion[i] +
                    this.gastosGerenciales[i] + this.rentas[i] + this.promocionMercadeo[i] + this.salarios[i] + this.depreciaciones[i];
        }
        return gastosFijosVentasCalculado;
    }
    
    public double[] calcularGastosVariablesVentas(){
        double[] gastosVariablesVentasCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosVariablesVentasCalculado[i] = this.ventasRequeridas[i] * this.tasaGastoVentas;
        }
        return gastosVariablesVentasCalculado;
    }
    
    public double[] calcularTotalGastoVentas(){
        double[] gastosFijosVentasCalculado = calcularGastosFijosVentas();
        double[] gastosVariablesVentasCalculado = calcularGastosVariablesVentas();
        double[] gastosVentaCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosVentaCalculado[i] = gastosFijosVentasCalculado[i] + gastosVariablesVentasCalculado[i];
        }
        return gastosVentaCalculado;
    }
}