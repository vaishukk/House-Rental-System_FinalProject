/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AssetManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kiran
 */

public class AssetManagerProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDealerProfilePanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public AssetManagerProfilePanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }
    
    public void populateRequestTable() {
        getname.setText(userAccount.getName());
        getprice.setText(userAccount.getCost());
        getcity.setText(userAccount.getCity());
        getavail.setText(userAccount.getStatus());
        getzipcode.setText(userAccount.getZip());
        getaddress.setText(userAccount.getAddress());
        getmailid.setText(userAccount.getMailId());
        getcontactnum.setText(userAccount.getContactnumber());
        getstate.setText(userAccount.getState());
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
        jPanel3 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblassetmanagerdetails = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        getcontactnum = new javax.swing.JTextField();
        lblmailid = new javax.swing.JLabel();
        getmailid = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        lblzip = new javax.swing.JLabel();
        getzipcode = new javax.swing.JTextField();
        lblavail = new javax.swing.JLabel();
        getavail = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        getprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(696, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 70));

        btnsubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 150, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblassetmanagerdetails.setBackground(new java.awt.Color(255, 255, 255));
        lblassetmanagerdetails.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblassetmanagerdetails.setText("ASSET MANAGER DETAILS");
        lblassetmanagerdetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });

        lblcontact.setBackground(new java.awt.Color(255, 255, 255));
        lblcontact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontact.setText("Contact no:");

        getcontactnum.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcontactnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactnumActionPerformed(evt);
            }
        });

        lblmailid.setBackground(new java.awt.Color(255, 255, 255));
        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblmailid.setText("Mailid:");

        getmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbladdress.setBackground(new java.awt.Color(255, 255, 255));
        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladdress.setText("Address:");

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcity.setBackground(new java.awt.Color(255, 255, 255));
        lblcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcity.setText("City:");

        getcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblstate.setBackground(new java.awt.Color(255, 255, 255));
        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstate.setText("State:");

        getstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblzip.setBackground(new java.awt.Color(255, 255, 255));
        lblzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzip.setText("Zipcode:");

        getzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblavail.setBackground(new java.awt.Color(255, 255, 255));
        lblavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblavail.setText("Availibility:");

        getavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getavailActionPerformed(evt);
            }
        });

        lblprice.setBackground(new java.awt.Color(255, 255, 255));
        lblprice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblprice.setText("Price:");

        getprice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(lblcontact)
                    .addComponent(lblmailid)
                    .addComponent(lbladdress)
                    .addComponent(lblcity)
                    .addComponent(lblstate)
                    .addComponent(lblzip)
                    .addComponent(lblavail)
                    .addComponent(lblprice)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblassetmanagerdetails)
                    .addComponent(getprice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(getzipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(getmailid)
                        .addComponent(getcontactnum)
                        .addComponent(getname)
                        .addComponent(getaddress)
                        .addComponent(getcity)
                        .addComponent(getstate)
                        .addComponent(getavail)))
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblassetmanagerdetails))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontact)
                    .addComponent(getcontactnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmailid)
                    .addComponent(getmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity)
                    .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzip)
                    .addComponent(getzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblavail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprice)
                    .addComponent(getprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1180, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getavailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getavailActionPerformed

    private void getcontactnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactnumActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        if (system.isNull(getname.getText()) || system.isNull(getprice.getText()) || system.isNull(getcity.getText())
                || system.isNull(getavail.getText()) || system.isNull(getzipcode.getText()) || system.isNull(getaddress.getText())
                || system.isNull(getmailid.getText()) || system.isNull(getcontactnum.getText()) || system.isNull(getstate.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        } else if (!system.isDouble(getprice.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter valid charge!");
            return;
        } else if (!system.isInt(getzipcode.getText()) || getzipcode.getText().length() != 5) {
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        } else if (!system.checkValidPhoneFormat(getcontactnum.getText())) {
            return;
        } else if (!system.checkValidEmailFormat(getmailid.getText())) {
            return;
        } else if (!system.checkIfEmailIsUnique(getmailid.getText(), userAccount.getUsername())) {
            return;
        } else if (!system.checkIfPhoneIsUnique(getcontactnum.getText(), userAccount.getUsername())) {
            return;
        }
        userAccount.setName(getname.getText());
        userAccount.setCost(getprice.getText());
        userAccount.setCity(getcity.getText());
        userAccount.setStatus(getavail.getText());
        userAccount.setZip(getzipcode.getText());
        userAccount.setAddress(getaddress.getText());
        userAccount.setMailId(getmailid.getText());
        userAccount.setContactnumber(getcontactnum.getText());
        userAccount.setState(getstate.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
                                          

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getavail;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getcontactnum;
    private javax.swing.JTextField getmailid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getprice;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getzipcode;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblassetmanagerdetails;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzip;
    // End of variables declaration//GEN-END:variables
}
