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
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class Seller extends javax.swing.JFrame {

    private String gender;
    Connection con = null;
    Statement stmnt = null;
    ResultSet rs = null;
    DefaultTableModel model1;
    Date joinDate;
    PreparedStatement pstmt;
    int lastId;
    Object[] data;
    JComboBox comboBoxSelection;

    public Seller() {
        initComponents();
        selectSeller();
        getLastId();

    }

    private void selectSeller() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT * from sellertbl ");
            sellerTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
        }
    }

    private void getLastId() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("SELECT Max(id) from sellertbl ");
            if (rs.next()) {
                lastId = rs.getInt(1);
                lastId++;
                sellerId.setText(Integer.toString(lastId));
            }

        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sellerAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sellerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellerContact = new javax.swing.JTextField();
        sellUpBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        sellAddBtn = new javax.swing.JButton();
        sellDellBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        others = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        sellerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sellerPassword = new javax.swing.JTextField();
        joiningDate = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("MANAGE SELLERS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        sellerAge.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerAge.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(sellerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 186, 193, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Seller ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 75, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 131, -1, -1));

        sellerName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerName.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(sellerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 126, 193, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 243, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        sellerContact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerContact.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(sellerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 126, 193, 30));

        sellUpBtn.setBackground(new java.awt.Color(51, 0, 102));
        sellUpBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sellUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        sellUpBtn.setText("Update");
        sellUpBtn.setBorderPainted(false);
        sellUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(sellUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 283, -1, 34));

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

        sellAddBtn.setBackground(new java.awt.Color(51, 0, 102));
        sellAddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sellAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        sellAddBtn.setText("Add");
        sellAddBtn.setBorderPainted(false);
        sellAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellAddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(sellAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 283, 75, 34));

        sellDellBtn.setBackground(new java.awt.Color(51, 0, 102));
        sellDellBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sellDellBtn.setForeground(new java.awt.Color(255, 255, 255));
        sellDellBtn.setText("Delete");
        sellDellBtn.setBorderPainted(false);
        sellDellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellDellBtnActionPerformed(evt);
            }
        });
        jPanel2.add(sellDellBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 283, -1, 34));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("SELLERS LIST");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        sellerTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "GENDER", "JOINING DATE", "CONTACT NO", "PASSWORD"
            }
        ));
        sellerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        sellerTable.setRowHeight(25);
        sellerTable.setSelectionBackground(new java.awt.Color(51, 0, 102));
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellerTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 800, 158));

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        others.setForeground(new java.awt.Color(51, 0, 102));
        others.setText("Others");
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });
        jPanel2.add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 241, -1, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        male.setForeground(new java.awt.Color(51, 0, 102));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 241, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        female.setForeground(new java.awt.Color(51, 0, 102));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 241, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Age");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 191, -1, -1));

        sellerId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerId.setForeground(new java.awt.Color(51, 0, 102));
        sellerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellerIdKeyTyped(evt);
            }
        });
        jPanel2.add(sellerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 70, 193, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("Joining Date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 75, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Contact No");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 131, -1, -1));

        sellerPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerPassword.setForeground(new java.awt.Color(51, 0, 102));
        jPanel2.add(sellerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 193, 30));

        joiningDate.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(joiningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 70, 193, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 840, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 32, 800, 635));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 16, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PRODUCTS");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CATEGORIES");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LOGOUT");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

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

    private void sellAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellAddBtnMouseClicked
        String date = ((JTextField) joiningDate.getDateEditor().getUiComponent()).getText();
        if (sellerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id Missing");
        } else if (sellerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name Missing");
        } else if (sellerAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Age Missing");
        } else if (gender == null) {
            JOptionPane.showMessageDialog(this, "Gender Missing");
        } else if (date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Joining Date Missing");
        } else if (sellerContact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Contact No Missing");
        } else if (sellerPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password Missing");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("INSERT into sellertbl values(?,?,?,?,?,?,?)");
                pstmt.setInt(1, Integer.valueOf(sellerId.getText()));
                pstmt.setString(2, sellerName.getText());
                pstmt.setInt(3, Integer.valueOf(sellerAge.getText()));
                pstmt.setString(4, gender);
                pstmt.setString(5, date);
                pstmt.setString(6, sellerContact.getText());
                pstmt.setString(7, sellerPassword.getText());
                int row = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                con.close();
                selectSeller();
                getLastId();

            } catch (SQLException e) {
            }
            selectSeller();
        }
    }//GEN-LAST:event_sellAddBtnMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = "Male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = "Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
        gender = "Others";
    }//GEN-LAST:event_othersActionPerformed

    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseClicked
