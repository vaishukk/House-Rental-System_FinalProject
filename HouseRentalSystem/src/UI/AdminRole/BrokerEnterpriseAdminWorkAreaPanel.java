/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanik
 */
public class BrokerEnterpriseAdminWorkAreaPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation Organisation;

    /**
     * Creates new form BrokerEnterpriseAdminWork
     * @param userProcessContainer
     * @param account
     * @param Organisation
     * @param enterprise
     * @param business
     * @param network
     */
    public BrokerEnterpriseAdminWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation Organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.Organisation = Organisation;
        manageorganisation();
    }

    private void manageorganisation() {
        //BrokerEntManageOrganizationsJPanel bnmoj = new BrokerEntManageOrganizationsJPanel(enterprise.getOrganizationDirectory());
        //workPanel.add("BrokerEntManageOrganizationsJPanel", bnmoj);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.next(workPanel);
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
        systemAdminPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        manageOrgPanel = new javax.swing.JPanel();
        manageOrganization = new javax.swing.JLabel();
        manageEmployeeLabel = new javax.swing.JLabel();
        manageEmp = new javax.swing.JPanel();
        manageUserAcc = new javax.swing.JPanel();
        manageUserAccountLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageRequestPanel = new javax.swing.JPanel();
        manageRequestLabel = new javax.swing.JLabel();
        workPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(241, 241, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setMinimumSize(new java.awt.Dimension(280, 840));
        menuPanel.setPreferredSize(new java.awt.Dimension(280, 840));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrgPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageOrgPanel.setToolTipText("");
        manageOrgPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrgPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrgPanelMousePressed(evt);
            }
        });

        manageOrganization.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageOrganization.setText("Manage Organization");
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        manageEmployeeLabel.setBackground(new java.awt.Color(255, 255, 255));
        manageEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Employee");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrgPanelLayout = new javax.swing.GroupLayout(manageOrgPanel);
        manageOrgPanel.setLayout(manageOrgPanelLayout);
        manageOrgPanelLayout.setHorizontalGroup(
            manageOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrgPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(manageOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap())
        );
        manageOrgPanelLayout.setVerticalGroup(
            manageOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuPanel.add(manageOrgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageEmp.setBackground(new java.awt.Color(255, 255, 255));
        manageEmp.setToolTipText("");
        manageEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmp.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEmpLayout = new javax.swing.GroupLayout(manageEmp);
        manageEmp.setLayout(manageEmpLayout);
        manageEmpLayout.setHorizontalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        manageEmpLayout.setVerticalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menuPanel.add(manageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        manageUserAcc.setBackground(new java.awt.Color(255, 255, 255));
        manageUserAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccMousePressed(evt);
            }
        });

        manageUserAccountLabel.setBackground(new java.awt.Color(255, 255, 255));
        manageUserAccountLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageUserAccountLabel.setText("Manage User Account");
        manageUserAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAccountLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageUserAccLayout = new javax.swing.GroupLayout(manageUserAcc);
        manageUserAcc.setLayout(manageUserAccLayout);
        manageUserAccLayout.setHorizontalGroup(
            manageUserAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        manageUserAccLayout.setVerticalGroup(
            manageUserAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuPanel.add(manageUserAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BROKER ENTERPRISE ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 20));

        manageRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageRequestPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestPanelMousePressed(evt);
            }
        });

        manageRequestLabel.setBackground(new java.awt.Color(255, 255, 255));
        manageRequestLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageRequestLabel.setText("Manage Requests");
        manageRequestLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRequestLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageRequestPanelLayout = new javax.swing.GroupLayout(manageRequestPanel);
        manageRequestPanel.setLayout(manageRequestPanelLayout);
        manageRequestPanelLayout.setHorizontalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(manageRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        manageRequestPanelLayout.setVerticalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menuPanel.add(manageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 40));

        workPanel.setBackground(new java.awt.Color(241, 241, 242));
        workPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        workPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(systemAdminPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1338, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
       
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrgPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrgPanelMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_manageOrgPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
       
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmpMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageEmpMousePressed

    private void manageUserAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccMousePressed
       
    }//GEN-LAST:event_manageUserAccMousePressed

    private void manageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestPanelMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_manageRequestPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageEmp;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JPanel manageOrgPanel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JLabel manageRequestLabel;
    private javax.swing.JPanel manageRequestPanel;
    private javax.swing.JPanel manageUserAcc;
    private javax.swing.JLabel manageUserAccountLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
