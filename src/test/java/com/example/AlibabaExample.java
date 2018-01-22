package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by linke on 2017/2/11.
 */
public class AlibabaExample {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        // TODO: 2017/2/11  linke
        // FIXME: 2017/2/11
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            String temp = it.next();
            if("3".equals(temp)){
                it.remove();
            }
        }
    }
}
