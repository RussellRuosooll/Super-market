/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aroosh
 */
public class BillingPoint extends javax.swing.JFrame {

    Connection con = null;
    Statement stmnt = null;
    ResultSet rs = null;
    DefaultTableModel model1;
    PreparedStatement pstmt;
    int lastId;
    Object[] data;

    public BillingPoint() {
        initComponents();
        selectProduct();
        getComp();
    }

    private void selectProduct() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT * from productstbl ");
            productTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }
    public void getComp() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();

            rs = stmnt.executeQuery("SELECT * from categorytbl ");
            productTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        prodAddBtn = new javax.swing.JButton();
        prodDellBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        billingId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cateCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        billArea = new javax.swing.JTextArea();
        prodName = new javax.swing.JTextField();
        grandlbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Billing  ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        quantity.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        quantity.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 30));

        print.setBackground(new java.awt.Color(51, 0, 102));
        print.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.setBorderPainted(false);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, 34));

        clearBtn.setBackground(new java.awt.Color(51, 0, 102));
        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.setBorderPainted(false);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, 34));

        prodAddBtn.setBackground(new java.awt.Color(51, 0, 102));
        prodAddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        prodAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        prodAddBtn.setText("Add to Bill");
        prodAddBtn.setBorderPainted(false);
        prodAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodAddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(prodAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, 34));

        prodDellBtn.setBackground(new java.awt.Color(51, 0, 102));
        prodDellBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        prodDellBtn.setForeground(new java.awt.Color(255, 255, 255));
        prodDellBtn.setText("Delete");
        prodDellBtn.setBorderPainted(false);
        prodDellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodDellBtnActionPerformed(evt);
            }
        });
        jPanel2.add(prodDellBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("PRODUCTS LIST");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        productTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "Quantity", "Price", "Category"
            }
        ));
        productTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        productTable.setRowHeight(25);
        productTable.setSelectionBackground(new java.awt.Color(51, 0, 102));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 400, 158));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Category");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        billingId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        billingId.setForeground(new java.awt.Color(51, 0, 102));
        billingId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                billingIdKeyTyped(evt);
            }
        });
        jPanel2.add(billingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Quantity");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 850, -1));

        cateCombo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel2.add(cateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 200, 30));

        billArea.setColumns(20);
        billArea.setRows(5);
        jScrollPane2.setViewportView(billArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 650, 240));

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodName.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(prodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));

        grandlbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        grandlbl.setForeground(new java.awt.Color(51, 0, 102));
        grandlbl.setText("Taka");
        jPanel2.add(grandlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("BILLLING POINT");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("BILLLING POINT");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 830, 640));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 16, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOGOUT");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            billArea.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        billingId.setText("");
        prodName.setText("");
        quantity.setText("");


    }//GEN-LAST:event_clearBtnActionPerformed
    int i = 0;
    private void prodAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodAddBtnMouseClicked

        if (quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name Missing");
        } else if (quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity Missing");
        }else if (available <=Integer.valueOf(quantity.getText())){
        JOptionPane.showMessageDialog(this, "Not Enough in Stock");
        } else {
            i++;
            totalPrice = uPrice * Integer.valueOf(quantity.getText());
            grandTotal += totalPrice; 
            if (i == 1) {
                billArea.setText(billArea.getText() + "              ====================EXTRA CARE SUPERMARKET====================\n" + "\t     NUM    PRODUCT    UNIT PRICE    QUANTITY    TOTAL\n\t     " + i + "            " + prodName.getText() + "                      " + uPrice
                        + "                    " + quantity.getText() + "             " + totalPrice + "\n\t");
            } else {
                billArea.setText(billArea.getText() + "     " + i + "            " + prodName.getText() + "                      " + uPrice
                        + "                    " + quantity.getText() + "             " + totalPrice + "\n");
            }
            grandlbl.setText("Taka "+ grandTotal);

        }
    }//GEN-LAST:event_prodAddBtnMouseClicked

    private void prodDellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodDellBtnActionPerformed

    }//GEN-LAST:event_prodDellBtnActionPerformed
    int uPrice, totalPrice=0, available, grandTotal=0;
    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        model1 = (DefaultTableModel) productTable.getModel();
        int myIndex = productTable.getSelectedRow();
        available = Integer.valueOf(model1.getValueAt(myIndex, 2).toString());
            
        prodName.setText(model1.getValueAt(myIndex, 1).toString());
        quantity.setText(model1.getValueAt(myIndex, 2).toString());
        uPrice = Integer.valueOf(model1.getValueAt(myIndex, 3).toString());

        

//        quantity.setText(model1.getValueAt(myIndex, 2).toString());
//        price.setText(model1.getValueAt(myIndex, 3).toString());
//        cateCombo.setSelectedItem(model1.getValueAt(myIndex, 4).toString());

    }//GEN-LAST:event_productTableMouseClicked

    private void billingIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billingIdKeyTyped
        Pattern ptrnId = Pattern.compile("^\\d{2,8}$");
        Matcher okayId = ptrnId.matcher(billingId.getText());
        if (okayId.matches()) {
            billingId.setBackground(Color.white);
        } else {
            billingId.setBackground(Color.orange);
        }
    }//GEN-LAST:event_billingIdKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingPoint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billArea;
    private javax.swing.JTextField billingId;
    private javax.swing.JComboBox<String> cateCombo;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel grandlbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton print;
    private javax.swing.JButton prodAddBtn;
    private javax.swing.JButton prodDellBtn;
    private javax.swing.JTextField prodName;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
