package com.itcast.jdbc;

import javax.xml.transform.Result;
import java.sql.*;

public class JdbcDemo6 {
    public static void main(String[] args) {
        Statement stat = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");

            String sql = "select * from account";

            stat = conn.createStatement();

            rs = stat.executeQuery(sql);

//            rs.next();
//            int id = rs.getInt(1);
//            String name = rs.getString("name");
//            double balance = rs.getDouble(3);
//
//            System.out.println(id + "--" + name + "--" + balance);
//
//            rs.next();
//            int id2 = rs.getInt(1);
//            String name2 = rs.getString("name");
//            double balance2 = rs.getDouble(3);
//
//            System.out.println(id2 + "--" + name2 + "--" + balance2);

            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id + "--" + name + "--" + balance);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
