package GUI;

import LogicaCedulas.CostoVentas;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPCostoVentas extends javax.swing.JPanel {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    CostoVentas costoV = new CostoVentas();

    private int[] ventas;
    private double[] inventarioFinalE;
    private double[] inventarioInicialE;
    private double[] totalCostoIndirectosVentas;
    private double[] totalCostoIndirectosAdministracion;
    private double[] costoTotalProduccion;
    private double[] costoUnitarioProduccion;

    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double valorUnitario;
    private double[] valorTInventarioI;
    private double[] valorTInventarioF;
    private double[] costoTotalVentas;

    public JPCostoVentas(int[] ventas, double[] inventarioFinalE, double[] inventarioInicialE, double[] totalCostoIndirectosVentas, 
            double[] totalCostoIndirectosAdministracion, double[] costoTotalProduccion, double[] costoUnitarioProduccion) {

        this.ventas = ventas;
        this.inventarioFinalE = inventarioFinalE;
        this.inventarioInicialE = inventarioInicialE;
        this.totalCostoIndirectosVentas = totalCostoIndirectosVentas;
        this.totalCostoIndirectosAdministracion = totalCostoIndirectosAdministracion;
        this.costoTotalProduccion = costoTotalProduccion;
        this.costoUnitarioProduccion = costoUnitarioProduccion;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOctavaCedula = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFieldValorU = new javax.swing.JTextField();
        jLValorTInveI = new javax.swing.JLabel();
        jLValorTInveF = new javax.swing.JLabel();
        jLCostoTVentas = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTOctavaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTOctavaCedula);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Costo de Ventas");

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("VALORT I.F:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("VALORT I.I:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("COSTO TOTAL VENTAS:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Valor Unitario:");

        jLValorTInveI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLValorTInveF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLCostoTVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIngresar)
                    .addComponent(jBSiguienteCedula)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLValorTInveI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLValorTInveF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCostoTVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFieldValorU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFieldValorU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBIngresar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBSiguienteCedula)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLValorTInveI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(jLValorTInveF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLCostoTVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        JPGastosV gastosV = new JPGastosV(this.ventas, this.totalCostoIndirectosVentas, this.totalCostoIndirectosAdministracion, this.costoTotalVentas);
        gastosV.setSize(1056, 407);
        gastosV.setLocation(0, 0);

        this.removeAll();
        this.add(gastosV, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLCostoTVentas;
    private javax.swing.JLabel jLValorTInveF;
    private javax.swing.JLabel jLValorTInveI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFieldValorU;
    private javax.swing.JTable jTOctavaCedula;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "Valor T I.I", "Produccion", "Valor T I.F", "CostoT Ventas"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTOctavaCedula.setModel(modeloTabla);
    }

    private void buttomsPrimeraCarga() {
        jTFieldValorU.setEditable(false);
        jTFieldValorU.setEnabled(false);
        jTFieldValorU.setFocusable(false);
    }

    private void primeraCarga() {
        try {
            this.valorUnitario = Double.parseDouble(jTFieldValorU.getText());

            costoV.setValorUnitarioDado(this.valorUnitario);
            costoV.setValorUnitario(this.costoUnitarioProduccion);
            costoV.setUnidadesInventarioI(this.inventarioInicialE);
            costoV.setUnidadesInventarioF(this.inventarioFinalE);
            costoV.setCostoTotalproduccion(this.costoTotalProduccion);

            this.valorTInventarioI = costoV.calcularvalorTotalInventarioI();
            this.valorTInventarioF = costoV.calcularvalorTotalInventarioF();
            this.costoTotalVentas = costoV.calcularTotalVentas();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.valorTInventarioI[this.mesActual]),
                formatoMoneda.format(this.costoTotalProduccion[this.mesActual]), formatoMoneda.format(this.valorTInventarioF[this.mesActual]),
                formatoMoneda.format(this.costoTotalVentas[this.mesActual])};

            modeloTabla.addRow(fila);
            jTOctavaCedula.setModel(modeloTabla);

            jTFieldValorU.setText("");
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void segundaCarga() {
        try {
            this.valorTInventarioI = costoV.calcularvalorTotalInventarioI();
            this.valorTInventarioF = costoV.calcularvalorTotalInventarioF();
            this.costoTotalVentas = costoV.calcularTotalVentas();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.valorTInventarioI[this.mesActual]),
                formatoMoneda.format(this.costoTotalProduccion[this.mesActual]), formatoMoneda.format(this.valorTInventarioF[this.mesActual]),
                formatoMoneda.format(this.costoTotalVentas[this.mesActual])};

            modeloTabla.addRow(fila);
            jTOctavaCedula.setModel(modeloTabla);

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double valorTInveI = costoV.calcularTotalInventarioI();
        double valorTInveF = costoV.calcularTotalInventarioF();
        double costoTventas = costoV.calcularTotalAnualVentas();

        // Muestreo de valores
        jLValorTInveI.setText(String.valueOf(formatoMoneda.format(valorTInveI)));
        jLValorTInveF.setText(String.valueOf(formatoMoneda.format(valorTInveF)));
        jLCostoTVentas.setText(String.valueOf(formatoMoneda.format(costoTventas)));

        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
