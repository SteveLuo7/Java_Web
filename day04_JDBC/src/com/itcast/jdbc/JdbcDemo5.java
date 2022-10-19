package com.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo5 {
    public static void main(String[] args) {
        Statement stat = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");

            String sql = "create table student (id int , name varchar (20))";

            stat = conn.createStatement();

            int count = stat.executeUpdate(sql);

            System.out.println(count);

            if (count > 0 ) {
                System.out.println("Create success");
            } else {
                System.out.println("Create Failed");
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
