/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

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
public class CustomerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation organisation;

     public CustomerWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        //this.userProcessContainer = userProcessContainer;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageAdvertise();

    }

    private void manageAdvertise() {
        CustomerScreenPanel customerScreenPanel = new CustomerScreenPanel(rightWorkAreaPanel, account, enterprise, system, network, organisation);
        rightWorkAreaPanel.add("viewJobsJPanel", customerScreenPanel);
        CardLayout layout = (CardLayout) rightWorkAreaPanel.getLayout();
        layout.next(rightWorkAreaPanel);
    }

    private void manageBuyers() {
        DisplayJobsInfoPanel displayJobsInfoPanel = new DisplayJobsInfoPanel(rightWorkAreaPanel, account, enterprise, system, network, organisation);
        rightWorkAreaPanel.add("DisplayJobsInfoPanel", displayJobsInfoPanel);
        CardLayout layout = (CardLayout) rightWorkAreaPanel.getLayout();
        layout.next(rightWorkAreaPanel);
    }
    
    private void manageProfile() {
        ControlCustomerPanel controlCustomerPanel = new ControlCustomerPanel(userProcessContainer, system, account);
        rightWorkAreaPanel.add("ControlCustomerPanel", controlCustomerPanel);
        CardLayout layout = (CardLayout) rightWorkAreaPanel.getLayout();
        layout.next(rightWorkAreaPanel);
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
        WorkAreaPanel = new javax.swing.JPanel();
        leftworkAreaPanel = new javax.swing.JPanel();
        manageOrganizationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbladvertisements = new javax.swing.JLabel();
        jobstatuspanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbljobstatus = new javax.swing.JLabel();
        lblcustomer = new javax.swing.JLabel();
        advertisementpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        manageEmployeeLabel1 = new javax.swing.JLabel();
        profilepanel = new javax.swing.JPanel();
        lblprofile = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rightWorkAreaPanel = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        WorkAreaPanel.setBackground(new java.awt.Color(241, 241, 242));
        WorkAreaPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        leftworkAreaPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftworkAreaPanel.setMinimumSize(new java.awt.Dimension(280, 840));
        leftworkAreaPanel.setPreferredSize(new java.awt.Dimension(280, 840));
        leftworkAreaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganizationPanel.setToolTipText("");
        manageOrganizationPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationPanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");

        lbladvertisements.setBackground(new java.awt.Color(255, 255, 255));
        lbladvertisements.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbladvertisements.setText("DISPLAY ADVERTISEMENT");
        lbladvertisements.setAutoscrolls(true);
        lbladvertisements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbladvertisements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbladvertisementsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrganizationPanelLayout = new javax.swing.GroupLayout(manageOrganizationPanel);
        manageOrganizationPanel.setLayout(manageOrganizationPanelLayout);
        manageOrganizationPanelLayout.setHorizontalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbladvertisements, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        manageOrganizationPanelLayout.setVerticalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbladvertisements, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        leftworkAreaPanel.add(manageOrganizationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        jobstatuspanel.setBackground(new java.awt.Color(255, 255, 255));
        jobstatuspanel.setToolTipText("");
        jobstatuspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jobstatuspanel.setPreferredSize(new java.awt.Dimension(264, 48));
        jobstatuspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jobstatuspanelMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 213, 90));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbljobstatus.setBackground(new java.awt.Color(255, 255, 255));
        lbljobstatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbljobstatus.setText("DISPLAY JOB STATUS");
        lbljobstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbljobstatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbljobstatusMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jobstatuspanelLayout = new javax.swing.GroupLayout(jobstatuspanel);
        jobstatuspanel.setLayout(jobstatuspanelLayout);
        jobstatuspanelLayout.setHorizontalGroup(
            jobstatuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobstatuspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbljobstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jobstatuspanelLayout.setVerticalGroup(
            jobstatuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(jobstatuspanelLayout.createSequentialGroup()
                .addComponent(lbljobstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftworkAreaPanel.add(jobstatuspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        lblcustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcustomer.setText("CUSTOMER WORK AREA PANEL");
        lblcustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leftworkAreaPanel.add(lblcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        advertisementpanel.setBackground(new java.awt.Color(255, 213, 90));
        advertisementpanel.setToolTipText("");
        advertisementpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                advertisementpanelMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(215, 81, 81));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setToolTipText("");

        manageEmployeeLabel1.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeeLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeLabel1.setText("Manage Profile");
        manageEmployeeLabel1.setAutoscrolls(true);
        manageEmployeeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout advertisementpanelLayout = new javax.swing.GroupLayout(advertisementpanel);
        advertisementpanel.setLayout(advertisementpanelLayout);
        advertisementpanelLayout.setHorizontalGroup(
            advertisementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advertisementpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        advertisementpanelLayout.setVerticalGroup(
            advertisementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, advertisementpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(advertisementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEmployeeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        leftworkAreaPanel.add(advertisementpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        profilepanel.setBackground(new java.awt.Color(255, 255, 255));
        profilepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profilepanelMousePressed(evt);
            }
        });

        lblprofile.setBackground(new java.awt.Color(255, 255, 255));
        lblprofile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblprofile.setText("MANAGE PROFILE");
        lblprofile.setPreferredSize(new java.awt.Dimension(115, 16));
        lblprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblprofileMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 213, 90));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout profilepanelLayout = new javax.swing.GroupLayout(profilepanel);
        profilepanel.setLayout(profilepanelLayout);
        profilepanelLayout.setHorizontalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addGroup(profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(profilepanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        profilepanelLayout.setVerticalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addComponent(lblprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        leftworkAreaPanel.add(profilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 60));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator1.setFocusCycleRoot(true);
        leftworkAreaPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 9));

        rightWorkAreaPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightWorkAreaPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightWorkAreaPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout WorkAreaPanelLayout = new javax.swing.GroupLayout(WorkAreaPanel);
        WorkAreaPanel.setLayout(WorkAreaPanelLayout);
        WorkAreaPanelLayout.setHorizontalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaPanelLayout.createSequentialGroup()
                .addComponent(leftworkAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightWorkAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WorkAreaPanelLayout.setVerticalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightWorkAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(WorkAreaPanelLayout.createSequentialGroup()
                .addComponent(leftworkAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(WorkAreaPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1433, Short.MAX_VALUE)
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

    private void lbladvertisementsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladvertisementsMousePressed
        manageAdvertise();
    }//GEN-LAST:event_lbladvertisementsMousePressed

    private void manageOrganizationPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationPanelMousePressed
        manageAdvertise();
    }//GEN-LAST:event_manageOrganizationPanelMousePressed

    private void lbljobstatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljobstatusMousePressed
        manageBuyers();
    }//GEN-LAST:event_lbljobstatusMousePressed

    private void jobstatuspanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobstatuspanelMousePressed
        // TODO add your handling code here:
        manageBuyers();
    }//GEN-LAST:event_jobstatuspanelMousePressed

    private void manageEmployeeLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabel1MousePressed
        // TODO add your handling code here:
        manageBuyers();
    }//GEN-LAST:event_manageEmployeeLabel1MousePressed

    private void advertisementpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advertisementpanelMousePressed
        // TODO add your handling code here:
        manageAdvertise();
    }//GEN-LAST:event_advertisementpanelMousePressed

    private void lblprofileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblprofileMousePressed
        // TODO add your handling code here:
       manageProfile();
    }//GEN-LAST:event_lblprofileMousePressed

    private void profilepanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilepanelMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_profilepanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WorkAreaPanel;
    private javax.swing.JPanel advertisementpanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jobstatuspanel;
    private javax.swing.JLabel lbladvertisements;
    private javax.swing.JLabel lblcustomer;
    private javax.swing.JLabel lbljobstatus;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JPanel leftworkAreaPanel;
    private javax.swing.JLabel manageEmployeeLabel1;
    private javax.swing.JPanel manageOrganizationPanel;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JPanel rightWorkAreaPanel;
    // End of variables declaration//GEN-END:variables
}
