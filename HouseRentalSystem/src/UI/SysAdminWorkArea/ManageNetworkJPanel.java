/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nemod
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private final EcoSystem system;
    /**
     * Creates new form ManageEnterpriseAdminJPanel
     * @param system
     */
    public ManageNetworkJPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networktable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networktable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblmainicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblsubtitle = new javax.swing.JLabel();
        getstatename = new javax.swing.JTextField();
        btnSave = new javax.swing.JLabel();
        lblnetwork = new javax.swing.JLabel();
        lblsubicon = new javax.swing.JLabel();
        lblsubsubtitle = new javax.swing.JLabel();
        lblsubsubicon = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(44, 68, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networktable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        networktable.setForeground(new java.awt.Color(25, 56, 82));
        networktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networktable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(networktable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 790, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblmainicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblmainicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblmainicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        lblsubtitle.setBackground(new java.awt.Color(204, 204, 204));
        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblsubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsubtitle.setText("MANAGE NETWORK");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        getstatename.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        getstatename.setForeground(new java.awt.Color(25, 56, 82));
        getstatename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getstatenameActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 51));
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnSave.setText(" Save Network ");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
        });

        lblnetwork.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblnetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-address-16.png"))); // NOI18N
        lblnetwork.setText(" Network Name");

        lblsubicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exchange-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblsubicon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblnetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getstatename, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(354, 354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblsubicon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblsubtitle)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getstatename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1080, 300));

        lblsubsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblsubsubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblsubsubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsubsubtitle.setText("View Networks");
        jPanel5.add(lblsubsubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 330, 30));

        lblsubsubicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-administrative-tools-50.png"))); // NOI18N
        jPanel5.add(lblsubsubicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        // TODO add your handling code here:
        submitNetwork();
        
    }//GEN-LAST:event_btnSaveMousePressed

    private void submitNetwork(){
        String name = getstatename.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Network Name!");
            return;
        }
        if (system.checkUniqueNetwork(name)) {
            Network network = system.createAndAddNetwork();
            network.setName(name);
            JOptionPane.showMessageDialog(null, "Network Created Successfully");
            getstatename.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Network Already Exists");
        }
        populateNetworkTable();
    }
    private void getstatenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getstatenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getstatenameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSave;
    private javax.swing.JTextField getstatename;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmainicon;
    private javax.swing.JLabel lblnetwork;
    private javax.swing.JLabel lblsubicon;
    private javax.swing.JLabel lblsubsubicon;
    private javax.swing.JLabel lblsubsubtitle;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable networktable;
    // End of variables declaration//GEN-END:variables
}
