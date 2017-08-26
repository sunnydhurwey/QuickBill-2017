/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coders.quickbill;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author sunny
 */
public class ManageCustomer extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form ManageCustomer
     */
    public ManageCustomer() {
        initComponents();
        conn=javaconnect.ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //Program to set one instance on this ManageCustomer Form
    private static ManageCustomer obj=null;
    public static ManageCustomer getObj(){
        if(obj==null){
            obj=new ManageCustomer();
        }
        return obj;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtCustName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustMgmtPnl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Management Panel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 27, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(1, 27, 29));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Cust. ID");

        txtCustID.setEditable(false);
        txtCustID.setBackground(new java.awt.Color(255, 255, 255));
        txtCustID.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Cust. Name");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Contact1");

        txtContact.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Address");

        txtAddress.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        btnAdd.setBackground(java.awt.Color.white);
        btnAdd.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(java.awt.Color.white);
        btnUpdate.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(java.awt.Color.white);
        btnDelete.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtCustName.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        txtCustName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustNameKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Contact2");

        txtContact2.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        txtContact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Email");

        txtEmail.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(53, 53, 53));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Customer Management Panel");

        btnNew.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(384, 384, 384)
                .addComponent(btnNew)
                .addGap(17, 17, 17)
                .addComponent(btnReset)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnUpdate)
                        .addGap(4, 4, 4)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContact))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnNew)
                            .addComponent(btnReset))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(1, 1, 1))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 160));

        tblCustMgmtPnl.setBackground(new java.awt.Color(53, 53, 53));
        tblCustMgmtPnl.setForeground(java.awt.Color.white);
        tblCustMgmtPnl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCustMgmtPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustMgmtPnlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustMgmtPnl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 800, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(832, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Program to get Customer Data to Table
    public void getCustDataToTable(){
        try{
            String sql="Select * from Customer Order By cName ASC";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblCustMgmtPnl.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void getCustData(){
        try{
            int count=0;
            String sql="Select * from Customer";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                count=rs.getInt("cid");
                count++;
            }
            txtCustID.setText(String.valueOf(count));
            txtCustName.setText("");
            txtContact.setText("");
            txtAddress.setText("");
            txtContact2.setText("");
            txtEmail.setText("");
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        getCustDataToTable();
        getCustData();
    }//GEN-LAST:event_formWindowOpened
    //Program to add new Customer to database
    public void addCustomer(){
        if(!"".equals(txtCustName.getText()) && !"".equals(txtContact.getText()) && !"".equals(txtAddress.getText())){
            try{
                String sql="Insert into Customer (cName,cAddress,cContact,cContact2,cEmail)values(?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1, txtCustName.getText());
                pst.setString(2, txtAddress.getText());
                pst.setString(3, txtContact.getText());
                pst.setString(4, txtContact2.getText());
                pst.setString(5, txtEmail.getText());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Customer added to database.");
            }   
            catch(SQLException | HeadlessException e){
                //JOptionPane.showMessageDialog(null,"Customer with the same contact already exist","ATTENTION !!!",JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Cannot save empty data. Name, Contact1, and Address field are compulsary.","STOP",JOptionPane.ERROR_MESSAGE);
        }  
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addCustomer();
        getCustDataToTable();
        getCustData();
        txtCustName.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed
    //Program to update Customer Database
    public void updtCustomer(){
        if(!"".equals(txtCustID.getText()) && !"".equals(txtCustName.getText()) && !"".equals(txtContact.getText())&& !"".equals(txtAddress.getText())){
            try{
                String sql="Update Customer set cName=?, cContact=?, cAddress=?, cContact2=?, cEmail=? where cid='"+txtCustID.getText()+"'";
                pst=conn.prepareStatement(sql);
                pst.setString(1, txtCustName.getText());
                pst.setString(2, txtContact.getText());
                pst.setString(3, txtAddress.getText());                
                pst.setString(4, txtContact2.getText());
                pst.setString(5, txtEmail.getText());
                pst.execute();                 
                JOptionPane.showMessageDialog(null, "Data updated on database.");
                pst.close();
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "Empty data cannot be saved.");
        }
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updtCustomer();
        getCustDataToTable();
        getCustData();
    }//GEN-LAST:event_btnUpdateActionPerformed
    //Program to get table data to field
    public void getTableToField(){
        try{
            int row=tblCustMgmtPnl.getSelectedRow();
            String tblClick=tblCustMgmtPnl.getModel().getValueAt(row, 0).toString();
            String sql="Select * from Customer where cid='"+tblClick+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                txtCustID.setText(rs.getString("cid"));
                txtCustName.setText(rs.getString("cName"));
                txtContact.setText(rs.getString("cContact"));  
                txtAddress.setText(rs.getString("cAddress"));
                txtContact2.setText(rs.getString("cContact2"));
                txtEmail.setText(rs.getString("cEmail"));
            }
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void tblCustMgmtPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustMgmtPnlMouseClicked
        // TODO add your handling code here:
        getTableToField();
    }//GEN-LAST:event_tblCustMgmtPnlMouseClicked
    //Program to delete existing Customer from database
    public void delCust(){
        if(!"".equals(txtCustID.getText())){
           try{
               String sql="Delete from Customer where cid='"+txtCustID.getText()+"'";
               pst=conn.prepareStatement(sql);
               pst.execute();
               JOptionPane.showMessageDialog(null,"Data deleted from database.");
               getCustDataToTable();
               getCustData();
               pst.close();
           }
           catch(SQLException | HeadlessException e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Customer not selected.");
       }
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delCust();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        getCustData();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtCustName.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        txtContact2.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtContact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2KeyTyped

    //Program to get Cust on input
    public void searchCust(){
        try{
            String KeyVal=txtCustName.getText();
            String sql="Select * from Customer where cName LIKE ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,"%"+KeyVal + "%");
            rs=pst.executeQuery();
            tblCustMgmtPnl.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"searchCust() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtCustNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustNameKeyReleased
        // TODO add your handling code here:
        searchCust();
    }//GEN-LAST:event_txtCustNameKeyReleased
    //Program to get Cust on input
    public void searchContact(){
        try{
            String KeyVal=txtContact.getText();
            String sql="Select * from Customer where cContact LIKE ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,"%"+KeyVal + "%");
            rs=pst.executeQuery();
            tblCustMgmtPnl.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"searchContact() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        searchContact();
    }//GEN-LAST:event_txtContactKeyReleased
    //Program to get Cust on input
    public void searchAddress(){
        try{
            String KeyVal=txtAddress.getText();
            String sql="Select * from Customer where cAddress LIKE ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,"%"+KeyVal + "%");
            rs=pst.executeQuery();
            tblCustMgmtPnl.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"searchAddress() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        searchAddress();
    }//GEN-LAST:event_txtAddressKeyReleased
    //Program to get Cust on input
    public void searchEmail(){
        try{
            String KeyVal=txtEmail.getText();
            String sql="Select * from Customer where cEmail LIKE ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,"%"+KeyVal + "%");
            rs=pst.executeQuery();
            tblCustMgmtPnl.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"searchEmail() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        searchEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

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
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustMgmtPnl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}