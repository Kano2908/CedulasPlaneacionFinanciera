package GUI;

import LogicaCedulas.PresupuestoCostoProduccion;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPPresupuestoCP extends javax.swing.JPanel {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    PresupuestoCostoProduccion presuCP = new PresupuestoCostoProduccion();
    
    private double[] produccionMensual;
    private double[] costoTotalUsoMateriales;
    private double[] costoTotalMDO;
    private double[] totalCostoIndirectosVentas;
    private double[] totalCostoIndirectosAdministracion;
    private double[] costoTotalCIF;
    
    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double[] costoTotalproduccion;
    private double[] costoUnitarioProduccion;
    
    public JPPresupuestoCP(double[] produccionMensual, double[] costoTotalUsoMateriales, double[] costoTotalMDO, double[] totalCostoIndirectosVentas, double[] totalCostoIndirectosAdministracion, double[] costoTotalCIF) {
        this.produccionMensual = produccionMensual;
        this.costoTotalUsoMateriales = costoTotalUsoMateriales;
        this.costoTotalMDO = costoTotalMDO;
        this.totalCostoIndirectosVentas = totalCostoIndirectosVentas;
        this.totalCostoIndirectosAdministracion = totalCostoIndirectosAdministracion;
        this.costoTotalCIF = costoTotalCIF;
        initComponents();
        cargarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSeptimaCedula = new javax.swing.JTable();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLCostoTP = new javax.swing.JLabel();
        jLCostoUP = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jTSeptimaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTSeptimaCedula.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTSeptimaCedula);

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("COSTO TOTAL PRODUCCION:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Presupuesto Costo Produccion");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("COSTOU PRODUCCION:");

        jLCostoTP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLCostoUP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIngresar)
                    .addComponent(jBSiguienteCedula)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCostoTP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCostoUP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSiguienteCedula)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLCostoTP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jLCostoUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void jBSiguienteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        jBIngresar.setEnabled(false);
        for (int i = 0; i < 12; i++) {
            primeraCarga();
            if(this.mesActual == 12){
                calcularTotales();
            }
        }
    }//GEN-LAST:event_jBIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLCostoTP;
    private javax.swing.JLabel jLCostoUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSeptimaCedula;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "CT Usu de Materiales", "CT Mano de Obra","CT Costos IF", "CT de Produccion", "Produccion Requerida", "CostoU de Produccion"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTSeptimaCedula.setModel(modeloTabla);
    }
    
    private void primeraCarga(){
        try {
            presuCP.setCostoTotalUsoMaterial(this.costoTotalUsoMateriales);
            presuCP.setCostoTotalManoObra(this.costoTotalMDO);
            presuCP.setCostoTotalCostosIndirectosFabricacion(this.costoTotalCIF);
            presuCP.setProduccionRequerida(this.produccionMensual);

            this.costoTotalproduccion = presuCP.calcularCostoTotalProduccion();
            this.costoUnitarioProduccion = presuCP.calcularCostoUnitarioProduccion();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.costoTotalUsoMateriales[this.mesActual]), 
            formatoMoneda.format(this.costoTotalMDO[this.mesActual]), formatoMoneda.format(this.costoTotalCIF[this.mesActual]),
            formatoMoneda.format(this.costoTotalproduccion[this.mesActual]), formatoDecimal.format(this.produccionMensual[this.mesActual]),
            formatoDecimal.format(this.costoUnitarioProduccion[this.mesActual])};

            modeloTabla.addRow(fila);
            jTSeptimaCedula.setModel(modeloTabla);
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calcularTotales(){
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        double totalCTP = presuCP.calcularTotalCostoTotalProduccion();
        double totalCUP = presuCP.calcularTotalCostoUnitarioProduccion();

        // Muestreo de valores
        jLCostoTP.setText(String.valueOf(formatoMoneda.format(totalCTP)));
        jLCostoUP.setText(String.valueOf(formatoDecimal.format(totalCUP)));
        
        
        jBSiguienteCedula.setEnabled(true);
    }
}
