package cn.yl.day5_31_2;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int num=random.nextInt(100)+1;


        while (true){

            System.out.println("请输入你猜测的数字：");
            int a=sc.nextInt();
            if (a<num){
                System.out.println("小了！");
            }else if (a>num){
                System.out.println("大了！");
            }else {
                System.out.println("恭喜你猜对了："+num);
                break;
            }
        }



    }
}
