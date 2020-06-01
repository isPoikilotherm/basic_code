package cn.yl.day5_31_String;

import java.util.Scanner;

public class StringPractise_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        method(str);
    }

    public static void method(String string){
        int cap=0,uncap=0,num=0,other=0;
        for (int i = 0; i < string.length(); i++) {
            char ch=string.charAt(i);
            if ('A'<=ch && ch<='Z'){
                cap+=1;
            }else if ('a'<=ch && ch<='z'){
                uncap+=1;
            }else if ('0'<=ch && ch<='9'){
                num+=1;
            }else {
                other+=1;
            }
        }
        System.out.println("大写字母："+cap+"个；"+"小写字母："+uncap+"个；"+"数字："+num+"个；"+"其他："+other+"个；");
    }
}
