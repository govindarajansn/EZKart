/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface_meatAdmin;

import user_interface_foodAdmin.*;
import java.awt.Color;

/**
 *
 * @author snehagovindarajan
 */
public class manageMeatItems extends javax.swing.JPanel {

    /**
     * Creates new form foodAdminMainPanel
     */
    public manageMeatItems() {
        initComponents();
        foodAdminTemp.setBackground(new Color(0,0,0,90));
        //jLabel2.setVisible(true);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        foodAdminTemp = new javax.swing.JPanel();
        foodShopName = new javax.swing.JLabel();
        foodShopName1 = new javax.swing.JLabel();
        foodShopName2 = new javax.swing.JLabel();
        foodShopName3 = new javax.swing.JLabel();
        foodShopName4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        uploadFoodPic = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        foodShopName5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        foodShopName.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName.setText("Upload Image");

        foodShopName1.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName1.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName1.setText("Type");

        foodShopName2.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName2.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName2.setText("Quantity");

        foodShopName3.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName3.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName3.setText("Item");

        foodShopName4.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName4.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName4.setText("Price");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        uploadFoodPic.setText("UPLOAD");

        jLabel2.setText("Shop Name");

        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Item");

        jButton3.setText("Delete Item");

        jButton4.setText("Clear");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Items", "Price", "Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        foodShopName5.setBackground(new java.awt.Color(255, 255, 255));
        foodShopName5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        foodShopName5.setForeground(new java.awt.Color(255, 255, 255));
        foodShopName5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foodShopName5.setText("Best Before");

        javax.swing.GroupLayout foodAdminTempLayout = new javax.swing.GroupLayout(foodAdminTemp);
        foodAdminTemp.setLayout(foodAdminTempLayout);
        foodAdminTempLayout.setHorizontalGroup(
            foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodAdminTempLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(foodAdminTempLayout.createSequentialGroup()
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodAdminTempLayout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodAdminTempLayout.createSequentialGroup()
                        .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodAdminTempLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(foodShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodShopName4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodShopName3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodShopName1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodShopName2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodShopName5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
                            .addGroup(foodAdminTempLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(foodAdminTempLayout.createSequentialGroup()
                                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton3)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(uploadFoodPic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(111, 111, 111)
                                .addComponent(jButton4))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        foodAdminTempLayout.setVerticalGroup(
            foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodAdminTempLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodShopName3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodShopName4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(foodAdminTempLayout.createSequentialGroup()
                        .addComponent(foodShopName5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(foodAdminTempLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodShopName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodShopName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadFoodPic))
                .addGap(30, 30, 30)
                .addGroup(foodAdminTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        add(foodAdminTemp);
        foodAdminTemp.setBounds(0, 0, 1200, 720);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MeatAdmin.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel foodAdminTemp;
    private javax.swing.JLabel foodShopName;
    private javax.swing.JLabel foodShopName1;
    private javax.swing.JLabel foodShopName2;
    private javax.swing.JLabel foodShopName3;
    private javax.swing.JLabel foodShopName4;
    private javax.swing.JLabel foodShopName5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton uploadFoodPic;
    // End of variables declaration//GEN-END:variables
}
