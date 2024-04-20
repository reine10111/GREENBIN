/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGINandSIGNUP;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Precifil
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost/greenbin";
    static final String USER = "root";
    static final String PASS = "ellayza_wagan";
    public static Connection connectDB(){
        Connection conn = null;
        try{
            //register jdbc driver, not required for newer 
            Class.forName("com.mysql.jdbc.Driver");
            //open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex) {
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
