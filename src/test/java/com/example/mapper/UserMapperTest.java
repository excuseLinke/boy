package com.example.mapper;

import com.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
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
        set(3);
    }
    private void set(Integer key){
        //查询今天，昨天，7天，30天记录
        //定义查询字典
        Map<Integer,Integer> hash = new HashMap();
        hash.put(2,-1);
        hash.put(3,-7);
        hash.put(4,-30);
        Date start;
        Date end;
        //当天凌晨
        LocalDateTime endTime = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        if(hash.get(key)==null){
            start  =Date.from(endTime.atZone(ZoneId.systemDefault()).toInstant());
            end = new Date();
        }else{
            start = Date.from( endTime.plusDays(hash.get(key)).atZone(ZoneId.systemDefault()).toInstant());
            end = Date.from( endTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        User user = new User();
        user.setStart(start);
        user.setEnd(end);
        User user1 = userMapper.selectTime(user);
        System.out.println(user1);
    }
}