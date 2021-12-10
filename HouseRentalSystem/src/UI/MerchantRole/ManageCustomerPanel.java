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
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerPanel
     */
    public ManageCustomerPanel() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnprevious = new javax.swing.JButton();
        lblsubtitle = new javax.swing.JLabel();
        btnAddBuyer = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customertable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Given_id", "Name", "Contact number", "Mailid", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customertable.setShowGrid(true);
        jScrollPane1.setViewportView(customertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 660, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(792, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        btnprevious.setBackground(new java.awt.Color(102, 102, 102));
        btnprevious.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnprevious.setText("BACK");
        btnprevious.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblsubtitle.setText("POTENTIAL CUSTOMER PAGE");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnAddBuyer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddBuyer.setText("SELL PROPERTIES");
        btnAddBuyer.setBorder(new javax.swing.border.MatteBorder(null));
        btnAddBuyer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBuyerActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnView.setText("VIEW CUSTOMERS");
        btnView.setBorder(new javax.swing.border.MatteBorder(null));
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(lblsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnAddBuyer)
                .addGap(181, 181, 181)
                .addComponent(btnView)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblsubtitle)))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBuyer)
                    .addComponent(btnView))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 920, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBuyerActionPerformed
       
    }//GEN-LAST:event_btnAddBuyerActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnpreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBuyer;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnprevious;
    private javax.swing.JTable customertable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}
