/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ConstructorRole;

/**
 *
 * @author Kiran
 */
public class ViewOppurtunitiesPanell extends javax.swing.JPanel {

    /**
     * Creates new form ViewOppurtunitiesPanell
     */
    public ViewOppurtunitiesPanell() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        housingtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblmainicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnviewappointer = new javax.swing.JButton();
        btnviewmerchant = new javax.swing.JButton();
        btnselectjob = new javax.swing.JButton();
        btnjobcomplete = new javax.swing.JButton();
        btndecline = new javax.swing.JButton();
        lblquote = new javax.swing.JLabel();
        getquote = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblcomments = new javax.swing.JLabel();
        getcomments = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 287, -1, -1));

        housingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jobid", "Appointer", "Merchant", "Address", "City", "State", "Zipcode", "Availibilty", "Customer Message", "Constructer Message", "Quote", "Appointer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(housingtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 920, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 70));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btnviewappointer.setBackground(new java.awt.Color(241, 241, 242));
        btnviewappointer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnviewappointer.setText("VIEW APPOINTER");
        btnviewappointer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnviewappointer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnviewappointer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewappointerActionPerformed(evt);
            }
        });

        btnviewmerchant.setBackground(new java.awt.Color(241, 241, 242));
        btnviewmerchant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnviewmerchant.setText("VIEW MERCHANT");
        btnviewmerchant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnviewmerchant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnviewmerchant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewmerchantActionPerformed(evt);
            }
        });

        btnselectjob.setBackground(new java.awt.Color(241, 241, 242));
        btnselectjob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnselectjob.setText("SELECT JOB");
        btnselectjob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnselectjob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnselectjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectjobActionPerformed(evt);
            }
        });

        btnjobcomplete.setBackground(new java.awt.Color(241, 241, 242));
        btnjobcomplete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnjobcomplete.setText("JOB DONE");
        btnjobcomplete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnjobcomplete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnjobcomplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjobcompleteActionPerformed(evt);
            }
        });

        btndecline.setBackground(new java.awt.Color(241, 241, 242));
        btndecline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btndecline.setText("DECLINE");
        btndecline.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btndecline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeclineActionPerformed(evt);
            }
        });

        lblquote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblquote.setText("QUOTE:");

        getquote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getquoteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("CONSTRUCTER PAGE");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblcomments.setBackground(new java.awt.Color(241, 241, 242));
        lblcomments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcomments.setForeground(new java.awt.Color(41, 50, 80));
        lblcomments.setText("COMMENTS:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnviewappointer)
                                .addGap(369, 369, 369))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnselectjob, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndecline, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnviewmerchant, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(btnjobcomplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblquote, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getquote, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(lblcomments)
                        .addGap(18, 18, 18)
                        .addComponent(getcomments, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel3)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewappointer)
                    .addComponent(btnviewmerchant))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnselectjob)
                    .addComponent(btndecline)
                    .addComponent(btnjobcomplete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquote, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getquote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomments)
                    .addComponent(getcomments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1210, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnselectjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectjobActionPerformed
        
        
    }//GEN-LAST:event_btnselectjobActionPerformed

    private void btnjobcompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjobcompleteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnjobcompleteActionPerformed

    private void btnviewappointerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewappointerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnviewappointerActionPerformed

    private void getquoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getquoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getquoteActionPerformed

    private void btnviewmerchantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewmerchantActionPerformed
        
    }//GEN-LAST:event_btnviewmerchantActionPerformed

    private void btndeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeclineActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndecline;
    private javax.swing.JButton btnjobcomplete;
    private javax.swing.JButton btnselectjob;
    private javax.swing.JButton btnviewappointer;
    private javax.swing.JButton btnviewmerchant;
    private javax.swing.JTextField getcomments;
    private javax.swing.JTextField getquote;
    private javax.swing.JTable housingtable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcomments;
    private javax.swing.JLabel lblmainicon;
    private javax.swing.JLabel lblquote;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}