/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ExamineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class ControlExaminerJob extends javax.swing.JPanel {

    /**
     * Creates new form ControlExaminerJob
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private AssetDirectory assetDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;
    public ControlExaminerJob(JPanel userProcess, UserAccount userAccount, EcoSystem system, Enterprise enterprise, Network network, Organisation organisation) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organisation = organisation;
        this.assetDirectory = (system.getAssetDirectory()== null) ? new AssetDirectory() : system.getAssetDirectory();
        populateReqTable();
    }

    public void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) tblexaminer.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.QualityControl) {
                    for (WorkRequest workRequest : e.getWorkQueue().getWrkReqList()) {
                        if (workRequest instanceof ExamineRequest) {
                            if (userAccount.getUsername().equals(((ExamineRequest) workRequest).getCustomer().getUsername())) {
                                Object[] row = new Object[model.getColumnCount()];
                                row[0] = ((ExamineRequest) workRequest);
                                row[1] = ((ExamineRequest) workRequest).getExaminer().getName();
                                row[2] = ((ExamineRequest) workRequest).getMerchant().getName();
                                row[3] = ((ExamineRequest) workRequest).getAsset().getAddress();
                                row[4] = ((ExamineRequest) workRequest).getAsset().getCity();
                                row[5] = ((ExamineRequest) workRequest).getAsset().getState();
                                row[6] = ((ExamineRequest) workRequest).getAsset().getZip();
                                row[7] = ((ExamineRequest) workRequest).getStatus();
                                row[8] = ((ExamineRequest) workRequest).getCustomerNote();
                                row[9] = ((ExamineRequest) workRequest).getExaminerNote();
                                row[10] = ((ExamineRequest) workRequest).getExaminer().getCost();
                                row[11] = ((ExamineRequest) workRequest).getQuote();
                                row[12] = ((ExamineRequest) workRequest).getOrgType();
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
        jPanel6 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblexaminer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblexaminer = new javax.swing.JTable();
        lblmessage = new javax.swing.JLabel();
        getmessage = new javax.swing.JTextField();
        btnsendmessage = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbltitle))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 90));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblexaminer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblexaminer.setText("VIEW EXAMINERS JOB LIST");
        lblexaminer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblexaminer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Examiner", "Merchant", "Address", "City", "State", "Zipcode", "Status", "Customer Message", "Examiner Message", "Charge", "Estimate", "OrgType"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblexaminer);

        lblmessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblmessage.setText("MESSAGE");

        btnsendmessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsendmessage.setText("SEND MESSAGE");
        btnsendmessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsendmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendmessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(lblexaminer)
                .addContainerGap(799, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2)
                .addGap(219, 219, 219))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblmessage)
                        .addGap(47, 47, 47)
                        .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(btnsendmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblexaminer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmessage)
                    .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnsendmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1320, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsendmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendmessageActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblexaminer.getSelectedRow();

        if (selectedRow >= 0) {
            ExamineRequest br = (ExamineRequest) tblexaminer.getValueAt(selectedRow, 0);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsendmessage;
    private javax.swing.JTextField getmessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblexaminer;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblexaminer;
    // End of variables declaration//GEN-END:variables
}
