/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CameraManRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CameraManRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiran
 */
public class ViewOppurnitiesPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOppurnitiesPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Enterprise enterprise;
    
    public ViewOppurnitiesPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }
    
        public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) housingtable.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWrkReqList()) {
                    if (workRequest instanceof CameraManRequest) {
                        if (((CameraManRequest) workRequest).getCameraman().getUsername().equals(useraccount.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((CameraManRequest) workRequest).getCustomer();
                            row[2] = ((CameraManRequest) workRequest).getMerchant();
                            row[3] = ((CameraManRequest) workRequest).getAsset().getAddress();
                            row[4] = ((CameraManRequest) workRequest).getAsset().getCity();
                            row[5] = ((CameraManRequest) workRequest).getAsset().getState();
                            row[6] = ((CameraManRequest) workRequest).getAsset().getZip();
                            row[7] = ((CameraManRequest) workRequest).getStatus();
                            row[8] = ((CameraManRequest) workRequest).getCustomerNote();
                            row[9] = ((CameraManRequest) workRequest).getExaminerNote();
                            row[10] = ((CameraManRequest) workRequest).getQuote();
                            row[11] = ((CameraManRequest) workRequest).getCustomer().getRole().toString();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        housingtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblcameraman = new javax.swing.JLabel();
        btnviewappointer = new javax.swing.JButton();
        btnmerchant = new javax.swing.JButton();
        btnselectjob = new javax.swing.JButton();
        btnjobcompleted = new javax.swing.JButton();
        btndecline = new javax.swing.JButton();
        lblquote = new javax.swing.JLabel();
        getquote = new javax.swing.JTextField();
        lblcomment = new javax.swing.JLabel();
        getcomment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblsubsubtitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        housingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job_id", "Appointer", "Merchant", "Address", "City", "State", "Zipcode", "Availibility", "Customer Message", "Camera man Message", "Quote", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(housingtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1130, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(741, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 70));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblcameraman.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblcameraman.setText(" CAMERA MAN PAGE");
        lblcameraman.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnviewappointer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnviewappointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-58.png"))); // NOI18N
        btnviewappointer.setText("VIEW APPOINTER");
        btnviewappointer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnviewappointer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnviewappointer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewappointerActionPerformed(evt);
            }
        });

        btnmerchant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnmerchant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-broker-48.png"))); // NOI18N
        btnmerchant.setText("VIEW MERCHANT");
        btnmerchant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnmerchant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmerchant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmerchantActionPerformed(evt);
            }
        });

        btnselectjob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnselectjob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-online-jobs-application-available-on-a-smartphone-24.png"))); // NOI18N
        btnselectjob.setText("SELECT JOB");
        btnselectjob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnselectjob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnselectjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectjobActionPerformed(evt);
            }
        });

        btnjobcompleted.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnjobcompleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-verification-tick-mark-for-digital-certification-document-24.png"))); // NOI18N
        btnjobcompleted.setText("JOB DONE");
        btnjobcompleted.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnjobcompleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnjobcompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjobcompletedActionPerformed(evt);
            }
        });

        btndecline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btndecline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cross-mark-48.png"))); // NOI18N
        btndecline.setText("DECLINE");
        btndecline.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btndecline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeclineActionPerformed(evt);
            }
        });

        lblquote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblquote.setText("QUOTE:");

        getquote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getquote.setBorder(null);
        getquote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getquoteActionPerformed(evt);
            }
        });

        lblcomment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcomment.setText("COMMENTS:");

        getcomment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getcomment.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-photographer-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblquote, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getquote, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(lblcomment)
                        .addGap(18, 18, 18)
                        .addComponent(getcomment, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnmerchant)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnselectjob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnviewappointer, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(114, 114, 114))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcameraman)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btndecline, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146)
                                        .addComponent(btnjobcompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblcameraman)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmerchant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewappointer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnselectjob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndecline, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnjobcompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblquote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getquote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcomment)
                        .addComponent(getcomment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1210, 320));

        lblsubsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblsubsubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblsubsubtitle.setText("VIEW DETAILS");
        jPanel1.add(lblsubsubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-contact-details-64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1207, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnselectjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectjobActionPerformed
        int selectedRow = housingtable.getSelectedRow();
        if (selectedRow >= 0) {
            CameraManRequest checkRequest = (CameraManRequest) housingtable.getValueAt(selectedRow, 0);
            try {
                Double quote = Double.parseDouble(getquote.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Quote");
                return;
            }
            if (!"In Progress".equals(checkRequest.getStatus())) {
                checkRequest.setStatus("In Progress");
                checkRequest.setQuote(getquote.getText());
                useraccount.setStatus("Occupied");
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnselectjobActionPerformed

    private void btnjobcompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjobcompletedActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingtable.getSelectedRow();
        if (selectedRow >= 0) {
            CameraManRequest checkRequest = (CameraManRequest) housingtable.getValueAt(selectedRow, 0);
            String comment = getcomment.getText();
            if (comment.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            if (!"Completed".equals(checkRequest.getStatus())) {
                checkRequest.setStatus("Completed");
                checkRequest.setExaminerNote(comment);
                JOptionPane.showMessageDialog(null, "Job is set to completed!");
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to set your status to Available?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    useraccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already completed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnjobcompletedActionPerformed

    private void getquoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getquoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getquoteActionPerformed

    private void btnviewappointerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewappointerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewappointerActionPerformed

    private void btnmerchantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmerchantActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnmerchantActionPerformed

    private void btndeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeclineActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingtable.getSelectedRow();
        if (selectedRow >= 0) {
            CameraManRequest checkRequest = (CameraManRequest) housingtable.getValueAt(selectedRow, 0);
            String comment = getcomment.getText();
            if (comment.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            if (!"Completed".equals(checkRequest.getStatus()) && !"In Progress".equals(checkRequest.getStatus())) {
                checkRequest.setStatus("Rejected");
                checkRequest.setExaminerNote(comment);
                JOptionPane.showMessageDialog(null, "Job is set to rejected!");
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to set your status to Available?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    useraccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already " + checkRequest.getStatus());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
       
    }//GEN-LAST:event_btndeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndecline;
    private javax.swing.JButton btnjobcompleted;
    private javax.swing.JButton btnmerchant;
    private javax.swing.JButton btnselectjob;
    private javax.swing.JButton btnviewappointer;
    private javax.swing.JTextField getcomment;
    private javax.swing.JTextField getquote;
    private javax.swing.JTable housingtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcameraman;
    private javax.swing.JLabel lblcomment;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblquote;
    private javax.swing.JLabel lblsubsubtitle;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}
