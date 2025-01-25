/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Customer extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private String userid="";
    public Customer() {
        initComponents();
    }
    public Customer(String tempuserid) throws ClassNotFoundException {
        try {
            initComponents();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","$1Anuradha");
            userid=tempuserid;
            setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
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

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcid = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        jdob = new javax.swing.JTextField();
        jaddress = new javax.swing.JTextField();
        jphone = new javax.swing.JTextField();
        jrid = new javax.swing.JTextField();
        jroom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        insert_button = new java.awt.Button();
        delete_button = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        update_button = new java.awt.Button();
        search_button = new java.awt.Button();
        back_button = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jempid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("CUSTOMER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 131, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 168, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ADDRESS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 265, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("PHONE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 325, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("DOB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 221, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("RID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 378, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ROOM TYPE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 431, -1, -1));

        jcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcidActionPerformed(evt);
            }
        });
        jPanel1.add(jcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 125, 310, -1));
        jPanel1.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 165, 310, -1));
        jPanel1.add(jdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 221, 310, -1));
        jPanel1.add(jaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 265, 310, -1));

        jphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphoneActionPerformed(evt);
            }
        });
        jPanel1.add(jphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 322, 310, -1));
        jPanel1.add(jrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 378, 310, -1));
        jPanel1.add(jroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 428, 310, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("PRICE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 488, -1, -1));
        jPanel1.add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 485, 310, -1));

        insert_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        insert_button.setLabel("INSERT");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(insert_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        delete_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        delete_button.setLabel("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        update_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update_button.setLabel("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, -1, -1));

        search_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        search_button.setLabel("SEARCH");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        back_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        back_button.setLabel("BACK");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/all pages background.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 410, 1110, 330));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("INCHARGE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));
        jPanel1.add(jempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 330, -1));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/eee.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 823, 661));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        this.hide();
        Dashboard d=new Dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        try {
            String c4=JOptionPane.showInputDialog(this,"Enter customer id to search:");
            pst=con.prepareStatement("SELECT * FROM CUSTOMER WHERE CID='"+c4+"'");
            rs=pst.executeQuery();
            int flag=0;
            while(rs.next())
            {
                String c=rs.getString("CID");
                if(c4.equals(c))
                {
                    flag=1;
                    jcid.setText(rs.getString("CID"));
                    jname.setText(rs.getString("NAME"));
                    jdob.setText(rs.getString("DOB"));
                    jaddress.setText(rs.getString("ADDRESS"));
                    jphone.setText(rs.getString("PHONE_NO"));
                }
            }
            pst=con.prepareStatement("SELECT * FROM ROOM WHERE CID='"+c4+"'");
            rs=pst.executeQuery();
            while(rs.next())
            {
                String c=rs.getString("CID");
                if(c4.equals(c))
                {
                    flag=1;
                    jrid.setText(rs.getString("RID"));
                    jroom.setText(rs.getString("ROOM_TYPE"));
                    jprice.setText(rs.getString("PRICE"));
                    jempid.setText(rs.getString("EMPID"));
                    
                }
            }
            if(flag==0){
                JOptionPane.showMessageDialog(this,"No record found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        try {
            // TODO add your handling code here:
            String c3=JOptionPane.showInputDialog(this,"Enter customer id to update phone number:");

            int flag=0;
            pst=con.prepareStatement("SELECT * FROM CUSTOMER WHERE CID='"+c3+"'");
            rs=pst.executeQuery();
            while(rs.next())
            {
                String c=rs.getString("CID");
                if(c3.equals(c))
                {
                    flag=1;
                    String p2=JOptionPane.showInputDialog(this,"Enter Phone number:");
                    if(p2.length()==10)
                    {
                        pst=con.prepareStatement("UPDATE CUSTOMER SET PHONE_NO='"+p2+"'WHERE CID='"+c3+"'");
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this,"Updated");
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Phone number length invalid");
                    }
                }
            }
            if(flag==0){
                JOptionPane.showMessageDialog(this,"No record found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        try {
            // TODO add your handling code here:
            String c2=JOptionPane.showInputDialog(this,"Enter customer id to delete:");
            int flag=0;
            pst=con.prepareStatement("SELECT * FROM CUSTOMER WHERE CID='"+c2+"'");
            rs=pst.executeQuery();
            while(rs.next()){
                String c=rs.getString("CID");
                if(c2.equals(c))
                {
                    flag=1;
                    pst=con.prepareStatement("DELETE FROM CUSTOMER WHERE CID='"+c2+"'");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Deleted");
                }
            }
            if(flag==0){
                JOptionPane.showMessageDialog(this,"No record found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed

        try {

            String c1=jcid.getText();
            String n1=jname.getText();
            String d1=jdob.getText();
            String a1=jaddress.getText();
            String p1=jphone.getText();
            String r1=jrid.getText();
            String pr1=jprice.getText();
            String rt1=jroom.getText();
            String e5=jempid.getText();
            pst=con.prepareStatement("INSERT INTO CUSTOMER VALUES('"+c1+"','"+n1+"','"+d1+"','"+a1+"','"+p1+"')");
            pst.executeUpdate();
            pst=con.prepareStatement("INSERT INTO ROOM VALUES('"+r1+"','"+pr1+"','"+rt1+"','"+c1+"','"+e5+"')");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"THANK YOU FOR BOOKING ");
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_insert_buttonActionPerformed

    private void jphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jphoneActionPerformed

    private void jcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcidActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button back_button;
    private java.awt.Button delete_button;
    private java.awt.Button insert_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jcid;
    private javax.swing.JTextField jdob;
    private javax.swing.JTextField jempid;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jrid;
    private javax.swing.JTextField jroom;
    private java.awt.Label label1;
    private java.awt.Button search_button;
    private java.awt.Button update_button;
    // End of variables declaration//GEN-END:variables
}