package cn.yl.digui;



public class Demo01Recurision {
    public static void main(String[] args) {
        //a();
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if (i==1000){
            return;
        }
        b(++i);
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }
}
