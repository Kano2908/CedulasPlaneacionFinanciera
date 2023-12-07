package GUI;

import LogicaCedulas.MaterialesComprar;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPMaterialesComprar extends javax.swing.JPanel {
    // Instancias de clases
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    MaterialesComprar materialesComprar = new MaterialesComprar();
    
    // Declaracion de variables y arreglos de esta cedula
    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double porcentaje;
    private double[] produccionMensual;
    private int materialesUsar;
    private int inventarioFinal;
    private double costoUnitario;
   
    public JPMaterialesComprar(double[] produccionMensual) {
        initComponents();
        mostrarMeses();
        this.produccionMensual = produccionMensual;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSegundaCedula = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFMaterialesUsar = new javax.swing.JTextField();
        jLinventarioFinalDeseable = new javax.swing.JLabel();
        jTFInventarioFinal = new javax.swing.JTextField();
        jLimporteCalculado = new javax.swing.JLabel();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFCostoUnitario = new javax.swing.JTextField();
        jLunidadesComprarCalculadas1 = new javax.swing.JLabel();
        jLImporte = new javax.swing.JLabel();
        jLimporteCalculado1 = new javax.swing.JLabel();
        jLimporteCalculado2 = new javax.swing.JLabel();
        jLUnidadesC = new javax.swing.JLabel();
        jLUnidadesR = new javax.swing.JLabel();
        jTFPorcentaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLMeses = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTSegundaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTSegundaCedula.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTSegundaCedula);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Materiales a Usar:");

        jLinventarioFinalDeseable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLinventarioFinalDeseable.setText("Inventario Final:");

        jLimporteCalculado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLimporteCalculado.setText("Costo Total de Uso:");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Materiales a Comprar");

        jLunidadesComprarCalculadas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLunidadesComprarCalculadas1.setText("Costo Unitario:");

        jLImporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLimporteCalculado1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLimporteCalculado1.setText("Total Unidades a Comprar:");

        jLimporteCalculado2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLimporteCalculado2.setText("Total Unidades Requeridas:");

        jLUnidadesC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLUnidadesR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Porcentaje:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLimporteCalculado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFMaterialesUsar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLinventarioFinalDeseable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFInventarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLunidadesComprarCalculadas1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jBIngresar)
                            .addComponent(jBSiguienteCedula)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLimporteCalculado2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLUnidadesR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLimporteCalculado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLUnidadesC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFMaterialesUsar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLinventarioFinalDeseable)
                            .addComponent(jTFInventarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLunidadesComprarCalculadas1))
                        .addGap(34, 34, 34)
                        .addComponent(jBIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSiguienteCedula)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLimporteCalculado2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLUnidadesR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLimporteCalculado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLimporteCalculado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLImporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLUnidadesC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            for (int i = 0; i < 11; i++) {
                segundaCarga();
                if (this.mesActual == 12) {
                    calcularTotales();
                }
            }
        }
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jBSiguienteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteCedulaActionPerformed
        JPMaterialesUsar materialesU = new JPMaterialesUsar(this.produccionMensual, this.materialesUsar, this.costoUnitario);
        materialesU.setSize(804, 407);
        materialesU.setLocation(0, 0);
        
        this.removeAll();
        this.add(materialesU,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLImporte;
    private javax.swing.JLabel jLMeses;
    private javax.swing.JLabel jLUnidadesC;
    private javax.swing.JLabel jLUnidadesR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLimporteCalculado;
    private javax.swing.JLabel jLimporteCalculado1;
    private javax.swing.JLabel jLimporteCalculado2;
    private javax.swing.JLabel jLinventarioFinalDeseable;
    private javax.swing.JLabel jLunidadesComprarCalculadas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCostoUnitario;
    private javax.swing.JTextField jTFInventarioFinal;
    private javax.swing.JTextField jTFMaterialesUsar;
    private javax.swing.JTextField jTFPorcentaje;
    private javax.swing.JTable jTSegundaCedula;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTFMaterialesUsar.setText("");
        jTFInventarioFinal.setText("");
        jTFCostoUnitario.setText("");
    }
    
    private void mostrarMeses(){
        jLMeses.setText(String.valueOf(this.meses[this.mesActual]));
    }
    
    private void buttomsPrimeraCarga() {
        jTFPorcentaje.setEditable(false);
        jTFPorcentaje.setEnabled(false);
        jTFPorcentaje.setFocusable(false);
        
        jTFMaterialesUsar.setEditable(false);
        jTFMaterialesUsar.setEnabled(false);
        jTFMaterialesUsar.setFocusable(false);
        
        jTFInventarioFinal.setEditable(false);
        jTFInventarioFinal.setEnabled(false);
        jTFInventarioFinal.setFocusable(false);
        
        jTFCostoUnitario.setEditable(false);
        jTFCostoUnitario.setEnabled(false);
        jTFCostoUnitario.setFocusable(false);
    }
    
    private double convertirPorcentaje(double porcentaje){
        return porcentaje / 100;
    }

    private void cargarTabla() {
        String titulos[] = {"Periodo", "Produccion","Material a Usar", "Unidades Rqueridas", "Unidades a Comprar", "Costo Unitario", "Importe"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTSegundaCedula.setModel(modeloTabla);
    }
    
    private void primeraCarga() {
        String porcentajeDado = jTFPorcentaje.getText();
        String materialUsarDado = jTFMaterialesUsar.getText();
        String inventarioFinalDado = jTFInventarioFinal.getText();
        String costoUnitarioDado = jTFCostoUnitario.getText();

        try {
            double porcen = Double.parseDouble(porcentajeDado);
            
            this.porcentaje = convertirPorcentaje(porcen);
            this.materialesUsar = Integer.parseInt(materialUsarDado);
            this.inventarioFinal = Integer.parseInt(inventarioFinalDado);
            this.costoUnitario = Double.parseDouble(costoUnitarioDado);
            
            materialesComprar.setPorcentaje(this.porcentaje);
            materialesComprar.setUnidadesProducir(this.produccionMensual);
            materialesComprar.setMaterialesUsar(this.materialesUsar);
            materialesComprar.setInventarioFinal(this.inventarioFinal);
            materialesComprar.setCostoUnitario(this.costoUnitario);

            double[] unidadesRequeridas = materialesComprar.calcularUnidadesRequeridas();
            double[] unidadesComprar = materialesComprar.calcularUnidadesComprar();
            double[] importe = materialesComprar.calcularImporte();

            Object[] fila = {this.meses[this.mesActual], formatoDecimal.format(this.produccionMensual[this.mesActual]), this.materialesUsar,
                formatoDecimal.format(unidadesRequeridas[this.mesActual]), formatoDecimal.format(unidadesComprar[this.mesActual]), 
                formatoMoneda.format(this.costoUnitario), formatoMoneda.format(importe[this.mesActual])};

            modeloTabla.addRow(fila);
            jTSegundaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void segundaCarga(){
        try {
            double[] unidadesRequeridas = materialesComprar.calcularUnidadesRequeridas();
            double[] unidadesComprar = materialesComprar.calcularUnidadesComprar();
            double[] importe = materialesComprar.calcularImporte();

            Object[] fila = {this.meses[this.mesActual], this.produccionMensual[this.mesActual], this.materialesUsar,
                formatoDecimal.format(unidadesRequeridas[this.mesActual]), formatoDecimal.format(unidadesComprar[this.mesActual]), 
                formatoMoneda.format(this.costoUnitario), formatoMoneda.format(importe[this.mesActual])};

            modeloTabla.addRow(fila);
            jTSegundaCedula.setModel(modeloTabla);

            limpiarCampos();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        double totalUnidadesR = materialesComprar.calcularTotalUnidadesRequeridas();
        double totalUnidadesC = materialesComprar.calcularTotalUnidadesComprar();
        double costoTotal = materialesComprar.calcularTotalImporte();

        // Muestreo de valores
        jLUnidadesR.setText(String.valueOf(formatoDecimal.format(totalUnidadesR)));
        jLUnidadesC.setText(String.valueOf(formatoDecimal.format(totalUnidadesC)));
        jLImporte.setText(String.valueOf(formatoMoneda.format(costoTotal)));
        
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}