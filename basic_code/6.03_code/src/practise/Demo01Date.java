package practise;


import java.util.Date;

//1天=86400秒=86400000毫秒
public class Demo01Date {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());//获取当前系统时间到1970年1月1日经历了多少毫秒
        method2();
    }

    private static void method2() {
        Date date=new Date(1845485412484L);
        System.out.println(date);
        long time = new Date(1845485412484L).getTime();
        System.out.println(time);
    }

    private static void method1() {
        Date date=new Date();
        System.out.println(date);
    }
}
