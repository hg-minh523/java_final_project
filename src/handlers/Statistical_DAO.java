/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Product;
import entity.Invoices;
//import entity.Statistic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author KHONG TAM
 */
public class Statistical_DAO {

    private Object ConnectDB;
//    private Statistic statistic;

    public Statistical_DAO() {
    }

    public void getRevenueByMonth() throws SQLException, ClassNotFoundException {
        try {

            System.out.println(" select * from products order by id offset  rows fetch next 8 rows only");
            databaseConnection connectDb = new databaseConnection();
            Connection con = connectDb.getConnection();
            String sql = "SELECT \n"
                    + "    YEAR(i.create_at) AS Year,\n"
                    + "    SUM(p.price * ivd.quantity) AS TotalRevenue,\n"
                    + "    AVG(p.price * ivd.quantity) AS AverageRevenue\n"
                    + "  FROM invoices i\n"
                    + "  INNER JOIN invoice_detail ivd ON i.id = ivd.invoice_id\n"
                    + "  INNER JOIN products p ON ivd.product_id = p.id\n"
                    + "  GROUP BY YEAR(i.create_at)";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                statistic.addName(resultSet.getString("month"));
                statistic.addRevenue(resultSet.getString("total"));
            }
            
            resultSet.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        };
    }

}
