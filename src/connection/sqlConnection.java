/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ray
 */
public class sqlConnection {
      public Connection ConexionALaBaseDeDatos() {
        String url;
        Connection con = null; 
     url = "jdbc:sqlserver://DESKTOP-5CEBSGU\\SQLEXPRESS;database=CRUDY;integratedSecurity=true;";
        try { 
            con = DriverManager.getConnection(url);  
            if (!con.isClosed()) 
            {
               System.out.println("Connection Complete");
            } else {
                System.out.println("Error");
            }
        } catch (SQLException e) {
            System.err.println("Error" + e.toString());
        }
        return con;
    }
}
