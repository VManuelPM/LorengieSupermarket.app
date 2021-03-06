/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.Interface;

/**
 *
 * @author ANDRES
 */
public class IntAddProduct extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz7
     */
    public IntAddProduct() {
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

        pnlInter7 = new javax.swing.JPanel();
        btnHome7 = new javax.swing.JButton();
        lblProdCode = new javax.swing.JLabel();
        lblProdName = new javax.swing.JLabel();
        lblProdDescription = new javax.swing.JLabel();
        lblProdAmount = new javax.swing.JLabel();
        btnAddProd = new javax.swing.JButton();
        btnDeleteProd = new javax.swing.JButton();
        txtProdCode = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtProdDescription = new javax.swing.JTextField();
        txtProdAmount = new javax.swing.JTextField();
        pnlTable7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        scrollPaneAddProd = new javax.swing.JScrollPane();
        tabAddProd = new javax.swing.JTable();
        lblTittleAddProduct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInter7.setBackground(new java.awt.Color(204, 204, 255));

        btnHome7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome7.setText("Home");
        btnHome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome7ActionPerformed(evt);
            }
        });

        lblProdCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProdCode.setText("Product code");

        lblProdName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProdName.setText("Product name");

        lblProdDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProdDescription.setText("Product description");

        lblProdAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProdAmount.setText("Product amount");

        btnAddProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddProd.setText("Add Product");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnDeleteProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteProd.setText("Delete Product");
        btnDeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdActionPerformed(evt);
            }
        });

        txtProdDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdDescriptionActionPerformed(evt);
            }
        });

        txtProdAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdAmountActionPerformed(evt);
            }
        });

        pnlTable7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Order for date");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabAddProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Amount", "Date of Aggregation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneAddProd.setViewportView(tabAddProd);
        if (tabAddProd.getColumnModel().getColumnCount() > 0) {
            tabAddProd.getColumnModel().getColumn(0).setResizable(false);
            tabAddProd.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlTable7Layout = new javax.swing.GroupLayout(pnlTable7);
        pnlTable7.setLayout(pnlTable7Layout);
        pnlTable7Layout.setHorizontalGroup(
            pnlTable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTable7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlTable7Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTable7Layout.setVerticalGroup(
            pnlTable7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTable7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(scrollPaneAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        lblTittleAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add Product.png"))); // NOI18N

        javax.swing.GroupLayout pnlInter7Layout = new javax.swing.GroupLayout(pnlInter7);
        pnlInter7.setLayout(pnlInter7Layout);
        pnlInter7Layout.setHorizontalGroup(
            pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInter7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter7Layout.createSequentialGroup()
                        .addComponent(btnHome7)
                        .addGap(157, 157, 157)
                        .addComponent(lblTittleAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInter7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInter7Layout.createSequentialGroup()
                                .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddProd)
                                    .addComponent(lblProdAmount))
                                .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlInter7Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnDeleteProd))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInter7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtProdAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))))
                            .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlInter7Layout.createSequentialGroup()
                                    .addComponent(lblProdDescription)
                                    .addGap(39, 39, 39)
                                    .addComponent(txtProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInter7Layout.createSequentialGroup()
                                    .addComponent(lblProdName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProdCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblProdCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(pnlTable7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pnlInter7Layout.setVerticalGroup(
            pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInter7Layout.createSequentialGroup()
                .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome7))
                    .addGroup(pnlInter7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTittleAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter7Layout.createSequentialGroup()
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdCode)
                            .addComponent(txtProdCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdName)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdDescription)
                            .addComponent(txtProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdAmount)
                            .addComponent(txtProdAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(pnlInter7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteProd)
                            .addComponent(btnAddProd))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInter7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlTable7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pnlInter7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInter7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnDeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteProdActionPerformed

    private void txtProdDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdDescriptionActionPerformed

    private void txtProdAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdAmountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnHome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome7ActionPerformed

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
            java.util.logging.Logger.getLogger(IntAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntAddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnDeleteProd;
    private javax.swing.JButton btnHome7;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblProdAmount;
    private javax.swing.JLabel lblProdCode;
    private javax.swing.JLabel lblProdDescription;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblTittleAddProduct;
    private javax.swing.JPanel pnlInter7;
    private javax.swing.JPanel pnlTable7;
    private javax.swing.JScrollPane scrollPaneAddProd;
    private javax.swing.JTable tabAddProd;
    private javax.swing.JTextField txtProdAmount;
    private javax.swing.JTextField txtProdCode;
    private javax.swing.JTextField txtProdDescription;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
