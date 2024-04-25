/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import 

/**
 *
 * @author hgmin
 */
public class databaseConnection {
public Connection con=null;
//private static databaseConnection intance =new databaseConnection();
//public static  databaseConnection getIntance(){
//    return intance;
//            
//}
public databaseConnection(){
    String url="jdbc:sqlserver://localhost:1433;databaseName=cafe_managerment";
    String user="sa";
    String pass="123456";
    try {
        con=DriverManager.getConnection(url, user, pass);
        System.out.println(con);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
}
   public Connection getConnection(){
       return this.con;
   }
}


