package cn.itcast.datasouce.druid;

import cn.itcast.datasouce.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "insert into account values(null,?,?)";

            pstat = conn.prepareStatement(sql);

            pstat.setString(1,"wangwu");
            pstat.setString(2,"3000");

            int count = pstat.executeUpdate();

            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstat,conn);
        }
    }
}
