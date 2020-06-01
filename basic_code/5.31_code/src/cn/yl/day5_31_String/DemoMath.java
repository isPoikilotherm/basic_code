package cn.yl.day5_31_String;
/*
* public static double abs(double num) :绝对值
* public static double ceil(double num) :向上取整
* public static double floor(double num) :向下取整
* public static double round(double num) :四舍五入
*/
public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-3.12));
        System.out.println(Math.abs(3));
        System.out.println("======================");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(-3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("======================");

        //想下取整
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(-3.9));
        System.out.println(Math.floor(31));
        System.out.println("======================");

        //四舍五入
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(-3.99));
        System.out.println(Math.round(3));
    }
}