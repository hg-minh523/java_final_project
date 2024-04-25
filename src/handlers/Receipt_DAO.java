/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Customer;
import entity.Employee;
import entity.Invoice_detail;
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
public class Receipt_DAO {
    public Object ConnectDB;
    ArrayList<Invoices> receipts = new ArrayList<Invoices>(); 
    public Receipt_DAO() {
    }

    public ArrayList<Invoices> getList() throws SQLException, ClassNotFoundException {
        try {
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM [dbo].[invoices] a, [dbo].[employees] b, [dbo].[customers] c " +
                                                                 "WHERE a.[employee_id] = b.[id] AND a.customer_id = c.id");
            ResultSet rs = statement.executeQuery();

            Invoices receipt = null;
            while (rs.next()) {
                receipt = new Invoices(rs.getString("id"),LocalDate.parse(rs.getString("create_at")),new Employee(rs.getString("employee_id")),new Customer(rs.getString("customer_id")),LocalDate.parse(rs.getString("delete_at")),LocalDate.parse(rs.getString("update_at")),rs.getString("description"),new Invoice_detail());
                      
                       
                
                receipts.add(receipt);
            }

            rs.close();
            statement.close();

            return receipts;
        } catch (Exception e) {
            e.printStackTrace();
        };
        return null;
    }

   


}
