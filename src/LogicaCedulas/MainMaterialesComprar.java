/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LogicaCedulas;

/**
 *
 * @author crist
 */
public class MainMaterialesComprar {

    public static void main(String[] args) {
        // Valores de producción
        double[] produccion = {
            1835, 1562, 1097, 1325, 791, 956, 1015, 2749, 3343, 11525, 1397, 39
        };

        // Crear una instancia de MaterialesComprar
        MaterialesComprar materiales = new MaterialesComprar();

        // Establecer valores en la instancia
        materiales.setPorcentaje(0.01); // Ajusta el porcentaje según tus necesidades
        materiales.setUnidadesProducir(produccion);
        materiales.setMaterialesUsar(4); // Ajusta el valor según tus necesidades
        materiales.setInventarioFinal(70); // Ajusta el inventario final según tus necesidades
        materiales.setCostoUnitario(10.50); // Ajusta el costo unitario según tus necesidades

        // Calcular y mostrar resultados
        double[] unidadesComprar = materiales.calcularUnidadesComprar();
        double totalUnidadesComprar = materiales.calcularTotalUnidadesComprar();
        double[] importeCalculado = materiales.calcularImporte();
        double totalImporte = materiales.calcularTotalImporte();

        // Mostrar resultados
        System.out.println("Unidades a Comprar por Mes:");
        for (int i = 0; i < unidadesComprar.length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + unidadesComprar[i]);
        }

        System.out.println("\nTotal de Unidades a Comprar: " + totalUnidadesComprar);

        System.out.println("\nImporte por Mes:");
        for (int i = 0; i < importeCalculado.length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + importeCalculado[i]);
        }

        System.out.println("\nTotal de Importe: " + totalImporte);
    }
}

