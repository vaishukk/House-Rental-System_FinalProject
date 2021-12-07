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
public class QualityControlAdminWorkAreaPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation organisation;

    /**
     * Creates new form QualityControlAdminWorkAreaPanel
     */
    public QualityControlAdminWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageOrganisation();
    }
    
    private void manageOrganisation(){
        
       // QualityAssuaranceEntManageOrganizationsJPanel pemoj = new QualityAssuaranceEntManageOrganizationsJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory(),enterprise, network, system);
        //rightSystemAdminPanel.add("QualityAssuaranceEntManageOrganizationsJPanel", pemoj);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
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
        jPanel3 = new javax.swing.JPanel();
        manageOrganizationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JLabel();
        manageEmployee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageEmployeeLabel = new javax.swing.JLabel();
        manageUserAccount = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageUserAccountLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageRequestPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        manageRequestLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganizationPanel.setToolTipText("");
        manageOrganizationPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationPanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");

        manageOrganization.setBackground(new java.awt.Color(215, 81, 81));
        manageOrganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageOrganization.setText("Manage Organization");
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrganizationPanelLayout = new javax.swing.GroupLayout(manageOrganizationPanel);
        manageOrganizationPanel.setLayout(manageOrganizationPanelLayout);
        manageOrganizationPanelLayout.setHorizontalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageOrganizationPanelLayout.setVerticalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageOrganizationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageEmployee.setBackground(new java.awt.Color(255, 255, 255));
        manageEmployee.setToolTipText("");
        manageEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployee.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(215, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageEmployeeLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Employee");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEmployeeLayout = new javax.swing.GroupLayout(manageEmployee);
        manageEmployee.setLayout(manageEmployeeLayout);
        manageEmployeeLayout.setHorizontalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEmployeeLayout.setVerticalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(manageEmployeeLayout.createSequentialGroup()
                        .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.add(manageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        manageUserAccount.setBackground(new java.awt.Color(255, 255, 255));
        manageUserAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccountMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(215, 81, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageUserAccountLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageUserAccountLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageUserAccountLabel.setText("Manage User Account");
        manageUserAccountLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageUserAccountLayout = new javax.swing.GroupLayout(manageUserAccount);
        manageUserAccount.setLayout(manageUserAccountLayout);
        manageUserAccountLayout.setHorizontalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        manageUserAccountLayout.setVerticalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("QUALITY CONTROL ENTERPRISE");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 370, 20));

        manageRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageRequestPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestPanelMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(215, 81, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manageRequestLabel.setBackground(new java.awt.Color(255, 213, 90));
        manageRequestLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageRequestLabel.setText("Manage Requests");
        manageRequestLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageRequestPanelLayout = new javax.swing.GroupLayout(manageRequestPanel);
        manageRequestPanel.setLayout(manageRequestPanelLayout);
        manageRequestPanelLayout.setHorizontalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageRequestPanelLayout.setVerticalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 40));

        rightSystemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        manageOrganisation();
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrganizationPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationPanelMousePressed
        // TODO add your handling code here:
        manageOrganisation();
    }//GEN-LAST:event_manageOrganizationPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
        
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageEmployeeMousePressed

    private void manageUserAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccountMousePressed
        
    }//GEN-LAST:event_manageUserAccountMousePressed

    private void manageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestPanelMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageRequestPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageEmployee;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JPanel manageOrganizationPanel;
    private javax.swing.JLabel manageRequestLabel;
    private javax.swing.JPanel manageRequestPanel;
    private javax.swing.JPanel manageUserAccount;
    private javax.swing.JLabel manageUserAccountLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
