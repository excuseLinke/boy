package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


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

        public Date get(User user)  {



//        user.setStartTime(new Date(user.getStart()));
//        user.setEndTime(new Date(user.getEnd()));
        List<User> users = userMapper.selectTime(user);
        List<User> user1 = userMapper.selectTime(user);
//        User user2 = user1.get(0);
//        users.forEach(e ->{
//            if (user2.getStatus() != e.getStatus()) {
//                System.out.println(e);
//            }
//        });

//        ExeclUtil.generateExecl(response);
        return new Date();
//        user.setName("linke");
//        System.out.println(1111111111);
//        user.setName("linke");
//        user.setWeight(boyProperties.getWeight());
//        log.info("this is id:{} count:{}",user.getId(),user.getUserCont());
//        log.info("this is id:{} count:{}",user.getId(),user.getUserCont());
    }



    @RequestMapping(value = "/hello/post", method = RequestMethod.POST)
    public User getPost(@RequestBody User user) {


        // logger.info("this is id:{} count:{}",user.getId(),user.getUserCont());
        System.out.println(user.getName());
        log.debug("this is id:{} count:{}",user.getId(),user.getUserCont());
        return user;
    }

    public static void main(String[] args) {
        Integer s = 0;
        System.out.println(s.longValue());
        System.out.println(convertToMoneyYuan(s.longValue()));
        serviceRule();
        Map<String,String> map = new HashMap<>();
        map.put("b","linke");
        map.put("a","kkk");
        map.put("c","kdfg");
        ArrayList<String> strings = new ArrayList<>(map.keySet());
        Collections.sort(strings);
        StringBuffer stringBuffer = new StringBuffer();
        for (String s1 : strings) {
            System.out.println(s1);
            stringBuffer.append(s1);
            stringBuffer.append(map.get(s1));
        }
        System.out.println(stringBuffer.toString());
        DigestUtils.md5DigestAsHex(stringBuffer.toString().getBytes(StandardCharsets.UTF_8));
    }
    public static Double convertToMoneyYuan(Long fen) {
        BigDecimal result = BigDecimal.valueOf(fen)
                .divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);

        return result.doubleValue();
    }
    public static void serviceRule() {
        LocalDate date = LocalDate.now();
        LocalDate of = LocalDate.of(2021, 11, 30);
        LocalDate from = LocalDate.of(2021, 12, 30);
        System.out.println(date);
        if (date.isAfter(of) && date.isBefore(from)) {
            System.out.println(111111);
        }
        int compareTo = date.compareTo(LocalDate.of(2021, 12, 17));
        System.out.println(compareTo);
    }
    }
