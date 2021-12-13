/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.Asset;
import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BrokerRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class ControlBrokerJob extends javax.swing.JPanel {

    /**
     * Creates new form ControlBrokerJob
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private AssetDirectory assetDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;
    public ControlBrokerJob(JPanel userProcess, UserAccount userAccount, EcoSystem system, Enterprise enterprise, Network network, Organisation organisation) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organisation = organisation;
        this.assetDirectory = (system.getAssetDirectory()== null) ? new AssetDirectory() : system.getAssetDirectory();
        tblhouse.setVisible(false);
        populateReqTable();
    }
    
    public void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) tblbroker.getModel();
        model.setRowCount(0);
        for (Network n : system.getNwkCatalog()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.Broker) {
                    for (WorkRequest workRequest : e.getWorkQueue().getWrkReqList()) {
                        if (workRequest instanceof BrokerRequest) {
                            if (userAccount.getUserName().equals(((BrokerRequest) workRequest).getCustomer().getUserName())) {
                                Object[] row = new Object[model.getColumnCount()];
                                row[0] = ((BrokerRequest) workRequest);
                                row[1] = ((BrokerRequest) workRequest).getBroker().getName();
                                row[2] = ((BrokerRequest) workRequest).getMerchant().getName();
                                row[3] = ((BrokerRequest) workRequest).getAsset().getAddress();
                                row[4] = ((BrokerRequest) workRequest).getAsset().getCity();
                                row[5] = ((BrokerRequest) workRequest).getAsset().getState();
                                row[6] = ((BrokerRequest) workRequest).getAsset().getZip();
                                row[7] = ((BrokerRequest) workRequest).getAvail();
                                row[8] = ((BrokerRequest) workRequest).getCustomerNote();
                                row[9] = ((BrokerRequest) workRequest).getExaminerNote();
                                row[10] = ((BrokerRequest) workRequest).getBroker().getCost();
                                row[11] = ((BrokerRequest) workRequest).getQuote();
                                row[12] = ((BrokerRequest) workRequest).getOrgType();
                                model.addRow(row);
                            }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbroker = new javax.swing.JTable();
        lblmessage = new javax.swing.JLabel();
        getmessage = new javax.swing.JTextField();
        btnsendmessage = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhouse = new javax.swing.JTable();
        btnhouses = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblbroker = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblbroker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Broker", "Merchant", "Address", "City", "State", "Zipcode", "Availibility", "Customer Message", "Broker Message", "Charge", "Quote", "OrgType"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblbroker);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 840, 110));

        lblmessage.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 255, 255));
        lblmessage.setText("MESSAGE");
        jPanel1.add(lblmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));
        jPanel1.add(getmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 680, -1));

        btnsendmessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsendmessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64_1.png"))); // NOI18N
        btnsendmessage.setText("SEND MESSAGE");
        btnsendmessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsendmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendmessageActionPerformed(evt);
            }
        });
        jPanel1.add(btnsendmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 230, 50));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 691, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(lbltitle))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 70));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tblhouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Houseid", "Name", "Street", "City", "State", "Zipcode", "No of Bhk", "Restrooms", "Rent Price", "Availibility", "Sold", "Merchant Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhouse);

        btnhouses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhouses.setText("VIEW RECOMMENDED HOUSES");
        btnhouses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhousesActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-give-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhouses, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnhouses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1340, 210));

        lblbroker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblbroker.setForeground(new java.awt.Color(255, 255, 255));
        lblbroker.setText("VIEW BROKER JOB LIST");
        lblbroker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblbroker, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broker-48.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendmessageActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblbroker.getSelectedRow();

        if (selectedRow >= 0) {
            BrokerRequest br = (BrokerRequest) tblbroker.getValueAt(selectedRow, 0);
            String message = getmessage.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            br.setCustomerNote(message);
            populateReqTable();
            JOptionPane.showMessageDialog(null, "Message Sent Successfully!");

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnsendmessageActionPerformed

    private void btnhousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhousesActionPerformed
        // TODO add your handling code here:
       tblbroker.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tblbroker.getModel();
        model.setRowCount(0);
        int selectedRow = tblhouse.getSelectedRow();

        if (selectedRow >= 0) {
            BrokerRequest br = (BrokerRequest) tblhouse.getValueAt(selectedRow, 0);

            if (br instanceof BrokerRequest) {
                ArrayList<String> assetList = br.getAssetList();
                if (assetList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry there are no house suggestions yet!");
                    return;
                }
                for (String assetID : assetList) {
                    Asset asset = system.getAssetDirectory().fetchAsset(assetID);
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = asset.getAssetID();
                    row[1] = asset.getAssetName();
                    row[2] = asset.getAddress();
                    row[3] = asset.getCity();
                    row[4] = asset.getState();
                    row[5] = asset.getZip();
                    row[6] = asset.getBedroom();
                    row[7] = asset.getBaths();
                    row[8] = asset.getCost();
                    row[9] = asset.getAvail();
                    row[10] = asset.getCustomer();
                    row[11] = asset.getMerchant();
                    model.addRow(row);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }

                   
    }//GEN-LAST:event_btnhousesActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnhouses;
    private javax.swing.JButton btnsendmessage;
    private javax.swing.JTextField getmessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblbroker;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblbroker;
    private javax.swing.JTable tblhouse;
    // End of variables declaration//GEN-END:variables
}
