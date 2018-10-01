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
public class LoginView extends javax.swing.JDialog {

    private Usuario usuario;
    private Persona persona;

    public LoginView(java.awt.Frame parent, boolean modal, Usuario usuario, Persona person) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ingresoAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("USERNAME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ACCEDER");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
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
   boolean validarEntradasLogin() {
        if (txtuser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el campo nombre usuario");
            return false;
        } else if (txtpass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el campo contraseña");
            return false;
        }
        return true;
    }

    public void ingresoAdmin() {
        //en este metodo me indica q si mi tabla usuarios esta vacia me va a crear un usuario  con admin etc..pero para q se cree 
        // el ususario debe tener una persona para q funcion es por esto q creamos a la persona y relacionarle con el usuario admin
        UsuarioDao ud = new UsuarioDao(null);
        boolean estado = ud.insertarAdmin();
        if (estado == false) {

            Persona p = new Persona();
            p.setNombre("Administrador");
            p.setApellido("Admin");
            p.setDireccion("Guamani");
            p.setTelefono("1234567");
            Usuario u = new Usuario();
            u.setNombreUsuario("admin");
            u.setPassword("admin");
            u.setPersona(p);
            p.setUsuario(u);
            PersonaDao pd = new PersonaDao(p);
            pd.persist();
        } else {
//            JOptionPane.showMessageDialog(this, "YA ESTA CREADO UN USUARIO Y CONTRASEÑA PREDETERMINADO");
        }
    }

    public void validacionInicioLogin() {
        if (validarEntradasLogin()) {
            UsuarioDao ud = new UsuarioDao(null);
            boolean estado = ud.verificacionLogin(txtuser.getText(), txtpass.getText());
            if (estado == true) {
                ud = new UsuarioDao(null);
                Usuario us = ud.obtenerUsuario(txtuser.getText(), txtpass.getText());
                this.dispose();
                PrincipalView pv = new PrincipalView(us);
                pv.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");

            }

        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validacionInicioLogin();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            validacionInicioLogin();
        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            validacionInicioLogin();
        }
    }//GEN-LAST:event_txtuserKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
