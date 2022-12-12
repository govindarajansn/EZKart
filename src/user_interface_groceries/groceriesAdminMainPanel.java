/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface_groceries;

import db4util.Db4util;
import ecosystem.Ecosystem;
import user_interface_foodAdmin.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import organisation.GroceryVendorDirectory;
import organisation.GroceryVendorOnboarding;
import user_interface.MainJFrame;

/**
 *
 * @author snehagovindarajan
 */
public class groceriesAdminMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form foodAdminMainPanel
     */
    
    GroceryVendorDirectory gvd;
    Ecosystem system;
    MainJFrame mainframe;
    public static int index = 99;
    DefaultTableModel tblmodel;

    private Db4util dB4OUtil = Db4util.getInstance();
    
    public groceriesAdminMainPanel(Ecosystem system, MainJFrame mainframe) {
        initComponents();
        gvd = system.getGroceryDirectory();
        this.system = system;
        this.mainframe = mainframe;
        ItemsContainer.setBackground(new Color(0,0,0,90));
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
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtShopName = new javax.swing.JTextField();
        txtShopLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        temp = new javax.swing.JPanel();
        groceryAdminImage = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop Id", "Shop Name", "Location"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

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

        jButton2.setText("Update Shop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Add Shop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItemsContainerLayout = new javax.swing.GroupLayout(ItemsContainer);
        ItemsContainer.setLayout(ItemsContainerLayout);
        ItemsContainerLayout.setHorizontalGroup(
            ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsContainerLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemsContainerLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShopLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ItemsContainerLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        ItemsContainerLayout.setVerticalGroup(
            ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsContainerLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShopLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(ItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        add(ItemsContainer);
        ItemsContainer.setBounds(0, 0, 1200, 720);

        temp.setLayout(new java.awt.CardLayout());
        add(temp);
        temp.setBounds(0, 0, 0, 0);

        groceryAdminImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grocerieAdmin.jpeg"))); // NOI18N
        add(groceryAdminImage);
        groceryAdminImage.setBounds(0, 0, 1200, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void txtShopNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShopNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShopNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        gvd = system.getGroceryDirectory();

        GroceryVendorOnboarding gv = gvd.createShopData(txtShopName.getText(), txtShopLocation.getText());
        gvd.setGroceryVendorList(gv);
        Object data_value[] = {gv.getShop_id(),
            txtShopName.getText(), txtShopLocation.getText()

        };
        tblmodel.addRow(data_value);
        clearFields();

        JOptionPane.showMessageDialog(new JFrame(), "Shop Saved Succesfully");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        this.index = jTable1.getSelectedRow();
        groceriesAdminPanel.index_1 = this.index;
        TableModel model = jTable1.getModel();
//        String shop_name = model.getValueAt(index, 1).toString();
//        String shop_location = model.getValueAt(index, 2).toString();
        
        txtShopName.setText(model.getValueAt(index, 1).toString());
        txtShopLocation.setText(model.getValueAt(index, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (index == 99) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Please make a selection",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            String shopname_edit = txtShopName.getText();
            String shop_loc_edit = txtShopLocation.getText();

            gvd.getGroceryVendorList().get(index).setShop_name(shopname_edit);
            gvd.getGroceryVendorList().get(index).setLocation(shop_loc_edit);
            
            populateTable();
            clearFields();
            JOptionPane.showMessageDialog(new JFrame(), "Shop Updated Succesfully");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        gvd.getGroceryVendorList().remove(index);
        populateTable();
        clearFields();
        JOptionPane.showMessageDialog(this, "Vendor Deleted Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateTable() {

        tblmodel = (DefaultTableModel) jTable1.getModel();
        tblmodel.setRowCount(0);

        for (int i = 0; i < gvd.getGroceryVendorList().size(); i++) {
            Object data_value[] = {gvd.getGroceryVendorList().get(i).getShop_id(),
                gvd.getGroceryVendorList().get(i).getShop_name(),
                gvd.getGroceryVendorList().get(i).getLocation()

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
    private javax.swing.JLabel groceryAdminImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JPanel temp;
    private javax.swing.JTextField txtShopLocation;
    private javax.swing.JTextField txtShopName;
    // End of variables declaration//GEN-END:variables
}
