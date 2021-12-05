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

            greetings = greetings + " " + userAccount.getUsername();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganisation, inEnterprise, networkEmergency, system));

            greetingUserLabel.setText(greetings + " !!!");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        btnBackLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        houserentaltitle = new javax.swing.JLabel();
        lblmainicon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        getusername = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        getpassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JLabel();
        loginButton2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(41, 50, 80));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoutLabel.setText("LOGOUT");
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 70, 60));

        greetingUserLabel.setBackground(new java.awt.Color(255, 255, 255));
        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        greetingUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

        btnBackLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLabel.setText("BACK");
        btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 60, 60));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, -1));

        container.setBackground(new java.awt.Color(41, 50, 80));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1390, 1050));

        loginJPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(554, 840));

        jLabel2.setBackground(new java.awt.Color(255, 213, 90));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 840));

        houserentaltitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        houserentaltitle.setForeground(new java.awt.Color(41, 50, 80));
        houserentaltitle.setText("HOUSE RENTAL ");
        houserentaltitle.setBorder(new javax.swing.border.MatteBorder(null));

        lblmainicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N
        lblmainicon.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Helping you find the House of your Dreams!");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(houserentaltitle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houserentaltitle)
                    .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(getusername, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
                .addGap(0, 287, Short.MAX_VALUE)
                .addComponent(getpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        loginButton.setBackground(new java.awt.Color(255, 229, 180));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64 (2).png"))); // NOI18N
        loginButton.setText("USERNAME");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });

        cancelButton.setText("CANCEL");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLabelMousePressed
        // TODO add your handling code here:
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }//GEN-LAST:event_btnBackLabelMousePressed

    private void getusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getusernameActionPerformed

    private void getpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getpasswordActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
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
                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        networkEmergency = network;
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganisation = organization;
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
                btnLogoutLabel.setVisible(true);
                btnBackLabel.setVisible(false);
                getusername.setText("");
                getpassword.setText("");
                changePanel1(userAccount);
            }
        }
           
    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        // TODO add your handling code here:
        //UserRegistrationJPanel panel = new UserRegistrationJPanel(container, system);
        greetingUserLabel.setText("WELCOME TO NEW HOUSE RENTAL ORGANIZATION REGISTRATION!!!");
        loginJPanel.setVisible(false);
        container.setVisible(true);
        leftPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        btnBackLabel.setVisible(true);
        getusername.setText("");
        getpassword.setText("");
        //container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnRegisterMousePressed

    private void loginButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MousePressed
        // TODO add your handling code here:
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
    private javax.swing.JLabel btnBackLabel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JTextField getusername;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JLabel houserentaltitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblmainicon;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel loginButton1;
    private javax.swing.JLabel loginButton2;
    private javax.swing.JPanel loginJPanel;
    // End of variables declaration//GEN-END:variables
}
