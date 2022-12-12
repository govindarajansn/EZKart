/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user_interface_sysadmin;


import ecosystem.Ecosystem;
import javax.swing.JFrame;
import db4util.Db4util;
import user_interface.MainJFrame;
import user_interface_foodAdmin.foodAdminMainPanel;
import user_interface.MainJFrame;

/**
 *
 * @author snehagovindarajan
 */
public class sysadminPanel extends javax.swing.JFrame {

    /**
     * Creates new form sysadminPanel
     */

    Ecosystem system;
    MainJFrame mainframe;
    communityPanel communityTab ;
    enterprisePanel enterprise ;
    manageEmployeeAdmin employeeAdmin;
    manageAdminPanel manageAdmin ;
    private Db4util dB4OUtil = Db4util.getInstance();

        public sysadminPanel(Ecosystem system, MainJFrame mainframe) {
        initComponents();
        this.system = system;
        this.mainframe = mainframe;
        communityTab = new communityPanel(system);
        manageAdmin = new manageAdminPanel();
        employeeAdmin = new manageEmployeeAdmin(system);
        manageAdmin = new manageAdminPanel();
        enterprise = new enterprisePanel();
        adminSplitPane.setRightComponent(communityTab);
    }

    
    private void manageCommunity(){
        //user_interface_sysadmin.communityPanel community = new user_interface_sysadmin.communityPanel(system);
        adminSplitPane.setRightComponent(communityTab);
    }
    
    private void manageEnterprise(){
        //user_interface_sysadmin.communityPanel community = new user_interface_sysadmin.communityPanel(system);
        enterprise = new enterprisePanel(system);
        adminSplitPane.setRightComponent(enterprise);

    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminSplitPane = new javax.swing.JSplitPane();
        SysMenu = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addEmployeeAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 720));

        SysMenu.setBackground(new java.awt.Color(153, 153, 153));

        adminBtn.setText("Manage Admin");
        adminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminBtnMouseClicked(evt);
            }
        });
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/systemadminlogo.png"))); // NOI18N

        addEmployeeAdmin.setText("Add Employee Admin");
        addEmployeeAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeAdminMouseClicked(evt);
            }
        });
        addEmployeeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeAdminActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SysMenuLayout = new javax.swing.GroupLayout(SysMenu);
        SysMenu.setLayout(SysMenuLayout);
        SysMenuLayout.setHorizontalGroup(
            SysMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(SysMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(SysMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addEmployeeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SysMenuLayout.setVerticalGroup(
            SysMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysMenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(addEmployeeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        adminSplitPane.setLeftComponent(SysMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseClicked
        // TODO add your handling code here:manageAdmin
        
        sysAdminDashboard admin = new sysAdminDashboard(system,mainframe);
        adminSplitPane.setVisible(false);
        admin.setVisible(true);
        
        //adminSplitPane.setRightComponent.
    }//GEN-LAST:event_adminBtnMouseClicked

    private void addEmployeeAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeAdminMouseClicked
        // TODO add your handling code here:
         adminSplitPane.setRightComponent(employeeAdmin);
    }//GEN-LAST:event_addEmployeeAdminMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     mainframe.logoutAction();
     mainframe.displayPane();
     this.dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addEmployeeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeAdminActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBtnActionPerformed

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
            java.util.logging.Logger.getLogger(sysadminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sysadminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sysadminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sysadminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new sysadminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SysMenu;
    private javax.swing.JButton addEmployeeAdmin;
    private javax.swing.JButton adminBtn;
    private javax.swing.JSplitPane adminSplitPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
