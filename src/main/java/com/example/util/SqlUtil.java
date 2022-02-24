package com.example.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * linKe create by 2021/3/3
 */
public class SqlUtil {
    private static int startTime = 202112;
    private static int endTime = 202212;
    private static int startKey = 1;
    private static int endKey = 64;
    private static String filePath = "/Users/linke/Desktop/inquiry_order.sql";
    private static String EMP_TYPE = "ALTER TABLE `mars_inquiry_order`.`inquiry_order_%04d_%d` ADD COLUMN `service_fare_type` tinyint(2) DEFAULT NULL COMMENT '服务费类型（1:节假日服务费）',algorithm = inplace;";
    private static String PLAN_EMP = "ALTER TABLE `mars_inquiry_order`.`inquiry_order_%04d_%d` ADD COLUMN `plan_service_fare` int(11) NOT NULL DEFAULT 0 COMMENT '预估服务费；单位：分）',algorithm = inplace;";
//    private static String EMP = "ALTER TABLE `mars_order`.`order_fee_%04d_%d` ADD COLUMN `service_fare` int(11) NOT NULL DEFAULT 0 COMMENT '服务费；单位：分）',algorithm = inplace;";
//    private static String IN_EMP = "ALTER TABLE `mars_order`.`order_fee_%04d_%d` ADD COLUMN `invariable_service_fare` int(11) DEFAULT NULL COMMENT '司机发起收款时的服务费；单位：分（不可变）',algorithm = inplace;";
//    private static String RE_EMP = "ALTER TABLE `mars_order`.`order_fee_%04d_%d` ADD COLUMN `refund_service_fare` int(11) DEFAULT NULL COMMENT '服务费退款；单位：分）',algorithm = inplace;";
    private static String DROP = "ALTER TABLE `mars_order`.`order_%04d_%d` DROP COLUMN `driver_cancel_rule_id`;";



    public static void main(String[] args) {
        FileOutputStream fos;
        String s;
        try {
            fos = new FileOutputStream(new File(filePath));
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (int i = startTime; i <= endTime; i = incr4YM(i)) {
                for (int t = startKey; t <= endKey; t++) {
                    s = String.format(EMP_TYPE, i, t);
                    bw.write(s + "\t\n");
                }
                for (int t = startKey; t <= endKey; t++) {
                    s = String.format(PLAN_EMP, i, t);
                    bw.write(s + "\t\n");
                }
//                for (int t = startKey; t <= endKey; t++) {
//                    s = String.format(EMP, i, t);
//                    bw.write(s + "\t\n");
//                }
//                for (int t = startKey; t <= endKey; t++) {
//                    s = String.format(IN_EMP, i, t);
//                    bw.write(s + "\t\n");
//                }
//                for (int t = startKey; t <= endKey; t++) {
//                    s = String.format(RE_EMP, i, t);
//                    bw.write(s + "\t\n");
//                }
            }
            bw.close();
            osw.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static int incr4YM(int ym) {
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
