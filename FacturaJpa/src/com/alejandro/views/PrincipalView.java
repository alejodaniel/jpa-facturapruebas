package com.alejandro.views;

import com.alejandro.dominio.Usuario;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PrincipalView extends javax.swing.JFrame {

    Usuario usuario;

    public PrincipalView(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);

        if (user != null) {
            usuario = user;
        }

        System.out.println(usuario.getPersona().getNombre());
//        cargarUsuario();
    }

//    public void cargarUsuario() {
//        if (usuario != null) {
//            txtobteneruser.setText(usuario.getPersona().getNombre());
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtobteneruser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        item1 = new javax.swing.JMenuItem();
        item2 = new javax.swing.JMenuItem();
        item3 = new javax.swing.JMenuItem();
        item4 = new javax.swing.JMenuItem();
        item5 = new javax.swing.JMenuItem();
        item7 = new javax.swing.JMenuItem();
        item8 = new javax.swing.JMenuItem();
        item9 = new javax.swing.JMenuItem();
        item10 = new javax.swing.JMenuItem();
        item11 = new javax.swing.JMenuItem();
        item12 = new javax.swing.JMenuItem();
        item13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentRemoved(evt);
            }
        });

        txtobteneruser.setEditable(false);
        txtobteneruser.setBackground(new java.awt.Color(51, 255, 204));
        txtobteneruser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtobteneruser.setFocusable(false);
        txtobteneruser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtobteneruserKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(txtobteneruser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtobteneruser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        jMenu1.setText("ARCHIVO");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu3.setText("PERSONA");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("NUEVA PERSONA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("EDITAR PERSONA");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenu4.setText("USUARIO");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("EDITAR USUARIO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu1.add(jMenu4);

        jMenu5.setText("VEHICULO");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setText("EDITAR VEHICULO");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu1.add(jMenu5);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem4.setText("SALIR ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("TEMAS");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        item1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        item1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item1.setText("BLACK EYE");
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });
        jMenu6.add(item1);

        item2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        item2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item2.setText("BLACK MOON");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        jMenu6.add(item2);

        item3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        item3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item3.setText("BLUE ICE");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        jMenu6.add(item3);

        item4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        item4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item4.setText("BLUE MOON");
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });
        jMenu6.add(item4);

        item5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        item5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item5.setText("BLUE STEEL");
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });
        jMenu6.add(item5);

        item7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.ALT_MASK));
        item7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item7.setText("GREEN DREAM");
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });
        jMenu6.add(item7);

        item8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.ALT_MASK));
        item8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item8.setText("MAUVE METALLIC");
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });
        jMenu6.add(item8);

        item9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_MASK));
        item9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item9.setText("ORANGE METALLIC");
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });
        jMenu6.add(item9);

        item10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.ALT_MASK));
        item10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item10.setText("SILVER MOON");
        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });
        jMenu6.add(item10);

        item11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK));
        item11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item11.setText("SIMPLE 2D");
        item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ActionPerformed(evt);
            }
        });
        jMenu6.add(item11);

        item12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.ALT_MASK));
        item12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item12.setText("SKY METALLIC");
        item12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12ActionPerformed(evt);
            }
        });
        jMenu6.add(item12);

        item13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.ALT_MASK));
        item13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item13.setText("WHITE VISION");
        item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13ActionPerformed(evt);
            }
        });
        jMenu6.add(item13);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("ACERCA DE ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PersonaView pv = new PersonaView(null, true, null);
        pv.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BuscarUsuarioView buv = new BuscarUsuarioView(this, true);
        buv.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int salida = JOptionPane.showConfirmDialog(this, "Esta seguro de cerrar la aplicacion?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (salida == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscarPersonaView bpv = new BuscarPersonaView(null, true);
        bpv.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        BuscarVehiculoView bvv = new BuscarVehiculoView(null, true);
        bvv.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jPanel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentRemoved

    }//GEN-LAST:event_jPanel1ComponentRemoved

    private void txtobteneruserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtobteneruserKeyReleased
        // TODO add your handling code here:JTextField textField = new JTextField(10);

    }//GEN-LAST:event_txtobteneruserKeyReleased

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        PrincipalView pv = new PrincipalView(usuario);
        pv.setVisible(true);


    }//GEN-LAST:event_item1ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed

    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed

    }//GEN-LAST:event_item3ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed

    }//GEN-LAST:event_item4ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed

    }//GEN-LAST:event_item5ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed

    }//GEN-LAST:event_item7ActionPerformed

    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ActionPerformed

    }//GEN-LAST:event_item8ActionPerformed

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed

    }//GEN-LAST:event_item9ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed

    }//GEN-LAST:event_item10ActionPerformed

    private void item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ActionPerformed

    }//GEN-LAST:event_item11ActionPerformed

    private void item12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12ActionPerformed

    }//GEN-LAST:event_item12ActionPerformed

    private void item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13ActionPerformed

    }//GEN-LAST:event_item13ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item1;
    private javax.swing.JMenuItem item10;
    private javax.swing.JMenuItem item11;
    private javax.swing.JMenuItem item12;
    private javax.swing.JMenuItem item13;
    private javax.swing.JMenuItem item2;
    private javax.swing.JMenuItem item3;
    private javax.swing.JMenuItem item4;
    private javax.swing.JMenuItem item5;
    private javax.swing.JMenuItem item7;
    private javax.swing.JMenuItem item8;
    private javax.swing.JMenuItem item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtobteneruser;
    // End of variables declaration//GEN-END:variables
}
