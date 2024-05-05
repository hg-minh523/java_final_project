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
import java.time.LocalDate;

/**
 *
 * @author KHONG TAM
 */
public class Employee_DAO {
     public Employee_DAO() {
    }
    
    public Employee getEmployee(String id){
        databaseConnection connectDb = new databaseConnection();
        
        try {
            Connection con = (Connection) connectDb.getConnection();
            PreparedStatement statement = con.prepareStatement("  select * from employees where id=? ");
            statement.setString(1, id);
            
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
              Employee  empl;
                empl = new Employee(rs.getString("id"), rs.getNString("name"), rs.getString("phone"), LocalDate.parse(rs.getString("delete_at")), LocalDate.parse(rs.getString("update_at")), LocalDate.parse(rs.getString("create_at")));
                return empl;
 
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;

    }
}
