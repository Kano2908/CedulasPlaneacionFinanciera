package GUI;

import LogicaCedulas.GastoAdministracion;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPGastosA extends javax.swing.JPanel {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    GastoAdministracion gastoA = new GastoAdministracion();

    private int[] ventas;
    private double[] totalCostoIndirectosAdministracion;
    private double[] costoTotalVentas;
    private double[] totalGastosV;

    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double articulosOficina;
    private double[] adminSistemas = new double[12];
    private double[] salarios = new double[12];
    private double depreciaciones;
    private double tasaGastos;
    private double[] totalGastosFijosA = new double[12];
    private double[] totalGastosVariablesA = new double[12];
    private double[] totalGastosA = new double[12];

    public JPGastosA(int[] ventas, double[] totalCostoIndirectosAdministracion, double[] costoTotalVentas, double[] totalGastosV) {
        this.ventas = ventas;
        this.totalCostoIndirectosAdministracion = totalCostoIndirectosAdministracion;
        this.costoTotalVentas = costoTotalVentas;
        this.totalGastosV = totalGastosV;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDiezCedula = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFArticOficina = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFAdminSistemas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFSalario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFDepreciacion = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFGastoAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLTotalGFA = new javax.swing.JLabel();
        jLTotalGVA = new javax.swing.JLabel();
        jLTotalGA = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTDiezCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTDiezCedula.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTDiezCedula);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Artc Oficina:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Admi Sistemas:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Salario:");

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
        jLabel8.setText("TOTAL GASTOS F DE ADM:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Gastos de Administracion");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL GASTOS V DE ADM:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("TOTAL GASTOS DE ADM:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tasa Gasto Admin:");

        jLTotalGFA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalGVA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalGA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
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
                            .addComponent(jLTotalGFA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTotalGVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTotalGA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFGastoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFArticOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFAdminSistemas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFArticOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFAdminSistemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFGastoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSiguienteCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLTotalGFA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLTotalGVA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLTotalGA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        JPEstadoResultados estadoR = new JPEstadoResultados(this.ventas, this.costoTotalVentas, this.totalGastosV, this.totalGastosA);
        estadoR.setSize(1056, 407);
        estadoR.setLocation(0, 0);

        this.removeAll();
        this.add(estadoR, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jBSiguienteCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSiguienteCedula;
    private javax.swing.JLabel jLTotalGA;
    private javax.swing.JLabel jLTotalGFA;
    private javax.swing.JLabel jLTotalGVA;
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
    private javax.swing.JTable jTDiezCedula;
    private javax.swing.JTextField jTFAdminSistemas;
    private javax.swing.JTextField jTFArticOficina;
    private javax.swing.JTextField jTFDepreciacion;
    private javax.swing.JTextField jTFGastoAdmin;
    private javax.swing.JTextField jTFSalario;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "CFC Administracion", "Arc Oficina", "Adm Sistemas", "Salarios", "Depreciaciones", "Total GFA", "Ventas R", "Tasa GA", "Total GVA", "Totasl Gasto A"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTDiezCedula.setModel(modeloTabla);
    }

    private void buttomsPrimeraCarga() {
        jTFArticOficina.setEditable(false);
        jTFArticOficina.setEnabled(false);
        jTFArticOficina.setFocusable(false);
        
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);
        
        jTFGastoAdmin.setEditable(false);
        jTFGastoAdmin.setEnabled(false);
        jTFGastoAdmin.setFocusable(false);
    }
    
    private void buttomsFinal() {
        jTFArticOficina.setEditable(false);
        jTFArticOficina.setEnabled(false);
        jTFArticOficina.setFocusable(false);
        
        jTFAdminSistemas.setEditable(false);
        jTFAdminSistemas.setEnabled(false);
        jTFAdminSistemas.setFocusable(false);
        
        jTFSalario.setEditable(false);
        jTFSalario.setEnabled(false);
        jTFSalario.setFocusable(false);
        
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);
        
        jTFGastoAdmin.setEditable(false);
        jTFGastoAdmin.setEnabled(false);
        jTFGastoAdmin.setFocusable(false);
    }

    private void limpiarCampos() {
        jTFArticOficina.setText("");
        jTFAdminSistemas.setText("");
        jTFSalario.setText("");
        jTFDepreciacion.setText("");
        jTFGastoAdmin.setText("");
    }

    private void primeraCarga() {
        try {
            this.articulosOficina = Double.parseDouble(jTFArticOficina.getText());
            this.adminSistemas[this.mesActual] = Double.parseDouble(jTFAdminSistemas.getText());
            this.salarios[this.mesActual] = Double.parseDouble(jTFSalario.getText());
            this.depreciaciones = Double.parseDouble(jTFDepreciacion.getText());
            this.tasaGastos = Double.parseDouble(jTFGastoAdmin.getText());

            gastoA.setTotalCostoIndirectosAdmin(this.totalCostoIndirectosAdministracion);
            gastoA.setArticulosOficina(this.articulosOficina);
            gastoA.setAdministracionSistemas(this.adminSistemas);
            gastoA.setSalarios(this.salarios);
            gastoA.setDepreciaciones(this.depreciaciones);
            gastoA.setVentasRequeridas(this.ventas);
            gastoA.setTasaGastoAdm(this.tasaGastos);

            this.totalGastosFijosA = gastoA.calcularGastosFijosAdm();
            this.totalGastosVariablesA = gastoA.calcularGastosVariablesAdm();
            this.totalGastosA = gastoA.calcularGastosAdministracion();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosAdministracion[this.mesActual]),
                formatoMoneda.format(this.articulosOficina), formatoMoneda.format(this.adminSistemas[this.mesActual]),
                formatoMoneda.format(this.salarios[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalGastosFijosA[this.mesActual]), formatoDecimal.format(this.ventas[this.mesActual]),
                formatoMoneda.format(this.tasaGastos), formatoMoneda.format(this.totalGastosVariablesA[this.mesActual]),
                formatoMoneda.format(this.totalGastosA[this.mesActual])};

            modeloTabla.addRow(fila);
            jTDiezCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void segundaCarga() {
        try {
            this.adminSistemas[this.mesActual] = Double.parseDouble(jTFAdminSistemas.getText());
            this.salarios[this.mesActual] = Double.parseDouble(jTFSalario.getText());

            gastoA.setAdministracionSistemas(this.adminSistemas);
            gastoA.setSalarios(this.salarios);

            this.totalGastosFijosA = gastoA.calcularGastosFijosAdm();
            this.totalGastosVariablesA = gastoA.calcularGastosVariablesAdm();
            this.totalGastosA = gastoA.calcularGastosAdministracion();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosAdministracion[this.mesActual]),
                formatoMoneda.format(this.articulosOficina), formatoMoneda.format(this.adminSistemas[this.mesActual]),
                formatoMoneda.format(this.salarios[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalGastosFijosA[this.mesActual]), formatoDecimal.format(this.ventas[this.mesActual]),
                formatoMoneda.format(this.tasaGastos), formatoMoneda.format(this.totalGastosVariablesA[this.mesActual]),
                formatoMoneda.format(this.totalGastosA[this.mesActual])};

            modeloTabla.addRow(fila);
            jTDiezCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double totalGFV = gastoA.calcularTotalGastosFijosAdm();
        double totalGVV = gastoA.calcularTotalGastosVariablesAdm();
        double totalGV = gastoA.calcularTotalGastoA();

        // Muestreo de valores
        jLTotalGFA.setText(String.valueOf(formatoMoneda.format(totalGFV)));
        jLTotalGVA.setText(String.valueOf(formatoMoneda.format(totalGVV)));
        jLTotalGA.setText(String.valueOf(formatoMoneda.format(totalGV)));
        
        buttomsFinal();
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
