package cn.itcast.jedis.test;

import cn.itcast.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {


    @Test
    public void test1(){
        Jedis jedis = new Jedis("localhost",6379);

        jedis.set("username","zhangsan");
        jedis.close();
    }


    @Test
    public void test2(){
        Jedis jedis = new Jedis("localhost",6379);

        jedis.set("username","zhangsan");
        String username = jedis.get("username");
        System.out.println(username);

        jedis.setex("activecode",20,"hehe");
        jedis.close();
    }

    @Test
    public void test3(){
        Jedis jedis = new Jedis("localhost",6379);

        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");

        String name = jedis.hget("user", "name");
        System.out.println(name);

        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }


        jedis.close();

    }
        @Test
        public void test4() {
            Jedis jedis = new Jedis("localhost", 6379);

            jedis.lpush("mylist","a","b","c");
            jedis.rpush("mylist","a","b","c");

            List<String> mylist = jedis.lrange("mylist", 0, -1);
            System.out.println(mylist);

            String element = jedis.lpop("mylist");
            System.out.println(element);

            String element1 = jedis.rpop("mylist");
            System.out.println(element1);

            jedis.close();
        }

    @Test
    public void test5() {
        Jedis jedis = new Jedis("localhost", 6379);

        jedis.sadd("myset","java","php","c++");

        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);

        jedis.close();
    }
    @Test
    public void test6() {
        Jedis jedis = new Jedis("localhost", 6379);

        jedis.zadd("mysortedset",3,"Yasuo");
        jedis.zadd("mysortedset",20,"Jinx");
        jedis.zadd("mysortedset",30,"Aartox");

        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);

        jedis.close();
    }

    @Test
    public void test7() {
        JedisPoolConfig config = new JedisPoolConfig();

        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        Jedis jedis = jedisPool.getResource();
        jedis.set("hehe","6666");

        jedis.close();


    }

    @Test
    public void test8() {
        Jedis jedis = JedisPoolUtils.getJedis();

        jedis.set("hello","java");

        jedis.close();


    }
}
