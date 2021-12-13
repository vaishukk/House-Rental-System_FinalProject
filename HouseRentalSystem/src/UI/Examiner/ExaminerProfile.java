/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Examiner;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




/**
 *
 * @author sanik
 */
    

public class ExaminerProfile extends javax.swing.JPanel {

    /**
     * Creates new form ExaminerProfile
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public ExaminerProfile(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        populateReqTable();
    }
    
    public void populateReqTable() {
        getname.setText(userAccount.getName());
        getcharge.setText(userAccount.getCost());
        getcity.setText(userAccount.getCity());
        getstatus.setText(userAccount.getStatus());
        getzip.setText(userAccount.getZip());
        getaddress.setText(userAccount.getAddress());
        getmaidid.setText(userAccount.getMailId());
        getcontact.setText(userAccount.getContactnumber());
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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblexaminer = new javax.swing.JLabel();
        getcontact = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        getaddress = new javax.swing.JTextField();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        getstatus = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        lblzipcode = new javax.swing.JLabel();
        getmaidid = new javax.swing.JTextField();
        getzip = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblcharge = new javax.swing.JLabel();
        getcharge = new javax.swing.JTextField();
        lblmailid = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(44, 68, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(754, Short.MAX_VALUE))
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

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 80));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblexaminer.setBackground(new java.awt.Color(255, 255, 255));
        lblexaminer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblexaminer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexaminer.setText("EXAMINER PROFILE");
        lblexaminer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        getcontact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name");

        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladdress.setText("Address");

        lblcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcity.setText("City");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        getcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcityActionPerformed(evt);
            }
        });

        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstate.setText("State");

        lblstatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstatus.setText("Status");

        getstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        getstatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getstatusActionPerformed(evt);
            }
        });

        lblcontact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontact.setText("Contact ");

        lblzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzipcode.setText("Zipcode");

        getmaidid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        getzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSave.setText("SUBMIT AND SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblcharge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcharge.setText("Charge");

        getcharge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblmailid.setText("Mail ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblzipcode)
                                .addGap(238, 238, 238)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblstate))
                        .addGap(0, 772, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblname)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getzip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbladdress)
                            .addComponent(lblcity)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontact)
                            .addComponent(lblstatus)
                            .addComponent(lblcharge)
                            .addComponent(lblmailid))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getmaidid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(550, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(lblexaminer, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblexaminer)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontact)
                    .addComponent(getcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getmaidid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmailid))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcharge)
                    .addComponent(getcharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity)
                    .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstatus)
                    .addComponent(getstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblzipcode)
                            .addComponent(getzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1230, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactActionPerformed

    private void getcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcityActionPerformed

    private void getstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getstatusActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if(system.isNull(getname.getText()) || system.isNull(getcharge.getText()) || system.isNull(getcity.getText())
           || system.isNull(getstatus.getText()) || system.isNull(getzip.getText()) || system.isNull(getaddress.getText())
           || system.isNull(getmaidid.getText()) || system.isNull(getcontact.getText()) || system.isNull(getstate.getText())){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        }else if(!system.isInt(getzip.getText()) || getzip.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        }else if(!system.checkValidPhoneFormat(getcontact.getText())){
            return;
        }else if(!system.checkValidEmailFormat(getmaidid.getText())){
            return;
        }else if(!system.checkIfEmailIsUnique(getmaidid.getText(), userAccount.getUsername())){
            return;
        }else if(!system.checkIfPhoneIsUnique(getcontact.getText(), userAccount.getUsername())){
            return;
        }
        userAccount.setName(getname.getText());
        userAccount.setCost(getcharge.getText());
        userAccount.setCity(getcity.getText());
        userAccount.setStatus(getstatus.getText());
        userAccount.setZip(getzip.getText());
        userAccount.setAddress(getaddress.getText());
        userAccount.setMailId(getmaidid.getText());
        userAccount.setContactnumber(getcontact.getText());
        userAccount.setState(getstate.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getcharge;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getcontact;
    private javax.swing.JTextField getmaidid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getstatus;
    private javax.swing.JTextField getzip;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcharge;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblexaminer;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzipcode;
    // End of variables declaration//GEN-END:variables
}
