/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.BrokerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RegistrationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class BrokerEnterpriseWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form BrokerEnterpriseWorkRequest
     */
    private final Enterprise enterprise;
    private final OrganisationDirectory organisationDirectory;
    public BrokerEnterpriseWorkRequest(Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.organisationDirectory = enterprise.getOrganisationDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblworkrequest.getModel();

        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWrkReqList()) {
            if (workRequest instanceof RegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((RegistrationRequest) workRequest).getStatus();
                row[2] = ((RegistrationRequest) workRequest).getUserName();
                row[3] = ((RegistrationRequest) workRequest).getName();
                row[4] = ((RegistrationRequest) workRequest).getUserEmailId();
                row[5] = ((RegistrationRequest) workRequest).getUserCity();
                row[6] = ((RegistrationRequest) workRequest).getOrgType();
                row[7] = ((RegistrationRequest) workRequest).getNetwork();
                model.addRow(row);
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
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblbroker = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblworkrequest = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnallow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

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
                .addContainerGap(753, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblbroker.setBackground(new java.awt.Color(0, 0, 0));
        lblbroker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblbroker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbroker.setText("BROKER ENTERPRISE DETAILS");
        lblbroker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblworkrequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblworkrequest.setForeground(new java.awt.Color(25, 56, 82));
        tblworkrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Demands ", "Availibility", "Username", "Name", "Mailid", "Address", "Organization Type", "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblworkrequest.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblworkrequest);

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cross-mark-48.png"))); // NOI18N
        btnReject.setText("DECLINE");
        btnReject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnallow.setBackground(new java.awt.Color(255, 255, 255));
        btnallow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnallow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-verification-tick-mark-for-digital-certification-document-24.png"))); // NOI18N
        btnallow.setText("ALLOW");
        btnallow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnallow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnallow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallowActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnallow)
                                .addGap(113, 113, 113)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblbroker, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblbroker)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnallow)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1240, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnallowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallowActionPerformed

        int selectedRow = tblworkrequest.getSelectedRow();

        if (selectedRow >= 0) {
            RegistrationRequest request = (RegistrationRequest) tblworkrequest.getValueAt(selectedRow, 0);

            if (request.getOrgType() == Organisation.Type.Broker) {
                Organisation org = organisationDirectory.createOrganisation(request.getOrgType(), request.getName());
                Employee emp = org.getEmployeeDirectory().generateEmp(request.getName());
                UserAccount ua1 = org.getUserAccountDirectory().generateUserAcc(request.getUserName(), request.getUserPassword(), emp, new BrokerRole());
            }

            request.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "User account has been activated successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
        
    }//GEN-LAST:event_btnallowActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        int selectedRow = tblworkrequest.getSelectedRow();

        if (selectedRow >= 0) {
            RegistrationRequest request = (RegistrationRequest) tblworkrequest.getValueAt(selectedRow, 0);
            request.setStatus("Rejected");
            JOptionPane.showMessageDialog(null, "User request has been removed successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
       
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnallow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbroker;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblworkrequest;
    // End of variables declaration//GEN-END:variables
}
