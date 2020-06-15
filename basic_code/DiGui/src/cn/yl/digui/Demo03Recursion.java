package cn.yl.digui;

public class Demo03Recursion {
    public static void main(String[] args) {

        int num=factorial(5);
        System.out.println(num);
    }

    private static int factorial(int n) {
       if (n==1){
           return 1;
       }

       return n*factorial(n-1);
    }
}
