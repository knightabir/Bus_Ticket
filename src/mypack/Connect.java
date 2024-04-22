package mypack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;

public class Connect {
    public static Connection ConnectDB() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection URL for MySQL Workbench
            String connectionUrl = "jdbc:mysql://localhost:3306/src_travel?user=root&password=root";

            // Establish the connection
            return DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

