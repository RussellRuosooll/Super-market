package supermarket;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aroosh
 */
public class Products extends javax.swing.JFrame {

    Connection con = null;
    Statement stmnt = null;
    ResultSet rs = null;
    DefaultTableModel model1;
    PreparedStatement pstmt;
    int lastId;
    Object[] data;
    JComboBox comboBoxSelection;

    public Products() {
        initComponents();
        selectProduct();
        getLastId();
        getComp();
    }

    private void selectProduct() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT * from productstbl");
            while (rs.next()) {
                String myCat = rs.getString("name");
                cateCombo.addItem(myCat);
            }
            productTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }

    public void getComp() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();

            rs = stmnt.executeQuery("SELECT * from categorytbl");
            productTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prodName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        prodUpBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        prodAddBtn = new javax.swing.JButton();
        prodDellBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        prodId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cateCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("MANAGE PRODUCTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText(" ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 75, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 131, -1, -1));

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodName.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(prodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 126, 200, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        quantity.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        quantity.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 193, 30));

        prodUpBtn.setBackground(new java.awt.Color(51, 0, 102));
        prodUpBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        prodUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        prodUpBtn.setText("Update");
        prodUpBtn.setBorderPainted(false);
        prodUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(prodUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 283, -1, 34));

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
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 283, -1, 34));

        prodAddBtn.setBackground(new java.awt.Color(51, 0, 102));
        prodAddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        prodAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        prodAddBtn.setText("Add");
        prodAddBtn.setBorderPainted(false);
        prodAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodAddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(prodAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 283, 75, 34));

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
        jPanel2.add(prodDellBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 283, -1, 34));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("PRODUCTS LIST");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        productTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 740, 158));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Category");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 191, -1, -1));

        prodId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodId.setForeground(new java.awt.Color(51, 0, 102));
        prodId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodIdKeyTyped(evt);
            }
        });
        jPanel2.add(prodId, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 70, 200, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Quantity");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 193, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 840, -1));

        cateCombo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        cateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baverage", "Meat", "Soft Drink" }));
        jPanel2.add(cateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 47, 780, 620));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CATEGORIES");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOGOUT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SELLER");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 0, 20, 30));

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

    private void prodUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodUpBtnActionPerformed

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            pstmt = con.prepareStatement("UPDATE productstbl set name=?, quantity =?, price=?, category=? where id=? ");
            pstmt.setString(1, prodName.getText());
            pstmt.setInt(2, Integer.parseInt(quantity.getText()));
            pstmt.setDouble(3, Double.parseDouble(price.getText()));
            pstmt.setString(4, cateCombo.getSelectedItem().toString());
            pstmt.setInt(5, Integer.parseInt(prodId.getText()));
            int n = pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Update Successfully");
            con.close();
            selectProduct();
        } catch (SQLException e) {
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_prodUpBtnActionPerformed
    private void getLastId() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT Max(id) from categorytbl ");
            if (rs.next()) {
                lastId = rs.getInt(1);
                lastId++;
                prodId.setText(Integer.toString(lastId));
            }

        } catch (SQLException e) {
        }
    }
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        prodId.setText("");
        prodName.setText("");

        quantity.setText("");
        price.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void prodAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodAddBtnMouseClicked

        if (prodId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Id Missing");
        } else if (prodName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name Missing");
        } else if (quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity Missing");
        } else if (price.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "price Missing");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("INSERT into productstbl values(?,?,?,?,?)");
                pstmt.setInt(1, Integer.valueOf(prodId.getText()));
                pstmt.setString(2, prodName.getText());
                pstmt.setInt(3, Integer.valueOf(quantity.getText()));
                pstmt.setDouble(4, Double.valueOf(price.getText()));
                pstmt.setString(5, cateCombo.getSelectedItem().toString());
                int row = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
                con.close();
                selectProduct();
                getLastId();

            } catch (SQLException e) {
            }

        }
    }//GEN-LAST:event_prodAddBtnMouseClicked

    private void prodDellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodDellBtnActionPerformed
        if (prodId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Added Successfully");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("DELETE from productstbl where id =? ");
                pstmt.setInt(1, Integer.parseInt(prodId.getText()));
                int n = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
                con.close();
                selectProduct();

            } catch (SQLException e) {
            } finally {
                try {
                    pstmt.close();
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
    }//GEN-LAST:event_prodDellBtnActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        try {
            model1 = (DefaultTableModel) productTable.getModel();
            int myIndex = productTable.getSelectedRow();
            prodId.setText(model1.getValueAt(myIndex, 0).toString());
            prodName.setText(model1.getValueAt(myIndex, 1).toString());
            quantity.setText(model1.getValueAt(myIndex, 2).toString());
            price.setText(model1.getValueAt(myIndex, 3).toString());
            cateCombo.setSelectedItem(model1.getValueAt(myIndex, 4).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void prodIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodIdKeyTyped
        Pattern ptrnId = Pattern.compile("^\\d{2,8}$");
        Matcher okayId = ptrnId.matcher(prodId.getText());
        if (okayId.matches()) {
            prodId.setBackground(Color.white);
        } else {
            prodId.setBackground(Color.orange);
        }
    }//GEN-LAST:event_prodIdKeyTyped

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cateCombo;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField price;
    private javax.swing.JButton prodAddBtn;
    private javax.swing.JButton prodDellBtn;
    private javax.swing.JTextField prodId;
    private javax.swing.JTextField prodName;
    private javax.swing.JButton prodUpBtn;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
