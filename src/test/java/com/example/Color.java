package com.example;

/**
 * Created by linke on 2017/2/11.
 */
public enum Color {
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    //构造枚举值，比如RED(255,0,0)
    private Color(int rv,int gv,int bv){
        this.redValue=rv;
        this.greenValue=gv;
        this.blueValue=bv;
    }

    public String toString(){  //覆盖了父类Enum的toString()
        return "("+redValue+","+greenValue+","+blueValue+")";
    }

    private int redValue;  //自定义数据域，private为了封装。
    private int greenValue;
    private int blueValue;
    public static void main(String args[])
    {
        // Color colors=new Color(100,200,300);  //wrong
       // LongAdder
//        Color color=Color.RED;
        for (Color color1 : Color.values()) {
            System.out.println(color1.blueValue);
        }
//        System.out.println(color);  // 调用了toString()方法
    }
}
