/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;


/**
 *
 * @author asus
 */
public class loginIfWrong extends javax.swing.JFrame {

   int xx, xy;
    public loginIfWrong() {
        
        initComponents();
        
        setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new palette.PanelCustom();
        tx_pass = new javax.swing.JTextField();
        tx_username = new javax.swing.JTextField();
        ic_logo = new javax.swing.JLabel();
        ic_txtField3 = new javax.swing.JLabel();
        ic_txtField2 = new javax.swing.JLabel();
        bt_close = new javax.swing.JLabel();
        ic_txtField1 = new javax.swing.JLabel();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        bt_login1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        panelCustom2 = new palette.PanelCustom();
        bt_loginadmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom1.setBackground(new java.awt.Color(1, 4, 32));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopright(20);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tx_pass.setBackground(new java.awt.Color(217, 217, 217));
        tx_pass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tx_pass.setText("Password");
        tx_pass.setBorder(null);
        tx_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tx_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tx_passFocusLost(evt);
            }
        });
        tx_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_passActionPerformed(evt);
            }
        });
        panelCustom1.add(tx_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 260, 30));

        tx_username.setBackground(new java.awt.Color(217, 217, 217));
        tx_username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tx_username.setText("Username");
        tx_username.setBorder(null);
        tx_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tx_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tx_usernameFocusLost(evt);
            }
        });
        panelCustom1.add(tx_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 260, 30));

        ic_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo (1).png"))); // NOI18N
        panelCustom1.add(ic_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 134, -1, -1));

        ic_txtField3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textFieldicon.png"))); // NOI18N
        panelCustom1.add(ic_txtField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 110));

        ic_txtField2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textFieldicon.png"))); // NOI18N
        panelCustom1.add(ic_txtField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 110));

        bt_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cancel_3.png"))); // NOI18N
        bt_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_closeMouseClicked(evt);
            }
        });
        panelCustom1.add(bt_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 50, 40));

        ic_txtField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textFieldicon.png"))); // NOI18N
        panelCustom1.add(ic_txtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 110));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(1, 4, 32));
        rSMaterialButtonRectangle2.setBorder(null);
        rSMaterialButtonRectangle2.setForeground(new java.awt.Color(217, 217, 217));
        rSMaterialButtonRectangle2.setText("Register");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        panelCustom1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 170, 40));

        bt_login1.setBackground(new java.awt.Color(217, 217, 217));
        bt_login1.setForeground(new java.awt.Color(0, 0, 0));
        bt_login1.setText("LOGIN");
        panelCustom1.add(bt_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 190, 50));

        jLabel1.setBackground(new java.awt.Color(1, 4, 32));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 94, 94));
        jLabel1.setText("Sorry, username or password is incorrect");
        panelCustom1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        panelCustom2.setBackground(new java.awt.Color(1, 4, 32));

        bt_loginadmin.setBackground(new java.awt.Color(1, 4, 32));
        bt_loginadmin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bt_loginadmin.setForeground(new java.awt.Color(217, 217, 217));
        bt_loginadmin.setText("Login as admin");
        bt_loginadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginadminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addComponent(bt_loginadmin)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_loginadmin)
                .addContainerGap())
        );

        panelCustom1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 50));

        getContentPane().add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void bt_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_closeMouseClicked
        dispose();
    }//GEN-LAST:event_bt_closeMouseClicked

    private void bt_loginadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginadminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_loginadminMouseClicked

    private void tx_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_passActionPerformed

    private void tx_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_usernameFocusGained
        String username = tx_username.getText();
        if(username.equals("Username")){
            tx_username.setText("");
        }
    }//GEN-LAST:event_tx_usernameFocusGained

    private void tx_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_passFocusGained
         String pass = tx_pass.getText();
        if(pass.equals("Password")){
            tx_pass.setText("");
        }
    }//GEN-LAST:event_tx_passFocusGained

    private void tx_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_usernameFocusLost
        String username=tx_username.getText();
        if(username.equals("") || username.equals("Username")){
            tx_username.setText("Username");
        }
    }//GEN-LAST:event_tx_usernameFocusLost

    private void tx_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tx_passFocusLost
        String pass=tx_pass.getText();
        if(pass.equals("") || pass.equals("Password")){
            tx_pass.setText("Password");
        }
    }//GEN-LAST:event_tx_passFocusLost

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        reg.revalidate();
        
        dispose();
        
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginIfWrong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginIfWrong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginIfWrong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginIfWrong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginIfWrong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_close;
    private rojerusan.RSMaterialButtonRectangle bt_login1;
    private javax.swing.JLabel bt_loginadmin;
    private javax.swing.JLabel ic_logo;
    private javax.swing.JLabel ic_txtField1;
    private javax.swing.JLabel ic_txtField2;
    private javax.swing.JLabel ic_txtField3;
    private javax.swing.JLabel jLabel1;
    private palette.PanelCustom panelCustom1;
    private palette.PanelCustom panelCustom2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private javax.swing.JTextField tx_pass;
    private javax.swing.JTextField tx_username;
    // End of variables declaration//GEN-END:variables
}
