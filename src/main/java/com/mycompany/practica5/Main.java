/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5;

/**
 *
 * @author Ayoze
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChooseColors = new javax.swing.JPanel();
        jLabelColors = new javax.swing.JLabel();
        jLabelColors1 = new javax.swing.JLabel();
        jCheckBoxALL = new javax.swing.JCheckBox();
        jCheckBoxRED = new javax.swing.JCheckBox();
        jCheckBoxGREEN = new javax.swing.JCheckBox();
        jCheckBoxBLUE = new javax.swing.JCheckBox();
        jPanelChooseLogoCorner = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelLogo1 = new javax.swing.JLabel();
        jRadioButtonUPLEFT = new javax.swing.JRadioButton();
        jRadioButtonUPLEFT1 = new javax.swing.JRadioButton();
        jRadioButtonUPLEFT2 = new javax.swing.JRadioButton();
        jRadioButtonUPLEFT3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelChooseColors.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanelChooseColors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelColors.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelColors.setText("RGB COLORS SELECTION");
        jPanelChooseColors.add(jLabelColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabelColors1.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        jLabelColors1.setText("SELECCIONA LOS COLORES QUE QUIERE MOSTRAR EN LA IMAGEN");
        jPanelChooseColors.add(jLabelColors1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jCheckBoxALL.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBoxALL.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jCheckBoxALL.setSelected(true);
        jCheckBoxALL.setText("ALL");
        jCheckBoxALL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxALLStateChanged(evt);
            }
        });
        jCheckBoxALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxALLActionPerformed(evt);
            }
        });
        jPanelChooseColors.add(jCheckBoxALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jCheckBoxRED.setBackground(new java.awt.Color(255, 153, 153));
        jCheckBoxRED.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jCheckBoxRED.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBoxRED.setSelected(true);
        jCheckBoxRED.setText("RED");
        jCheckBoxRED.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxREDStateChanged(evt);
            }
        });
        jPanelChooseColors.add(jCheckBoxRED, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jCheckBoxGREEN.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBoxGREEN.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jCheckBoxGREEN.setForeground(new java.awt.Color(0, 255, 0));
        jCheckBoxGREEN.setSelected(true);
        jCheckBoxGREEN.setText("GREEN");
        jCheckBoxGREEN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxGREENStateChanged(evt);
            }
        });
        jPanelChooseColors.add(jCheckBoxGREEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jCheckBoxBLUE.setBackground(new java.awt.Color(153, 153, 255));
        jCheckBoxBLUE.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jCheckBoxBLUE.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxBLUE.setSelected(true);
        jCheckBoxBLUE.setText("BLUE");
        jCheckBoxBLUE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxBLUEStateChanged(evt);
            }
        });
        jPanelChooseColors.add(jCheckBoxBLUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jPanelChooseLogoCorner.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanelChooseLogoCorner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelLogo.setText("LOGO CORNER DISPLAY");
        jPanelChooseLogoCorner.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabelLogo1.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        jLabelLogo1.setText("SELECCIONA LA ESQUINA EN LA QUE QUIERE MOSTRAR EL LOGO");
        jPanelChooseLogoCorner.add(jLabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jRadioButtonUPLEFT.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jRadioButtonUPLEFT.setText("DOWN - LEFT");
        jRadioButtonUPLEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUPLEFTActionPerformed(evt);
            }
        });
        jPanelChooseLogoCorner.add(jRadioButtonUPLEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jRadioButtonUPLEFT1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jRadioButtonUPLEFT1.setText("UP - RIGHT");
        jRadioButtonUPLEFT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUPLEFT1ActionPerformed(evt);
            }
        });
        jPanelChooseLogoCorner.add(jRadioButtonUPLEFT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jRadioButtonUPLEFT2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jRadioButtonUPLEFT2.setText("UP - LEFT");
        jRadioButtonUPLEFT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUPLEFT2ActionPerformed(evt);
            }
        });
        jPanelChooseLogoCorner.add(jRadioButtonUPLEFT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jRadioButtonUPLEFT3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jRadioButtonUPLEFT3.setText("DOWN - RIGHT");
        jRadioButtonUPLEFT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUPLEFT3ActionPerformed(evt);
            }
        });
        jPanelChooseLogoCorner.add(jRadioButtonUPLEFT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelChooseColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addComponent(jPanelChooseLogoCorner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelChooseLogoCorner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelChooseColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(677, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxALLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxALLActionPerformed

    private void jCheckBoxALLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxALLStateChanged
        if (jCheckBoxALL.isSelected() == true) {
            jCheckBoxBLUE.setSelected(true);
            jCheckBoxGREEN.setSelected(true);
            jCheckBoxRED.setSelected(true);
        } else {
            if (jCheckBoxRED.isSelected() == true && jCheckBoxGREEN.isSelected() == true && jCheckBoxBLUE.isSelected() == true) {
                jCheckBoxALL.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBoxALLStateChanged

    private void jCheckBoxREDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxREDStateChanged
        if (jCheckBoxRED.isSelected() == false) {
            jCheckBoxALL.setSelected(false);
        } else {
            if (jCheckBoxGREEN.isSelected() == true && jCheckBoxBLUE.isSelected() == true) {
                jCheckBoxALL.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBoxREDStateChanged

    private void jCheckBoxGREENStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxGREENStateChanged
        if (jCheckBoxGREEN.isSelected() == false) {
            jCheckBoxALL.setSelected(false);
        } else {
            if (jCheckBoxRED.isSelected() == true && jCheckBoxBLUE.isSelected() == true) {
                jCheckBoxALL.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBoxGREENStateChanged

    private void jCheckBoxBLUEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxBLUEStateChanged
        if (jCheckBoxBLUE.isSelected() == false) {
            jCheckBoxALL.setSelected(false);
        } else {
            if (jCheckBoxRED.isSelected() == true && jCheckBoxGREEN.isSelected() == true) {
                jCheckBoxALL.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBoxBLUEStateChanged

    private void jRadioButtonUPLEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUPLEFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUPLEFTActionPerformed

    private void jRadioButtonUPLEFT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUPLEFT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUPLEFT1ActionPerformed

    private void jRadioButtonUPLEFT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUPLEFT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUPLEFT2ActionPerformed

    private void jRadioButtonUPLEFT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUPLEFT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUPLEFT3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxALL;
    private javax.swing.JCheckBox jCheckBoxBLUE;
    private javax.swing.JCheckBox jCheckBoxGREEN;
    private javax.swing.JCheckBox jCheckBoxRED;
    private javax.swing.JLabel jLabelColors;
    private javax.swing.JLabel jLabelColors1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanelChooseColors;
    private javax.swing.JPanel jPanelChooseLogoCorner;
    private javax.swing.JRadioButton jRadioButtonUPLEFT;
    private javax.swing.JRadioButton jRadioButtonUPLEFT1;
    private javax.swing.JRadioButton jRadioButtonUPLEFT2;
    private javax.swing.JRadioButton jRadioButtonUPLEFT3;
    // End of variables declaration//GEN-END:variables
}