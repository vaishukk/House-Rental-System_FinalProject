/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

/**
 *
 * @author sanik
 */

 
   

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BrokerEnterpriseUseraccounts extends javax.swing.JPanel {

    /**
     * Creates new form BrokerEnterpriseuseraccounts
     */
    private final Enterprise enterprise;
    private final EcoSystem ecosystem;
    Organisation organisation;
    public BrokerEnterpriseUseraccounts(Enterprise enterprise, EcoSystem system, Organisation organisation) {
        initComponents();
        this.enterprise = enterprise;
        this.ecosystem = system;
        this.organisation = organisation;
        populateorganizationbox();
        populateData();
    }
    
     public void populateorganizationbox() {
        organizationbox.removeAllItems();
        for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()) {
            organizationbox.addItem(org);
        }
    }

    public void populateData() {
        DefaultTableModel model = (DefaultTableModel) userdtltbl.getModel();

        model.setRowCount(0);

        for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userdtltbl.getModel()).addRow(row);
            }
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
        userdtltbl = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblorganization = new javax.swing.JLabel();
        lblemployee = new javax.swing.JLabel();
        lblrole = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        organizationbox = new javax.swing.JComboBox();
        employeebox = new javax.swing.JComboBox();
        rolebox = new javax.swing.JComboBox();
        getusername = new javax.swing.JTextField();
        getpassword = new javax.swing.JPasswordField();
        btnaddusers = new javax.swing.JButton();
        lblusers = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        lblbroker = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 255));

        userdtltbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userdtltbl.setForeground(new java.awt.Color(25, 56, 82));
        userdtltbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userdtltbl.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(userdtltbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 638, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 1080, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblorganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblorganization.setText("Organization");

        lblemployee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblemployee.setText("Employee");

        lblrole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblrole.setText("Role");

        lblusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblusername.setText("User Name");

        lblpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpassword.setText("Password");

        organizationbox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationbox.setForeground(new java.awt.Color(25, 56, 82));
        organizationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationboxActionPerformed(evt);
            }
        });

        employeebox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeebox.setForeground(new java.awt.Color(25, 56, 82));
        employeebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeboxActionPerformed(evt);
            }
        });

        rolebox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rolebox.setForeground(new java.awt.Color(25, 56, 82));
        rolebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleboxActionPerformed(evt);
            }
        });

        getusername.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        getusername.setForeground(new java.awt.Color(25, 56, 82));

        getpassword.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        getpassword.setForeground(new java.awt.Color(25, 56, 82));

        btnaddusers.setBackground(new java.awt.Color(255, 255, 255));
        btnaddusers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnaddusers.setText("ADD USERS");
        btnaddusers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddusers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddusersActionPerformed(evt);
            }
        });

        lblusers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblusers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusers.setText("CREATE USER ACCOUNTS");
        lblusers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrole)
                    .addComponent(lblusername)
                    .addComponent(lblpassword)
                    .addComponent(lblemployee)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblorganization)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblicon)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblusers, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rolebox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(employeebox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnaddusers, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblusers, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblorganization)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblicon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblemployee)
                    .addComponent(employeebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrole)
                    .addComponent(rolebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblusername)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword)
                    .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaddusers, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1090, 330));

        lblbroker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblbroker.setForeground(new java.awt.Color(255, 255, 255));
        lblbroker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbroker.setText("BROKER ENTERPRISE USERS ACCOUNT");
        jPanel1.add(lblbroker, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-100.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 90, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roleboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleboxActionPerformed

    private void employeeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeboxActionPerformed

    private void organizationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationboxActionPerformed
         Organisation org = (Organisation) organizationbox.getSelectedItem();
        if (org != null) {
            populateEmployeeComboBox(org);
            popRoleComboBox(org);
        }
    }//GEN-LAST:event_organizationboxActionPerformed

    public void populateEmployeeComboBox(Organisation organisation) {
        employeebox.removeAllItems();

        for (Employee employee : organisation.getEmployeeDirectory().getEmpList()) {
            employeebox.addItem(employee);
        }
    }

    private void popRoleComboBox(Organisation organisation) {
        rolebox.removeAllItems();
        for (Role role : organisation.getSupportedRole()) {
            rolebox.addItem(role);
        }
    }
    
    private void btnaddusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddusersActionPerformed
        String username = getusername.getText();
        String password = getpassword.getText();
        if ("".equals(username) || "".equals(password)|| organizationbox.getSelectedItem() == null
                || employeebox.getSelectedItem() == null || rolebox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please enter all required fields!");
            return;
        }
        if (!ecosystem.checkValidPasswordFormat(password)) {
            return;
        }
        if (!ecosystem.checkIfUserIsUnique(username)) {
            return;
        }
        Organisation org = (Organisation) organizationbox.getSelectedItem();
        Employee employee = (Employee) employeebox.getSelectedItem();
        Role role = (Role) rolebox.getSelectedItem();
        org.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        populateData();
        getusername.setText("");
        getpassword.setText("");
        JOptionPane.showMessageDialog(null, "User created successfully");
       
    }//GEN-LAST:event_btnaddusersActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddusers;
    private javax.swing.JButton btnlogout;
    private javax.swing.JComboBox employeebox;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JTextField getusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbroker;
    private javax.swing.JLabel lblemployee;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblorganization;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblrole;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusers;
    private javax.swing.JComboBox organizationbox;
    private javax.swing.JComboBox rolebox;
    private javax.swing.JTable userdtltbl;
    // End of variables declaration//GEN-END:variables
}