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
public class IntRegEli extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz4
     */
    public IntRegEli() {
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

        pnlInter4 = new java.awt.Panel();
        btnHome4 = new javax.swing.JButton();
        lblCodeEmp = new javax.swing.JLabel();
        lblNameEmp = new javax.swing.JLabel();
        lblIdEmp = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnRegisEmp = new javax.swing.JButton();
        btnElimDeliv = new javax.swing.JButton();
        pnlTable4 = new javax.swing.JPanel();
        jspTable4 = new javax.swing.JScrollPane();
        tblEmp_Position = new javax.swing.JTable();
        lblTittleRandE = new javax.swing.JLabel();
        txtEmployeeIdentification = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtEmployeeCode = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cbxPosition = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInter4.setBackground(new java.awt.Color(204, 204, 255));

        btnHome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome4.setText("Home");
        btnHome4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome4ActionPerformed(evt);
            }
        });

        lblCodeEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodeEmp.setText("Employee Code");

        lblNameEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNameEmp.setText("Employee Name");

        lblIdEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdEmp.setText("Employee Identification");

        lblPosition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPosition.setText("Position");

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setText("User");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        txtEmployeeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnRegisEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegisEmp.setText("Register Employee");
        btnRegisEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisEmpActionPerformed(evt);
            }
        });

        btnElimDeliv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElimDeliv.setText("Delete Employee");

        pnlTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblEmp_Position.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmp_Position.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable4.setViewportView(tblEmp_Position);
        if (tblEmp_Position.getColumnModel().getColumnCount() > 0) {
            tblEmp_Position.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout pnlTable4Layout = new javax.swing.GroupLayout(pnlTable4);
        pnlTable4.setLayout(pnlTable4Layout);
        pnlTable4Layout.setHorizontalGroup(
            pnlTable4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTable4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTable4Layout.setVerticalGroup(
            pnlTable4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTable4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTittleRandE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register and Elimination of Employees.png"))); // NOI18N

        txtEmployeeIdentification.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmployeeCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Recepcionista", "Repartidor", "Vendedor" }));

        javax.swing.GroupLayout pnlInter4Layout = new javax.swing.GroupLayout(pnlInter4);
        pnlInter4.setLayout(pnlInter4Layout);
        pnlInter4Layout.setHorizontalGroup(
            pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInter4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodeEmp)
                        .addComponent(lblNameEmp))
                    .addComponent(lblIdEmp)
                    .addComponent(lblPosition)
                    .addComponent(lblUser)
                    .addComponent(lblPassword))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeIdentification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(pnlTable4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(pnlInter4Layout.createSequentialGroup()
                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnRegisEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnElimDeliv, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblTittleRandE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInter4Layout.setVerticalGroup(
            pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInter4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome4)
                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTittleRandE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodeEmp)
                            .addComponent(txtEmployeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInter4Layout.createSequentialGroup()
                                .addComponent(lblNameEmp)
                                .addGap(27, 27, 27)
                                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdEmp)
                                    .addComponent(txtEmployeeIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition)
                            .addComponent(cbxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUser))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(pnlTable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(pnlInter4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addComponent(btnRegisEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(pnlInter4Layout.createSequentialGroup()
                        .addComponent(btnElimDeliv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInter4, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInter4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome4ActionPerformed

    private void btnRegisEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisEmpActionPerformed

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
            java.util.logging.Logger.getLogger(IntRegEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntRegEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntRegEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntRegEli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntRegEli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimDeliv;
    private javax.swing.JButton btnHome4;
    private javax.swing.JButton btnRegisEmp;
    private javax.swing.JComboBox cbxPosition;
    private javax.swing.JScrollPane jspTable4;
    private javax.swing.JLabel lblCodeEmp;
    private javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblNameEmp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTittleRandE;
    private javax.swing.JLabel lblUser;
    private java.awt.Panel pnlInter4;
    private javax.swing.JPanel pnlTable4;
    private javax.swing.JTable tblEmp_Position;
    private javax.swing.JTextField txtEmployeeCode;
    private javax.swing.JTextField txtEmployeeIdentification;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
