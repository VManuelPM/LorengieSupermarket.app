package com.lorengie.Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS_
 */
public class IntAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz2
     */
    public IntAdmin() {
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

        pnlAdminInterface = new javax.swing.JPanel();
        lblSuperLore2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblImgSaleReg = new javax.swing.JLabel();
        lblRegRem = new javax.swing.JLabel();
        lblSalesReport = new javax.swing.JLabel();
        lblProductSearch = new javax.swing.JLabel();
        lblAddProd = new javax.swing.JLabel();
        btnSaleReg = new javax.swing.JButton();
        btnRegRem = new javax.swing.JButton();
        btnSaleReport = new javax.swing.JButton();
        btnProdSearch = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();
        lblAdm = new javax.swing.JLabel();
        btnSaleReport1 = new javax.swing.JButton();
        lblInventary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdminInterface.setBackground(new java.awt.Color(204, 204, 255));
        pnlAdminInterface.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        lblSuperLore2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblSuperLore2.setForeground(new java.awt.Color(255, 102, 0));
        lblSuperLore2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cooltext165357678840369.png"))); // NOI18N

        lblUserName.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lblUserName.setText("ADMINISTRATOR");

        lblImgSaleReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.png"))); // NOI18N

        lblRegRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registro_user.png"))); // NOI18N

        lblSalesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/historial.png"))); // NOI18N

        lblProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        lblAddProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addinventary.png"))); // NOI18N

        btnSaleReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaleReg.setText("SALES REGISTER");

        btnRegRem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegRem.setText("REGISTER AND REMOVE EMPLOYEES");
        btnRegRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegRemActionPerformed(evt);
            }
        });

        btnSaleReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaleReport.setText("SALES REPORT");

        btnProdSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProdSearch.setText("PRODUCT SEARCH");

        btnAddProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddProd.setText("ADD PRODUCT TO INVENTORY");

        lblAdm.setText("Name");

        btnSaleReport1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaleReport1.setText("Inventary");

        lblInventary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control_inventario.png"))); // NOI18N

        javax.swing.GroupLayout pnlAdminInterfaceLayout = new javax.swing.GroupLayout(pnlAdminInterface);
        pnlAdminInterface.setLayout(pnlAdminInterfaceLayout);
        pnlAdminInterfaceLayout.setHorizontalGroup(
            pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                        .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaleReg)
                            .addComponent(btnProdSearch)
                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblImgSaleReg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblUserName)
                                .addGap(43, 43, 43)
                                .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                        .addComponent(btnAddProd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSaleReport1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                        .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRegRem)
                                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(lblAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(lblRegRem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminInterfaceLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblSalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(btnSaleReport)))
                                            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(lblInventary)))))
                                .addGap(101, 123, Short.MAX_VALUE))))
                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                        .addComponent(lblSuperLore2)
                        .addContainerGap())))
        );
        pnlAdminInterfaceLayout.setVerticalGroup(
            pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblSuperLore2))
                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName))))
                .addGap(18, 18, 18)
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminInterfaceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRegRem))
                    .addComponent(lblImgSaleReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSalesReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaleReg)
                    .addComponent(btnRegRem)
                    .addComponent(btnSaleReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminInterfaceLayout.createSequentialGroup()
                        .addComponent(lblInventary)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminInterfaceLayout.createSequentialGroup()
                        .addComponent(lblAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminInterfaceLayout.createSequentialGroup()
                        .addComponent(lblProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlAdminInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdSearch)
                    .addComponent(btnAddProd)
                    .addComponent(btnSaleReport1))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdminInterface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdminInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegRemActionPerformed

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
            java.util.logging.Logger.getLogger(IntAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnProdSearch;
    private javax.swing.JButton btnRegRem;
    private javax.swing.JButton btnSaleReg;
    private javax.swing.JButton btnSaleReport;
    private javax.swing.JButton btnSaleReport1;
    private javax.swing.JLabel lblAddProd;
    private javax.swing.JLabel lblAdm;
    private javax.swing.JLabel lblImgSaleReg;
    private javax.swing.JLabel lblInventary;
    private javax.swing.JLabel lblProductSearch;
    private javax.swing.JLabel lblRegRem;
    private javax.swing.JLabel lblSalesReport;
    private javax.swing.JLabel lblSuperLore2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlAdminInterface;
    // End of variables declaration//GEN-END:variables
}
