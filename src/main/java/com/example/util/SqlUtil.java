package com.example.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * linKe create by 2021/3/3
 */
public class SqlUtil {
    private static int startTime = 202009;
    private static int endTime = 202112;
    private static int startKey = 1;
    private static int endKey = 32;
    private static String filePath = "/Users/linke/Desktop/sqle.sql";
    private static String emp = "ALTER TABLE `mars_order`.`order_fee_%04d_%02d` ADD COLUMN `surcharge_fee` int(11) DEFAULT 0 COMMENT '基础信息服务费；单位：分',algorithm=inplace;";

    public static void main(String[] args) {
        FileOutputStream fos;
        String s;
        try {
            fos = new FileOutputStream(new File(filePath));
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (int i = startTime; i <= endTime; i = incr4YM(i)) {
                for (int t = startKey; t <= endKey; t++) {
                    s = String.format(emp, i, t);
                    bw.write(s + "\t\n");
                }
            }
            bw.close();
            osw.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static int incr4YM(int ym) {
        String value = String.valueOf(ym);
        int year = Integer.valueOf(value.substring(0, 4));
        int month = Integer.valueOf(value.substring(4, 6));
        if (month < 12) {
            ++month;
        } else {
            ++year;
            month = 01;
        }
        return Integer.valueOf(String.format("%04d%02d", year, month));
    }
}
