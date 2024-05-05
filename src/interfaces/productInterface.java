/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entity.Product;
import java.util.ArrayList;

/**
 *
 * @author hgmin
 */
public interface productInterface {
     void onProductIdReceived(Product p);
     void reLoadProduct(ArrayList<Product> products);
}
