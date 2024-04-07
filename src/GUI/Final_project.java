/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUI;

import ConnectDb.databaseConnection;
import GUI.Home;
import handlers.productControllers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hgmin
 */
public class Final_project {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Home home = new Home();
        
        home.setVisible(true);
    }  
}
