package cn.yl;

public class HelloWord {

    public static void main(String[] args) {

        int[] a=new int[10];
        a[1]=10;
        System.out.println(a[1]);



    }

    public static int getsum(int a,int b){
        int sum=0;
        while (a<=b){
            sum=sum+a++;
        }
        return sum;

    }


}