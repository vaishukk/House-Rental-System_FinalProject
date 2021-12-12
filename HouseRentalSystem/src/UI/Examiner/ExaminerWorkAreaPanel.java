/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Examiner;

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
public class ExaminerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExaminerWorkAreaPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation organisation;
    public ExaminerWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageJobs();
    }

    private void manageJobs() {
        ViewExaminer viewExaminer = new ViewExaminer(rightworkareapanel, enterprise, account, system);
        rightworkareapanel.add("ViewExaminer", viewExaminer);
        CardLayout layout = (CardLayout) rightworkareapanel.getLayout();
        layout.next(rightworkareapanel);
    }

    private void manageProfile() {
        ExaminerProfile examinerProfile = new ExaminerProfile(rightworkareapanel, enterprise, account, system);
        rightworkareapanel.add("ExaminerProfile", examinerProfile);
        CardLayout layout = (CardLayout) rightworkareapanel.getLayout();
        layout.next(rightworkareapanel);
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
        workareapanel = new javax.swing.JPanel();
        leftworkareapanel = new javax.swing.JPanel();
        manageprofilepanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblprofile = new javax.swing.JLabel();
        managejobpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbljobs = new javax.swing.JLabel();
        lblexaminer = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightworkareapanel = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        workareapanel.setBackground(new java.awt.Color(241, 241, 242));
        workareapanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        leftworkareapanel.setBackground(new java.awt.Color(255, 255, 255));
        leftworkareapanel.setMinimumSize(new java.awt.Dimension(280, 840));
        leftworkareapanel.setPreferredSize(new java.awt.Dimension(280, 840));
        leftworkareapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageprofilepanel.setBackground(new java.awt.Color(255, 255, 255));
        manageprofilepanel.setToolTipText("");
        manageprofilepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageprofilepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageprofilepanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");

        lblprofile.setBackground(new java.awt.Color(255, 255, 255));
        lblprofile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblprofile.setText("Manage Profile");
        lblprofile.setAutoscrolls(true);
        lblprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblprofileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageprofilepanelLayout = new javax.swing.GroupLayout(manageprofilepanel);
        manageprofilepanel.setLayout(manageprofilepanelLayout);
        manageprofilepanelLayout.setHorizontalGroup(
            manageprofilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageprofilepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        manageprofilepanelLayout.setVerticalGroup(
            manageprofilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageprofilepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageprofilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        leftworkareapanel.add(manageprofilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        managejobpanel.setBackground(new java.awt.Color(255, 255, 255));
        managejobpanel.setToolTipText("");
        managejobpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managejobpanel.setPreferredSize(new java.awt.Dimension(264, 48));
        managejobpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managejobpanelMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbljobs.setBackground(new java.awt.Color(255, 255, 255));
        lbljobs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbljobs.setText("Manage Jobs");
        lbljobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbljobsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout managejobpanelLayout = new javax.swing.GroupLayout(managejobpanel);
        managejobpanel.setLayout(managejobpanelLayout);
        managejobpanelLayout.setHorizontalGroup(
            managejobpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managejobpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbljobs, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managejobpanelLayout.setVerticalGroup(
            managejobpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(managejobpanelLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(lbljobs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        leftworkareapanel.add(managejobpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        lblexaminer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblexaminer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexaminer.setText("EXAMINER WORK AREA");
        lblexaminer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leftworkareapanel.add(lblexaminer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        leftworkareapanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 20));

        rightworkareapanel.setBackground(new java.awt.Color(241, 241, 242));
        rightworkareapanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightworkareapanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout workareapanelLayout = new javax.swing.GroupLayout(workareapanel);
        workareapanel.setLayout(workareapanelLayout);
        workareapanelLayout.setHorizontalGroup(
            workareapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workareapanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(leftworkareapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightworkareapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        workareapanelLayout.setVerticalGroup(
            workareapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightworkareapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(workareapanelLayout.createSequentialGroup()
                .addComponent(leftworkareapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(workareapanel, java.awt.BorderLayout.CENTER);

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

    private void lblprofileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblprofileMousePressed
       manageProfile();
    }//GEN-LAST:event_lblprofileMousePressed

    private void manageprofilepanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageprofilepanelMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageprofilepanelMousePressed

    private void lbljobsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbljobsMousePressed
       manageJobs();
    }//GEN-LAST:event_lbljobsMousePressed

    private void managejobpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managejobpanelMousePressed
        // TODO add your handling code here:
        manageJobs();
    }//GEN-LAST:event_managejobpanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblexaminer;
    private javax.swing.JLabel lbljobs;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JPanel leftworkareapanel;
    private javax.swing.JPanel managejobpanel;
    private javax.swing.JPanel manageprofilepanel;
    private javax.swing.JPanel rightworkareapanel;
    private javax.swing.JPanel workareapanel;
    // End of variables declaration//GEN-END:variables
}
