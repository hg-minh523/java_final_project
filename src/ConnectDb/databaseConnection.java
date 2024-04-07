/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import 

/**
 *
 * @author hgmin
 */
public class databaseConnection {

    public Connection connection;
    public String connectionUrl = "jdbc:sqlserver://LAPTOP-2O7KTCB9:1433;databaseName=cafe_management;user=sa;password=123123;encrypt=true;trustServerCertificate=true;";
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(connectionUrl);
    }
    
}


