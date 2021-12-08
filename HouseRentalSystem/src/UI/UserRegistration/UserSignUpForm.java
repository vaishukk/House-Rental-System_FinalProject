/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.UserRegistration;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nemod
 */
public class UserSignUpForm extends javax.swing.JPanel {

    /**
     * Creates new form userRegistration
     */
    private final EcoSystem system;
    private boolean flag = false;
    
    public UserSignUpForm(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        populateNetworkComboBox();
        populateOrgTypes();
        //pleaseWait.setVisible(false);
    }
    
    public void populateNetworkComboBox() {
        getstate.removeAllItems();
        for (Network network : system.getNetworkList()) {
            getstate.addItem(network);
        }
    }
    
    public void populateOrgTypes() {
        organizationbox.addItem(Organisation.Type.Broker);
        
        organizationbox.addItem(Organisation.Type.Broker);
        
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
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblsubtitle = new javax.swing.JLabel();
        lablorganizationname = new javax.swing.JLabel();
        organizationbox = new javax.swing.JComboBox();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        getusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        getpassword = new javax.swing.JPasswordField();
        lblmailid = new javax.swing.JLabel();
        getmail = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JComboBox();
        lbladdress = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        getcontactdetails = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1338, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1338, 900));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1002, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 70));

        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblsubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsubtitle.setText("SIGN UP FORM");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lablorganizationname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lablorganizationname.setText("Organization");

        organizationbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationboxActionPerformed(evt);
            }
        });
        organizationbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                organizationboxKeyTyped(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setText("Name");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });
        getname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                getnameKeyTyped(evt);
            }
        });

        lblusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblusername.setText("Username");

        getusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getusernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                getusernameKeyTyped(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpassword.setText("Password");

        getpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getpassword.setForeground(new java.awt.Color(25, 56, 82));

        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmailid.setText("Email Id");

        getmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getmail.setForeground(new java.awt.Color(25, 56, 82));
        getmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                getmailKeyTyped(evt);
            }
        });

        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblstate.setText("State");

        getstate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getstate.setForeground(new java.awt.Color(25, 56, 82));
        getstate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getstateItemStateChanged(evt);
            }
        });
        getstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getstateActionPerformed(evt);
            }
        });
        getstate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getstateKeyReleased(evt);
            }
        });

        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbladdress.setText("Address");

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getaddress.setForeground(new java.awt.Color(25, 56, 82));
        getaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                getaddressKeyTyped(evt);
            }
        });

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhone.setText("Contact Information");

        getcontactdetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getcontactdetails.setForeground(new java.awt.Color(25, 56, 82));
        getcontactdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactdetailsActionPerformed(evt);
            }
        });
        getcontactdetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getcontactdetailsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getcontactdetailsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                getcontactdetailsKeyTyped(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSignUp.setText("SIGNUP");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(lblsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lablorganizationname)
                            .addComponent(lblname)
                            .addComponent(lblusername)
                            .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmailid)
                            .addComponent(lbladdress)
                            .addComponent(lblstate)
                            .addComponent(lblPhone))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organizationbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getname)
                            .addComponent(getusername)
                            .addComponent(getpassword)
                            .addComponent(getmail)
                            .addComponent(getaddress)
                            .addComponent(getstate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getcontactdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(693, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblsubtitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablorganizationname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladdress)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblstate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(getcontactdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1490, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1487, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameActionPerformed

    private void getnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getnameKeyTyped
        // TODO add your handling code here
    }//GEN-LAST:event_getnameKeyTyped

    private void getnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameKeyPressed

    private void getusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getusernameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_getusernameKeyReleased

    private void getusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getusernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_getusernameKeyTyped

    private void getmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_getmailKeyReleased

    private void getmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_getmailKeyTyped

    private void getaddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getaddressKeyTyped
        // TODO add your handling code here
    }//GEN-LAST:event_getaddressKeyTyped

    private void getcontactdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactdetailsActionPerformed

    private void getcontactdetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getcontactdetailsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactdetailsKeyPressed

    private void getcontactdetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getcontactdetailsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactdetailsKeyReleased

    private void getcontactdetailsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getcontactdetailsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactdetailsKeyTyped

    private void getstateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getstateItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_getstateItemStateChanged

    private void getstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getstateActionPerformed
        
    }//GEN-LAST:event_getstateActionPerformed

    private void getstateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getstateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_getstateKeyReleased

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        Network network = (Network) getstate.getSelectedItem();
        Organisation.Type type = (Organisation.Type) organizationbox.getSelectedItem();
        String emailAddress = getmail.getText();
        String username = getusername.getText();
        String name = getname.getText();
        String password = getpassword.getText();
        String phone = getcontactdetails.getText();
        String city = getaddress.getText();
        if (network == null || type == null || name.isEmpty() || username.isEmpty() || password.isEmpty() || emailAddress.isEmpty()
                || city.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All of the above the fields are required for registration!!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!system.checkValidPasswordFormat(password)) {
            return;
        }
        if (!system.checkIfUserIsUnique(username)) {
            return;
        }
        if (!this.system.checkValidEmailFormat(emailAddress)) {
            return;
        }
        if (!this.system.checkValidPhoneFormat(phone)) {
            return;
        }

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getEmail() != null) {
                            if (u.getEmail().toLowerCase().equals(emailAddress.toLowerCase())) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Email Address already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }
        }
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getPhone() != null) {
                            if (u.getPhone().equals(phone)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (Organisation.Type.Customer == type) {
            flag = true;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Asset) {
                    Organisation org = enterprise.getOrganisationDirectory().createOrganisation(type, name);
                    Employee emp = org.getEmployeeDirectory().createEmployee(name);
//                    UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(username, password, emp, new BuyerRole());
//                    ua1.setEmail(emailAddress);
//                    ua1.setPhone(phone);
//                    ua1.setCity(city);
                    String bodyMsg = "Hello " + username + ", \n Thank you for registering with us. Your account is activated. Happy Housing!";
                }
            }
        } else {
//            UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
//            registrationRequest.setName(name);
//            registrationRequest.setUserName(username);
//            registrationRequest.setUserPassword(password);
//            registrationRequest.setUserEmailId(emailAddress);
//            registrationRequest.setNetwork(network);
//            registrationRequest.setUserCity(city);
//            registrationRequest.setOrgType(type);
//            registrationRequest.setStatus("Requested");
//            registrationRequest.setUserContact(phone);

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()) {
                    if (org.getType() == type) {
                        if (enterprise.getWorkQueue() == null) {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        flag = true;
                    }
                }
                if(flag){
                    //enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                }
            }
        }
        if (flag) {
//            pleaseWait.setVisible(true);
//            btnRegister.setEnabled(false);
            String bodyMsg = "Hello " + username + ", \n Thank you for registering with us. Your account will be activated within 48 hours. We will keep you posted here.";
            system.sendEmailMessage(emailAddress, bodyMsg);
            //SendSMS sendSMS = new SendSMS(phone, bodyMsg);
            JOptionPane.showMessageDialog(null, "You have been registered succesfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! No such Organization is created by the enterprise");
        }
        getname.setText("");
        getusername.setText("");
        getpassword.setText("");
        getmail.setText("");
        getaddress.setText("");
        getcontactdetails.setText("");
        //pleaseWait.setVisible(false);
        btnSignUp.setEnabled(true);
         
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void organizationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationboxActionPerformed

    private void organizationboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_organizationboxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationboxKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getcontactdetails;
    private javax.swing.JTextField getmail;
    private javax.swing.JTextField getname;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JComboBox getstate;
    private javax.swing.JTextField getusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lablorganizationname;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblusername;
    private javax.swing.JComboBox organizationbox;
    // End of variables declaration//GEN-END:variables
}