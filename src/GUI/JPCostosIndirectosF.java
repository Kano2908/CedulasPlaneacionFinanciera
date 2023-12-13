package GUI;

import LogicaCedulas.CostosIndirectosFabricacion;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPCostosIndirectosF extends javax.swing.JPanel {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DecimalFormat formatoDecimal = new DecimalFormat("#,##0");
    CostosIndirectosFabricacion costosIF = new CostosIndirectosFabricacion();

    private int[] ventas;
    private double[] inventarioFinalE;
    private double[] inventarioInicialE;
    private double[] produccionMensual;
    private double[] costoTotalUsoMateriales;
    private double[] costoTotalMDO;
    private double[] totalCostoIndirectosProduccion;
    private double[] totalCostoIndirectosVentas;
    private double[] totalCostoIndirectosAdministracion;

    private int mesActual = 0;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double[] gastosSupervicion = new double[12];
    private double depreciaciones;
    private double[] totalCostosFijosP = new double[12];
    private double tasaGIF;
    private double[] costosVariablesP = new double[12];
    private double[] costoTotalCIF = new double[12];

    public JPCostosIndirectosF(int[] ventas, double[] inventarioFinalE, double[] inventarioInicialE, double[] produccionMensual, double[] costoTotalUsoMateriales, double[] costoTotalMDO, double[] totalCostoIndirectosProduccion, double[] totalCostoIndirectosVentas, double[] totalCostoIndirectosAdministracion) {
        this.ventas = ventas;
        this.inventarioFinalE = inventarioFinalE;
        this.inventarioInicialE = inventarioInicialE;
        this.produccionMensual = produccionMensual;
        this.costoTotalUsoMateriales = costoTotalUsoMateriales;
        this.costoTotalMDO = costoTotalMDO;
        this.totalCostoIndirectosProduccion = totalCostoIndirectosProduccion;
        this.totalCostoIndirectosVentas = totalCostoIndirectosVentas;
        this.totalCostoIndirectosAdministracion = totalCostoIndirectosAdministracion;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSextaCedula = new javax.swing.JTable();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLgastosSupervicion = new javax.swing.JLabel();
        jTFGastosS = new javax.swing.JTextField();
        jLdepreciacionesCFC = new javax.swing.JLabel();
        jTFDepreciacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFTasaGIF = new javax.swing.JTextField();
        jLcalcularCostoVarablesProduccion = new javax.swing.JLabel();
        jLcalcularCostoVarablesProduccion1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLTotalCostosF = new javax.swing.JLabel();
        jLTotalCostosVar = new javax.swing.JLabel();
        jLCostoTotalCIF = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTSextaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTSextaCedula);

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
        jLabel8.setText("COSTO TOTAL CIF:");

        jLgastosSupervicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLgastosSupervicion.setText("Gastos Supervicion:");

        jLdepreciacionesCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLdepreciacionesCFC.setText("Depreciacion:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tasa GIF:");

        jLcalcularCostoVarablesProduccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLcalcularCostoVarablesProduccion.setText("TOTAL COSTOS VAR:");

        jLcalcularCostoVarablesProduccion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLcalcularCostoVarablesProduccion1.setText("TOTAL COSTOS FIJOS:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Costos Indirectos de Fabricacion");

        jLTotalCostosF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLTotalCostosVar.setBackground(new java.awt.Color(255, 255, 255));
        jLTotalCostosVar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLCostoTotalCIF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLcalcularCostoVarablesProduccion1)
                            .addComponent(jLcalcularCostoVarablesProduccion)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBIngresar)
                                .addComponent(jBSiguienteCedula))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTotalCostosF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTotalCostosVar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCostoTotalCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFTasaGIF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLdepreciacionesCFC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLgastosSupervicion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFGastosS, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLgastosSupervicion)
                            .addComponent(jTFGastosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLdepreciacionesCFC)
                            .addComponent(jTFDepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTFTasaGIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSiguienteCedula)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcalcularCostoVarablesProduccion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLcalcularCostoVarablesProduccion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLTotalCostosF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLTotalCostosVar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLCostoTotalCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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
        JPPresupuestoCP presuCP = new JPPresupuestoCP(this.ventas, this.inventarioFinalE, this.inventarioInicialE, this.produccionMensual,
                this.costoTotalUsoMateriales, this.costoTotalMDO, this.totalCostoIndirectosVentas, this.totalCostoIndirectosAdministracion, this.costoTotalCIF);

        presuCP.setSize(1056, 407);
        presuCP.setLocation(0, 0);

        this.removeAll();
        this.add(presuCP, BorderLayout.CENTER);
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
    private javax.swing.JLabel jLCostoTotalCIF;
    private javax.swing.JLabel jLTotalCostosF;
    private javax.swing.JLabel jLTotalCostosVar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLcalcularCostoVarablesProduccion;
    private javax.swing.JLabel jLcalcularCostoVarablesProduccion1;
    private javax.swing.JLabel jLdepreciacionesCFC;
    private javax.swing.JLabel jLgastosSupervicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDepreciacion;
    private javax.swing.JTextField jTFGastosS;
    private javax.swing.JTextField jTFTasaGIF;
    private javax.swing.JTable jTSextaCedula;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        String titulos[] = {"Periodo", "CFC Produccion", "Gastos S", "Depreciacion", "Total Costos Fijos", "Produccion Requerida", "TasaGIF", "Total Costo V", "Costo Total CIP"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTSextaCedula.setModel(modeloTabla);
    }

    private void buttomsPrimeraCarga() {
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);

        jTFTasaGIF.setEditable(false);
        jTFTasaGIF.setEnabled(false);
        jTFTasaGIF.setFocusable(false);
    }
    
    private void buttomsFinal() {
        jTFGastosS.setEditable(false);
        jTFGastosS.setEnabled(false);
        jTFGastosS.setFocusable(false);
        
        jTFDepreciacion.setEditable(false);
        jTFDepreciacion.setEnabled(false);
        jTFDepreciacion.setFocusable(false);

        jTFTasaGIF.setEditable(false);
        jTFTasaGIF.setEnabled(false);
        jTFTasaGIF.setFocusable(false);
    }

    private void limpiarCampos() {
        jTFGastosS.setText("");
        jTFDepreciacion.setText("");
        jTFTasaGIF.setText("");
    }

    private void primeraCarga() {
        try {
            this.gastosSupervicion[this.mesActual] = Double.parseDouble(jTFGastosS.getText());
            this.depreciaciones = Double.parseDouble(jTFDepreciacion.getText());
            this.tasaGIF = Double.parseDouble(jTFTasaGIF.getText());

            costosIF.setTotalCostoIndirectosProduccion(this.totalCostoIndirectosProduccion);
            costosIF.setGastosSupervicion(this.gastosSupervicion);
            costosIF.setDepreciaciones(this.depreciaciones);
            costosIF.setUnidadesProducir(this.produccionMensual);
            costosIF.setTasaGIF(this.tasaGIF);

            this.totalCostosFijosP = costosIF.calcularCostoFijosProduccion();
            this.costosVariablesP = costosIF.calcularCostoVarablesProduccion();
            this.costoTotalCIF = costosIF.calcularCostoTotalIndirectosProduccion();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosProduccion[this.mesActual]),
                formatoMoneda.format(this.gastosSupervicion[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalCostosFijosP[this.mesActual]), formatoDecimal.format(this.produccionMensual[this.mesActual]),
                this.tasaGIF, formatoMoneda.format(this.costosVariablesP[this.mesActual]), formatoMoneda.format(this.costoTotalCIF[this.mesActual])};

            modeloTabla.addRow(fila);
            jTSextaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void segundaCarga() {
        try {
            this.gastosSupervicion[this.mesActual] = Double.parseDouble(jTFGastosS.getText());

            costosIF.setTotalCostoIndirectosProduccion(totalCostoIndirectosProduccion);
            costosIF.setGastosSupervicion(this.gastosSupervicion);
            costosIF.setDepreciaciones(this.depreciaciones);
            costosIF.setUnidadesProducir(this.produccionMensual);
            costosIF.setTasaGIF(this.tasaGIF);

            this.totalCostosFijosP = costosIF.calcularCostoFijosProduccion();
            this.costosVariablesP = costosIF.calcularCostoVarablesProduccion();
            this.costoTotalCIF = costosIF.calcularCostoTotalIndirectosProduccion();

            Object[] fila = {this.meses[this.mesActual], formatoMoneda.format(this.totalCostoIndirectosProduccion[this.mesActual]),
                formatoMoneda.format(this.gastosSupervicion[this.mesActual]), formatoMoneda.format(this.depreciaciones),
                formatoMoneda.format(this.totalCostosFijosP[this.mesActual]), formatoDecimal.format(this.produccionMensual[this.mesActual]),
                formatoDecimal.format(tasaGIF), formatoMoneda.format(this.costosVariablesP[this.mesActual]), formatoMoneda.format(this.costoTotalCIF[this.mesActual])};

            modeloTabla.addRow(fila);
            jTSextaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();

            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularTotales() {
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);

        double totalCFP = costosIF.calcularTotalCostoFijosProduccion();
        double totalCVP = costosIF.calcularTotalCostoVarablesProduccion();
        double totalCTCIF = costosIF.calcularTotalCostoTotalIndirectosProduccion();

        // Muestreo de valores
        jLTotalCostosF.setText(String.valueOf(formatoMoneda.format(totalCFP)));
        jLTotalCostosVar.setText(String.valueOf(formatoMoneda.format(totalCVP)));
        jLCostoTotalCIF.setText(String.valueOf(formatoMoneda.format(totalCTCIF)));

        buttomsFinal();
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
