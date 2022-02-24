package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by linke on 2016/12/31.
 */
@Mapper
public interface UserMapper {
     User selectUser();
     List<User> selectTime(User user);
}
