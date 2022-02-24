package com.example.pojo;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 * Created by linke on 2018/4/28.
 */
@Data
public class Ctime {

    private LocalDateTime start;
    private LocalDateTime end;

    public static void main(String[] args) throws ParseException {
        String dateTime = "2021-12-31";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dateTime));
        System.out.println("日期[2016-12-31 12:30:45 123]对应毫秒：" + calendar.getTimeInMillis());
        List<String> dataTuples = new ArrayList<>();
        dataTuples.add("11");
        if (!CollectionUtils.isEmpty(dataTuples) && true) {
            System.out.println(11111);
        }
    }
}
