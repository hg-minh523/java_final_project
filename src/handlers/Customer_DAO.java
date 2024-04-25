/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import java.sql.*;
import ConnectDb.databaseConnection;
import java.sql.Connection;
import entity.Customer;
import entity.Employee;
import entity.Invoice_detail;
import entity.Invoices;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHONG TAM
 */
public class Customer_DAO extends databaseConnection{

    private ArrayList<Customer> listKH;
    private Connection con = null;
    private ArrayList<Customer> listCus;
    private Customer cus;
    private databaseConnection ConnectDB = new databaseConnection();

    public boolean addCustomer(Customer c) {
        int rs = 0;
        try {
            listKH = new ArrayList<>();
            con = ConnectDB.getConnection();
            String sql = "insert into customers(id,name,phone,create_at,update_at,delete_at) values(?,?,?,?,?,?) ";
            PreparedStatement pr = null;
            pr = con.prepareStatement(sql);
            pr.setString(1, c.getId());
            pr.setString(2, c.getName());
            pr.setString(3, c.getPhone());
            pr.setDate(4, java.sql.Date.valueOf(c.getCreate_at()));
            pr.setDate(5, java.sql.Date.valueOf(c.getUpdate_at()));
            pr.setDate(6, java.sql.Date.valueOf(c.getDelete_at()));
            rs = pr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs > 0;
    }

    public ArrayList<Customer> getlist_Customer() {
        listCus = new ArrayList<Customer>();

        con = ConnectDB.getConnection();
        PreparedStatement statement = null;

        try {
            statement = con.prepareStatement("SELECT * FROM customers");
            ResultSet rs = statement.executeQuery();

            Invoices receipt = null;
            while (rs.next()) {
//                cus=new Customer(rs.getString("id"), rs.getNString("name"), rs.getString("phone"), LocalDate.parse(rs.getString("create_at")), LocalDate.parse(rs.getString("update_at")), LocalDate.parse(rs.getString("delete_at")));
//                emp=new Employee(rs.getString("id"),rs.getNString("name") , rs.getString("phone"), LocalDate.parse(rs.getString("delete_at")), LocalDate.parse(rs.getString("update_at")),LocalDate.parse(rs.getString("create_at")));
//                    public Invoices(String id, LocalDate credate_at, Employee employee, Customer customer, LocalDate delete_at, LocalDate upadte_at, String description, Invoice_detail list_indetail) {

                cus = new Customer(rs.getString("id"), rs.getString("name"), rs.getString("phone"), LocalDate.parse(rs.getString("create_at")), LocalDate.parse(rs.getString("create_at")), LocalDate.parse(rs.getString("create_at")));

                listCus.add(cus);

            }
            return listCus;
        } catch (SQLException e) {
        }
        return null;

    }

    public boolean ktKhachHangTonTai(String sdt) {
        con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("SELECT count(*) FROM customers where phone=?");
                        statement.setString(1, sdt);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Trả về true nếu tồn tại khách hàng với số điện thoại đã cho
            }
        } catch (SQLException e) {
        }
        return false;

    }

}
