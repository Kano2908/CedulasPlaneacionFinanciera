package LogicaCedulas;

public class MaterialesUsar {
    private final int mesesA = 12;
    private double[] unidadesProducir;
    private int metrosPiezas;
    private double costoUnitario;

    public MaterialesUsar() {
    }

    public MaterialesUsar(double[] unidadesProducir, int metrosPiezas, double costoUnitario) {
        this.unidadesProducir = unidadesProducir;
        this.metrosPiezas = metrosPiezas;
        this.costoUnitario = costoUnitario;
    }

    public void setUnidadesProducir(double[] unidadesProducir) {
        this.unidadesProducir = unidadesProducir;
    }

    public void setMetrosPiezas(int metrosPiezas) {
        this.metrosPiezas = metrosPiezas;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
    
    public double[] calcularMaterialesUsar(){
        double[] materialesUsarCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            materialesUsarCalculado[i] = unidadesProducir[i] * metrosPiezas;
        }
        return materialesUsarCalculado;
    }
    
    public double calcularTotalMaterialesUsar(){
        double[] materialesUsarCalculado = calcularMaterialesUsar();
        double totalMaterialesUsar = 0;
        
        for (double materialesU : materialesUsarCalculado) {
            totalMaterialesUsar += materialesU;
        }
        return totalMaterialesUsar;
    }
    
    public double[] calcularUsoMaterial(){
        double[] materialesUsarCalculado = calcularMaterialesUsar();
        double[] usoMaterialCalculado = new double[this.mesesA];
        
        for (int i = 0; i < this.mesesA; i++) {
            usoMaterialCalculado[i] = materialesUsarCalculado[i] * this.costoUnitario;
        }
        return usoMaterialCalculado;
    }
    
    public double calcularTotalUsoMaterial(){
        double[] usoMaterialCalculado = calcularUsoMaterial();
        double totalUsoMaterial = 0;
        
        for (double usoMaterial : usoMaterialCalculado) {
            totalUsoMaterial += usoMaterial;
        }
        return totalUsoMaterial;
    }
}
