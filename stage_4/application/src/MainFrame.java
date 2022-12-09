package stage_4.application.src;

import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Teddy
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientBtn = new javax.swing.JButton();
        productBtn = new javax.swing.JButton();
        employeeBtn = new javax.swing.JButton();
        managerBtn = new javax.swing.JButton();
        promotionBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tea Shop");
        setPreferredSize(new Dimension(900, 680));
        setResizable(false);
        setSize(new Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientBtn.setText("Clients");
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 120, 50));

        productBtn.setText("Products");
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });
        getContentPane().add(productBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 120, 50));

        employeeBtn.setText("Employees");
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(employeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 120, 50));

        managerBtn.setText("Managers");
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(managerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 120, 50));

        promotionBtn.setText("Promotions");
        promotionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promotionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(promotionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 120, 50));

        exitBtn.setText("Sales");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teacup.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, 220));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Tea Shop");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 190, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        SalesFrame salesFrame = new SalesFrame();
        salesFrame.setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        // TODO add your handling code here:
        ClientFrame clientFrame = new ClientFrame();
        clientFrame.setVisible(true);
    }//GEN-LAST:event_clientBtnActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        // TODO add your handling code here:
        EmployeeFrame Emp = new EmployeeFrame();
        Emp.setVisible(true);
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
        // TODO add your handling code here:
        ManagerFrame man = new ManagerFrame();
        man.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_managerBtnActionPerformed

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        // TODO add your handling code here:
        ProductFrame productFrame = new ProductFrame();
        productFrame.setVisible(true);
    }//GEN-LAST:event_productBtnActionPerformed

    private void promotionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promotionBtnActionPerformed
        // TODO add your handling code here:
        PromotionFrame promotionFrame = new PromotionFrame();
        promotionFrame.setVisible(true);
    }//GEN-LAST:event_promotionBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientBtn;
    private javax.swing.JButton employeeBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton managerBtn;
    private javax.swing.JButton productBtn;
    private javax.swing.JButton promotionBtn;
    // End of variables declaration//GEN-END:variables
}