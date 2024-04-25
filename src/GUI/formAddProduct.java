/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;



import entity.Categoryes;
import entity.Product;
import handlers.Category_DAO;
import handlers.Product_DAO;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dell
 */
public class formAddProduct extends javax.swing.JFrame {

    private Component jComboBox1;
    private static String path2;
    private Product_DAO productDAO;
    private Category_DAO categoryDAO;
    private Product product ;
    private String checked;
    

    

    /**
     * Creates new form formAddProduct
     */
    public formAddProduct() {
        initComponents();
        hienthidanhmuc();
        hienthiVAT();
        
    }
    
    public formAddProduct(Product product, String check){
        initComponents();
        hienthidanhmuc();
        hienthiVAT();
        checked = check;
        txtTenSP.setText(product.getName());
        txtGia.setText(product.getPrice()+"");
        txtOrigin_price.setText(product.getOrigin_price()+"");
        txtMoTa.setText(product.getDescription());
        cboVAT.setSelectedItem(product.getVat()*100+"%");
        cboCategory.setSelectedItem(product.getCategory().getName());
        
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(new File("D:\\LT HSK-JAVA\\java_final_project\\src\\GUI\\assets\\"+product.getImage()));
        } catch (IOException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image img = bi.getScaledInstance(170, 140, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblimg.setIcon(icon);
        if(check.equalsIgnoreCase("view")){
            txtTenSP.setEditable(false);
            txtGia.setEditable(false);
            txtOrigin_price.setEditable(false);
            txtMoTa.setEditable(false);
            cboVAT.setEnabled(false);
            cboCategory.setEnabled(false);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCategory = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblimg = new javax.swing.JLabel();
        jbtnAccept = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboVAT = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtOrigin_price = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 124, 38));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("THÊM SẢN MỚI VÀO MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 477, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TÊN SẢN PHẨM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 205, 27));

        txtTenSP.setBackground(new java.awt.Color(211, 124, 38));
        txtTenSP.setFont(txtTenSP.getFont().deriveFont(txtTenSP.getFont().getSize()+2f));
        txtTenSP.setBorder(null);
        jPanel1.add(txtTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("________________________________");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("LOẠI SẢN PHẨM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 40));

        cboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCategory.setBorder(null);
        cboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(cboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("GIÁ BÁN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

        txtGia.setBackground(new java.awt.Color(211, 124, 38));
        txtGia.setFont(txtGia.getFont().deriveFont(txtGia.getFont().getSize()+2f));
        txtGia.setBorder(null);
        jPanel1.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 190, 30));

        jLabel10.setText("______________________________");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 20));

        jButton1.setBackground(new java.awt.Color(104, 31, 7));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("THÊM ẢNH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(211, 124, 38));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 204), new java.awt.Color(255, 255, 204), new java.awt.Color(255, 255, 204), new java.awt.Color(255, 255, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 140));

        lblimg.setPreferredSize(new java.awt.Dimension(170, 140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, 150));

        jbtnAccept.setBackground(new java.awt.Color(211, 124, 38));
        jbtnAccept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnAccept.setText("ACCEPT");
        jbtnAccept.setBorder(null);
        jbtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcceptActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        jButton3.setBackground(new java.awt.Color(211, 124, 38));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("CANCEL");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("VAT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, 30));

        cboVAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboVAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVATActionPerformed(evt);
            }
        });
        jPanel1.add(cboVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mô tả");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 70, 40));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 450, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("origin_price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));
        jPanel1.add(txtOrigin_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 570));

        setSize(new java.awt.Dimension(499, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void hienthidanhmuc(){
        ArrayList<Categoryes> list = new ArrayList<>();
        categoryDAO = new Category_DAO();
        try {
            list = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        int n = list.size();
        String items[] = new String[n];
        for(int i = 0; i< list.size(); i++){
            items[i] = list.get(i).getName();
        }
        cboCategory.setModel(new DefaultComboBoxModel<String>(items));
    }
    private void hienthiVAT(){
        String[] VAT = {"10%","20%","30%","40%","50%","60%","70%","80%","90%","100%"};
        cboVAT.setModel(new DefaultComboBoxModel<String>(VAT));
     
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        path2 = path;
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(170, 140, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblimg.setIcon(icon);
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private String generateCustomerId() {
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyMMddHHmmss"));
        return "SP" + formattedTime;
    }
    private void jbtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcceptActionPerformed
        if(checked.equalsIgnoreCase("view")){
            setVisible(false);
            return;
        }else if(checked.equalsIgnoreCase("edit")){
            updateProduct();
        }else{
            saveProduct();
        }

        
    }//GEN-LAST:event_jbtnAcceptActionPerformed

    private void updateProduct() {
        ArrayList<Categoryes> listCategory = new ArrayList<>();
        categoryDAO = new Category_DAO();
        try {
            listCategory = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String id = product.getId();
        String name = txtTenSP.getText();
        String strPrice = txtGia.getText();
        Double price = Double.parseDouble(strPrice);
        String categoryName = cboCategory.getSelectedItem().toString();
        Categoryes category = null;
        for(Categoryes cgr : listCategory){
            if(cgr != null){
                if(cgr.getName().equals(categoryName)){
                category =cgr;
                break;
            }
            }
        }
        Double oriqin_price = Double.parseDouble(txtOrigin_price.getText());
        String discription = txtMoTa.getText();
        LocalDate createAt = LocalDate.now();
        Double VAT = Double.parseDouble(cboVAT.getSelectedItem().toString().replace("%", ""))/100;
        String[] img = path2.split("\\\\");
        String image = img[img.length -1];
        product = new Product(id, name, discription,price,image,VAT,oriqin_price,category,createAt);
        productDAO = new Product_DAO();
        if(productDAO.updateProduct(product)){
            JOptionPane.showMessageDialog(this, "Đã cập nhật sản phẩm");
            setVisible(false);
            productDAO.clearList();
            ProductForm prf = new ProductForm();
            prf.setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(this, "Cập nhật không thành công");
        }
    }

    private void saveProduct() {
        ArrayList<Categoryes> listCategory = new ArrayList<>();
        categoryDAO = new Category_DAO();
        try {
            listCategory = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formAddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String id = generateCustomerId();
        String name = txtTenSP.getText();
        String strPrice = txtGia.getText();
        Double price = Double.parseDouble(strPrice);
        String categoryName = cboCategory.getSelectedItem().toString();
        Categoryes category = null;
        for(Categoryes cgr : listCategory){
            if(cgr != null){
                if(cgr.getName().equals(categoryName)){
                category =cgr;
                break;
            }
            }
        }
        Double oriqin_price = Double.parseDouble(txtOrigin_price.getText());
        String discription = txtMoTa.getText();
        LocalDate createAt = LocalDate.now();
        Double VAT = Double.parseDouble(cboVAT.getSelectedItem().toString().replace("%", ""))/100;
        String[] img = path2.split("\\\\");
        String image = img[img.length -1];
        product = new Product(id, name, discription,price,image,VAT,oriqin_price,category,createAt);
        productDAO = new Product_DAO();
        if(productDAO.saveProduct(product)){
            JOptionPane.showMessageDialog(this, "Đã thêm sản phẩm mới");
            setVisible(false);
            productDAO.clearList();
            ProductForm prf = new ProductForm();
            prf.setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(this, "Thêm không thành công");
        }
    }


    private void cboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoryActionPerformed

    private void cboVATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboVATActionPerformed

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
            java.util.logging.Logger.getLogger(formAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAddProduct().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JComboBox<String> cboVAT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAccept;
    private javax.swing.JLabel lblimg;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtOrigin_price;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

    private void setDefaultCloseOperation(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}