package cn.yl;

public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        Thread thread1=new Shop(baoZi);
        Thread thread2=new Customer(baoZi);

        thread1.start();
        thread2.start();
    }
}
