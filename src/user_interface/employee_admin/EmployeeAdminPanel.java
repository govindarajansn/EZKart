/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface.employee_admin;

import db4util.Db4util;
import ecosystem.Ecosystem;
import java.awt.Color;
import javax.swing.JFrame;
import user_interface.MainJFrame;
import employee.Employee;
import employee.EmployeeAccountDirectory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nishu
 */
public class EmployeeAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeAdminPanel
     */
    
    Ecosystem system;
    MainJFrame mainframe;
    EmployeeAccountDirectory emp_dir_ob; 
    Employee emp_ob;
    int employeeIndex;
    private Db4util dB4OUtil = Db4util.getInstance();
    DefaultTableModel tblmodel;
    
    
    public EmployeeAdminPanel(Ecosystem system, MainJFrame mainframe) {
        initComponents();
        this.system = system;
        this.mainframe = mainframe;
        System.out.println("EmployeeAdmin");
        emp_dir_ob = system.getEmpDirectory();

        tblmodel = (DefaultTableModel)tblEmployeeAdmin.getModel();
        
         for(int i=0; i< emp_dir_ob.getEmpAccountList().size(); i++)
        {
             Object data_value [] = {emp_dir_ob.getEmpAccountList().get(i).getEmployee_name(),
                 
                 emp_dir_ob.getEmpAccountList().get(i).getDepartment(),
                 emp_dir_ob.getEmpAccountList().get(i).getRole(),
                 emp_dir_ob.getEmpAccountList().get(i).getEmail_id(),
                 emp_dir_ob.getEmpAccountList().get(i).getPhone_no(),
                 emp_dir_ob.getEmpAccountList().get(i).getAddress(), 
                 emp_dir_ob.getEmpAccountList().get(i).getEmp_id()
            };
           tblmodel.addRow(data_value);
        }


      
                
        jPanel1.setBackground(new Color(0,0,0,15));
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboDepartment = new javax.swing.JComboBox<>();
        comboRole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployeeAdmin = new javax.swing.JTable();
        btnAddEmployee = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        txtAddress.setColumns(10);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Role");

        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A","Food", "Groceries", "Meat", "Pharma" }));

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","Food Admin", "Meat Admin", "Pharma Admin", "Groceries Admin", "Delivery Admin", "Delivery Agent", "Support Admin", "Support Agent", "Data analyst"}));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Password");

        tblEmployeeAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Department", "Role", "Email", "Phone", "Address", "Employee Id"
            }
        ));
        tblEmployeeAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeAdminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmployeeAdmin);

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnUpdateEmployee.setText("Update");
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });

        btnDeleteEmployee.setText("Delete");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        btnClearFields.setText("Clear");
        btnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldsActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Maku", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Welcome Admin ..!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(520, 520, 520)
                                    .addComponent(btnUpdateEmployee)
                                    .addGap(32, 32, 32)
                                    .addComponent(btnDeleteEmployee))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(185, 185, 185)
                                    .addComponent(jLabel6)
                                    .addGap(50, 50, 50)
                                    .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(52, 52, 52)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(btnAddEmployee)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnClearFields)
                                    .addGap(52, 52, 52)
                                    .addComponent(jButton1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel8)
                                        .addGap(66, 66, 66)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateEmployee)
                    .addComponent(btnDeleteEmployee))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClearFields)
                            .addComponent(btnAddEmployee)
                            .addComponent(jButton1))
                        .addGap(47, 47, 47))))
        );

        add(jPanel1);
        jPanel1.setBounds(80, 40, 1040, 630);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-square-shape-bg.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
     mainframe.logoutAction();
     mainframe.displayPane();
