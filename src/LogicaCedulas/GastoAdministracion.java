package LogicaCedulas;

public class GastoAdministracion {
    private final int mesesA = 12;
    private double[] agua;
    private double[] energiaElectrica;
    private double[] serviciosComunicacion;
    private double[] gastosGerenciales;
    private double[] rentas;
    private double[] articulosOficina;
    private double[] administracionSistemas;
    private double[] salarios;
    private double[] depreciaciones;
    private double[] ventasRequeridas;
    private double tasaGastoVentas;

    public GastoAdministracion() {
    }

    public GastoAdministracion(double[] agua, double[] energiaElectrica, double[] serviciosComunicacion, double[] gastosGerenciales, double[] rentas, double[] articulosOficina, double[] administracionSistemas, double[] salarios, double[] depreciaciones, double[] ventasRequeridas, double tasaGastoVentas) {
        this.agua = agua;
        this.energiaElectrica = energiaElectrica;
        this.serviciosComunicacion = serviciosComunicacion;
        this.gastosGerenciales = gastosGerenciales;
        this.rentas = rentas;
        this.articulosOficina = articulosOficina;
        this.administracionSistemas = administracionSistemas;
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

    public double[] getArticulosOficina() {
        return articulosOficina;
    }

    public void setArticulosOficina(double[] articulosOficina) {
        this.articulosOficina = articulosOficina;
    }

    public double[] getAdministracionSistemas() {
        return administracionSistemas;
    }

    public void setAdministracionSistemas(double[] administracionSistemas) {
        this.administracionSistemas = administracionSistemas;
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
    
    public double[] calcularGastosFijosAdm(){
        double[] gastosFijosAdmCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosFijosAdmCalculado[i] = this.agua[i] + this.energiaElectrica[i] + this.serviciosComunicacion[i] +
                    this.gastosGerenciales[i] + this.rentas[i] + this.articulosOficina[i] + this.salarios[i] + this.depreciaciones[i];
        }
        return gastosFijosAdmCalculado;
    }
    
    public double[] calcularGastosVariablesAdm(){
        double[] gastosVariablesAdmCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosVariablesAdmCalculado[i] = this.ventasRequeridas[i] * this.tasaGastoVentas;
        }
        return gastosVariablesAdmCalculado;
    }
    
    public double[] calcularGastosAdministracion(){
        double[] gastosFijosAdmCalculado = calcularGastosFijosAdm();
        double[] gastosVariablesAdmCalculado = calcularGastosVariablesAdm();
        double[] gastosAdministracionCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            gastosAdministracionCalculado[i] = gastosFijosAdmCalculado[i] + gastosVariablesAdmCalculado[i];
        }
        return gastosAdministracionCalculado;
    }
}
