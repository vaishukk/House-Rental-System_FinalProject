/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UI.UserRegistration.UserSignUpForm;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
//import userinterface.UserRegistration.UserRegistrationJPanel;

/**
 *
 * @author Kiran
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise inEnterprise;
    Organisation inOrganisation;
    Network networkEmergency;
    
    public MainFrame() {
        
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void changePanel1(UserAccount userAccount) {

        if (userAccount != null && userAccount.getRole() != null) {
            String greetings = "Welcome";

            greetings = greetings + " " + userAccount.getUserName();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganisation, inEnterprise, networkEmergency, system));

            lblwelcome.setText(greetings + " !!!");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnlogoff = new javax.swing.JLabel();
        lblwelcome = new javax.swing.JLabel();
        btngoback = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addimageicon = new javax.swing.JLabel();
        houserentaltitle = new javax.swing.JLabel();
        lblmainicon = new javax.swing.JLabel();
        lbltagline = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        getusername = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        getpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JLabel();
        btncancel = new javax.swing.JLabel();
        btnregister = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JLabel();
        loginButton2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(204, 204, 204));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogoff.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnlogoff.setText("LOGOUT");
        btnlogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlogoffMousePressed(evt);
            }
        });
        leftPanel.add(btnlogoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 70, 30));

        lblwelcome.setBackground(new java.awt.Color(255, 255, 255));
        lblwelcome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(255, 255, 255));
        leftPanel.add(lblwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 770, 60));

        btngoback.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btngoback.setText("BACK");
        btngoback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btngobackMousePressed(evt);
            }
        });
        leftPanel.add(btngoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 30));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 50));

        container.setBackground(new java.awt.Color(204, 204, 204));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1270, 650));

        loginJPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(554, 840));

        addimageicon.setBackground(new java.awt.Color(255, 213, 90));
        addimageicon.setPreferredSize(new java.awt.Dimension(600, 840));

        houserentaltitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        houserentaltitle.setForeground(new java.awt.Color(41, 50, 80));
        houserentaltitle.setText("HOUSE RENTAL ");
        houserentaltitle.setBorder(new javax.swing.border.MatteBorder(null));

        lblmainicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N
        lblmainicon.setBorder(new javax.swing.border.MatteBorder(null));

        lbltagline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltagline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltagline.setText("Helping you find the House of your Dreams!");
        lbltagline.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rental.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(houserentaltitle))
                    .addComponent(lbltagline, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addimageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houserentaltitle)
                    .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(lbltagline, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(addimageicon, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginJPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 539, 970));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 34));

        getusername.setBackground(new java.awt.Color(204, 204, 204));
        getusername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getusername.setForeground(new java.awt.Color(255, 255, 255));
        getusername.setToolTipText("");
        getusername.setBorder(null);
        getusername.setCaretColor(new java.awt.Color(255, 255, 255));
        getusername.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        getusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getusernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginJPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 179, 401, 37));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(302, 34));

        getpassword.setBackground(new java.awt.Color(204, 204, 204));
        getpassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getpassword.setForeground(new java.awt.Color(255, 255, 255));
        getpassword.setBorder(null);
        getpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        getpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 173, Short.MAX_VALUE)
                .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        loginJPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 310, 418, -1));

        btnlogin.setBackground(new java.awt.Color(255, 229, 180));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64 (2).png"))); // NOI18N
        btnlogin.setText("USERNAME");
        btnlogin.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });
        loginJPanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 205, 54));

        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btncancel.setText("CANCEL");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncancelMousePressed(evt);
            }
        });
        loginJPanel.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 68, 35));

        btnregister.setBackground(new java.awt.Color(255, 255, 255));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnregister.setText("REGISTER");
        btnregister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnregisterMousePressed(evt);
            }
        });
        loginJPanel.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 411, 304, 33));

        loginButton1.setBackground(new java.awt.Color(255, 229, 180));
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton1.setText("LOGIN");
        loginButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        loginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButton1MousePressed(evt);
            }
        });
        loginJPanel.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 360, 304, 33));

        loginButton2.setBackground(new java.awt.Color(255, 229, 180));
        loginButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-47.png"))); // NOI18N
        loginButton2.setText("PASSWORD");
        loginButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        loginButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButton2MousePressed(evt);
            }
        });
        loginJPanel.add(loginButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 205, 58));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoffMousePressed
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }//GEN-LAST:event_btnlogoffMousePressed

    private void btngobackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngobackMousePressed
        // TODO add your handling code here:
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }//GEN-LAST:event_btngobackMousePressed

    private void getusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getusernameActionPerformed

    private void getpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getpasswordActionPerformed

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
        // TODO add your handling code here:
        String userName = getusername.getText();
        char[] passwordCharArray = getpassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter valid user credentials to login!");
        } else {
            userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
            inEnterprise = null;
            inOrganisation = null;
            networkEmergency = null;

            if (userAccount == null) {
                for (Network network : system.getNwkCatalog()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        networkEmergency = network;
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
                                userAccount = organisation.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganisation = organisation;
                                    networkEmergency = network;
                                    break;
                                }
                            }

                        } else {
                            inEnterprise = enterprise;
                            break;
                        }
                        if (inOrganisation != null) {
                            break;
                        }
                    }
                    if (inEnterprise != null) {
                        break;
                    }
                }
            }
            if (userAccount == null) {
                JOptionPane.showMessageDialog(null, "Invalid user credentials,Try again!");
                return;
            } else {
                loginJPanel.setVisible(false);
                container.setVisible(true);
                leftPanel.setVisible(true);
                btnlogoff.setVisible(true);
                btngoback.setVisible(false);
                getusername.setText("");
                getpassword.setText("");
                changePanel1(userAccount);
            }
        }
           
    }//GEN-LAST:event_btnloginMousePressed

    private void btncancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMousePressed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        System.exit(0);
    }//GEN-LAST:event_btncancelMousePressed

    private void btnregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisterMousePressed
        // TODO add your handling code here:
        UserSignUpForm panel = new UserSignUpForm(container, system);
        lblwelcome.setText("Welcome to House Rental!");
        loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        btnlogoff.setVisible(false);
        btngoback.setVisible(true);
        getusername.setText("");
        getpassword.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnregisterMousePressed

    private void loginButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MousePressed
        // TODO add your handling code here:
        String userName = getusername.getText();
        char[] passwordCharArray = getpassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again");
        } else {
            userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
            inEnterprise = null;
            inOrganisation = null;
            networkEmergency = null;

            if (userAccount == null) {
                for (Network network : system.getNwkCatalog()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        networkEmergency = network;
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
                                userAccount = organisation.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganisation = organisation;
                                    networkEmergency = network;
                                    break;
                                }
                            }

                        } else {
                            inEnterprise = enterprise;
                            break;
                        }
                        if (inOrganisation != null) {
                            break;
                        }
                    }
                    if (inEnterprise != null) {
                        break;
                    }
                }
            }
            if (userAccount == null) {
                JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                return;
            } else {
                loginJPanel.setVisible(false);
                container.setVisible(true);
                leftPanel.setVisible(true);
                btnlogoff.setVisible(true);
                btngoback.setVisible(false);
                getusername.setText("");
                getpassword.setText("");
                changePanel1(userAccount);
            }
        }
           
    }//GEN-LAST:event_loginButton1MousePressed

    private void loginButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addimageicon;
    private javax.swing.JLabel btncancel;
    private javax.swing.JLabel btngoback;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel btnlogoff;
    private javax.swing.JLabel btnregister;
    private javax.swing.JPanel container;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JTextField getusername;
    private javax.swing.JLabel houserentaltitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblmainicon;
    private javax.swing.JLabel lbltagline;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton1;
    private javax.swing.JLabel loginButton2;
    private javax.swing.JPanel loginJPanel;
    // End of variables declaration//GEN-END:variables
}
