/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import entity.Product;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hgmin
 */
class ProductPanel extends JPanel {
    public ProductPanel(Product product) {
        super();
        setLayout(new BorderLayout());
        JLabel imgLabel = new JLabel();
        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon(getClass().getResource("/GUI/assets/cats.jpeg"));
        Image img = icon.getImage().getScaledInstance(158, 252, Image.SCALE_DEFAULT);
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
}
