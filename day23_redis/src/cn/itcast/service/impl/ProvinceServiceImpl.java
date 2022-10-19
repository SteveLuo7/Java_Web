package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.dao.impl.ProvinceDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.jedis.util.JedisPoolUtils;
import cn.itcast.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {

        return dao.findAll();
    }

    @Override
    public String findAllJson() {

        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        if (province_json == null || province_json.length() == 0) {
            System.out.println("redis中没有数据，查询数据库。。。");

            List<Province> ps = dao.findAll();

            ObjectMapper mapper = new ObjectMapper();
            try {
                String s = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            jedis.set("province",province_json);

            jedis.close();

        } else {
            System.out.println("redis有数据 查询中...");
        }

        return null;
    }
}
