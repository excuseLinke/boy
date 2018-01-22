package com.example;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by linke on 2017/3/31.
 */
public class RedisTest {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: "+jedis.ping());
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // 获取存储的数据并输出
        List<String>list = jedis.lrange("tutorial-list", 0 ,5);
        list.forEach(s-> System.out.println(s));
    }
}
