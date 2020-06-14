package cn.yl.digui;

public class Demo02Recursion {
    public static void main(String[] args) {

        int sum = sum(3);
        System.out.println(sum);
    }


    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }

}
