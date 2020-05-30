package cn.yl;

public class test {
    public static void main(String[] args) {
        int a=1;
        method(a);
        System.out.println(a);

    }
    public static void method(int b){
        b=b+1;
        System.out.println(b);
    }
}
