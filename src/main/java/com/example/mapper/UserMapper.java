package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by linke on 2016/12/31.
 */
@Mapper
public interface UserMapper {
     User selectUser();
     User selectTime(User user);
     User selectTimeDate(@Param("time") Integer time);
}
