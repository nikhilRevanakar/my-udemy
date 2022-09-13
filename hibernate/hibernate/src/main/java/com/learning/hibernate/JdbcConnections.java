package com.learning.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class JdbcConnections 
{
	static final String DB_URL = "jdbc:mysql://localhost:3306/mytestdb?useSSL=false&serverTimezone=UTC";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT emp_id, name, manager_id FROM Employee";

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                   // Retrieve by column name
                   System.out.print("ID: " + rs.getInt("emp_id"));
                   System.out.print(", name: " + rs.getString("name"));
                   System.out.print(", manager_id: " + rs.getInt("manager_id"));
                   System.out.println("\n");
                }
             } catch (SQLException e) {
                e.printStackTrace();
             } 
    }
}
