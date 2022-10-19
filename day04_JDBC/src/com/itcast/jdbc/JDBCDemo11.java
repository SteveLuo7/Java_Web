package com.itcast.jdbc;

import com.itcast.util.JDBCUtils;

import java.sql.*;

public class JDBCDemo11 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstat1 = null;
        PreparedStatement pstat2 = null;

        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);

            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";

            pstat1 = conn.prepareStatement(sql1);
            pstat2 = conn.prepareStatement(sql2);

            pstat1.setDouble(1,500);
            pstat1.setInt(2,1);

            pstat2.setDouble(1,500);
            pstat2.setInt(2,2);

            pstat1.executeUpdate();
//            int i =3/0;
            pstat2.executeUpdate();

            conn.commit();

        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstat1,conn);
            JDBCUtils.close(pstat2,null);

        }
    }
}