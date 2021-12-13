/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CameraManRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kiran
 */
public class ManageCameramanPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVideoCamrProfilePanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    public ManageCameramanPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        fillReqTable();
    }
    
    public void fillReqTable() {
        getname.setText(userAccount.getName());
        getcost.setText(userAccount.getCost());
        getcity.setText(userAccount.getCity());
        getavail.setText(userAccount.getStatus());
        getzip.setText(userAccount.getZip());
        getaddress.setText(userAccount.getAddress());
        getmailid.setText(userAccount.getMailId());
        getcontactnumber.setText(userAccount.getContactnumber());
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
        btnsubmit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        lblzipcodde = new javax.swing.JLabel();
        getzip = new javax.swing.JTextField();
        getcontactnumber = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        lblmailid = new javax.swing.JLabel();
        getmailid = new javax.swing.JTextField();
        lblavail = new javax.swing.JLabel();
        getavail = new javax.swing.JTextField();
        lblcharge = new javax.swing.JLabel();
        getcost = new javax.swing.JTextField();
        lablsubtitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, 60));

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
                .addContainerGap(783, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 70));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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

        lblzipcodde.setBackground(new java.awt.Color(255, 255, 255));
        lblzipcodde.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzipcodde.setText("Zipcode:");

        getzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        getcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactnumberActionPerformed(evt);
            }
        });

        lblcontactnumber.setBackground(new java.awt.Color(255, 255, 255));
        lblcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontactnumber.setText("Contact Number:");

        lblmailid.setBackground(new java.awt.Color(255, 255, 255));
        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblmailid.setText("Mail id:");

        getmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblavail.setBackground(new java.awt.Color(255, 255, 255));
        lblavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblavail.setText("Availibility:");

        getavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcharge.setBackground(new java.awt.Color(255, 255, 255));
        lblcharge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcharge.setText("Price:");

        getcost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lablsubtitle.setBackground(new java.awt.Color(255, 255, 255));
        lablsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lablsubtitle.setText(" CAMERA MAN PAGE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-photographer-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblcontactnumber)
                        .addComponent(lblname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbladdress)
                            .addComponent(lblcity)
                            .addComponent(lblstate)
                            .addComponent(lblzipcodde)
                            .addComponent(lblmailid)
                            .addComponent(lblavail))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblcharge)
                        .addGap(63, 63, 63)))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getname)
                            .addComponent(getcontactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getaddress)
                            .addComponent(getzip)
                            .addComponent(getcity)
                            .addComponent(getstate)
                            .addComponent(getmailid)
                            .addComponent(getavail)
                            .addComponent(getcost, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lablsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lablsubtitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getcontactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontactnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzipcodde)
                    .addComponent(getzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmailid)
                    .addComponent(getmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavail)
                    .addComponent(getavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcharge)
                    .addComponent(getcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1260, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactnumberActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        if(system.isNull(getname.getText()) || system.isNull(getcost.getText()) || system.isNull(getcity.getText())
           || system.isNull(getavail.getText()) || system.isNull(getzip.getText()) || system.isNull(getaddress.getText())
           || system.isNull(getmailid.getText()) || system.isNull(getcontactnumber.getText()) || system.isNull(getstate.getText())){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        }else if(!system.isDouble(getcost.getText())){
            JOptionPane.showMessageDialog(null, "Please enter valid charge!");
            return;
        }else if(!system.isInt(getzip.getText()) || getzip.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        }else if(!system.checkValidPhoneFormat(getcontactnumber.getText())){
            return;
        }else if(!system.checkValidEmailFormat(getmailid.getText())){
            return;
        }else if(!system.checkIfEmailIsUnique(getmailid.getText(), userAccount.getUsername())){
            return;
        }else if(!system.checkIfPhoneIsUnique(getcontactnumber.getText(), userAccount.getUsername())){
            return;
        }
        userAccount.setName(getname.getText());
        userAccount.setCost(getcost.getText());
        userAccount.setCity(getcity.getText());
        userAccount.setStatus(getavail.getText());
        userAccount.setZip(getzip.getText());
        userAccount.setAddress(getaddress.getText());
        userAccount.setMailId(getmailid.getText());
        userAccount.setContactnumber(getcontactnumber.getText());
        userAccount.setState(getstate.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
       
    }//GEN-LAST:event_btnsubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getavail;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getcontactnumber;
    private javax.swing.JTextField getcost;
    private javax.swing.JTextField getmailid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getzip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lablsubtitle;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblcharge;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzipcodde;
    // End of variables declaration//GEN-END:variables
}
