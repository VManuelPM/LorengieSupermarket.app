/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.Interface;

/**
 *
 * @author Asus
 */
public class IntProvider extends javax.swing.JFrame {

    /**
     * Creates new form IntProvider
     */
    public IntProvider() {
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

        pnlInventary = new javax.swing.JPanel();
        lblProviders = new javax.swing.JLabel();
        jspInventory = new javax.swing.JScrollPane();
        tblProviders = new javax.swing.JTable();
        btnHome4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInventary.setBackground(new java.awt.Color(204, 204, 255));

        lblProviders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/providers.png"))); // NOI18N

        tblProviders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIT", "Provider Name", "Product type", "Number Telephone"
            }
        ));
        jspInventory.setViewportView(tblProviders);

        btnHome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome4.setText("Home");
        btnHome4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInventaryLayout = new javax.swing.GroupLayout(pnlInventary);
        pnlInventary.setLayout(pnlInventaryLayout);
        pnlInventaryLayout.setHorizontalGroup(
            pnlInventaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInventaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventaryLayout.createSequentialGroup()
                        .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addComponent(lblProviders)
                        .addGap(0, 388, Short.MAX_VALUE))
                    .addComponent(jspInventory))
                .addContainerGap())
        );
        pnlInventaryLayout.setVerticalGroup(
            pnlInventaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventaryLayout.createSequentialGroup()
                .addGroup(pnlInventaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInventaryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome4))
                    .addGroup(pnlInventaryLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblProviders)))
                .addGap(29, 29, 29)
                .addComponent(jspInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInventary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInventary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome4ActionPerformed

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
            java.util.logging.Logger.getLogger(IntProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntProvider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome4;
    private javax.swing.JScrollPane jspInventory;
    private javax.swing.JLabel lblProviders;
    private javax.swing.JPanel pnlInventary;
    private javax.swing.JTable tblProviders;
    // End of variables declaration//GEN-END:variables
}
