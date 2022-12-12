/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface_pharmacyAdmin;

import customer.Customer;
import db4util.Db4util;
import ecosystem.Ecosystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import organisation.PharmaVendorOnboarding;
import organisation.PharmaVendorDirectory;
import user_interface.MainJFrame;
import user_interface_groceries.groceriesAdminPanel;

/**
 *
 * @author snehagovindarajan
 */
public class pharmacyAdminMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form foodAdminMainPanel
     */
    
    PharmaVendorDirectory pvd;
    Ecosystem system;
    MainJFrame mainframe;
    public static int index = 99;
    DefaultTableModel tblmodel;

    private Db4util dB4OUtil = Db4util.getInstance();
    
    public pharmacyAdminMainPanel(Ecosystem system, MainJFrame mainframe) {
        initComponents();
        pvd = system.getPharmaDirectory();
        this.system = system;
        this.mainframe = mainframe;
        ItemsContainer.setBackground(new Color(0, 0, 0, 90));
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ItemsContainer = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPharmaShop = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtShopName = new javax.swing.JTextField();
        txtShopLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        temp = new javax.swing.JPanel();
        pharmAdminImage = new javax.swing.JLabel();

        setLayout(null);

        tblPharmaShop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop Id", "Shop Name", "Location"
            }
        ));
        tblPharmaShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPharmaShopMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPharmaShop);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Shop Name");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Location");

        txtShopName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShopNameActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Shop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Shop");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Shop");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItemsContainerLayout = new javax.swing.GroupLayout(ItemsContainer);
        ItemsContainer.setLayout(ItemsContainerLayout);
        ItemsContainerLayout.setHorizontalGroup(
            ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsContainerLayout.createSequentialGroup()
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemsContainerLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShopLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ItemsContainerLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItemsContainerLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        ItemsContainerLayout.setVerticalGroup(
            ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsContainerLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShopLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        add(ItemsContainer);
        ItemsContainer.setBounds(0, 0, 1200, 720);

        temp.setLayout(new java.awt.CardLayout());
        add(temp);
        temp.setBounds(0, 0, 0, 0);

        pharmAdminImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pharamaadmin_1200x720.png"))); // NOI18N
        add(pharmAdminImage);
        pharmAdminImage.setBounds(0, 0, 1200, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void txtShopNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShopNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShopNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        pvd = system.getPharmaDirectory();

        PharmaVendorOnboarding pv = pvd.createShopData(txtShopName.getText(), txtShopLocation.getText());
        pvd.setPharmaVendorList(pv);
        Object data_value[] = {pv.getShop_id(),
            txtShopName.getText(), txtShopLocation.getText()

        };
        tblmodel.addRow(data_value);
        clearFields();
        JOptionPane.showMessageDialog(new JFrame(), "Shop Saved Succesfully");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (index == 99) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Please make a selection",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            String shopname_edit = txtShopName.getText();
            String shop_loc_edit = txtShopLocation.getText();

            pvd.getPharmaVendorList().get(index).setShop_name(shopname_edit);
            pvd.getPharmaVendorList().get(index).setLocation(shop_loc_edit);
            
            populateTable();
            clearFields();
            JOptionPane.showMessageDialog(new JFrame(), "Shop Updated Succesfully");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblPharmaShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPharmaShopMouseClicked
        // TODO add your handling code here:
        this.index = tblPharmaShop.getSelectedRow();
        pharmAdminPanel.index_1 = this.index;
        TableModel model = tblPharmaShop.getModel();
//        String shop_name = model.getValueAt(index, 1).toString();
//        String shop_location = model.getValueAt(index, 2).toString();

        txtShopName.setText(model.getValueAt(index, 1).toString());
        txtShopLocation.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tblPharmaShopMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int index = tblPharmaShop.getSelectedRow();
        pvd.getPharmaVendorList().remove(index);
        populateTable();
        clearFields();
        JOptionPane.showMessageDialog(this, "Vendor Deleted Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateTable() {

        tblmodel = (DefaultTableModel) tblPharmaShop.getModel();
        tblmodel.setRowCount(0);

        for (int i = 0; i < pvd.getPharmaVendorList().size(); i++) {
            Object data_value[] = {pvd.getPharmaVendorList().get(i).getShop_id(),
                pvd.getPharmaVendorList().get(i).getShop_name(),
                pvd.getPharmaVendorList().get(i).getLocation()

            };
            tblmodel.addRow(data_value);
        }

    }
    private void clearFields() {
        
        txtShopName.setText("");
        txtShopLocation.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ItemsContainer;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pharmAdminImage;
    public static javax.swing.JTable tblPharmaShop;
    private javax.swing.JPanel temp;
    private javax.swing.JTextField txtShopLocation;
    private javax.swing.JTextField txtShopName;
    // End of variables declaration//GEN-END:variables
}
