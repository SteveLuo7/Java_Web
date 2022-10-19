package com.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
    public static void main(String[] args) {
        Statement stat = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");

            String sql = "update account set balance = 1500 where id = 3";

            stat = conn.createStatement();

            int count = stat.executeUpdate(sql);

            System.out.println(count);

            if (count > 0 ) {
                System.out.println("Update success");
            } else {
                System.out.println("Update Failed");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
