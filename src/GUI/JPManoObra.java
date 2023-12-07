package GUI;

import LogicaCedulas.ManoDeObra;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPManoObra extends javax.swing.JPanel {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    ManoDeObra manoDeObra = new ManoDeObra();
    
    private double[] produccionMensual;
    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double tiempoTrabajar;
    private double tarifaHora;
    
    public JPManoObra(double[] produccionMensual) {
        initComponents();
        this.produccionMensual = produccionMensual;
        cargarTabla();
        mostrarMeses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCuartaCedula = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFTiempoEstandar = new javax.swing.JTextField();
        jLtarifaHora = new javax.swing.JLabel();
        jTFTarifaHora = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLhorasTrabajarCalculadas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLImporteTotal = new javax.swing.JLabel();
        jLhorasTrabajarCalculadas1 = new javax.swing.JLabel();
        jLTotalHoras = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLMeses = new javax.swing.JLabel();

        jTCuartaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTCuartaCedula);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tiempo Estandar:");

        jLtarifaHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLtarifaHora.setText("Tarifa por Hora:");

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

        jLhorasTrabajarCalculadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLhorasTrabajarCalculadas.setText("IMPORTE TOTAL:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mano de Obra");

        jLImporteTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLhorasTrabajarCalculadas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLhorasTrabajarCalculadas1.setText("TOTAL HORAS:");

        jLTotalHoras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBIngresar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLtarifaHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFTiempoEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jTFTarifaHora)))
                    .addComponent(jBSiguienteCedula)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLhorasTrabajarCalculadas1)
                            .addComponent(jLhorasTrabajarCalculadas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTotalHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFTiempoEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtarifaHora)
                            .addComponent(jTFTarifaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jBIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBSiguienteCedula)
                                .addGap(34, 34, 34)
                                .addComponent(jLhorasTrabajarCalculadas1))
                            .addComponent(jLTotalHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLhorasTrabajarCalculadas)
                            .addComponent(jLImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        if(this.mesActual == 0){
            primeraCarga();
        } else {
            for (int i = 0; i < 11; i++) {
                segundaCarga();
                if(this.mesActual == 12){
                    calcularTotales();
                }
            }
        }
    }//GEN-LAST:event_jBIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLImporteTotal;
    private javax.swing.JLabel jLMeses;
    private javax.swing.JLabel jLTotalHoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLhorasTrabajarCalculadas;
    private javax.swing.JLabel jLhorasTrabajarCalculadas1;
    private javax.swing.JLabel jLtarifaHora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCuartaCedula;
    private javax.swing.JTextField jTFTarifaHora;
    private javax.swing.JTextField jTFTiempoEstandar;
    // End of variables declaration//GEN-END:variables
    
    private void cargarTabla() {
        String titulos[] = {"Periodo", "Produccion","Tiempo Estandar", "Horas a Trabajar", "Tarifa Estandar por Hora", "Importe Total"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTCuartaCedula.setModel(modeloTabla);
    }
    
    private void mostrarMeses(){
        jLMeses.setText(String.valueOf(this.meses[this.mesActual]));
    }
    
    private void buttomsPrimeraCarga(){
        jTFTiempoEstandar.setEditable(false);
        jTFTiempoEstandar.setEnabled(false);
        jTFTiempoEstandar.setFocusable(false);
        
        jTFTarifaHora.setEditable(false);
        jTFTarifaHora.setEnabled(false);
        jTFTarifaHora.setFocusable(false);
    }
    
    private void limpiarCampos() {
        jTFTarifaHora.setText("");
        jTFTiempoEstandar.setText("");
    }
    
    private void primeraCarga(){
        String tiempoEstandarDado = jTFTiempoEstandar.getText();
        String tarifaHoraDada = jTFTarifaHora.getText();

        try {
            this.tiempoTrabajar = Double.parseDouble(tiempoEstandarDado);
            this.tarifaHora = Double.parseDouble(tarifaHoraDada);

            manoDeObra.setUnidadesProducir(this.produccionMensual);
            manoDeObra.setTiempoEstandar(this.tiempoTrabajar);
            manoDeObra.setTarifaHora(this.tarifaHora);

            double[] horasTrabajarCalculada = manoDeObra.calcularHorasTrabajar();
            double[] importeCalculado = manoDeObra.calcularImporte();

            Object[] fila = {this.meses[this.mesActual], formatoDecimal.format(this.produccionMensual[this.mesActual]), this.tiempoTrabajar, horasTrabajarCalculada[this.mesActual],
            formatoMoneda.format(this.tarifaHora), formatoMoneda.format(importeCalculado[this.mesActual])};

            modeloTabla.addRow(fila);
            jTCuartaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void segundaCarga(){
        try {
            manoDeObra.setUnidadesProducir(this.produccionMensual);
            manoDeObra.setTiempoEstandar(this.tiempoTrabajar);
            manoDeObra.setTarifaHora(this.tarifaHora);

            double[] horasTrabajarCalculada = manoDeObra.calcularHorasTrabajar();
            double[] importeCalculado = manoDeObra.calcularImporte();

            Object[] fila = {this.meses[this.mesActual], formatoDecimal.format(this.produccionMensual[this.mesActual]), this.tiempoTrabajar, 
                formatoDecimal.format(horasTrabajarCalculada[this.mesActual]), formatoMoneda.format(this.tarifaHora), 
                formatoMoneda.format(importeCalculado[this.mesActual])};

            modeloTabla.addRow(fila);
            jTCuartaCedula.setModel(modeloTabla);

            limpiarCampos();
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calcularTotales(){
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        double totalHoras = manoDeObra.calcularTotalHorasTrabajar();
        double importeTotal = manoDeObra.calcularImporteTotal();

        // Muestreo de valores
        jLTotalHoras.setText(String.valueOf(formatoDecimal.format(totalHoras)));
        jLImporteTotal.setText(String.valueOf(formatoMoneda.format(importeTotal)));

        jBSiguienteCedula.setEnabled(true);
    }
}