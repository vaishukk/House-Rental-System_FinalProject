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
import Business.Organisation.Organisation.Type;
import Business.Organisation.OrganisationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class QualityControlEnterpriseManageOrganisation extends javax.swing.JPanel {

    /**
     * Creates new form QualityControlEnterpriseManageOrganisation
     */
    private OrganisationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private EcoSystem system;
    private int index = -1;
    
    public QualityControlEnterpriseManageOrganisation(JPanel userProcessContainer, OrganisationDirectory directory, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        PopulateTable();
        populateOrganizationtypeBox();
    }
    
     private void populateOrganizationtypeBox() {
        OrganizationtypeBox.removeAllItems();
        OrganizationtypeBox.addItem(Organisation.Type.CameraMan);
        OrganizationtypeBox.addItem(Organisation.Type.Examiner);
    }

    public void PopulateTable() {
        DefaultTableModel model = (DefaultTableModel) tblorganizations.getModel();

        model.setRowCount(0);

        for (Organisation organization : directory.getOrganisationList()) {
            {
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                model.addRow(row);
            }

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorganizations = new javax.swing.JTable();
        lblquality = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblorganization = new javax.swing.JLabel();
        OrganizationtypeBox = new javax.swing.JComboBox();
        lblorganizationname = new javax.swing.JLabel();
        lblorganizationtype = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        btnaddorganization = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblorganizations.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblorganizations.setForeground(new java.awt.Color(25, 56, 82));
        tblorganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorganizations.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblorganizations);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 595, 120));

        lblquality.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblquality.setForeground(new java.awt.Color(255, 255, 255));
        lblquality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquality.setText("QUALITY CONTROL ORGANIZATIONS");
        jPanel1.add(lblquality, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 310, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 920, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblorganization.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblorganization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblorganization.setText("CREATE ORGANIZATION");
        lblorganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OrganizationtypeBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        OrganizationtypeBox.setForeground(new java.awt.Color(25, 56, 82));

        lblorganizationname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblorganizationname.setText("Organization Name");

        lblorganizationtype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblorganizationtype.setText("Organization Type ");

        getname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        getname.setForeground(new java.awt.Color(25, 56, 82));

        btnaddorganization.setBackground(new java.awt.Color(255, 255, 255));
        btnaddorganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddorganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnaddorganization.setText("ADD ORGANIZATION");
        btnaddorganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddorganization.setContentAreaFilled(false);
        btnaddorganization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddorganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddorganizationActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-organization-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblorganizationname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblorganizationtype)
                                .addGap(91, 91, 91)
                                .addComponent(OrganizationtypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnaddorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblorganizationname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblorganizationtype))
                    .addComponent(OrganizationtypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnaddorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 920, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-organization-chart-people-48.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddorganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddorganizationActionPerformed

        Type type = (Type) OrganizationtypeBox.getSelectedItem();

        if ("".equals(getname.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        } else {
            Organisation organisation = directory.createOrganisation(type, getname.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            getname.setText("");
            PopulateTable();
        }
       
    }//GEN-LAST:event_btnaddorganizationActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrganizationtypeBox;
    private javax.swing.JButton btnaddorganization;
    private javax.swing.JButton btnlogout;
    private javax.swing.JTextField getname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblorganization;
    private javax.swing.JLabel lblorganizationname;
    private javax.swing.JLabel lblorganizationtype;
    private javax.swing.JLabel lblquality;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblorganizations;
    // End of variables declaration//GEN-END:variables
}
