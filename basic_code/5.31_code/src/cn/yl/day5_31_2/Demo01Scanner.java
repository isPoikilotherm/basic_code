package cn.yl.day5_31_2;
import java.util.Scanner;


//键盘输入
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=sc.next();

        System.out.println(num);
        System.out.println(str);
    }
}