//     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
          public boolean isValid(String s){
        Pattern p = Pattern.compile("^\\d{10}$");
 
        Matcher m = p.matcher(s);
 
        // Returning boolean value
        return (m.matches());
    }
    
    public boolean isValidEmail(String s){
        String regex = "^(.+)@(\\S+)$";
       return s.matches(regex);
    }
    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        // TODO add your handling code here:
       if(txtName.getText().trim().equals("")){
             String error = "Please enter valid Name";
              JOptionPane.showMessageDialog(new JFrame(), error, "Error",
        JOptionPane.ERROR_MESSAGE);
        }else if(!isValidEmail(txtEmail.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid E-mail ");   //Validation for employee Phone Number
        }else if(!isValid(txtPhone.getText().trim())){
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid Phone Number ");   //Validation for employee Phone Number
        }else if(txtAddress.getText().trim().equals("")){
             JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid Address ");
        }else if(comboDepartment.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid department ");
        }else if(comboRole.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid Role ");
        }else if(txtPassword.getText().trim().equals("")){
             JOptionPane.showMessageDialog(new JFrame(), "Please Enter valid Password ");
        }else{
        if(emp_dir_ob.checkIfUsernameIsUnique(txtEmail.getText()))
        {
        emp_ob = emp_dir_ob.createEmpAccount(txtName.getText(), txtPassword.getText(), txtEmail.getText(), txtPhone.getText(), comboDepartment.getSelectedItem().toString(), txtAddress.getText().toString() ,
                comboRole.getSelectedItem().toString());
        emp_dir_ob.SetEmpAccountList(emp_ob);
        
                      Object data_value [] = {txtName.getText(),
                         comboDepartment.getSelectedItem().toString(),
                         comboRole.getSelectedItem().toString(),
                         txtEmail.getText(),
                         txtPhone.getText(),
                         txtAddress.getText(),
                        
            };
           tblmodel.addRow(data_value);
         
        JOptionPane.showMessageDialog(new JFrame(), "Employee Saved succesfully");
        }
        }
        
        
        
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        comboRole.setSelectedIndex(0);
        comboDepartment.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    private void tblEmployeeAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeAdminMouseClicked
        // TODO add your handling code here:
           employeeIndex = tblEmployeeAdmin.getSelectedRow();
        // ArrayList<Patient> patientList = patient.getPatientList();
        DefaultTableModel tempEmployee = (DefaultTableModel)tblEmployeeAdmin.getModel();
        String name = tempEmployee.getValueAt(employeeIndex,0).toString();
        String department = tempEmployee.getValueAt(employeeIndex,1).toString();
        String role = tempEmployee.getValueAt(employeeIndex,2).toString();
        String email = tempEmployee.getValueAt(employeeIndex,3).toString();
        String phone = tempEmployee.getValueAt(employeeIndex,4).toString();
        String address = tempEmployee.getValueAt(employeeIndex,5).toString();
   

        txtName.setText(name);
        comboDepartment.setSelectedItem(department);
        txtEmail.setText(email);
        comboRole.setSelectedItem(role);
        txtPhone.setText(phone);
        txtAddress.setText(address);
        txtPassword.setText(emp_dir_ob.getEmpAccountList().get(employeeIndex).getPassword());
    }//GEN-LAST:event_tblEmployeeAdminMouseClicked

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        // TODO add your handling code here:
        employeeIndex = tblEmployeeAdmin.getSelectedRow();
        String name = txtName.getText();
        String department = comboDepartment.getSelectedItem().toString();
        String role = comboRole.getSelectedItem().toString();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();
        String pwd = txtPassword.getText();

        emp_dir_ob.getEmpAccountList().get(employeeIndex).setEmployee_name(name);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setDepartment(department);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setEmail_id(email);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setRole(role);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setPassword(pwd);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setAddress(address);
        emp_dir_ob.getEmpAccountList().get(employeeIndex).setPhone_no(phone);
        
         DefaultTableModel tblmodel = (DefaultTableModel)tblEmployeeAdmin.getModel();
         tblmodel.setRowCount(0);
         for(int i=0; i< emp_dir_ob.getEmpAccountList().size(); i++)
        {
             Object data_value [] = {emp_dir_ob.getEmpAccountList().get(i).getEmployee_name(),
                 
                 emp_dir_ob.getEmpAccountList().get(i).getDepartment(),
                 emp_dir_ob.getEmpAccountList().get(i).getRole(),
                 emp_dir_ob.getEmpAccountList().get(i).getEmail_id(),
                 emp_dir_ob.getEmpAccountList().get(i).getPhone_no(),
                 emp_dir_ob.getEmpAccountList().get(i).getAddress()                 
            };
           tblmodel.addRow(data_value);
        }
         

       // renderPatient(patientList);
        JOptionPane.showMessageDialog(new JFrame(), "Admins Updated successfully ..!!");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        comboRole.setSelectedIndex(0);
        comboDepartment.setSelectedIndex(0);
        txtAddress.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        employeeIndex = tblEmployeeAdmin.getSelectedRow();
        //ArrayList<Patient> patientList = patient.getPatientList();
        emp_dir_ob.getEmpAccountList().remove(employeeIndex);
        //renderPatient(patientList);
           DefaultTableModel tblmodel = (DefaultTableModel)tblEmployeeAdmin.getModel();
         tblmodel.setRowCount(0);
         for(int i=0; i< emp_dir_ob.getEmpAccountList().size(); i++)
        {
             Object data_value [] = {emp_dir_ob.getEmpAccountList().get(i).getEmployee_name(),
                 
                 emp_dir_ob.getEmpAccountList().get(i).getDepartment(),
                 emp_dir_ob.getEmpAccountList().get(i).getRole(),
                 emp_dir_ob.getEmpAccountList().get(i).getEmail_id(),
                 emp_dir_ob.getEmpAccountList().get(i).getPhone_no(),
                 emp_dir_ob.getEmpAccountList().get(i).getAddress()                 
            };
           tblmodel.addRow(data_value);
        }
         
        JOptionPane.showMessageDialog(new JFrame(), "Employee Deleted successfully ..!!");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        comboRole.setSelectedIndex(0);
        comboDepartment.setSelectedIndex(0);
        txtAddress.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmployeeAdmin;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
