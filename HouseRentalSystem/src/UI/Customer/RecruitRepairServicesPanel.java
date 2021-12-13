/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.Asset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Role.RepairRole;
import Business.SMS.Sms;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairServiceRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class RecruitRepairServicesPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecruitRepairServices
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Asset asset;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;
    
    public RecruitRepairServicesPanel(JPanel userProcess, Organisation organisation, Network network, Enterprise enterprise, Asset asset, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.asset = asset;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organisation = organisation;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblhouse.getModel();
        model.setRowCount(0);
        
        for (Network n : system.getNwkCatalog()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation org : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        String role = ua.getRole().toString();
                        if (ua.getRole() instanceof RepairRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getAvail();
                            row[5] = ua.getContactnumber();
                            row[6] = ua.getCost();
                            row[7] = org.getType();
                            model.addRow(row);
                        }
                    }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhouse = new javax.swing.JTable();
        lblmessae = new javax.swing.JLabel();
        getmessage = new javax.swing.JTextField();
        lblrepair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnrepairservices = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblicon1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 242));

        jScrollPane1.setForeground(new java.awt.Color(41, 50, 80));

        tblhouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Contact", "Rent", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhouse);

        lblmessae.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblmessae.setText("MESSAGE");

        getmessage.setForeground(new java.awt.Color(41, 50, 80));

        lblrepair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblrepair.setText("REPAIR SERVICES LIST");
        lblrepair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cloud-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblrepair))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblmessae)
                        .addGap(18, 18, 18)
                        .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(428, 428, 428))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmessae)
                    .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 250));

        btnrepairservices.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrepairservices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-online-jobs-application-available-on-a-smartphone-24.png"))); // NOI18N
        btnrepairservices.setText("RECRUIT REPAIR SERVICES ");
        btnrepairservices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrepairservices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepairservicesActionPerformed(evt);
            }
        });
        jPanel1.add(btnrepairservices, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
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
                .addGap(669, 669, 669)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(lbltitle))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrepairservicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepairservicesActionPerformed

        int selectedRow = tblhouse.getSelectedRow();
        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount servAcc = (UserAccount) tblhouse.getValueAt(selectedRow, 1);
                String message = getmessage.getText();
                if (message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Comment note!");
                    return;
                } else if (!servAcc.getAvail().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Electrician is already Occupied");
                    return;
                }
                for (Network n : system.getNwkCatalog()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organisation org : e.getOrganisationDirectory().getOrganisationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (servAcc.getUserName().equals(ua.getUserName())) {
                                    RepairServiceRequest cr = new RepairServiceRequest();
                                    cr.setRequestID();
                                    cr.setCustomer(userAccount);
                                    cr.setRepairservice(servAcc);
                                    cr.setMerchant(asset.getMerchant());
                                    cr.setAvail("Pending");
                                    cr.setCustomerNote(message);
                                    cr.setAsset(asset);
                                    cr.setOrgType(org.getType());
                                    e.getWorkQueue().getWrkReqList().add(cr);
                                    JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                                    try {
                                        if (servAcc.getContactnumber()!= null) {
                                            Sms sms = new Sms(servAcc.getContactnumber(), "Hello! You have one new work request! Please login to know more!");
                                        } else {
                                            System.out.println("NophoneNumber");
                                        }
                                    } catch (NullPointerException ex) {
                                        System.out.println("NophoneNumber");
                                    }
                                    try {
                                        if (servAcc.getMailId()!= null) {
                                            EcoSystem.sendEmailMessage(servAcc.getMailId(), "Hello! You have one new work request! Please login to know more!");
                                        } else {
                                            System.out.println("Noemail");
                                        }
                                    } catch (NullPointerException ex) {
                                        System.out.println("NoEmail");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");

        }
    }//GEN-LAST:event_btnrepairservicesActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnrepairservices;
    private javax.swing.JTextField getmessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblmessae;
    private javax.swing.JLabel lblrepair;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblhouse;
    // End of variables declaration//GEN-END:variables
}
