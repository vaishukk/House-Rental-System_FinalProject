/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.Asset;
import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sanik
 */
public class DisplayHouseInfoPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AssetDirectory assetDirectory;
    private Asset asset;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;
    /**
     * Creates new form DisplayHouseInfoPanel
     * @param userProcessContainer
     * @param property
     * @param propertyDirectory
     * @param system
     * @param userAccount
     */
    
    
    public DisplayHouseInfoPanel(JPanel userProcessContainer, Asset asset, AssetDirectory assetDirectory, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.asset = asset;
        this.assetDirectory = assetDirectory;
        this.userAccount = userAccount;
        this.system = system;

        populateReqTable();
        
    }
    
    private void populateReqTable() {
        getbedrooms.setText(asset.getAssetName());
        getcity.setText(asset.getCity());
        getaddress.setText(asset.getAddress());
        getzip.setText(asset.getZip());
        getstate.setText(asset.getState());
        getrate.setText(Double.toString(asset.getCost()));
        getbedrooms.setText(Integer.toString(asset.getBedroom()));
        getbaths.setText(Double.toString(asset.getBaths()));
        String imgIcon = asset.getHomeImg();
        lblphoto.setIcon(ResizeImg(imgIcon));
    }
    
    public ImageIcon ResizeImg(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(460, 280, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblbaths = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        getzip = new javax.swing.JTextField();
        getaddress = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        lblhouse = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        getbedrooms = new javax.swing.JTextField();
        lblpic = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        getname1 = new javax.swing.JTextField();
        getrate = new javax.swing.JTextField();
        getbaths = new javax.swing.JTextField();
        lblzip1 = new javax.swing.JLabel();
        lblrent = new javax.swing.JLabel();
        lblbhk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 718, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbltitle))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 70));

        jPanel2.setBackground(new java.awt.Color(241, 241, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbaths.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblbaths.setText("Bedrooms");
        jPanel2.add(lblbaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbladdress.setText("Address");
        jPanel2.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        getzip.setEnabled(false);
        jPanel2.add(getzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        getaddress.setEnabled(false);
        jPanel2.add(getaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 160, -1));

        lblcity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(0, 0, 51));
        lblcity.setText("City");
        jPanel2.add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 30, -1));

        getcity.setEnabled(false);
        jPanel2.add(getcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 160, -1));

        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblstate.setText("State");
        jPanel2.add(lblstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        getstate.setEnabled(false);
        jPanel2.add(getstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 160, -1));

        lblhouse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblhouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhouse.setText("HOUSE DETAILS");
        lblhouse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblhouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 190, -1));

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setText("Name");
        jPanel2.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        getbedrooms.setEnabled(false);
        getbedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getbedroomsActionPerformed(evt);
            }
        });
        jPanel2.add(getbedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, -1));

        lblpic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpic.setText("Photo");
        jPanel2.add(lblpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        jPanel2.add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 270, 190));

        getname1.setEnabled(false);
        getname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getname1ActionPerformed(evt);
            }
        });
        jPanel2.add(getname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));

        getrate.setEnabled(false);
        getrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getrateActionPerformed(evt);
            }
        });
        jPanel2.add(getrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, -1));

        getbaths.setEnabled(false);
        getbaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getbathsActionPerformed(evt);
            }
        });
        jPanel2.add(getbaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, -1));

        lblzip1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblzip1.setText("Zipcode");
        jPanel2.add(lblzip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblrent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblrent.setText("Rent");
        jPanel2.add(lblrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        lblbhk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblbhk.setText("Baths");
        jPanel2.add(lblbhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-house-48 (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void getbedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getbedroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getbedroomsActionPerformed

    private void getname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getname1ActionPerformed

    private void getrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getrateActionPerformed

    private void getbathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getbathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getbathsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getbaths;
    private javax.swing.JTextField getbedrooms;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getname1;
    private javax.swing.JTextField getrate;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getzip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblbaths;
    private javax.swing.JLabel lblbhk;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblhouse;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblpic;
    private javax.swing.JLabel lblrent;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzip1;
    // End of variables declaration//GEN-END:variables
}
