package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by linke on 2016/12/31.
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BoyProperties boyProperties;
  //  private  static final Logger logger = LoggerFactory.getLogger(HelloController.class);



    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public String get(@ModelAttribute TestDemo boy, @RequestParam String id) {
        System.out.println(id);
        System.out.println(boy.getAge());
        System.out.println(boyProperties.getWeight());
        User user = userMapper.selectUser();
       // logger.info("this is id:{} count:{}",user.getId(),user.getUserCont());
        log.info("this is id:{} count:{}",user.getId(),user.getUserCont());
        return "Hello Spring Boot！" + user.getUserCont()+ user.getUserCont();
    }
}
