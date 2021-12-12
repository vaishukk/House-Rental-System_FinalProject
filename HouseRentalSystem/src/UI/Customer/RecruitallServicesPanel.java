/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.Asset;
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
public class RecruitallServicesPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecruitallServices
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Asset asset;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;

    public RecruitallServicesPanel(JPanel userProcessContainer, Organisation organisation, Network network, Enterprise enterprise, Asset asset, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        this.asset = asset;
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
        btnBack1 = new javax.swing.JButton();
        lblservicemanagement = new javax.swing.JLabel();
        hireRepairServices = new javax.swing.JButton();
        recruitConstructor = new javax.swing.JButton();
        recruitExaminer = new javax.swing.JButton();
        recruitBroker = new javax.swing.JButton();
        recruitMovPac = new javax.swing.JButton();
        recruitAssetManager = new javax.swing.JButton();
        recruitCameraMan = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 242));

        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        lblservicemanagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblservicemanagement.setText("SERVICE MANAGEMENT");
        lblservicemanagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hireRepairServices.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hireRepairServices.setText("RECRUIT REPAIR SERVICE");
        hireRepairServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireRepairServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireRepairServicesActionPerformed(evt);
            }
        });

        recruitConstructor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recruitConstructor.setText("RECRUIT CONSTRUCTOR");
        recruitConstructor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitConstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitConstructorActionPerformed(evt);
            }
        });

        recruitExaminer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recruitExaminer.setText("RECRUIT EXAMINER");
        recruitExaminer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitExaminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitExaminerActionPerformed(evt);
            }
        });

        recruitBroker.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recruitBroker.setText("RECRUIT BROKER");
        recruitBroker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitBroker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitBrokerActionPerformed(evt);
            }
        });

        recruitMovPac.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        recruitMovPac.setText("RECRUIT MOVERS AND PACKERS");
        recruitMovPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitMovPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitMovPacActionPerformed(evt);
            }
        });

        recruitAssetManager.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        recruitAssetManager.setForeground(new java.awt.Color(0, 0, 51));
        recruitAssetManager.setText("RECRUIT ASSET MANAGER");
        recruitAssetManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitAssetManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitAssetManagerActionPerformed(evt);
            }
        });

        recruitCameraMan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recruitCameraMan.setText("RECRUIT CAMERAMAN ");
        recruitCameraMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitCameraMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitCameraManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblservicemanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(recruitAssetManager, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(hireRepairServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recruitConstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recruitCameraMan))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recruitExaminer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recruitMovPac))
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(recruitBroker, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblservicemanagement))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireRepairServices)
                    .addComponent(recruitConstructor)
                    .addComponent(recruitExaminer))
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recruitCameraMan)
                    .addComponent(recruitAssetManager)
                    .addComponent(recruitMovPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(recruitBroker)
                .addGap(62, 62, 62))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1280, 410));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbltitle)
                .addGap(669, 669, 669)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbltitle))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1278, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void recruitCameraManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitCameraManActionPerformed

        RecruitPhotographersPanel recruitPhotographersPanel = new RecruitPhotographersPanel(userProcessContainer, organisation, network, enterprise, asset, userAccount, system);
        userProcessContainer.add("RecruitPhotographersPanel", recruitPhotographersPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitCameraManActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void hireRepairServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireRepairServicesActionPerformed
        // TODO add your handling code here:
        RecruitRepairServicesPanel recruitRepairServicesPanel = new RecruitRepairServicesPanel(userProcessContainer, organisation, network, enterprise, asset, userAccount, system);
        userProcessContainer.add("RecruitRepairServicesPanel", recruitRepairServicesPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireRepairServicesActionPerformed

    private void recruitConstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitConstructorActionPerformed
        // TODO add your handling code here:
        RecruitConstructorPanel recruitConstructorPanel = new RecruitConstructorPanel(userProcessContainer, organisation, network, enterprise,asset, userAccount, system);
        userProcessContainer.add("RecruitConstructorPanel", recruitConstructorPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitConstructorActionPerformed

    private void recruitExaminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitExaminerActionPerformed
        // TODO add your handling code here:
        RecruitExaminerPanel recruitExaminerPanel = new RecruitExaminerPanel(userProcessContainer,organisation, network, enterprise, asset,userAccount, system);
        userProcessContainer.add("RecruitExaminerPanel", recruitExaminerPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitExaminerActionPerformed

    private void recruitBrokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitBrokerActionPerformed
        // TODO add your handling code here:
        RecruitBrokerPanel recruitBrokerPanel = new RecruitBrokerPanel(userProcessContainer, organisation, network, enterprise,asset, userAccount, system);
        userProcessContainer.add("RecruitBrokerPanel", recruitBrokerPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitBrokerActionPerformed

    private void recruitMovPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitMovPacActionPerformed
        // TODO add your handling code here:
        RecruitMoversandPackersPanel recruitMoversandPackersPanel = new RecruitMoversandPackersPanel(userProcessContainer, organisation, network, enterprise, asset, userAccount, system);
        userProcessContainer.add("RecruitMoversandPackersPanel", recruitMoversandPackersPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitMovPacActionPerformed

    private void recruitAssetManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitAssetManagerActionPerformed
         RecruitAssetManagerPanel recruitAssetManagerPanel = new RecruitAssetManagerPanel(userProcessContainer, organisation, network, enterprise, asset, userAccount, system);
        userProcessContainer.add("RecruitAssetManagerPanel", recruitAssetManagerPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_recruitAssetManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton hireRepairServices;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblservicemanagement;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JButton recruitAssetManager;
    private javax.swing.JButton recruitBroker;
    private javax.swing.JButton recruitCameraMan;
    private javax.swing.JButton recruitConstructor;
    private javax.swing.JButton recruitExaminer;
    private javax.swing.JButton recruitMovPac;
    // End of variables declaration//GEN-END:variables
}
