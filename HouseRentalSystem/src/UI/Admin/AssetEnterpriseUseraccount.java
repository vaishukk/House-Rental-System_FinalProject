/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class AssetEnterpriseUseraccount extends javax.swing.JPanel {

    /**
     * Creates new form AssetEnterpriseUseraccount
     */
    private final JPanel userProcessContainer;
    private final Enterprise enterprise;
    private final EcoSystem ecosystem;
    Organisation organisation;
    
    public AssetEnterpriseUseraccount(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system, Organisation organisation) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = system;
        this.organisation = organisation;
        populateOrganizationBox();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserDetails = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        lblassetenterprise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(44, 68, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel2.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 255));

        tblUserDetails.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblUserDetails.setForeground(new java.awt.Color(25, 56, 82));
        tblUserDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUserDetails.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblUserDetails);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 638, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("HOUSE RENTAL SYSTEM");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(669, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1160, 70));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

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

        organizationbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationbox.setForeground(new java.awt.Color(25, 56, 82));
        organizationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationboxActionPerformed(evt);
            }
        });

        employeebox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeebox.setForeground(new java.awt.Color(25, 56, 82));
        employeebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeboxActionPerformed(evt);
            }
        });

        rolebox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rolebox.setForeground(new java.awt.Color(25, 56, 82));
        rolebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleboxActionPerformed(evt);
            }
        });

        getusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getusername.setForeground(new java.awt.Color(25, 56, 82));

        getpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getpassword.setForeground(new java.awt.Color(25, 56, 82));

        btnaddusers.setBackground(new java.awt.Color(255, 255, 255));
        btnaddusers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64_1.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblrole)
                            .addComponent(lblusername)
                            .addComponent(lblpassword)
                            .addComponent(lblemployee)
                            .addComponent(lblorganization))
                        .addGap(154, 154, 154)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(employeebox, javax.swing.GroupLayout.Alignment.LEADING, 0, 260, Short.MAX_VALUE)
                                .addComponent(rolebox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblicon)
                        .addGap(29, 29, 29)
                        .addComponent(lblusers, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnaddusers, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(555, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon)
                    .addComponent(lblusers))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblorganization))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblemployee)
                    .addComponent(employeebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrole)
                    .addComponent(rolebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername)
                    .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword)
                    .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnaddusers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1150, 400));

        lblassetenterprise.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblassetenterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblassetenterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblassetenterprise.setText("ASSET ENTERPRISE USERS ACCOUNT");
        jPanel2.add(lblassetenterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-100.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 90, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationboxActionPerformed

        Organisation org = (Organisation) organizationbox.getSelectedItem();
        if (org != null) {
            populateEmployeeBox(org);
            populateRoleComboBox(org);
        }
    }//GEN-LAST:event_organizationboxActionPerformed

    private void employeeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeboxActionPerformed

    private void roleboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleboxActionPerformed

    private void btnaddusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddusersActionPerformed

        String username = getusername.getText();
        String password = getpassword.getText();
        if ("".equals(username) || "".equals(password) || organizationbox.getSelectedItem() == null
                || employeebox.getSelectedItem() == null || rolebox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please enter all required  fields!");
            return;
        }
        if (!ecosystem.verifyPassFormat(password)) {
            return;
        }
        if (!ecosystem.verifySameUser(username)) {
            return;
        }
        Organisation org = (Organisation) organizationbox.getSelectedItem();
        Employee employee = (Employee) employeebox.getSelectedItem();
        Role role = (Role) rolebox.getSelectedItem();
        org.getUserAccountDirectory().generateUserAcc(username, password, employee, role);
        populateTable();
        getusername.setText("");
        getpassword.setText("");
        JOptionPane.showMessageDialog(null, "User created successfully");
    }//GEN-LAST:event_btnaddusersActionPerformed

    public void populateOrganizationBox() {
        organizationbox.removeAllItems();
        for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()) {
            if (org.getType() != Organisation.Type.Customer) {
                organizationbox.addItem(org);
            }
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblUserDetails.getModel();

        model.setRowCount(0);

        for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()) {
            if (org.getType() != Organisation.Type.Customer) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = ua.getRole();
                    ((DefaultTableModel) tblUserDetails.getModel()).addRow(row);
                }
            }
        }
    }

    public void populateEmployeeBox(Organisation organisation) {
        employeebox.removeAllItems();

        for (Employee employee : organisation.getEmployeeDirectory().getEmpList()) {
            employeebox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organisation organisation) {
        rolebox.removeAllItems();
        for (Role role : organisation.getCorrespondingRole()) {
            rolebox.addItem(role);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddusers;
    private javax.swing.JComboBox employeebox;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JTextField getusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblassetenterprise;
    private javax.swing.JLabel lblemployee;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblorganization;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblrole;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusers;
    private javax.swing.JComboBox organizationbox;
    private javax.swing.JComboBox rolebox;
    private javax.swing.JTable tblUserDetails;
    // End of variables declaration//GEN-END:variables
}
