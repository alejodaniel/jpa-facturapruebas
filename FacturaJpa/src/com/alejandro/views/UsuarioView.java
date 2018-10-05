/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import com.alejandro.DAO.PersonaDao;
import com.alejandro.DAO.UsuarioDao;
import com.alejandro.dominio.Persona;
import com.alejandro.dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class UsuarioView extends javax.swing.JDialog {

    private Usuario usuario;
    private Persona persona;

    public UsuarioView(java.awt.Frame parent, boolean modal, Usuario user, Persona person) {
        super(parent, modal);
        initComponents();
        if (user != null) {
            usuario = user;

            persona = user.getPersona();

        } else {
            persona = person;
       

        }
        cargarPersonaIngresado();

    }

    public void cargarUsuario() {
        txtnombreusuario.setText(usuario.getNombreUsuario());
        txtcontrasena.setText(usuario.getPassword());

    }

    public void cargarPersonaIngresado() {
        if (persona != null) {
            txtpersona.setText(persona.getNombre());
            txtapellidoa.setText(persona.getApellido());
        }
    }

//    public void cargarUser() {
//        if (usuario != null) {
//            txtpersona.setText(usuario.getNombreUsuario());
//
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombreusuario = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        txtconfirmar = new javax.swing.JPasswordField();
        labe = new javax.swing.JLabel();
        txtpersona = new javax.swing.JTextField();
        labe1 = new javax.swing.JLabel();
        txtapellidoa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("USUARIO");

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        btnguardar.setBackground(new java.awt.Color(51, 255, 255));
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setFocusable(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 255, 255));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.setFocusable(false);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Confirmar Contraseña:");

        labe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labe.setText("NOMBRE:");

        txtpersona.setEditable(false);

        labe1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labe1.setText("APELLIDO:");

        txtapellidoa.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addGap(53, 53, 53)
                .addComponent(btnsalir)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(labe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombreusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpersona, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtapellidoa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtapellidoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(labe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labe1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnsalir))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean validarEntradasUsuario() {

        if (txtnombreusuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene el campo nombre de usuario");
            return false;
        } else if (txtcontrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene el campo contraseña");
            return false;
        } else if (txtconfirmar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lene la confirmacion de contraseña es muy importante");
        }
        return true;
    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (validarEntradasUsuario()) {
            if (txtcontrasena.getText().equals(txtconfirmar.getText())) {
                UsuarioDao usuarioDao = new UsuarioDao(usuario);

                if (usuario != null) {
                    usuario.setNombreUsuario(txtnombreusuario.getText());
                    usuario.setPassword(txtcontrasena.getText());
                    boolean estado = usuarioDao.editarUsuario(usuario);
                    int guarda = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (guarda == JOptionPane.YES_OPTION) {
                        if (estado == true) {
                            JOptionPane.showMessageDialog(this, "Se edito correctamente");
                            dispose();
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Error al editar");
                    }

                } else {
                    Usuario u = new Usuario();
                    u.setNombreUsuario(txtnombreusuario.getText());
                    u.setPassword(txtcontrasena.getText());
                    u.setPersona(persona);
                    //para la relacion de uno a uno
                    persona.setUsuario(u);
                    //
                    boolean estado = usuarioDao.guardarUsuario(u);
                    int guardar = JOptionPane.showConfirmDialog(this, "Desea guardar al nuevo usuario", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (guardar == JOptionPane.YES_OPTION) {
                        if (estado == true) {
                            JOptionPane.showMessageDialog(this, "Se guardo correctamente");
                            dispose();

                        } else {
                            JOptionPane.showMessageDialog(this, "Error al guardar");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden"
                        + "\nVERIFIQUE");
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labe;
    private javax.swing.JLabel labe1;
    private javax.swing.JTextField txtapellidoa;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtnombreusuario;
    private javax.swing.JTextField txtpersona;
    // End of variables declaration//GEN-END:variables
}