String date = ((JTextField) joiningDate.getDateEditor().getUiComponent()).getText();
        try {
            model1 = (DefaultTableModel) sellerTable.getModel();
            int myIndex = sellerTable.getSelectedRow();
            sellerId.setText(model1.getValueAt(myIndex, 0).toString());
            sellerName.setText(model1.getValueAt(myIndex, 1).toString());
            sellerAge.setText(model1.getValueAt(myIndex, 2).toString());
            gender = model1.getValueAt(myIndex, 3).toString();
            switch (gender) {
                case "Male":
                    male.setSelected(true);
                    break;
                case "Female":
                    female.setSelected(true);
                    break;
                default:
                    others.setSelected(true);
                    break;
            }

            joinDate = (Date) model1.getValueAt(myIndex, 4);
            joiningDate.setDate(joinDate);
            sellerContact.setText(model1.getValueAt(myIndex, 5).toString());
            sellerPassword.setText(model1.getValueAt(myIndex, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_sellerTableMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        sellerId.setText("");
        sellerName.setText("");
        sellerAge.setText("");
        buttonGroup1.clearSelection();
        joiningDate.setDate(null);
        sellerContact.setText("");
        sellerPassword.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void sellDellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellDellBtnActionPerformed
        if (sellerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seller Added Successfully");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
                pstmt = con.prepareStatement("DELETE from sellertbl where id =? ");
                pstmt.setInt(1, Integer.parseInt(sellerId.getText()));
                int n = pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully");
                con.close();
                selectSeller();
            } catch (SQLException e) {
            } finally {
                try {
                    pstmt.close();
                    con.close();
                } catch (SQLException ex) {
                }
            }
    }//GEN-LAST:event_sellDellBtnActionPerformed
    }
    private void sellUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellUpBtnActionPerformed
        String date = ((JTextField) joiningDate.getDateEditor().getUiComponent()).getText();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
            pstmt = con.prepareStatement("UPDATE sellertbl set name= ?, age =?, gender=?, Joiningdate=?, contactNo=?, password=? where id=? ");
            pstmt.setString(1, sellerName.getText());
            pstmt.setString(2, sellerAge.getText());
            pstmt.setString(3, gender);
            pstmt.setString(4, date);
            pstmt.setString(5, sellerContact.getText());
            pstmt.setString(6, sellerPassword.getText());
            pstmt.setInt(7, Integer.parseInt(sellerId.getText()));
            int n = pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller Update Successfully");
            con.close();
            selectSeller();

        } catch (SQLException e) {
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_sellUpBtnActionPerformed

    private void sellerIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerIdKeyTyped
        Pattern ptrnId = Pattern.compile("^\\d{2,8}$");
        Matcher okayId = ptrnId.matcher(sellerId.getText());
        if (okayId.matches()) {
            sellerId.setBackground(Color.white);
        } else {
            sellerId.setBackground(Color.orange);
        }
    }//GEN-LAST:event_sellerIdKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
           System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
//    private void filterData() {
//        try {
//              if (!searchField.getText().equals("")) {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market_db", "root", "myNameRussell10");
//
//            pstmt = con.prepareStatement("SELECT * from sellertbl where id=?");
//             pstmt.setInt(1, Integer.parseInt(searchField.getText()));
//
//            ResultSet rs = pstmt.executeQuery();
//
//            model1.setRowCount(0);
//            while (rs.next()) {
//                data = new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
//                     rs.getString(10),
//                     rs.getString(11)};
//                model1.addRow(data);
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, " ID Is Requred");
//        }
//        } catch (Exception e) {
//        }
//    }

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
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private com.toedter.calendar.JDateChooser joiningDate;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton others;
    private javax.swing.JButton sellAddBtn;
    private javax.swing.JButton sellDellBtn;
    private javax.swing.JButton sellUpBtn;
    private javax.swing.JTextField sellerAge;
    private javax.swing.JTextField sellerContact;
    private javax.swing.JTextField sellerId;
    private javax.swing.JTextField sellerName;
    private javax.swing.JTextField sellerPassword;
    private javax.swing.JTable sellerTable;
    // End of variables declaration//GEN-END:variables

}
