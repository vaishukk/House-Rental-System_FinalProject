/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MoneyLender;

import Business.Asset.Asset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MoneyContractorEmployeeRequest;
import Business.WorkQueue.WorkRequest;
import UI.Customer.DisplayCustomerInfoPanel;
import UI.Customer.DisplayMerchantInfoPanel;
import UI.MerchantRole.ViewCustomerPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class ViewApplications extends javax.swing.JPanel {

    /**
     * Creates new form ViewApplications
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Enterprise enterprise;
    
    public ViewApplications(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblapplications.getModel();
        model.setRowCount(0);
        for (Network n : system.getNwkCatalog()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWrkReqList()) {
                    if (workRequest instanceof MoneyContractorEmployeeRequest) {
                        if (((MoneyContractorEmployeeRequest) workRequest).getMoneycontractoremp()== null || ((MoneyContractorEmployeeRequest) workRequest).getMoneycontractoremp().getUsername().equals(useraccount.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((MoneyContractorEmployeeRequest) workRequest).getCustomer();
                            row[2] = ((MoneyContractorEmployeeRequest) workRequest).getMerchant();
                            row[3] = ((MoneyContractorEmployeeRequest) workRequest).getAsset().getAddress();
                            row[4] = ((MoneyContractorEmployeeRequest) workRequest).getAsset().getCity();
                            row[5] = ((MoneyContractorEmployeeRequest) workRequest).getAsset().getState();
                            row[6] = ((MoneyContractorEmployeeRequest) workRequest).getAsset().getZip();
                            row[7] = ((MoneyContractorEmployeeRequest) workRequest).getStatus();
                            row[8] = ((MoneyContractorEmployeeRequest) workRequest).getCustomerNote();
                            row[9] = ((MoneyContractorEmployeeRequest) workRequest).getExaminerNote();
                            row[10] = ((MoneyContractorEmployeeRequest) workRequest).getDiscount();
                            row[11] = ((MoneyContractorEmployeeRequest) workRequest).getAsset();
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
        btnViewBuyerDetails = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblloan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblapplications = new javax.swing.JTable();
        lblprice = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        getmessage = new javax.swing.JTextField();
        getprice = new javax.swing.JTextField();
        btnaccept = new javax.swing.JButton();
        btndecline = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewBuyerDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewBuyerDetails.setText("View Assignee Details");
        btnViewBuyerDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewBuyerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuyerDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewBuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        btnViewSellerDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblloan.setBackground(new java.awt.Color(255, 255, 255));
        lblloan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblloan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblloan.setText("LOAN APPLICATIONS");
        lblloan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblapplications.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblapplications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Customer", "Merchant", "Address", "City", "State", "Zipcode", "Status", "Customer Message", "Employee Message", "Discount", "AssetID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblapplications);

        lblprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblprice.setText("Discounted Price");

        lblmessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmessage.setText("Message");

        getmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getmessageActionPerformed(evt);
            }
        });

        getprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getpriceActionPerformed(evt);
            }
        });

        btnaccept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaccept.setText("ACCEPT");
        btnaccept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });

        btndecline.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndecline.setText("DECLINE");
        btndecline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btndecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeclineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(lblloan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getprice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(btnaccept)))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btndecline))))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblloan)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getmessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnaccept)
                            .addComponent(btndecline))
                        .addGap(36, 36, 36))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1290, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1290, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        int selectedRow = tblapplications.getSelectedRow();
        double discount;
        if (selectedRow >= 0) {
            MoneyContractorEmployeeRequest checkRequest = (MoneyContractorEmployeeRequest) tblapplications.getValueAt(selectedRow, 0);
            try {
                discount = Double.parseDouble(getprice.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Discount");
                return;
            }
            if (!"In Progress".equals(checkRequest.getStatus())) {
                checkRequest.setStatus("In Progress");
                checkRequest.setMoneycontractoremp(useraccount);
                checkRequest.setDiscount(discount);
                useraccount.setStatus("Occupied");
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnacceptActionPerformed

    private void btnViewBuyerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBuyerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblapplications.getSelectedRow();
        int count = tblapplications.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount custAcc = (UserAccount) tblapplications.getValueAt(selectedRow, 1);
                Asset AssetAcc = (Asset) tblapplications.getValueAt(selectedRow, 11);
                ViewCustomerPanel viewCustomerPanel = new ViewCustomerPanel(userProcessContainer, AssetAcc, custAcc, useraccount, system);
                userProcessContainer.add("ViewCustomerPanel", viewCustomerPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewBuyerDetailsActionPerformed

    private void getpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getpriceActionPerformed

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblapplications.getSelectedRow();

        int count = tblapplications.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount merchantAcc = (UserAccount) tblapplications.getValueAt(selectedRow, 2);
                DisplayMerchantInfoPanel displayMerchantInfoPanel = new DisplayMerchantInfoPanel(userProcessContainer, merchantAcc, useraccount, system);
                userProcessContainer.add("DisplayMerchantInfoPanel", displayMerchantInfoPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btndeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeclineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblapplications.getSelectedRow();
        if (selectedRow >= 0) {
            String message = getmessage.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for message");
                return;
            }
            MoneyContractorEmployeeRequest checkRequest = (MoneyContractorEmployeeRequest) tblapplications.getValueAt(selectedRow, 0);
            if (!"In Progress".equals(checkRequest.getStatus())) {
                checkRequest.setStatus("Rejected");
                JOptionPane.showMessageDialog(null, "Job Rejected Successfully!");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btndeclineActionPerformed

    private void getmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getmessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getmessageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewBuyerDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JButton btnaccept;
    private javax.swing.JButton btndecline;
    private javax.swing.JTextField getmessage;
    private javax.swing.JTextField getprice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblloan;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblapplications;
    // End of variables declaration//GEN-END:variables
}
