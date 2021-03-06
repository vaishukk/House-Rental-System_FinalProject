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
import Business.Organisation.OrganisationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class AssetEnterpriseManageEmployees extends javax.swing.JPanel {

    /**
     * Creates new form AssetEnterpriseManageEmployees
     */
    private final JPanel userPrcCont;
    private final OrganisationDirectory organisationDirectory;
    private Enterprise enterprise;
    private EcoSystem system;
    
    public AssetEnterpriseManageEmployees(JPanel userPrcCont, OrganisationDirectory organisationDirectory) {
        initComponents();
        this.userPrcCont = userPrcCont;
        this.organisationDirectory = organisationDirectory;
        populateTable();
        populateorganizationbox();
        populateTable();
    }
    public void populateorganizationbox() {
        organizationbox.removeAllItems();

        for (Organisation organisation : organisationDirectory.getOrganisationList()) {
            if (organisation.getType() != Organisation.Type.Customer) {
                organizationbox.addItem(organisation);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblorganization.getModel();

        model.setRowCount(0);

        for (Organisation organisation : organisationDirectory.getOrganisationList()) {
            if (organisation.getType() != Organisation.Type.Customer) {
                for (Employee emp : organisation.getEmployeeDirectory().getEmpList()) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = emp.getId();
                    row[1] = emp.getName();
                    model.addRow(row);
                }
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

        jPanel2 = new javax.swing.JPanel();
        lblasset = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorganization = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblemployee = new javax.swing.JLabel();
        lblorganization = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        organizationbox = new javax.swing.JComboBox();
        getname = new javax.swing.JTextField();
        btnaddemploye = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(44, 68, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel2.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblasset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblasset.setForeground(new java.awt.Color(255, 255, 255));
        lblasset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblasset.setText("ASSET ENTERPRISE EMPLOYEES");
        jPanel2.add(lblasset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 270, -1));

        tblorganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblorganization.setForeground(new java.awt.Color(25, 56, 82));
        tblorganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorganization.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblorganization);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 560, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblemployee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblemployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblemployee.setText("CREATE AN EMPLOYEE");
        lblemployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblorganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblorganization.setText("Organization");

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setText("Name");

        organizationbox.setEditable(true);
        organizationbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationboxActionPerformed(evt);
            }
        });

        getname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getname.setForeground(new java.awt.Color(25, 56, 82));
        getname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getnameKeyPressed(evt);
            }
        });

        btnaddemploye.setBackground(new java.awt.Color(255, 255, 255));
        btnaddemploye.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddemploye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64_1.png"))); // NOI18N
        btnaddemploye.setText("ADD EMPLOYEE");
        btnaddemploye.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddemploye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddemploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddemployeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblorganization)
                            .addComponent(lblname))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaddemploye, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblemployee)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnaddemploye)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 980, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationboxActionPerformed

    private void getnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameKeyPressed

    private void btnaddemployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddemployeActionPerformed
if (!getname.getText().equals("")) {
            Organisation organisation = (Organisation) organizationbox.getSelectedItem();
            String name = getname.getText();
            organisation.getEmployeeDirectory().generateEmp(name);
            JOptionPane.showMessageDialog(null, "Hurray!! Employee Added");
            populateTable();
            getname.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnaddemployeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemploye;
    private javax.swing.JTextField getname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblasset;
    private javax.swing.JLabel lblemployee;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblorganization;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JComboBox organizationbox;
    private javax.swing.JTable tblorganization;
    // End of variables declaration//GEN-END:variables
}
