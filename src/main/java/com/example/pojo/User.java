package com.example.pojo;

import lombok.Data;

import java.util.Date;

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
    private Date start;
    private Date end;
    private Date time;


}
