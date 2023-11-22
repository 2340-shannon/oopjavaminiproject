package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "root");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    public static void main(String[] args) {
        Conn connection = new Conn();
        if (connection.c != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
