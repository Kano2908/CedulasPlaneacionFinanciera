package GUI;

import LogicaCedulas.GastoVenta;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPGastosV extends javax.swing.JPanel {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    GastoVenta gastoV = new GastoVenta();

    private int[] ventas;
    private double[] totalCostoIndirectosVentas;
    private double[] totalCostoIndirectosAdministracion;
    private double[] costoTotalVentas;

    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double[] promocionMercadeo = new double[12];
    private double[] salarios = new double[12];
    private double[] distribuciones = new double[12];
    private double depreciaciones;
    private double tasaGastos;
    private double[] totalGastosFijosV = new double[12];
    private double[] totalGastosVariablesV = new double[12];
    private double[] totalGastosV = new double[12];

    public JPGastosV(int[] ventas, double[] totalCostoIndirectosVentas, double[] totalCostoIndirectosAdministracion, double[] costoTotalVentas) {
        this.ventas = ventas;
        this.totalCostoIndirectosVentas = totalCostoIndirectosVentas;
        this.totalCostoIndirectosAdministracion = totalCostoIndirectosAdministracion;
        this.costoTotalVentas = costoTotalVentas;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNovenaCedula = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFPromMerca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFSalarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFDistribucion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFDepreciacion = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFGastoVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLTotalGFV = new javax.swing.JLabel();
        jLTotalGVV = new javax.swing.JLabel();
        jLTotalGV = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTNovenaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTNovenaCedula.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTNovenaCedula);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Prom y Mercadeo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Salarios:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Distribucion:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Depreciacion:");

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
        jLabel8.setText("TOTAL GASTOS F DE VENTA:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Gasto de Ventas");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL GASTOS V DE VENTA:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("TOTAL GASTOS DE VENTA:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tasa Gasto Ventas:");

        jLTotalGFV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalGVV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalGV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBIngresar)
                                .addComponent(jBSiguienteCedula)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTotalGFV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTotalGVV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTotalGV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFGastoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFPromMerca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFSalarios, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFDistribucion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFPromMerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFSalarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDistribucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFGastoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jLTotalGV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSiguienteCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLTotalGFV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLTotalGVV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(40, Short.MAX_VALUE))
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
        JPGastosA gastoA = new JPGastosA(this.ventas, this.totalCostoIndirectosAdministracion, this.costoTotalVentas, this.totalGastosV);
        gastoA.setSize(1056, 407);
        gastoA.setLocation(0, 0);

        this.removeAll();
        this.add(gastoA, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLTotalGFV;
    private javax.swing.JLabel jLTotalGV;
    private javax.swing.JLabel jLTotalGVV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDepreciacion;
    private javax.swing.JTextField jTFDistribucion;
    private javax.swing.JTextField jTFGastoVenta;
    private javax.swing.JTextField jTFPromMerca;
    private javax.swing.JTextField jTFSalarios;
    private javax.swing.JTable jTNovenaCedula;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "CFC Ventas", "Prom/Merc", "Salarios", "Distribuciones", "Depreciaciones", "Total GFV", "Ventas R", "Tasa GV", "Total GVV", "Totasl Gasto V"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTNovenaCedula.setModel(modeloTabla);
    }

    private void buttomsPrimeraCarga() {
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);
        
        jTFGastoVenta.setEditable(false);
        jTFGastoVenta.setEnabled(false);
        jTFGastoVenta.setFocusable(false);
    }
    
    private void buttomsFinal() {
        jTFPromMerca.setEditable(false);
        jTFPromMerca.setEnabled(false);
        jTFPromMerca.setFocusable(false);
        
        jTFSalarios.setEditable(false);
        jTFSalarios.setEnabled(false);
        jTFSalarios.setFocusable(false);
        
        jTFDistribucion.setEditable(false);
        jTFDistribucion.setEnabled(false);
        jTFDistribucion.setFocusable(false);
        
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);
        
        jTFGastoVenta.setEditable(false);
        jTFGastoVenta.setEnabled(false);
        jTFGastoVenta.setFocusable(false);
    }

    private void limpiarCampos() {
        jTFPromMerca.setText("");
        jTFSalarios.setText("");
        jTFDistribucion.setText("");
        jTFDepreciacion.setText("");
        jTFGastoVenta.setText("");
    }

    private void primeraCarga() {
        try {
            this.promocionMercadeo[this.mesActual] = Double.parseDouble(jTFPromMerca.getText());
            this.salarios[this.mesActual] = Double.parseDouble(jTFSalarios.getText());
            this.distribuciones[this.mesActual] = Double.parseDouble(jTFDistribucion.getText());
            this.depreciaciones = Double.parseDouble(jTFDepreciacion.getText());
            this.tasaGastos = Double.parseDouble(jTFGastoVenta.getText());

            gastoV.setTotalCostoIndirectosVentas(this.totalCostoIndirectosVentas);
            gastoV.setPromocionMercadeo(this.promocionMercadeo);
            gastoV.setSalarios(this.salarios);
            gastoV.setDistribuciones(this.distribuciones);
            gastoV.setDepreciaciones(this.depreciaciones);
            gastoV.setVentasRequeridas(this.ventas);
            gastoV.setTasaGastoVentas(this.tasaGastos);

            this.totalGastosFijosV = gastoV.calcularGastosFijosVentas();
            this.totalGastosVariablesV = gastoV.calcularGastosVariablesVentas();
            this.totalGastosV = gastoV.calcularTotalGastoVentas();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosVentas[this.mesActual]),
                formatoMoneda.format(this.promocionMercadeo[this.mesActual]), formatoMoneda.format(this.salarios[this.mesActual]),
                formatoMoneda.format(this.distribuciones[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalGastosFijosV[this.mesActual]), formatoDecimal.format(this.ventas[this.mesActual]),
                formatoMoneda.format(this.tasaGastos), formatoMoneda.format(this.totalGastosVariablesV[this.mesActual]),
                formatoMoneda.format(this.totalGastosV[this.mesActual])};

            modeloTabla.addRow(fila);
            jTNovenaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void segundaCarga() {
        try {
            this.promocionMercadeo[this.mesActual] = Double.parseDouble(jTFPromMerca.getText());
            this.salarios[this.mesActual] = Double.parseDouble(jTFSalarios.getText());
            this.distribuciones[this.mesActual] = Double.parseDouble(jTFDistribucion.getText());

            gastoV.setPromocionMercadeo(this.promocionMercadeo);
            gastoV.setSalarios(this.salarios);
            gastoV.setDistribuciones(this.distribuciones);

            this.totalGastosFijosV = gastoV.calcularGastosFijosVentas();
            this.totalGastosVariablesV = gastoV.calcularGastosVariablesVentas();
            this.totalGastosV = gastoV.calcularTotalGastoVentas();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosVentas[this.mesActual]),
                formatoMoneda.format(this.promocionMercadeo[this.mesActual]), formatoMoneda.format(this.salarios[this.mesActual]),
                formatoMoneda.format(this.distribuciones[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalGastosFijosV[this.mesActual]), formatoDecimal.format(this.ventas[this.mesActual]),
                formatoMoneda.format(this.tasaGastos), formatoMoneda.format(this.totalGastosVariablesV[this.mesActual]),
                formatoMoneda.format(this.totalGastosV[this.mesActual])};

            modeloTabla.addRow(fila);
            jTNovenaCedula.setModel(modeloTabla);

            limpiarCampos();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double totalGFV = gastoV.calcularTotalGastosFijosVentas();
        double totalGVV = gastoV.calcularTotalGastosVariablesVentas();
        double totalGV = gastoV.calcularTotalGastoV();

        // Muestreo de valores
        jLTotalGFV.setText(String.valueOf(formatoMoneda.format(totalGFV)));
        jLTotalGVV.setText(String.valueOf(formatoMoneda.format(totalGVV)));
        jLTotalGV.setText(String.valueOf(formatoMoneda.format(totalGV)));

        buttomsFinal();
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
