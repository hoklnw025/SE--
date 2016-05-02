package View;

import Controller.Controller;
import Model.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddCustomer extends javax.swing.JPanel {
    
    Controller controller;
    Query Q = new Query();

    public AddCustomer(Controller controller) {
        this.controller = controller;
        initComponents();
        setBounds(0, 0, 800, 600);
        Fname.setText("");
        Lname.setText("");
        SocialNo.setText("");
        txtTelephoneNo.setText("");
        txtAddress.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        emptyPanel = new javax.swing.JPanel();
        lblSocialNo = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTelephoneNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        SocialNo = new javax.swing.JTextField();
        txtTelephoneNo = new javax.swing.JTextField();
        scrollPaneForTxtAddress = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        chooseSex = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));

        emptyPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblSocialNo.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblSocialNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSocialNo.setText("เลขประจำตัวประชาชน");

        lblFirstName.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblFirstName.setText("ชื่อ");

        lblLastName.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblLastName.setText("นามสกุล");

        lblGender.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblGender.setText("เพศ");

        lblTelephoneNo.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblTelephoneNo.setText("เบอร์โทร");

        lblAddress.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        lblAddress.setText("ที่อยู่");

        Fname.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N

        Lname.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N

        SocialNo.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N

        txtTelephoneNo.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        txtAddress.setRows(5);
        scrollPaneForTxtAddress.setViewportView(txtAddress);

        btnConfirm.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        btnConfirm.setText("ยืนยัน");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        btnCancel.setText("<< ย้อนกลับ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        chooseSex.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        chooseSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ชาย", "หญิง" }));

        javax.swing.GroupLayout emptyPanelLayout = new javax.swing.GroupLayout(emptyPanel);
        emptyPanel.setLayout(emptyPanelLayout);
        emptyPanelLayout.setHorizontalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emptyPanelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress)
                            .addComponent(lblTelephoneNo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emptyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSocialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SocialNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addComponent(Lname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fname, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelephoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneForTxtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .addComponent(chooseSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm)
                .addGap(25, 25, 25))
        );
        emptyPanelLayout.setVerticalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SocialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSocialNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(chooseSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelephoneNo)
                    .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(scrollPaneForTxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        chooseSex.getAccessibleContext().setAccessibleName("chooseSex");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("เพิ่มลูกค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emptyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(emptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String socialNo = SocialNo.getText();
        String firstName = Fname.getText();
        String lastName = Lname.getText();
        String telephoneNo = txtTelephoneNo.getText();
        String address = txtAddress.getText();
        String sex = chooseSex.getSelectedItem().toString();
        if(socialNo.length()==0||firstName.length()==0||lastName.length()==0||telephoneNo.length()==0||address.length()==0) {
            JOptionPane.showMessageDialog(null,"กรุณากรอกข้อมูลให้ครบด้วย!");
        }
        else if(socialNo.length()==13) {
            if(firstName.length()<=50||lastName.length()<=50) {
                if(telephoneNo.length()==10){
                    Q.InsertCustomer(socialNo, firstName, lastName, sex , telephoneNo, address);
                    JOptionPane.showMessageDialog(null,"เรียบร้อยแล้วครับ/ค่ะ!");
                    controller.goToHome();
                }else{JOptionPane.showMessageDialog(null,"คุณกรอกเบอร์ไม่ถูกต้อง!");}
            }else{JOptionPane.showMessageDialog(null,"คุณกรอกชื่อยาวเกินกว่า 50 ตัวอักษร!");}
        }else{JOptionPane.showMessageDialog(null,"คุณกรอกบัตรประชาชนไม่ถูกต้อง!");}        
        //controller.btnConfirmOnAddCustomer(socialNo, firstName, lastName, gender, telephoneNo, address);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.goToHome();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField SocialNo;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JComboBox<String> chooseSex;
    private javax.swing.JPanel emptyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSocialNo;
    private javax.swing.JLabel lblTelephoneNo;
    private javax.swing.JScrollPane scrollPaneForTxtAddress;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtTelephoneNo;
    // End of variables declaration//GEN-END:variables
}
