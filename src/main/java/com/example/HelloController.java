package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linke on 2016/12/31.
 */
@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BoyProperties boyProperties;
    private  static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get(ModelAndView modelAndView) {
        System.out.println(boyProperties.getWeight());
        User user = userMapper.selectUser();
        modelAndView.addObject("list-test",user);
        modelAndView.setViewName("list");
        logger.info("this is id:{} count:{}",user.getId(),user.getUserCont());
        return "Hello Spring Boot！" + user.getUserCont()+ user.getUserCont();
    }
}
