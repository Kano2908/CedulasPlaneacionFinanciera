package GUI;

import LogicaCedulas.MaterialesUsar;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPMaterialesUsar extends javax.swing.JPanel {

    // Instancias de clases
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    MaterialesUsar materialesU = new MaterialesUsar();

    private int[] ventas;
    private double[] produccionMensual;
    private double[] inventarioFinalE;
    private double[] inventarioInicialE;

    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private int metrosPiezas;
    private double[] materialesUsar;
    private double costoUnitario;
    private double[] totalUsoMaterial;

    public JPMaterialesUsar(int[] ventas, double[] inventarioFinalE, double[] inventarioInicialE, double[] produccionMensual, int metrosPiezas, double costoUnitario) {
        initComponents();
        this.ventas = ventas;
        this.inventarioFinalE = inventarioFinalE;
        this.inventarioInicialE = inventarioInicialE;
        this.produccionMensual = produccionMensual;
        this.metrosPiezas = metrosPiezas;
        this.costoUnitario = costoUnitario;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTerceraCedula = new javax.swing.JTable();
        jLusoMaterialCalculado = new javax.swing.JLabel();
        jBSiguienteCedula = new javax.swing.JButton();
        jLusoMaterialCalculado1 = new javax.swing.JLabel();
        jLMaterialesU = new javax.swing.JLabel();
        jLTotalUsoM = new javax.swing.JLabel();
        jBCalcularTotales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTTerceraCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTTerceraCedula);

        jLusoMaterialCalculado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLusoMaterialCalculado.setText("TOTAL USO DE MATERIALES:");

        jBSiguienteCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBSiguienteCedula.setText("SIGUIENTE CEDULA");
        jBSiguienteCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSiguienteCedula.setEnabled(false);
        jBSiguienteCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteCedulaActionPerformed(evt);
            }
        });

        jLusoMaterialCalculado1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLusoMaterialCalculado1.setText("TOTAL MATERIALES A USAR:");

        jLMaterialesU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalUsoM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jBCalcularTotales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBCalcularTotales.setText("CALCULAR TOTALES");
        jBCalcularTotales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCalcularTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularTotalesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Materiales a Usar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCalcularTotales)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLusoMaterialCalculado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLTotalUsoM, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLusoMaterialCalculado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLMaterialesU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jBSiguienteCedula))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLusoMaterialCalculado1)
                                    .addComponent(jLMaterialesU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLusoMaterialCalculado))
                            .addComponent(jLTotalUsoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(jBCalcularTotales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jBSiguienteCedula)
                .addGap(26, 26, 26))
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
        JPManoObra manoObra = new JPManoObra(this.ventas, this.inventarioFinalE, this.inventarioInicialE, this.produccionMensual, this.totalUsoMaterial);
        manoObra.setSize(1056, 407);
        manoObra.setLocation(0, 0);

        this.removeAll();
        this.add(manoObra, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed

    private void jBCalcularTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularTotalesActionPerformed
        jBCalcularTotales.setEnabled(false);
        for (int i = 0; i < 12; i++) {
            cargarCalculos();
            if (this.mesActual == 12) {
                calcularTotales();
            }
        }
    }//GEN-LAST:event_jBCalcularTotalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcularTotales;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLMaterialesU;
    private javax.swing.JLabel jLTotalUsoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLusoMaterialCalculado;
    private javax.swing.JLabel jLusoMaterialCalculado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTerceraCedula;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "Produccion", "Metros/Piezas", "Materiales Usar", "Costo Unitario", "Total del Uso de Material"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTTerceraCedula.setModel(modeloTabla);
    }

    private void cargarCalculos() {
        try {
            materialesU.setUnidadesProducir(this.produccionMensual);
            materialesU.setMetrosPiezas(this.metrosPiezas);
            materialesU.setCostoUnitario(this.costoUnitario);

            this.materialesUsar = materialesU.calcularMaterialesUsar();
            this.totalUsoMaterial = materialesU.calcularUsoMaterial();

            Object[] fila = {this.meses[this.mesActual], formatoDecimal.format(this.produccionMensual[this.mesActual]), this.metrosPiezas,
                formatoDecimal.format(this.materialesUsar[this.mesActual]), formatoMoneda.format(this.costoUnitario),
                formatoMoneda.format(this.totalUsoMaterial[this.mesActual])};

            modeloTabla.addRow(fila);
            jTTerceraCedula.setModel(modeloTabla);

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double totalMaterialesU = materialesU.calcularTotalMaterialesUsar();
        double costoTotal = materialesU.calcularTotalUsoMaterial();

        // Muestreo de valores
        jLMaterialesU.setText(String.valueOf(formatoDecimal.format(totalMaterialesU)));
        jLTotalUsoM.setText(String.valueOf(formatoMoneda.format(costoTotal)));

        jBSiguienteCedula.setEnabled(true);
    }
}
