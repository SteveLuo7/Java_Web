package com.itcast.jdbc;

import com.itcast.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input username");
        String username = sc.nextLine();
        System.out.println("Please input password");
        String password = sc.nextLine();

        boolean flag = new JDBCDemo10().login2(username, password);

        if (flag) {
            System.out.println("Login Success");
        } else {
            System.out.println("Incorrect Password Login Failed ");
        }

    }



    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "select * from user where username = ? and password = ? ";

            pstat = conn.prepareStatement(sql);
            pstat.setString(1,username);
            pstat.setString(2,password);

            rs = pstat.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,pstat,conn);
        }


        return false;
    }
}
