package cn.yl.day5_31_String;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        String str="wfdrbgrhwfewbffn";
        char[] ch=str.toCharArray();

        Arrays.sort(ch);

        for (int i = ch.length-1; i>=0 ; i--) {
            System.out.print(ch[i]);

        }
    }
}
