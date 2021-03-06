/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Query;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Stock extends javax.swing.JPanel {

    Controller controller;
    Query q = new Query();
    public Stock(Controller controller) {
        this.controller = controller;
        setBounds(0, 0, 800, 600);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        Choose = new javax.swing.JComboBox();
        Search = new javax.swing.JButton();
        gotoUp = new javax.swing.JButton();
        gotoAdd = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายการสินค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        stockTable.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสินค้า", "ประเภทสินค้า ", "ชื่อสินค้า ", "สี ", "ราคา ", "หน่วย ", "จำนวนคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.setRowHeight(20);
        stockTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                stockTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(stockTable);
        if (stockTable.getColumnModel().getColumnCount() > 0) {
            stockTable.getColumnModel().getColumn(0).setResizable(false);
            stockTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            stockTable.getColumnModel().getColumn(1).setResizable(false);
            stockTable.getColumnModel().getColumn(2).setResizable(false);
            stockTable.getColumnModel().getColumn(3).setResizable(false);
            stockTable.getColumnModel().getColumn(4).setResizable(false);
            stockTable.getColumnModel().getColumn(5).setResizable(false);
            stockTable.getColumnModel().getColumn(5).setPreferredWidth(20);
            stockTable.getColumnModel().getColumn(6).setResizable(false);
            stockTable.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        searchTxt.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        Choose.setBackground(new java.awt.Color(240, 240, 240));
        Choose.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        Choose.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รหัสสินค้า", "ประเภทสินค้า", "ชื่อสินค้า", "สี" }));

        Search.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        Search.setText("ค้นหา");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        gotoUp.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        gotoUp.setText("แก้ไข");
        gotoUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoUpActionPerformed(evt);
            }
        });

        gotoAdd.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        gotoAdd.setText("เพิ่มสินค้า");
        gotoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoAddActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("2005_iannnnnGMO", 0, 24)); // NOI18N
        Back.setText("<< ย้อนกลับ ");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Search)
                                .addGap(15, 15, 15)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gotoUp)
                        .addGap(25, 25, 25)
                        .addComponent(gotoAdd)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(gotoAdd)
                    .addComponent(gotoUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        controller.goToHome();
    }//GEN-LAST:event_BackActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String ch = Choose.getSelectedItem().toString();
        String temp = null;
        if(ch.equals("รหัสสินค้า")){
            temp = "product_id";
        }else if(ch.equals("ประเภทสินค้า")) {
            temp = "product_type";    
        }else if(ch.equals("ชื่อสินค้า")) {
            temp = "product_name";    
        }else if(ch.equals("สี")) {
            temp = "product_color";
        }
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        model.setRowCount(0); //Set new value
        ArrayList<String> s = q.searchProduct(temp, searchTxt.getText());
        for(int i=0;i < s.size();i+=7) {
            model.addRow(new Object[]
            {
                s.get(i),
                s.get(i+1),
                s.get(i+2),
                s.get(i+3),
                s.get(i+4) + " บาท",
                s.get(i+5),
                s.get(i+6)
            });
        }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void gotoUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoUpActionPerformed
        int row = stockTable.getSelectedRow();
        int column = 0;
        if(row == -1){
            JOptionPane.showMessageDialog(null,"กรุณาเลือกสินค้าที่คุณต้องการจะแก้ไข!");
        } else {
            controller.goToUpdate((String) stockTable.getValueAt(row, column));
        }
    }//GEN-LAST:event_gotoUpActionPerformed

    private void gotoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoAddActionPerformed
        controller.goToAddProduct();
    }//GEN-LAST:event_gotoAddActionPerformed

    private void stockTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_stockTableAncestorAdded
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        ArrayList<String> s = q.Products();
        for(int i=0;i < s.size();i+=7) {
            model.addRow(new Object[]
            {
                s.get(i),
                s.get(i+1),
                s.get(i+2),
                s.get(i+3),
                s.get(i+4) + " บาท",
                s.get(i+5),
                s.get(i+6)
            });
        }
    }//GEN-LAST:event_stockTableAncestorAdded

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String ch = Choose.getSelectedItem().toString();
        String temp = null;
        if(ch.equals("รหัสสินค้า")){
            temp = "product_id";
        }else if(ch.equals("ประเภทสินค้า")) {
            temp = "product_type";    
        }else if(ch.equals("ชื่อสินค้า")) {
            temp = "product_name";    
        }else if(ch.equals("สี")) {
            temp = "product_color";
        }
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        model.setRowCount(0); //Set new value
        ArrayList<String> s = q.searchProduct(temp, searchTxt.getText());
        for(int i=0;i < s.size();i+=7) {
            model.addRow(new Object[]
            {
                s.get(i),
                s.get(i+1),
                s.get(i+2),
                s.get(i+3),
                s.get(i+4) + " บาท",
                s.get(i+5),
                s.get(i+6)
            });
        }
    }//GEN-LAST:event_searchTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JComboBox Choose;
    private javax.swing.JButton Search;
    private javax.swing.JButton gotoAdd;
    private javax.swing.JButton gotoUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable stockTable;
    // End of variables declaration//GEN-END:variables
}
