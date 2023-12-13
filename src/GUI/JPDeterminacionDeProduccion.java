package GUI;

import LogicaCedulas.DeterminacionDeProduccion;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPDeterminacionDeProduccion extends javax.swing.JPanel {

    // Instancias de clases
    DeterminacionDeProduccion determinacionProduccion = new DeterminacionDeProduccion();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    JPMaterialesComprar materialesComprar = null;

    // Declaracion de variables y arreglos de esta cedula
    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double porcentaje;
    private int[] ventas = new int[12];
    private double[] produccionMensual = new double[12];
    private double[] inventarioFinalE;
    private double[] inventarioInicialE;

    public JPDeterminacionDeProduccion() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrimeraC = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFVentas = new javax.swing.JTextField();
        jLunidadesProducir = new javax.swing.JLabel();
        jTFInventarioFinal = new javax.swing.JTextField();
        jLinventarioFinalDeseable = new javax.swing.JLabel();
        jTFInventarioInicial = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLVentaAnual = new javax.swing.JLabel();
        jLProduccionAnual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFPorcentaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLMeses = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTPrimeraC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTPrimeraC);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ventas:");

        jLunidadesProducir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLunidadesProducir.setText("Inventario Final: ");

        jLinventarioFinalDeseable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLinventarioFinalDeseable.setText("Inventario Inicial: ");

        jBIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBIngresar.setText("INGRESAR");
        jBIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jBSiguienteCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBSiguienteCedula.setText("SIGUIENTE CEDULA");
        jBSiguienteCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSiguienteCedula.setEnabled(false);
        jBSiguienteCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteCedulaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Venta Anual:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Produccion Anual:");

        jLVentaAnual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLProduccionAnual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Determinacion de Produccion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Porcentaje:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLinventarioFinalDeseable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFInventarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLunidadesProducir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFInventarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jBIngresar)
                        .addComponent(jBSiguienteCedula)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLVentaAnual, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jLProduccionAnual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLunidadesProducir)
                            .addComponent(jTFInventarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLinventarioFinalDeseable)
                            .addComponent(jTFInventarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jBIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSiguienteCedula))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLVentaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLProduccionAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        if (this.mesActual == 0) {
            primeraCarga();
        } else {
            segundaCarga();
            if (this.mesActual == 12) {
                calcularTotales();
            }
        }
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jBSiguienteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteCedulaActionPerformed
        materialesComprar = new JPMaterialesComprar(this.ventas, this.inventarioFinalE, this.inventarioInicialE, this.produccionMensual);
        materialesComprar.setSize(1056, 407);
        materialesComprar.setLocation(0, 0);

        this.removeAll();
        this.add(materialesComprar, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLMeses;
    private javax.swing.JLabel jLProduccionAnual;
    private javax.swing.JLabel jLVentaAnual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLinventarioFinalDeseable;
    private javax.swing.JLabel jLunidadesProducir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFInventarioFinal;
    private javax.swing.JTextField jTFInventarioInicial;
    private javax.swing.JTextField jTFPorcentaje;
    private javax.swing.JTextField jTFVentas;
    private javax.swing.JTable jTPrimeraC;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTFPorcentaje.setText("");
        jTFVentas.setText("");
        jTFInventarioFinal.setText("");
        jTFInventarioInicial.setText("");
    }

    private void buttomsPrimeraCarga() {
        jTFInventarioFinal.setEditable(false);
        jTFInventarioFinal.setEnabled(false);
        jTFInventarioFinal.setFocusable(false);

        jTFInventarioInicial.setEditable(false);
        jTFInventarioInicial.setEnabled(false);
        jTFInventarioInicial.setFocusable(false);

        jTFPorcentaje.setEditable(false);
        jTFPorcentaje.setEnabled(false);
        jTFPorcentaje.setFocusable(false);
    }
    
    private void buttomsFinal() {
        jTFVentas.setEditable(false);
        jTFVentas.setEnabled(false);
        jTFVentas.setFocusable(false);
        
        jTFInventarioFinal.setEditable(false);
        jTFInventarioFinal.setEnabled(false);
        jTFInventarioFinal.setFocusable(false);

        jTFInventarioInicial.setEditable(false);
        jTFInventarioInicial.setEnabled(false);
        jTFInventarioInicial.setFocusable(false);

        jTFPorcentaje.setEditable(false);
        jTFPorcentaje.setEnabled(false);
        jTFPorcentaje.setFocusable(false);
    }

    private void cargarTabla() {
        String titulos[] = {"Periodo", "Ventas", "I.F", "I.I", "Produccion"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTPrimeraC.setModel(modeloTabla);
    }

    private void primeraCarga() {
        try {
            // Convertir las entradas a números decimales y almacenarlas en los arrays
            this.porcentaje = Double.parseDouble(jTFPorcentaje.getText());
            this.ventas[this.mesActual] = Integer.parseInt(jTFVentas.getText());
            int inventarioInicial = Integer.parseInt(jTFInventarioInicial.getText());
            int inventarioFinal = Integer.parseInt(jTFInventarioFinal.getText());

            // Calcular la producción mensual solo para el mes actual
            determinacionProduccion.setVentas(this.ventas);
            determinacionProduccion.setPorcentaje(this.porcentaje);
            determinacionProduccion.setInventarioFinal(inventarioFinal);
            determinacionProduccion.setInventarioInicial(inventarioInicial);

            this.produccionMensual = determinacionProduccion.calcularDeterminacionProduccion();
            this.inventarioFinalE = determinacionProduccion.extraerInventarioFinal();
            this.inventarioInicialE = determinacionProduccion.extraerInventarioInicial();

            // Agregar una fila a la tabla con los datos del mes actual
            Object[] fila = {this.meses[this.mesActual], this.ventas[this.mesActual], formatoDecimal.format(this.inventarioFinalE[this.mesActual]),
                formatoDecimal.format(this.inventarioInicialE[this.mesActual]), formatoDecimal.format(this.produccionMensual[this.mesActual])};

            modeloTabla.addRow(fila);
            jTPrimeraC.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void segundaCarga() {
        try {
            // Convertir las entradas a números decimales y almacenarlas en los arrays
            this.ventas[this.mesActual] = Integer.parseInt(jTFVentas.getText());

            // Calcular la producción mensual solo para el mes actual
            determinacionProduccion.setVentas(this.ventas);

            this.produccionMensual = determinacionProduccion.calcularDeterminacionProduccion();
            this.inventarioFinalE = determinacionProduccion.extraerInventarioFinal();
            this.inventarioInicialE = determinacionProduccion.extraerInventarioInicial();

            // Agregar una fila a la tabla con los datos del mes actual
            Object[] fila = {this.meses[this.mesActual], this.ventas[this.mesActual], formatoDecimal.format(this.inventarioFinalE[this.mesActual]),
                formatoDecimal.format(this.inventarioInicialE[this.mesActual]), formatoDecimal.format(this.produccionMensual[this.mesActual])};

            modeloTabla.addRow(fila);
            jTPrimeraC.setModel(modeloTabla);

            limpiarCampos();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double ventaAnual = determinacionProduccion.calcularTotalVentas();
        double produccionAnual = determinacionProduccion.calcularProduccionAnual();

        // Muestreo de los valores anuales
        jLVentaAnual.setText(String.valueOf(formatoDecimal.format(ventaAnual)));
        jLProduccionAnual.setText(String.valueOf(formatoDecimal.format(produccionAnual)));

        // Desactivar el botón después de ingresar los datos de los 12 meses y activamos el que cambiara la cedula
        buttomsFinal();
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
