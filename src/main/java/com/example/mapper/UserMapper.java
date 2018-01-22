package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by linke on 2016/12/31.
 */
@Mapper
public interface UserMapper {
     User selectUser();
}
