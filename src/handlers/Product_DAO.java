/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Categoryes;
import entity.Product;
import entity.Invoices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author KHONG TAM
 */
public class Product_DAO {

    private Object ConnectDB;
    ArrayList<Product> products = new ArrayList<Product>();

    public Product_DAO() {
    }
    public  void clearList(){
      this.products.clear();
    };
    public ArrayList<Product> getList(int skip) throws SQLException, ClassNotFoundException {
        try {
            int skipRow = skip * 8;
            System.out.println(" select * from products order by id offset "+skipRow+" rows fetch next 8 rows only");
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();

            PreparedStatement statement = con.prepareStatement(" select * from products order by id offset "+skipRow+" rows fetch next 8 rows only");
            ResultSet resultSet = statement.executeQuery();

            Product prod = null;
            while (resultSet.next()) {
//                    public Product(String id, String name, String description, double price, String image, double vat, double origin_price, Categoryes category, LocalDate create_at, LocalDate delete_at, LocalDate update_at) {

                prod = new Product(
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"),
                        resultSet.getString("image"),
                        resultSet.getDouble("vat"),
                        resultSet.getDouble("origin_price"),
                        new Categoryes(resultSet.getString("category_id")),
                        LocalDate.parse(resultSet.getString("create_at"))
//                        LocalDate.parse(resultSet.getString("delete_at")),
//                        LocalDate.parse(resultSet.getString("update_at"))

                );
                products.add(prod);
            }

            resultSet.close();
            statement.close();

            return products;
        } catch (Exception e) {
            e.printStackTrace();
        };
        return null;
    }
    
      public ArrayList<Product> getListByCategory(int skip, String category) throws SQLException, ClassNotFoundException {
        try {
            int skipRow = skip * 8;
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();

            PreparedStatement statement = con.prepareStatement(" select * from products where category_id = "+category+"  order by id offset "+skipRow+" rows fetch next 8 rows only");
            ResultSet resultSet = statement.executeQuery();

            Product prod = null;
            while (resultSet.next()) {
                prod = new Product(
                      resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"),
                        resultSet.getString("image"),
                        resultSet.getDouble("vat"),
                        resultSet.getDouble("origin_price"),
                        new Categoryes(resultSet.getString("category_id")),
                        LocalDate.parse(resultSet.getString("create_at"))
//                        LocalDate.parse(resultSet.getString("delete_at")),
//                        LocalDate.parse(resultSet.getString("update_at"))

                );
                products.add(prod);
            }

            resultSet.close();
            statement.close();

            return products;
        } catch (Exception e) {
            e.printStackTrace();
        };
        return null;
    }
    public ArrayList<Product> getListProduct(){
        ArrayList<Product> listProducts = new ArrayList<>();
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        try {
            String sql = "select * from products order by create_at desc";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            Product prod = null;
            while (result.next()) {
                prod = new Product(
                      result.getString("id"),
                        result.getString("name"),
                        result.getString("description"),
                        result.getDouble("price"),
                        result.getString("image"),
                        result.getDouble("vat"),
                        result.getDouble("origin_price"),
                        new Categoryes(result.getString("category_id")),
                        LocalDate.parse(result.getString("create_at"))
//                        LocalDate.parse(result.getString("delete_at")),
//                        LocalDate.parse(result.getString("update_at"))

                );
                listProducts.add(prod);
            }
            result.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProducts;
    }
    public ArrayList<Product> searchByName(String name){
        ArrayList<Product> list = new ArrayList<>();
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        
        try {
            String sql = "select * from products where name like ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + name + "%");
            ResultSet result = statement.executeQuery();
            Product prod = null;
            while (result.next()) {
                prod = new Product(
                      result.getString("id"),
                        result.getString("name"),
                        result.getString("description"),
                        result.getDouble("price"),
                        result.getString("image"),
                        result.getDouble("vat"),
                        result.getDouble("origin_price"),
                        new Categoryes(result.getString("category_id")),
                        LocalDate.parse(result.getString("create_at"))
//                        LocalDate.parse(result.getString("delete_at")),
//                        LocalDate.parse(result.getString("update_at"))

                );
                list.add(prod);
            }
            result.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean saveProduct(Product product){
        int rs = 0;
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        try {
            String sql = "insert into products values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getDescription());
            statement.setDouble(4, product.getPrice());
            statement.setString(5, product.getImage());
            statement.setDouble(6, product.getVat());
            statement.setDouble(7, product.getOrigin_price());
            statement.setString(8,product.getCategory().getId());
            statement.setDate(9, java.sql.Date.valueOf(product.getCreate_at()));
//            System.out.println(statement);
            rs = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs > 0;
    }
    
    public boolean updateProduct(Product product){
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        try {
            String sql = "update products set name = ?, price = ?, image= ?, description=?, vat=?, origin_price=?, category_id=? where id = ? ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setString(3, product.getImage());
            statement.setString(4, product.getDescription());
            statement.setDouble(5, product.getVat());
            statement.setDouble(6, product.getOrigin_price());
            statement.setString(7, product.getCategory().getId());
            statement.setString(8, product.getId());
            
            int result = statement.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteProduct(String id){
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        try {
            String sql = "delete from products where id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id);
            int result = statement.executeUpdate();
            return result > 0;
//            xóa mềm
//            String sql = "update products set isDelete = ? where id = ?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setBoolean(1, true);
//            statement.setString(2, id);
//            return statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Product> getListProductByCategory(String madm){
        databaseConnection connectDB = new databaseConnection();
        Connection conn = connectDB.getConnection();
        try {
            String sql = "select * from products where category_id = ? order by create_at desc";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, madm);
            ResultSet result = statement.executeQuery();
             Product prod = null;
            while (result.next()) {
                prod = new Product(
                      result.getString("id"),
                        result.getString("name"),
                        result.getString("description"),
                        result.getDouble("price"),
                        result.getString("image"),
                        result.getDouble("vat"),
                        result.getDouble("origin_price"),
                        new Categoryes(result.getString("category_id")),
                        LocalDate.parse(result.getString("create_at"))
//                        LocalDate.parse(result.getString("delete_at")),
//                        LocalDate.parse(result.getString("update_at"))

                );
                products.add(prod);
            }
            result.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public Product getProduct(String id) {
    databaseConnection connectDB = new databaseConnection();
    Connection conn = connectDB.getConnection();
    PreparedStatement statement = null;
    ResultSet result = null;

    try {
        String sql = "select * from products where id = ?";
        statement = conn.prepareStatement(sql);
        statement.setString(1, id);
        result = statement.executeQuery();
        
        if (result.next()) {
            Product prod = new Product(
                result.getString("id"),
                result.getString("name"),
                result.getString("description"),
                result.getDouble("price"),
                result.getString("image"),
                result.getDouble("vat"),
                result.getDouble("origin_price"),
                new Categoryes(result.getString("category_id")),
                LocalDate.parse(result.getString("create_at"))
            );

            return prod;
        } else {
            // Không tìm thấy sản phẩm với id tương ứng
            return null;
        }
    } catch (Exception e) {
        e.printStackTrace();
    } 
            // Đóng PreparedStatement
        return null;
   

}
}
