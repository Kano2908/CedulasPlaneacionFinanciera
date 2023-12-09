
package GUI;

import LogicaCedulas.DistribucionCostosFijosComunes;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPDistribucionCFC extends javax.swing.JPanel {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DecimalFormat formatoMoneda = new DecimalFormat("$#,##0.00");
    DistribucionCostosFijosComunes distriCFC = new DistribucionCostosFijosComunes();
    
    private double[] produccionMensual;
    private double[] costoTotalUsoMateriales;
    private double[] costoTotalMDO;
    
    private int mesActual = 0;
    private final int PORCENTAJE = 100;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private double porcentajeP;
    private double porcentajeV;
    private double porcentajeA;
    private double porcentajeProd;
    private double porcentajeVent;
    private double porcentajeAdm;
    private double agua;
    private double luz;
    private double servicioC;
    private double gastosG;
    private double rentas;
    private double depreciacion;
    private double[] totalCostoIndirectos;
    private double[] totalCostoIndirectosProduccion;
    private double[] totalCostoIndirectosVentas;
    private double[] totalCostoIndirectosAdministracion;
    
    public JPDistribucionCFC(double[] produccionMensual, double[] costoTotalUsoMateriales, double[] costoTotalMDO) {
        this.produccionMensual = produccionMensual;
        this.costoTotalUsoMateriales = costoTotalUsoMateriales;
        this.costoTotalMDO = costoTotalMDO;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTQuintaCedula = new javax.swing.JTable();
        jLaguaCFC = new javax.swing.JLabel();
        jTFAgua = new javax.swing.JTextField();
        jLenergiaElectricaCFC = new javax.swing.JLabel();
        jTFLuz = new javax.swing.JTextField();
        jLserviciosComunicacionCFC = new javax.swing.JLabel();
        jTFServiciosC = new javax.swing.JTextField();
        jLgastosGerencialesCFC = new javax.swing.JLabel();
        jTFGastosG = new javax.swing.JTextField();
        jLrentasCFC = new javax.swing.JLabel();
        jTFRentas = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBSiguienteCedula = new javax.swing.JButton();
        jLcalcularCostoVarablesProduccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLCostoTotal = new javax.swing.JLabel();
        jLrentasCFC1 = new javax.swing.JLabel();
        jTFDepreciaciones = new javax.swing.JTextField();
        jTFPorcentajeP = new javax.swing.JTextField();
        jLaguaCFC1 = new javax.swing.JLabel();
        jLaguaCFC2 = new javax.swing.JLabel();
        jTFPorcentajeV = new javax.swing.JTextField();
        jLaguaCFC3 = new javax.swing.JLabel();
        jTFPorcentajeA = new javax.swing.JTextField();

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

        jTQuintaCedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTQuintaCedula.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTQuintaCedula);

        jLaguaCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLaguaCFC.setText("Agua:");

        jLenergiaElectricaCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLenergiaElectricaCFC.setText("Luz:");

        jLserviciosComunicacionCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLserviciosComunicacionCFC.setText("Serv. Comunicacion:");

        jLgastosGerencialesCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLgastosGerencialesCFC.setText("Gastos Gerenciales:");

        jLrentasCFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLrentasCFC.setText("Rentas:");

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

        jLcalcularCostoVarablesProduccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLcalcularCostoVarablesProduccion.setText("COSTO TOTAL COSTOS INDIRECTOS:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Distribucion CFC");

        jLCostoTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLrentasCFC1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLrentasCFC1.setText("Depreciacion:");

        jLaguaCFC1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLaguaCFC1.setText("% P");

        jLaguaCFC2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLaguaCFC2.setText("% V");

        jLaguaCFC3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLaguaCFC3.setText("% A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLcalcularCostoVarablesProduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBIngresar)
                            .addComponent(jBSiguienteCedula)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLaguaCFC1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPorcentajeP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLaguaCFC2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPorcentajeV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLaguaCFC3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPorcentajeA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLrentasCFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFRentas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLaguaCFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLenergiaElectricaCFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLserviciosComunicacionCFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFServiciosC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLgastosGerencialesCFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFGastosG, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLrentasCFC1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFDepreciaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaguaCFC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLenergiaElectricaCFC)
                            .addComponent(jTFLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLserviciosComunicacionCFC)
                            .addComponent(jTFServiciosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLgastosGerencialesCFC)
                            .addComponent(jTFGastosG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLrentasCFC)
                            .addComponent(jTFRentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLrentasCFC1)
                            .addComponent(jTFDepreciaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLaguaCFC1)
                                .addComponent(jTFPorcentajeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLaguaCFC2)
                                .addComponent(jTFPorcentajeV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLaguaCFC3)
                                .addComponent(jTFPorcentajeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSiguienteCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcalcularCostoVarablesProduccion)
                            .addComponent(jLCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
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
        JPCostosIndirectosF costosIF = new JPCostosIndirectosF(produccionMensual, costoTotalUsoMateriales, costoTotalMDO, totalCostoIndirectosProduccion, totalCostoIndirectosVentas, totalCostoIndirectosAdministracion);
        
        costosIF.setSize(804, 407);
        costosIF.setLocation(0, 0);
        
        this.removeAll();
        this.add(costosIF,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
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
    private javax.swing.JLabel jLCostoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLaguaCFC;
    private javax.swing.JLabel jLaguaCFC1;
    private javax.swing.JLabel jLaguaCFC2;
    private javax.swing.JLabel jLaguaCFC3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLcalcularCostoVarablesProduccion;
    private javax.swing.JLabel jLenergiaElectricaCFC;
    private javax.swing.JLabel jLgastosGerencialesCFC;
    private javax.swing.JLabel jLrentasCFC;
    private javax.swing.JLabel jLrentasCFC1;
    private javax.swing.JLabel jLserviciosComunicacionCFC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAgua;
    private javax.swing.JTextField jTFDepreciaciones;
    private javax.swing.JTextField jTFGastosG;
    private javax.swing.JTextField jTFLuz;
    private javax.swing.JTextField jTFPorcentajeA;
    private javax.swing.JTextField jTFPorcentajeP;
    private javax.swing.JTextField jTFPorcentajeV;
    private javax.swing.JTextField jTFRentas;
    private javax.swing.JTextField jTFServiciosC;
    private javax.swing.JTable jTQuintaCedula;
    // End of variables declaration//GEN-END:variables
    
    private void cargarTabla() {
        String titulos[] = {"Periodo", "Porcentaje", "Agua","Luz", "Servicios C", "Gastos Gerenciales", "Rentas", "Depreciacion", "Costo Total"};
        modeloTabla.setColumnIdentifiers(titulos);
        jTQuintaCedula.setModel(modeloTabla);
    }
    
    private void buttomsPrimeraCarga(){
        jTFAgua.setEditable(false);
        jTFAgua.setEnabled(false);
        jTFAgua.setFocusable(false);
        
        jTFLuz.setEditable(false);
        jTFLuz.setEnabled(false);
        jTFLuz.setFocusable(false);
        
        jTFServiciosC.setEditable(false);
        jTFServiciosC.setEnabled(false);
        jTFServiciosC.setFocusable(false);
        
        jTFGastosG.setEditable(false);
        jTFGastosG.setEnabled(false);
        jTFGastosG.setFocusable(false);
        
        jTFRentas.setEditable(false);
        jTFRentas.setEnabled(false);
        jTFRentas.setFocusable(false);
        
        jTFPorcentajeP.setEditable(false);
        jTFPorcentajeP.setEnabled(false);
        jTFPorcentajeP.setFocusable(false);
        
        jTFPorcentajeV.setEditable(false);
        jTFPorcentajeV.setEnabled(false);
        jTFPorcentajeV.setFocusable(false);
        
        jTFPorcentajeA.setEditable(false);
        jTFPorcentajeA.setEnabled(false);
        jTFPorcentajeA.setFocusable(false);
        
        jTFDepreciaciones.setEditable(false);
        jTFDepreciaciones.setEnabled(false);
        jTFDepreciaciones.setFocusable(false);
    }
    
    private void limpiarCampos() {
        jTFAgua.setText("");
        jTFLuz.setText("");
        jTFServiciosC.setText("");
        jTFGastosG.setText("");
        jTFRentas.setText("");
        jTFDepreciaciones.setText("");
    }
    
    private double convertirPorcentaje(double porcentaje){
        return porcentaje / 100;
    }
    
    private void primeraCarga(){
        try {
            this.agua = Double.parseDouble(jTFAgua.getText());
            this.luz = Double.parseDouble(jTFLuz.getText());
            this.servicioC = Double.parseDouble(jTFServiciosC.getText());
            this.gastosG = Double.parseDouble(jTFGastosG.getText());
            this.rentas = Double.parseDouble(jTFRentas.getText());
            this.depreciacion = Double.parseDouble(jTFDepreciaciones.getText());
            this.porcentajeProd = Double.parseDouble(jTFPorcentajeP.getText());
            this.porcentajeVent = Double.parseDouble(jTFPorcentajeV.getText());
            this.porcentajeAdm = Double.parseDouble(jTFPorcentajeA.getText());
            
            this.porcentajeP = convertirPorcentaje(this.porcentajeProd);
            this.porcentajeV = convertirPorcentaje(this.porcentajeVent);
            this.porcentajeA = convertirPorcentaje(this.porcentajeAdm);
            
            distriCFC.setPorcentajeProduccion(this.porcentajeP);
            distriCFC.setPorcentajeVentas(this.porcentajeV);
            distriCFC.setPorcentajeAdministracion(this.porcentajeA);
            distriCFC.setAgua(this.agua);
            distriCFC.setEnergiaElectrica(this.luz);
            distriCFC.setServiciosComunicacion(this.servicioC);
            distriCFC.setGastosGerenciales(this.gastosG);
            distriCFC.setRentas(this.rentas);
            distriCFC.setDepreciaciones(depreciacion);

            this.totalCostoIndirectos = distriCFC.calularCostoTotalCostosIndirectos();
            this.totalCostoIndirectosProduccion = distriCFC.calcularCostoFijosComunesProduccion();
            this.totalCostoIndirectosVentas = distriCFC.calcularCostoFijosComunesVentas();
            this.totalCostoIndirectosAdministracion = distriCFC.calcularCostoFijosComunesAdministracion();

            Object[] fila = {this.meses[this.mesActual], this.PORCENTAJE, formatoMoneda.format(this.agua), formatoMoneda.format(this.luz), 
                formatoMoneda.format(this.servicioC), formatoMoneda.format(this.gastosG), formatoMoneda.format(this.rentas), 
                formatoMoneda.format(this.depreciacion), formatoMoneda.format(this.totalCostoIndirectos[this.mesActual])};

            modeloTabla.addRow(fila);
            jTQuintaCedula.setModel(modeloTabla);

            limpiarCampos();
            buttomsPrimeraCarga();
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void segundaCarga(){
        try {
            distriCFC.setPorcentajeProduccion(this.porcentajeP);
            distriCFC.setPorcentajeVentas(this.porcentajeV);
            distriCFC.setPorcentajeAdministracion(this.porcentajeA);
            distriCFC.setAgua(this.agua);
            distriCFC.setEnergiaElectrica(this.luz);
            distriCFC.setServiciosComunicacion(this.servicioC);
            distriCFC.setGastosGerenciales(this.gastosG);
            distriCFC.setRentas(this.rentas);
            distriCFC.setDepreciaciones(depreciacion);

            this.totalCostoIndirectos = distriCFC.calularCostoTotalCostosIndirectos();
            this.totalCostoIndirectosProduccion = distriCFC.calcularCostoFijosComunesProduccion();
            this.totalCostoIndirectosVentas = distriCFC.calcularCostoFijosComunesVentas();
            this.totalCostoIndirectosAdministracion = distriCFC.calcularCostoFijosComunesAdministracion();

            Object[] fila = {this.meses[this.mesActual], this.PORCENTAJE, formatoMoneda.format(this.agua), formatoMoneda.format(this.luz), 
                formatoMoneda.format(this.servicioC), formatoMoneda.format(this.gastosG), formatoMoneda.format(this.rentas), 
                formatoMoneda.format(this.depreciacion), formatoMoneda.format(this.totalCostoIndirectos[this.mesActual])};

            modeloTabla.addRow(fila);
            jTQuintaCedula.setModel(modeloTabla);
            
            this.mesActual++;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calcularTotales(){
        JOptionPane.showMessageDialog(null, "Calculando totales", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        double totalCostoTotal = distriCFC.calcularCostoAnualCostosIndirectos();

        // Muestreo de valores
        jLCostoTotal.setText(String.valueOf(formatoMoneda.format(totalCostoTotal)));
        
        jBIngresar.setEnabled(false);
        jBSiguienteCedula.setEnabled(true);
    }
}
