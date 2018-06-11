/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledetails;

/**
 *
 * @author Pubudu Boteju
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    final static String DBUserName  = "root";
    final static String DBPassword  ="";
    
    final static String driver = "com.mysql.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/vehicle_details";
    
    public static Connection ConnecrDb(){
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,DBUserName,DBPassword);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
