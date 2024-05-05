/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Customer;
import entity.Employee;
import entity.Invoices;
//import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHONG TAM
 */
public class Invoices_DAO {

    private ArrayList<Invoices> listInvoic = new ArrayList<>();

    private Connection con = null;
    private databaseConnection ConnectDB = new databaseConnection();

    public void clearList() {
        this.listInvoic.clear();
    }

    ;
 public boolean addInvoices(Invoices invoi) {
        int rs = 0;
        try {
            
            con = ConnectDB.getConnection();
            String sql = "insert into invoices values(?,?,?,?,?) ";
            PreparedStatement pr = null;
            pr = con.prepareStatement(sql);
            pr.setString(1, invoi.getId());
            pr.setString(2, invoi.getDescription());
            pr.setString(3, invoi.getEmployee().getId());
            pr.setString(4, invoi.getCustomer().getId());
            pr.setDate(5, java.sql.Date.valueOf(invoi.getCredate_at()));
        
            rs = pr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs > 0;
    }
       @SuppressWarnings("empty-statement")
  public ArrayList<Invoices> getList() throws SQLException, ClassNotFoundException {
        try {
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();
            ArrayList<Invoices> receipts = new ArrayList<Invoices>(); 


            try (PreparedStatement statement = con.prepareStatement("select * from [dbo].[invoices]");
                    ResultSet rs = statement.executeQuery()) {
                
                Invoices receipt = null;
                while (rs.next()) {
                    receipt = new Invoices(rs.getString("id"),LocalDate.parse(rs.getString("create_at")),new Employee(rs.getString("employee_id")),new Customer(rs.getString("customer_id")),rs.getNString("description"));
                    receipts.add(receipt);
                }
                
            }

            return receipts;
        } catch (SQLException e) {
        }
        return null;
    }
  
  
  
  
   public Invoices getInvoice(String id) throws SQLException, ClassNotFoundException {
        try {
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();


            PreparedStatement statement = con.prepareStatement("select * from [dbo].[invoices] where id=? ");
                    statement.setString(1, id);
                    ResultSet rs = statement.executeQuery() ;
                
                Invoices receipt = null;
               if (rs.next()) {
                    receipt = new Invoices(rs.getString("id"),LocalDate.parse(rs.getString("create_at")),new Employee(rs.getString("employee_id")),new Customer(rs.getString("customer_id")),rs.getNString("description"));
                    return receipt;
                }
                
            

          
        } catch (SQLException e) {
        }
        return null;
    }
  
  public double getSum(String id) throws SQLException, ClassNotFoundException {
        try {
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();


           PreparedStatement statement = con.prepareStatement("select SUM((a.quantity*b.price)*(1+b.vat)) as total\n" +
"from [dbo].[invoice_detail] a join [dbo].[products] b on a.product_id=b.id\n" +
"where a.invoice_id=?");
                    statement.setString(1, id);
                    ResultSet rs = statement.executeQuery() ;
                
                Invoices receipt = null;
                if (rs.next()) {
                    double sum=rs.getDouble("total");
                    return sum;
                }
                
            

        } catch (SQLException e) {
        }
           return 0;
    }
  
}
