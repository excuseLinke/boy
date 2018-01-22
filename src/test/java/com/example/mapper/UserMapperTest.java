package com.example.mapper;

import com.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by linke on 2017/3/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;
    @Test
    public void selectUser() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("linke",123);
        User user = userMapper.selectUser();
        System.out.println(user.getUserCont());
        System.out.println(map.get("linke").toString());

    }

}