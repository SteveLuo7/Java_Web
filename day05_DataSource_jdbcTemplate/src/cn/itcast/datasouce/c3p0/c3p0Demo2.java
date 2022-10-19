package cn.itcast.datasouce.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0Demo2 {
    public static void main(String[] args) throws SQLException {

        DataSource ds = new ComboPooledDataSource();

        for (int i = 1; i <= 11 ; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);

            if(i == 5) {
                conn.close();
            }
        }

        testConfig();
    }

    public static void testConfig() throws SQLException {
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        for (int i = 1; i <= 8 ; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);

            if(i == 5) {
                conn.close();
            }
        }
    }
}
