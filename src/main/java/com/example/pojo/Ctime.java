package com.example.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by linke on 2018/4/28.
 */
@Data
public class Ctime {

    private LocalDateTime start;
    private LocalDateTime end;
    private int age;
}
