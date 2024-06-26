/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entity.Categoryes;
import entity.Customer;
import entity.Product;
import handlers.Category_DAO;
import handlers.Customer_DAO;
import handlers.Product_DAO;
import interfaces.categoryInterface;
import interfaces.productInterface;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import ravencell.QuantytiCellEditor;
import ravencell.TableActionCellEditor;
import ravencell.TableActionCellEditor_Home;
import ravencell.TableActionCellRender_Home;
import ravencell.TableActionEvent;
import ravencell.TableActionEvent_Home;
//import javax.swing.Im;

/**
 *
 * @author hgmin
 */
public class Home extends javax.swing.JPanel implements productInterface, categoryInterface{


    public Product_DAO prod_DAO;
    public Category_DAO category_DAO;
    private int skip = 0;
    DefaultTableModel modelCart;
    /**
     * Creates new form Home
     */
    public Home() {
//        connection = new productControllers();
        prod_DAO = new Product_DAO();
        category_DAO= new Category_DAO();
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

        jButton9 = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCart = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        txtphone = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jscCafe = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jsDaxay = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jscTra = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jscSoda = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jscKhac = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jscBanh = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();

        jButton9.setBackground(new java.awt.Color(255, 204, 255));
        jButton9.setText("jButton6");
        jButton9.setPreferredSize(new java.awt.Dimension(75, 32));

        panelMain.setBackground(new java.awt.Color(255, 255, 204));
        panelMain.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cart");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 376, 52));

        jtCart.setBackground(new java.awt.Color(255, 204, 102));
        //String[] columnNames = {  "Tên sản phẩm", "Giá", "Số lượng", "Tổng giá"};

        //modelCart = new DefaultTableModel(columnNames, 0);
        jtCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]{

            },
            new String [] {
                "id", "Tên sản phẩm", "Giá", "Số lượng", "Tổng giá", ""
            }
        )
        {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
    );
    jScrollPane1.setViewportView(jtCart);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 376, 330));

    jButton2.setBackground(new java.awt.Color(102, 51, 0));
    jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 153, 0));
    jButton2.setText("Tổng tiền");
    jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton2MouseClicked(evt);
        }
    });
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 100, 40));

    txtphone.setBackground(new java.awt.Color(255, 204, 102));
    txtphone.setText("Phone");
    txtphone.setToolTipText("");
    txtphone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
    txtphone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txtphone.setName(""); // NOI18N

    txthoten.setBackground(new java.awt.Color(255, 204, 102));
    txthoten.setText("Name");
    txthoten.setToolTipText("");
    txthoten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
    txthoten.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txthoten.setName(""); // NOI18N

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon/Icojam-Blue-Bits-User-check.24.png"))); // NOI18N
    jButton1.setPreferredSize(new java.awt.Dimension(60, 18));
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton1MouseClicked(evt);
        }
    });
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
            .addContainerGap(15, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addComponent(txtphone)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 60));

    panelMain.add(jPanel1, java.awt.BorderLayout.LINE_END);

    jPanel2.setPreferredSize(new java.awt.Dimension(696, 527));
    jPanel2.setLayout(new java.awt.BorderLayout());

    jPanel3.setBackground(new java.awt.Color(102, 51, 0));
    jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
    jPanel3.setMinimumSize(new java.awt.Dimension(60, 60));
    jPanel3.setPreferredSize(new java.awt.Dimension(696, 90));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 204, 51));
    jLabel5.setText("Menu");

    jPanel16.setBackground(new java.awt.Color(102, 51, 0));
    try{
        ArrayList<Categoryes> categories = category_DAO.getList();
        for (Categoryes cate : categories) {

            JButton categoryBtn = new JButton(cate.getName());
            categoryBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle button click here
                    getIdOfCategoy(cate.getId());
                }
            });
            jPanel16.add(categoryBtn);
        }
    }catch( Exception e){

    }
    jPanel16.setLayout(new java.awt.GridLayout(1, 0));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
    );

    jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

    jPanel4.setBackground(new java.awt.Color(204, 204, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
    jPanel4.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

    jscCafe.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel5.setBackground(new java.awt.Color(204, 255, 204));
    jPanel5.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel5.setLayout(new java.awt.BorderLayout());

    jPanel11.setMinimumSize(new java.awt.Dimension(50, 50));
    jPanel11.setPreferredSize(new java.awt.Dimension(346, 25));

    jLabel2.setText("Truoc");
    jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel2MouseClicked(evt);
        }
    });
    jPanel11.add(jLabel2);

    jLabel3.setText("Sau");
    jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel3MouseClicked(evt);
        }
    });
    jPanel11.add(jLabel3);

    jPanel5.add(jPanel11, java.awt.BorderLayout.PAGE_END);

    jPanel12.setLayout(new java.awt.GridLayout(0, 4));
    try{
        ArrayList<Product> products = prod_DAO.getList(skip);
        for (Product product : products) {

            ProductPanel prodPanel = new ProductPanel(product,this);
            jPanel12.add(prodPanel);
        }
    }catch( Exception e){

    }
    jPanel5.add(jPanel12, java.awt.BorderLayout.CENTER);

    jscCafe.setViewportView(jPanel5);

    jPanel4.add(jscCafe);

    jsDaxay.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel6.setBackground(new java.awt.Color(255, 51, 51));
    jPanel6.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel6.setLayout(new java.awt.GridLayout(2, 3, 15, 15));
    jsDaxay.setViewportView(jPanel6);

    jPanel4.add(jsDaxay);

    jscTra.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel7.setBackground(new java.awt.Color(204, 255, 204));
    jPanel7.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel7.setLayout(new java.awt.GridLayout(2, 3, 15, 15));
    jscTra.setViewportView(jPanel7);

    jPanel4.add(jscTra);

    jscSoda.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel8.setBackground(new java.awt.Color(102, 204, 0));
    jPanel8.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel8.setLayout(new java.awt.GridLayout(2, 3, 5, 15));
    jscSoda.setViewportView(jPanel8);

    jPanel4.add(jscSoda);

    jscKhac.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel9.setBackground(new java.awt.Color(102, 102, 0));
    jPanel9.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel9.setLayout(new java.awt.GridLayout(2, 3, 15, 15));
    jscKhac.setViewportView(jPanel9);

    jPanel4.add(jscKhac);

    jscBanh.setPreferredSize(new java.awt.Dimension(696, 437));

    jPanel10.setBackground(new java.awt.Color(102, 51, 0));
    jPanel10.setPreferredSize(new java.awt.Dimension(696, 437));
    jPanel10.setLayout(new java.awt.GridLayout(2, 3, 15, 15));
    jscBanh.setViewportView(jPanel10);

    jPanel4.add(jscBanh);

    jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

    panelMain.add(jPanel2, java.awt.BorderLayout.CENTER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tenKH = txthoten.getText();
        String sdtKH = txtphone.getText();
        DefaultTableModel model = (DefaultTableModel)jtCart.getModel();
        FromThanhToan frtt = new FromThanhToan(tenKH,sdtKH,model);
        frtt.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        try {

            skip++;
            jPanel12.removeAll();
            prod_DAO.clearList();
            ArrayList<Product> products = prod_DAO.getList(skip);
            for (Product product : products) {
                ProductPanel prodPanel = new ProductPanel(product,this);
                jPanel12.add(prodPanel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        jPanel12.revalidate();
        jPanel12.repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        try {
            if (skip > 0) {
                skip--;
            }
            jPanel12.removeAll();
            prod_DAO.clearList();
            ArrayList<Product> products = prod_DAO.getList(skip);
            for (Product product : products) {
                ProductPanel prodPanel = new ProductPanel(product,this);
                jPanel12.add(prodPanel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        jPanel12.revalidate();
        jPanel12.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private String generateCustomerId() {
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyMMddHHmmss"));
        return "KH" + formattedTime;
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // lệnh thêm lưu thông tin vào database
         // lệnh thêm lưu thông tin vào database
              String customerId = generateCustomerId();
              String name=txthoten.getText();
              String sdt=txtphone.getText();
              LocalDate create_at=LocalDate.now();
               LocalDate update_at=LocalDate.now();
              LocalDate delete_at=LocalDate.now();
              System.out.println(""+sdt);
            Customer  Cus=new Customer(customerId,  name,sdt, create_at, update_at, delete_at);
              Customer_DAO liscus=new Customer_DAO();
              if(!liscus.ktKhachHangTonTai(sdt)){
                if(liscus.addCustomer(Cus)){
                    JOptionPane.showConfirmDialog(this, "Đã thêm khách hàng");

            }
           
              } 
            else {
                        JOptionPane.showConfirmDialog(this, "Khách hàng đã tồn tại");

            }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jsDaxay;
    private javax.swing.JScrollPane jscBanh;
    private javax.swing.JScrollPane jscCafe;
    private javax.swing.JScrollPane jscKhac;
    private javax.swing.JScrollPane jscSoda;
    private javax.swing.JScrollPane jscTra;
    private javax.swing.JTable jtCart;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables

    private void setDefaultCloseOperation(int DO_NOTHING_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onProductIdReceived(Product prod) {
        Object[] newRowData = {prod.getId(),prod.getName(), prod.getPrice(), 1, prod.getPrice()};
//jtCart.
        modelCart = (DefaultTableModel)jtCart.getModel();
        modelCart.addRow(newRowData);
        jtCart.setRowHeight(30);
        TableActionEvent_Home event = new TableActionEvent_Home() {
            @Override
            public void onDelete(int row) {
                modelCart.removeRow(row);
            }

        };
        jtCart.getColumnModel().getColumn(3).setCellEditor(new QuantytiCellEditor());
        jtCart.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
            
        });
        jtCart.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender_Home());
        jtCart.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor_Home(event));
    }

    @Override
    public void getIdOfCategoy(String categoryId) {
        try {
            
            jPanel12.removeAll();
            prod_DAO.clearList();
            ArrayList<Product> products = prod_DAO.getListByCategory(0,categoryId);
            for (Product product : products) {
                ProductPanel prodPanel = new ProductPanel(product,this);
                jPanel12.add(prodPanel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        jPanel12.revalidate();
        jPanel12.repaint();
    }
}
