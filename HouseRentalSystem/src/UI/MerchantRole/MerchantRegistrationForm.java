/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MerchantRole;

/**
 *
 * @author nemod
 */
 

import Business.Asset.Asset;
import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MoneyContractorEmployeeRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MerchantRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form MerchantRegistrationForm
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Asset asset;
    private AssetDirectory assetDirectory;
    private Network network;
    private Organisation organisation;
    private String imagePath;
    
    public MerchantRegistrationForm(JPanel userProcess, Organisation organisation, Network network, Enterprise enterprise, Asset asset, EcoSystem system, UserAccount useraccount) {
        initComponents();
         this.userProcessContainer = userProcess;
        this.useraccount = useraccount;
        this.system = system;
        this.asset = asset;
        this.assetDirectory = (system.getAssetDirectory()== null) ? new AssetDirectory() : system.getAssetDirectory();
        this.network = network;
        this.organisation = organisation;
        txtHouse.setText(asset.getAssetName());
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
        uploadlbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        lblhouse = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnloanrequires = new javax.swing.JCheckBox();
        fileNameLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        btnprevious = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblsubtitle = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        getcontactnumber = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        getmailid = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblzip = new javax.swing.JLabel();
        getzipcode = new javax.swing.JTextField();
        lblProfID = new javax.swing.JLabel();
        getidproof = new javax.swing.JTextField();
        btnidproofuppload = new javax.swing.JButton();
        documentimg = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(uploadlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 828, 288, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 779, -1, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 100, 50));

        lblhouse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblhouse.setForeground(new java.awt.Color(255, 255, 255));
        lblhouse.setText("HOUSE:");
        jPanel1.add(lblhouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, 27));

        txtHouse.setEnabled(false);
        jPanel1.add(txtHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 127, 27));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 514, 269, -1));

        btnloanrequires.setText("GET LOAN");
        btnloanrequires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloanrequiresActionPerformed(evt);
            }
        });
        jPanel1.add(btnloanrequires, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, 30));

        fileNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fileNameLabel.setForeground(new java.awt.Color(25, 56, 82));
        jPanel1.add(fileNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 270, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        btnprevious.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnprevious.setText("BACK");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(btnprevious)
                .addGap(191, 191, 191))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblsubtitle.setText("REGISTRATION FORM");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontactnumber.setText("Contact No:");

        getcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblemail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblemail.setText("Mail id");

        getmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladdress.setText("Address");

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzip.setText("Zipcode");

        getzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblProfID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblProfID.setText("ID Proof:");

        getidproof.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnidproofuppload.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnidproofuppload.setText("ID Proof Upload");
        btnidproofuppload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnidproofuppload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnidproofupploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(lblsubtitle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname)
                            .addComponent(lblcontactnumber)
                            .addComponent(lblemail)
                            .addComponent(lbladdress)
                            .addComponent(lblzip)
                            .addComponent(lblProfID))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getname, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(getcontactnumber)
                            .addComponent(getmailid)
                            .addComponent(getaddress)
                            .addComponent(getzipcode)
                            .addComponent(getidproof))
                        .addGap(52, 52, 52)
                        .addComponent(documentimg, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnidproofuppload)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontactnumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getcontactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemail)
                            .addComponent(getmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbladdress)
                            .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblzip)
                            .addComponent(getzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProfID)
                            .addComponent(getidproof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(documentimg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(btnidproofuppload, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnidproofupploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnidproofupploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
            String regex
                    = "([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(imagePath);
            if (!m.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter valid image file!");
                return;
            }
            fileNameLabel.setText(imagePath);
            viewImg(imagePath);
            JOptionPane.showMessageDialog(null, "Picture Uploaded Successfully");

        }
        
        
        
    }//GEN-LAST:event_btnidproofupploadActionPerformed

    public void viewImg(String imgPath) {
        documentimg.setIcon(ResizeImage(imgPath));
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
       String name = getname.getText();
        String contact = getcontactnumber.getText();
        String address = getaddress.getText();
        String zipcode = getzipcode.getText();
        String mailId = getmailid.getText();
        String nationalId = getidproof.getText();
        String idDoc = imagePath;
        Boolean appLoan = btnloanrequires.isSelected();

        if (name.isEmpty() || address.isEmpty() || contact.isEmpty() || zipcode.isEmpty() || nationalId.isEmpty() || mailId.isEmpty() || idDoc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the missing field to continue!");
        }else if(!system.isInt(getzipcode.getText()) || getzipcode.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        }else if(!system.checkValidPhoneFormat(getcontactnumber.getText())){
            return;
        }else if(!system.checkValidEmailFormat(getmailid.getText())){
            return;
        }else if(!system.checkIfEmailIsUnique(getmailid.getText(), useraccount.getUsername())){
            return;
        }else if(!system.checkIfPhoneIsUnique(getcontactnumber.getText(), useraccount.getUsername())){
            return;
        } else if (!system.isInt(getzipcode.getText()) || getzipcode.getText().length() != 5) {
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        } else {
            useraccount.setName(name);
            useraccount.setContactnumber(contact);
            useraccount.setMailId(mailId);
            useraccount.setAddress(address);
            useraccount.setZip(zipcode);
            useraccount.setNationId(nationalId);
            useraccount.setIdDoc(idDoc);
            ArrayList<UserAccount> registeredCust = asset.getRegisteredCustomer();
            registeredCust.add(useraccount);
            asset.setRegisteredCustomer(registeredCust);
            if (appLoan) {
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organisation org : e.getOrganisationDirectory().getOrganisationList()) {
                        if (org.getType() == Organisation.Type.MoneyContractor) {
                            MoneyContractorEmployeeRequest mce = new MoneyContractorEmployeeRequest();
                            mce.setRequestID();
                            mce.setCustomer(useraccount);
                            mce.setMerchant(asset.getMerchant());
                            mce.setStatus("Pending");
                            mce.setAsset(asset);
                            e.getWorkQueue().getWrkReqList().add(mce);
                            JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Thank you for submitting the form!");
        }
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnloanrequiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanrequiresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloanrequiresActionPerformed

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(documentimg.getWidth(), documentimg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnidproofuppload;
    private javax.swing.JCheckBox btnloanrequires;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel documentimg;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getcontactnumber;
    private javax.swing.JTextField getidproof;
    private javax.swing.JTextField getmailid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getzipcode;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblProfID;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblhouse;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzip;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JLabel uploadlbl;
    // End of variables declaration//GEN-END:variables
}
