/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface.customer;

import cart.Cart;
import cart.CartDirectory;
import db4util.Db4util;
import ecosystem.Ecosystem;
import items.Item;
import items.ItemDirectory;
import items.MeatItem;
import items.MeatItemDirectory;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishu
 */
public class MeatItemsPanel extends javax.swing.JPanel {
    
    Ecosystem system;
    MeatItemDirectory Id;
    DefaultTableModel tblModel;
    CartDirectory crd;
    CartDirectory dcrd;
    private Db4util dB4OUtil = Db4util.getInstance();
    int count = 0;

    /**
     * Creates new form MeatItemsPanel
     */
    public MeatItemsPanel(Ecosystem system, int index, CartDirectory crd) {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,20));
        
         this.system = system;
        this.crd = crd;
        Id = system.getMeatItemDirectory();
        dcrd = system.getCartDirectory();
        
        lblShopName.setText(ShopListPanel.tblShopDetails.getValueAt(index, 1).toString());
       
        tblModel = (DefaultTableModel)tblMeatItems.getModel();
        
                    
            for(MeatItem I1: Id.getMeatItemList())
            {
                if(I1.getShop_id().equals(ShopListPanel.tblShopDetails.getValueAt(index, 0).toString()))
                {
                    
                  
             Object data_value [] = {Id.getMeatItemList().get(count).getItemid(),

                 Id.getMeatItemList().get(count).getItemName(),
                 Id.getMeatItemList().get(count).getType(),
                 Id.getMeatItemList().get(count).getBestBefore(),
                 Id.getMeatItemList().get(count).getPrice()
                 
            };
           tblModel.addRow(data_value);
                    
                    
                }
                count++;
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMeatItems = new javax.swing.JTable();
        lblShopName = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblMeatItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item", "Type", "Best Before", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblMeatItems);

        lblShopName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblShopName.setForeground(new java.awt.Color(255, 255, 255));
        lblShopName.setText("<value>");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quantity");

        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(lblShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(196, 196, 196)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(lblShopName)
                    .addGap(67, 67, 67)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String item_id;
        String item_name;
        String item_type;
        float weight;
        String best_before;
        float price;
        int qty;
        
        if(jComboBox1.getSelectedItem().toString().equals("Select"))
        {
                      JOptionPane.showMessageDialog(new JFrame(),
                "Please select Qty",
                "Error",
        JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
        
        int index = tblMeatItems.getSelectedRow();
        item_id = tblMeatItems.getValueAt( index, 0).toString();
        item_name = tblMeatItems.getValueAt(index, 1).toString();
        item_type = tblMeatItems.getValueAt(index, 2).toString();
        best_before = tblMeatItems.getValueAt(index, 3).toString();
        price = Float.parseFloat(tblMeatItems.getValueAt(index, 4).toString());
        qty = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        
        Cart c = crd.createCart(item_id, item_name, qty, price, "Meat");
        Cart temp_c = dcrd.createCart(item_id, item_name, qty, price, "Meat");
        crd.setCartList(c);
        dcrd.setCartList(temp_c);
        
        JOptionPane.showMessageDialog(new JFrame(), "Added to Cart");

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblShopName;
    private javax.swing.JTable tblMeatItems;
    // End of variables declaration//GEN-END:variables
}
