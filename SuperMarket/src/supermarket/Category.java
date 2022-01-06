/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aroosh
 */
public class Category extends javax.swing.JFrame {

    Connection con = null;
    Statement stmnt = null;
    ResultSet rs = null;
    DefaultTableModel model1;
    PreparedStatement pstmt;
    int lastId;


    public Category() {
        initComponents();
        selectCategory();
        getLastId();
    }

    private void selectCategory() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT * from categorytbl");
            categoryTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }
    private void getLastId() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT Max(id) from categorytbl ");
            if (rs.next()) {
                lastId = rs.getInt(1);
                lastId++;
                cateIdField.setText(Integer.toString(lastId));
            }

        } catch (SQLException e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cateIdField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cateDescField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cateNameField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("MANAGE CATEGORIES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 12, -1, -1));

        cateIdField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cateIdField.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(cateIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 77, 193, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("CATEGORIES ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("DESCRIPTION");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 146, -1, -1));

        cateDescField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cateDescField.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(cateDescField, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 141, 193, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("NAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        cateNameField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cateNameField.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(cateNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 77, 193, 30));

        updateBtn.setBackground(new java.awt.Color(51, 0, 102));
        updateBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(null);
        updateBtn.setBorderPainted(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 232, 93, 34));

        clearBtn.setBackground(new java.awt.Color(51, 0, 102));
        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.setBorder(null);
        clearBtn.setBorderPainted(false);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 232, 75, 34));

        addBtn.setBackground(new java.awt.Color(51, 0, 102));
        addBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setBorder(null);
        addBtn.setBorderPainted(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 232, 75, 34));

        deleteBtn.setBackground(new java.awt.Color(51, 0, 102));
        deleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.setBorderPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 232, 83, 34));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("CATEGORIES LIST");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 317, -1, -1));

        categoryTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CATEGORIES ID", "NAME", "DESCRIPTION"
            }
        ));
        categoryTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        categoryTable.setRowHeight(25);
        categoryTable.setSelectionBackground(new java.awt.Color(51, 0, 102));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 355, 710, 216));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 840, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 740, 575));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 16, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SELLER");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUCTS");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOGOUT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
//    String date = ((JTextField) joiningDate.getDateEditor().getUiComponent()).getText();
        if (cateIdField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id Missing");
        } else if (cateNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name Missing");
        } else if (cateDescField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Age Missing");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("INSERT into categorytbl values(?,?,?)");
                pstmt.setInt(1, Integer.valueOf(cateIdField.getText()));
                pstmt.setString(2, cateNameField.getText());
                pstmt.setString(3, cateDescField.getText());

                int row = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Added Successfully");
                con.close();
                selectCategory();
            } catch (SQLException e) {
            }
//            selectSeller();
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        cateIdField.setText("");
        cateNameField.setText("");
        cateDescField.setText("");

    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         if (cateIdField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seller Added Successfully");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("DELETE from categorytbl where id =? ");
                pstmt.setInt(1, Integer.parseInt(cateIdField.getText()));
                int n = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Deleted Successfully");
                con.close();
                selectCategory();
            } catch (SQLException e) {
            } finally {
                try {
                    pstmt.close();
                    con.close();
                } catch (SQLException ex) {
                }
            }
    }     
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
 if (cateIdField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id Missing");
        } else if (cateNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name Missing");
        } else if (cateDescField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Description Missing");
        }else {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            pstmt = con.prepareStatement("UPDATE categorytbl set name= ?, description=? where id=? ");
            pstmt.setString(1, cateNameField.getText());
            pstmt.setString(2, cateDescField.getText());        
            pstmt.setInt(3, Integer.parseInt(cateIdField.getText()));
            int n = pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category Update Successfully");
            con.close();
            selectCategory();

        } catch (SQLException e) {
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
            }
        }}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
            try {
            model1 = (DefaultTableModel) categoryTable.getModel();
            int myIndex = categoryTable.getSelectedRow();
            cateIdField.setText(model1.getValueAt(myIndex, 0).toString());
            cateNameField.setText(model1.getValueAt(myIndex, 1).toString());
            cateDescField.setText(model1.getValueAt(myIndex, 2).toString());   
        } catch (Exception e) {
        }
    }//GEN-LAST:event_categoryTableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField cateDescField;
    private javax.swing.JTextField cateIdField;
    private javax.swing.JTextField cateNameField;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
