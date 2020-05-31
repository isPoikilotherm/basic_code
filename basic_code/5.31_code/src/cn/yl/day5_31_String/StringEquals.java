package cn.yl.day5_31_String;

public class StringEquals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] charArray={'h','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));
    }
}
