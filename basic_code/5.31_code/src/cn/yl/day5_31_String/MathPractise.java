package cn.yl.day5_31_String;

public class MathPractise {
    public static void main(String[] args) {
        int num=0;
        for (double i = -10.8; i < 5; i++) {
           // double z1=Math.abs(Math.ceil(i));
            if (Math.abs(Math.ceil(i))>6 || Math.abs(Math.ceil(i))<2.1){
                num+=1;
            }
        }
        System.out.println(num);
    }
}
