    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import com.alejandro.DAO.VehiculoDao;
import com.alejandro.dominio.Vehiculo;
import com.alejandro.table.VehiculoTable;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class BuscarVehiculoView extends javax.swing.JDialog {

    /**
     * Creates new form BuscarUsuario
     */
    public BuscarVehiculoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarvehiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablavehiculos = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR VEHICULO");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarvehiculoActionPerformed(evt);
            }
        });
        txtbuscarvehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarvehiculoKeyReleased(evt);
            }
        });

        tablavehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablavehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablavehiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablavehiculos);

        btncerrar.setBackground(new java.awt.Color(0, 204, 204));
        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(0, 204, 204));
        btneditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setFocusable(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btneditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar)
                        .addGap(10, 10, 10)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btncerrar))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        try {
            VehiculoTable vehiculoTable = (VehiculoTable) tablavehiculos.getModel();
            Vehiculo vehiculo = vehiculoTable.getFilas().get(tablavehiculos.getSelectedRow());
            VehiculoView vv = new VehiculoView((Frame) this.getParent(), true, vehiculo, null);

            vv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarvehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarvehiculoKeyReleased
        VehiculoDao vd = new VehiculoDao(null);
        List<Vehiculo> vehiculos = vd.buscarPorCriterio(txtbuscarvehiculo.getText());
        VehiculoTable vehiculoTable = new VehiculoTable(vehiculos);
        tablavehiculos.setModel(vehiculoTable);

    }//GEN-LAST:event_txtbuscarvehiculoKeyReleased

    private void txtbuscarvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarvehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarvehiculoActionPerformed

    private void tablavehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablavehiculosMouseClicked

    }//GEN-LAST:event_tablavehiculosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablavehiculos;
    private javax.swing.JTextField txtbuscarvehiculo;
    // End of variables declaration//GEN-END:variables
}
