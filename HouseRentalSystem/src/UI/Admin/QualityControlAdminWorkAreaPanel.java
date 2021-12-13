/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

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
    JPanel usrPrcCont;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount usrAcc;
    Organisation organisation;

    /**
     * Creates new form QualityControlAdminWorkAreaPanel
     */
    public QualityControlAdminWorkAreaPanel(JPanel usrPrcCont, UserAccount usrAcc, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.usrPrcCont = usrPrcCont;
        this.usrAcc = usrAcc;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageOrganisation();
    }
    
    private void manageOrganisation(){
        
        QualityControlEnterpriseManageOrganisation qualityControlEnterpriseManageOrganisation = new QualityControlEnterpriseManageOrganisation(rightpanel, enterprise.getOrganisationDirectory(),enterprise, network, system);
        rightpanel.add("QualityControlEnterpriseManageOrganisation", qualityControlEnterpriseManageOrganisation);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
     
    private void manageEmployee(){
        
        QualityControlEnterpriseManageEmployees qualityControlEnterpriseManageEmployees = new QualityControlEnterpriseManageEmployees(rightpanel, enterprise.getOrganisationDirectory());
        rightpanel.add("QualityControlEnterpriseManageEmployees", qualityControlEnterpriseManageEmployees);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    private void manageUsers(){
        
        QualityControlEnterpriseUseraccount qualityControlEnterpriseUseraccount = new QualityControlEnterpriseUseraccount(rightpanel, enterprise, system, organisation);
        rightpanel.add("QualityControlEnterpriseUseraccount", qualityControlEnterpriseUseraccount);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    private void manageDemands(){
        
        QualityControlEnterpriseWorkRequest qualityControlEnterpriseWorkRequest = new QualityControlEnterpriseWorkRequest(rightpanel, usrAcc, enterprise, network, system);
        rightpanel.add("QualityControlEnterpriseWorkRequest", qualityControlEnterpriseWorkRequest);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
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
        leftpanel = new javax.swing.JPanel();
        manageorgPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblmanageorg = new javax.swing.JLabel();
        manageempPanel = new javax.swing.JPanel();
        lblmanageemployee = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        manageuserPanel = new javax.swing.JPanel();
        lblmanageuser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblqualitycontrol = new javax.swing.JLabel();
        managedemandspanel = new javax.swing.JPanel();
        lblmanagedemands = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        leftpanel.setBackground(new java.awt.Color(255, 255, 255));
        leftpanel.setMinimumSize(new java.awt.Dimension(280, 840));
        leftpanel.setPreferredSize(new java.awt.Dimension(280, 840));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageorgPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageorgPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageorgPanel.setToolTipText("");
        manageorgPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageorgPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageorgPanelMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-organization-chart-people-48.png"))); // NOI18N

        lblmanageorg.setBackground(new java.awt.Color(215, 81, 81));
        lblmanageorg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmanageorg.setText("MANAGE ORGANIZATIONS");
        lblmanageorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanageorgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageorgPanelLayout = new javax.swing.GroupLayout(manageorgPanel);
        manageorgPanel.setLayout(manageorgPanelLayout);
        manageorgPanelLayout.setHorizontalGroup(
            manageorgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageorgPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageorgPanelLayout.setVerticalGroup(
            manageorgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageorgPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftpanel.add(manageorgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 70));

        manageempPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageempPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageempPanel.setToolTipText("");
        manageempPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageempPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageempPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageempPanelMousePressed(evt);
            }
        });

        lblmanageemployee.setBackground(new java.awt.Color(215, 81, 81));
        lblmanageemployee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmanageemployee.setText("MANAGE EMPLOYEE");
        lblmanageemployee.setAutoscrolls(true);
        lblmanageemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmanageemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanageemployeeMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout manageempPanelLayout = new javax.swing.GroupLayout(manageempPanel);
        manageempPanel.setLayout(manageempPanelLayout);
        manageempPanelLayout.setHorizontalGroup(
            manageempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageempPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblmanageemployee, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageempPanelLayout.setVerticalGroup(
            manageempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmanageemployee))
        );

        leftpanel.add(manageempPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 60));

        manageuserPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageuserPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageuserPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageuserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageuserPanelMousePressed(evt);
            }
        });

        lblmanageuser.setBackground(new java.awt.Color(215, 81, 81));
        lblmanageuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmanageuser.setText("MANAGE USER ");
        lblmanageuser.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-64.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout manageuserPanelLayout = new javax.swing.GroupLayout(manageuserPanel);
        manageuserPanel.setLayout(manageuserPanelLayout);
        manageuserPanelLayout.setHorizontalGroup(
            manageuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageuserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblmanageuser, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageuserPanelLayout.setVerticalGroup(
            manageuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageuserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanageuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageuserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 60));

        lblqualitycontrol.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblqualitycontrol.setText("QUALITY CONTROL PAGE");
        lblqualitycontrol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leftpanel.add(lblqualitycontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        managedemandspanel.setBackground(new java.awt.Color(255, 255, 255));
        managedemandspanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        managedemandspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managedemandspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managedemandspanelMousePressed(evt);
            }
        });

        lblmanagedemands.setBackground(new java.awt.Color(255, 213, 90));
        lblmanagedemands.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblmanagedemands.setText("MANAGE DEMANDS");
        lblmanagedemands.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-give-60.png"))); // NOI18N

        javax.swing.GroupLayout managedemandspanelLayout = new javax.swing.GroupLayout(managedemandspanel);
        managedemandspanel.setLayout(managedemandspanelLayout);
        managedemandspanelLayout.setHorizontalGroup(
            managedemandspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managedemandspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblmanagedemands, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managedemandspanelLayout.setVerticalGroup(
            managedemandspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managedemandspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagedemands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(managedemandspanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftpanel.add(managedemandspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 60));

        rightpanel.setBackground(new java.awt.Color(241, 241, 242));
        rightpanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightpanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void lblmanageorgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanageorgMousePressed
        manageOrganisation();
    }//GEN-LAST:event_lblmanageorgMousePressed

    private void manageorgPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageorgPanelMousePressed
        // TODO add your handling code here:
        manageOrganisation();
    }//GEN-LAST:event_manageorgPanelMousePressed

    private void lblmanageemployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanageemployeeMousePressed
        manageEmployee();
    }//GEN-LAST:event_lblmanageemployeeMousePressed

    private void manageempPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageempPanelMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageempPanelMousePressed

    private void manageuserPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserPanelMousePressed
         manageUsers();
    }//GEN-LAST:event_manageuserPanelMousePressed

    private void managedemandspanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managedemandspanelMousePressed
        // TODO add your handling code here:
        manageDemands();
    }//GEN-LAST:event_managedemandspanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblmanagedemands;
    private javax.swing.JLabel lblmanageemployee;
    private javax.swing.JLabel lblmanageorg;
    private javax.swing.JLabel lblmanageuser;
    private javax.swing.JLabel lblqualitycontrol;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JPanel managedemandspanel;
    private javax.swing.JPanel manageempPanel;
    private javax.swing.JPanel manageorgPanel;
    private javax.swing.JPanel manageuserPanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
