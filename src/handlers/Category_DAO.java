/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;
import java.sql.*;
import ConnectDb.databaseConnection;
import entity.Categoryes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHONG TAM
 */
public class Category_DAO {
    public Object ConnectDB;
    ArrayList<Categoryes> categories = new ArrayList<Categoryes>(); 
    public Category_DAO() {
    }

    @SuppressWarnings("empty-statement")
    public ArrayList<Categoryes> getList() throws SQLException, ClassNotFoundException {
        try {
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();

            PreparedStatement statement = con.prepareStatement("select * from categories");
            ResultSet resultSet = statement.executeQuery();

            Categoryes category = null;
            while (resultSet.next()) {
                category = new Categoryes(
 
                        resultSet.getString("id"),
                        resultSet.getString("name")
                );
                categories.add(category);
            }

            resultSet.close();
            statement.close();

            return categories;
        } catch (Exception e) {
}
        return null;
    
    }
   
}

   
