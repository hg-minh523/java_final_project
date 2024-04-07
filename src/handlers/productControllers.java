package handlers;

import ConnectDb.databaseConnection;
import collision.productCollection;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hgmin
 */
public class productControllers extends ConnectDb.databaseConnection {

    public productCollection collesion;

    public productControllers() {
        collesion = new productCollection();
    }

    public ArrayList<Product> getList() throws SQLException, ClassNotFoundException {
        try {
            Connection connectDb = getConnection();
            PreparedStatement statement = connectDb.prepareStatement("SELECT * FROM products ");
//            statement.setInt(1, productId);
            ResultSet resultSet = statement.executeQuery();

            Product product = null;
            while (resultSet.next()) {

                product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("image"),
                        resultSet.getInt("price")
                );
                collesion.add(product);
            }

            resultSet.close();
            statement.close();
            ArrayList<Product> products = collesion.getList();

            return products;
        } catch (Exception e) {
            e.printStackTrace();
        };
        return null;
    }

    public ArrayList<Product> getListHome() throws SQLException, ClassNotFoundException {
        try {
            Connection connectDb = getConnection();
            PreparedStatement statement = connectDb.prepareStatement("SELECT top 8 * FROM products");
//            statement.setInt(1, productId);
            ResultSet resultSet = statement.executeQuery();

            Product product = null;
            while (resultSet.next()) {

                product = new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("image"),
                        resultSet.getInt("price")
                );
                collesion.add(product);
            }

            resultSet.close();
            statement.close();
            ArrayList<Product> products = collesion.getList();

            return products;
        } catch (Exception e) {
            e.printStackTrace();
        };
        return null;
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {
        try {
            Connection connectDb = getConnection();
            PreparedStatement statement = connectDb.prepareStatement("delete from products where id = ?");
            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
        };
    }

}
