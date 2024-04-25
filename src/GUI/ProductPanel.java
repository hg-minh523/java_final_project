/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import entity.Product;
import interfaces.productInterface;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hgmin
 */
 class ProductPanel extends JPanel implements ActionListener {
    private final Product product;
    private productInterface listener;
    public ProductPanel(Product product, productInterface listener) {
        this.product = product;
        this.listener = listener;
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                listener.onProductIdReceived(product);
            }
        });
        setLayout(new BorderLayout());
        JLabel imgLabel = new JLabel();
        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon(getClass().getResource("/GUI/assets/" + product.getImage()));
        Image img = icon.getImage().getScaledInstance(200, 252, Image.SCALE_DEFAULT);
        imgLabel.setIcon(new ImageIcon(img));
        JPanel jpanelHandler = new JPanel();
        jpanelHandler.setLayout(new BoxLayout(jpanelHandler, BoxLayout.Y_AXIS));
        JLabel nameLabel = new JLabel("Name: " + product.getName());
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel priceLabel = new JLabel("Price: $" + product.getPrice());
        priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpanelHandler.add(nameLabel);
        jpanelHandler.add(priceLabel);
        add(imgLabel, BorderLayout.WEST);
        add(jpanelHandler, BorderLayout.PAGE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
