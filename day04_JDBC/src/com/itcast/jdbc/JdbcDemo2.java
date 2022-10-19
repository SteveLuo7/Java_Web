package com.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) {
        Statement stat = null;
        Connection conn = null;

        //注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //定义sql
            String sql = "insert into account values(null,'wangwu',3000)";
            //获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
            //获取执行statement
            stat = conn.createStatement();
            //执行sql
            int count = stat.executeUpdate(sql);

            System.out.println(count);

            if (count > 0) {
                System.out.println("添加到数据库成功");
            } else {
                System.out.println("添加到数据库失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if ( stat != null) {
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
}
