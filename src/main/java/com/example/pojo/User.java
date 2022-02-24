package com.example.pojo;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by linke on 2016/12/31.
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer weight;
    private Integer tops;
    private  String userCont;
    private Date startTime;
    private Date endTime;
    private Date time;
    private String type;

    private Long start;
    private Long end;
    private Date createTime;

    private Integer status;

    public static final long EPOCH;

    /**
     * 每一部分占用的位数, 序列号占用的位数
     */
    public static final long SEQUENCE_BIT = 12;

    public static final long SEQUENCE_MASK = (1 << SEQUENCE_BIT) - 1;

    /**
     * 每一部分占用的位数, 机器标识占用的位数
     */
    public static final long WORK_ID_BIT = 10;

    /**
     * 每一部分的最大值
     */
    public static final long MAX_MACHINE_NUM = -1L ^ (-1L << WORK_ID_BIT);

    /**
     * 每一部分向左的位移
     */
    public static final long WORK_ID_LEFT_SHIFT_BITS = SEQUENCE_BIT;
    public static final long TIMESTAMP_LEFT = SEQUENCE_BIT + WORK_ID_BIT;
    public static final long TIMESTAMP_LEFT_SHIFT_BITS = WORK_ID_LEFT_SHIFT_BITS + WORK_ID_BIT;

    /**
     * 从2019年1月1日开始
     */
    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        EPOCH = calendar.getTimeInMillis();
    }

    public static void main(String[] args) {


        System.out.println(((1641022947000L - EPOCH) << TIMESTAMP_LEFT_SHIFT_BITS) | (256 << WORK_ID_LEFT_SHIFT_BITS) | 0L);






        Set<String> date = new TreeSet<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
        Date start = new Date(1635696000000L);
        if (start.before(new Date(1598889600000L))){
            start = new Date(1598889600000L);
        }
        Date end = new Date(1638938040000L);
        Calendar calendarStart = Calendar.getInstance();
        Calendar calendarEnd = Calendar.getInstance();
        calendarStart.setTime(start);
        calendarEnd.setTime(end);
        while (calendarStart.before(calendarEnd)) {
            date.add(simpleDateFormat.format(calendarStart.getTime()));
            calendarStart.add(Calendar.MONTH,1);
        }
        date.add(simpleDateFormat.format(calendarEnd.getTime()));
        date.forEach(e -> {
            System.out.println(e);
        });
        String[] strings1 = date.toArray(new String[]{});
        for (String a :strings1) {
            System.out.println("[]----" + a);
        }

    }

}
