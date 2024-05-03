/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Account;
import entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Dell
 */
public class Account_DAO {

    private Account account;
    

    public Account_DAO() {
    }
    
    public Account login(String username, String password){
        databaseConnection connectDb = new databaseConnection();
        
        try {
            Connection con = (Connection) connectDb.getConnection();
            PreparedStatement statement = con.prepareStatement("select * from accounts where username=? and password=?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next())
            {
                account = new Account();
                account.setUsername(resultSet.getString("username"));
                account.setPassword(resultSet.getString("password"));
                account.setEmp(new Employee(resultSet.getString("employee_id")));    
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return account;

    }
}
