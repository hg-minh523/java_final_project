/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import entity.Categoryes;
import entity.Product;
import handlers.Category_DAO;
import handlers.Product_DAO;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import ravencell.TableActionCellEditor;
import ravencell.TableActionCellRender;
import ravencell.TableActionEvent;
import ravencell.TheModel;

/**
 *
 * @author Dell
 */
public class ProductForm extends javax.swing.JPanel implements interfaces.productInterface {

    ArrayList<Product> list = new ArrayList<>();
    ArrayList<Product> listProduct_Category = new ArrayList<>();
    ArrayList<Categoryes> listCategory = new ArrayList<>();
    Product_DAO productDAO = new Product_DAO();
    Category_DAO categoryDAO = new Category_DAO();
    private JButton btnCategory;
    private String category_id;
    private TableCellRenderer TableActionCellRender;
    private TheModel model;

    formAddProduct fm;

    /**
     * Creates new form Product
     */

    public ProductForm() {

        productDAO.clearList();
        list = productDAO.getListProduct();
        initComponents();
        hienthilentable(list);
        hienthiCategory();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnCategory = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1088, 539));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1088, 539));

        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon/Ionic-Ionicons-Search.16.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 29, 30));

        jLabel2.setText("__________________________________________________________");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, 30));

        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 290, 30));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCategory.setLayout(new java.awt.GridLayout(1, 0));

        tableProduct.setModel(new TheModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableProduct);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String name = txtName.getText();
        System.out.println(name);
        Product_DAO product_DAO = new Product_DAO();
        ArrayList<Product> list = product_DAO.searchByName(name);
        hienthilentable(list);
    }//GEN-LAST:event_jLabel3MouseClicked

//    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
//        // TODO add your handling code here:
//    }// GEN-LAST:event_jTextField1ActionPerformed
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel3MouseClicked

    }// GEN-LAST:event_jPanel3MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCategory;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    public void hienthilentable(ArrayList<Product> products) {


        String[] columnName = {"Ảnh", "Tên sản phẩm", "Giá Bán", ""};
        Object[][] rows = new Object[products.size()][4];
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getImage() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon("src/GUI/assets/" + products.get(i).getImage())
                        .getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                rows[i][0] = image;
            } else {
                rows[i][0] = null;
            }
            rows[i][1] = products.get(i).getName();
            rows[i][2] = products.get(i).getPrice();
        }
        model = new TheModel(rows, columnName);
        tableProduct.setModel(model);
        tableProduct.setRowHeight(120);
        tableProduct.getColumnModel().getColumn(0).setPreferredWidth(150);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                deleteProduct(row);
            }

            @Override
            public void onEdit(int row) {
                editProduct(row);
            }

            @Override
            public void onView(int row) {
                viewProduct(row);
            }
        };
        tableProduct.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());
        tableProduct.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
        model.fireTableDataChanged();
    }

    public void hienthilentableByCategory(String category_id) {
        productDAO.clearList();
        listProduct_Category = productDAO.getListProductByCategory(category_id);
        hienthilentable(listProduct_Category);

    }

    private void hienthiCategory() {

        try {
            listCategory = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (listCategory.isEmpty()) {
            return;
        }
        for (Categoryes category : listCategory) {
            JButton btnCategory = new JButton(category.getName());
            btnCategory.setPreferredSize(new Dimension(72, 50));

            btnCategory.addActionListener(e -> {
                String selectedCategory = ((JButton) e.getSource()).getText();

                category_id = category.getId();
                hienthilentableByCategory(category_id);

            });
            pnCategory.add(btnCategory);
        }

    }

    private void deleteProduct(int row) {
        String name = (String) tableProduct.getValueAt(row, 1);
        String id = null;
        ArrayList<Product> products = new ArrayList<>();
        products = productDAO.getListProduct();
        for (Product prd : products) {
            if (prd.getName().equalsIgnoreCase(name)) {
                id = prd.getId();
            }
        }
        if (productDAO.deleteProduct(id)) {
            JOptionPane.showMessageDialog(this, "Đã xóa sản phẩm thành công");
            productDAO.clearList();
            products = productDAO.getListProduct();
            hienthilentable(products);
        } else {
            JOptionPane.showMessageDialog(this, "Xóa không thành công");
        }
    }

    private void viewProduct(int row) {
        String check = "view";
        String name = (String) tableProduct.getValueAt(row, 1);
        Product product = null;
        Categoryes category = null;
        ArrayList<Categoryes> categories = new ArrayList<>();
        try {
            categories = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Product> products = new ArrayList<>();
        products = productDAO.getListProduct();
        for (Product prd : products) {
            if (prd.getName().equalsIgnoreCase(name)) {
                for (Categoryes cte : categories) {
                    if (cte.getId().equals(prd.getCategory().getId())) {
                        category = cte;
                        break;
                    }
                }
                product = new Product(prd.getId(), prd.getName(), prd.getDescription(), prd.getPrice(), prd.getImage(),
                        prd.getVat(), prd.getOrigin_price(), category, prd.getCreate_at());
                break;
            }
        }
        fm.openForm(product, check,this);
        fm.setVisible(true);
    }

    private void editProduct(int row) {
        String check = "edit";
        String name = (String) tableProduct.getValueAt(row, 1);
        Product product = null;
        Categoryes category = null;
        ArrayList<Categoryes> categories = new ArrayList<>();
        try {
            categories = categoryDAO.getList();
        } catch (SQLException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Product> products = new ArrayList<>();
        products = productDAO.getListProduct();
        for (Product prd : products) {
            if (prd.getName().equalsIgnoreCase(name)) {
                for (Categoryes cte : categories) {
                    if (cte.getId().equals(prd.getCategory().getId())) {
                        category = cte;
                        break;
                    }
                }
                product = new Product(prd.getId(), prd.getName(), prd.getDescription(), prd.getPrice(), prd.getImage(),
                        prd.getVat(), prd.getOrigin_price(), category, prd.getCreate_at());
                break;
            }
        }
        fm = new formAddProduct();
        fm.openForm(product, check,this);
        fm.setVisible(true);

    }

    public void removeModel() {

    }

    @Override
    public void onProductIdReceived(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reLoadProduct(ArrayList<Product> products) {
        if (model != null) {
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            this.hienthilentable(products);
        } else {
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
