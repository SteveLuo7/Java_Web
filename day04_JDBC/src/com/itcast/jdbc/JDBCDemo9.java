package com.itcast.jdbc;

import com.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input username");
        String username = sc.nextLine();
        System.out.println("Please input password");
        String password = sc.nextLine();

        boolean flag = new JDBCDemo9().login(username, password);

        if (flag) {
            System.out.println("Login Success");
        } else {
            System.out.println("Incorrect Password Login Failed ");
        }

    }



    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "select * from user where username ='"+username+"' and password = '"+password+"' ";

            stat = conn.createStatement();

            rs = stat.executeQuery(sql);

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,stat,conn);
        }


        return false;
    }
}
