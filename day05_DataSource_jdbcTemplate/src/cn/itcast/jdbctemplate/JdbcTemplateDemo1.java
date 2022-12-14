package cn.itcast.jdbctemplate;

import cn.itcast.datasouce.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSouce());

        String sql = "update account set balance = 5000 where id = ?";

        int count = template.update(sql, 1);
        System.out.println(count);

    }
}
