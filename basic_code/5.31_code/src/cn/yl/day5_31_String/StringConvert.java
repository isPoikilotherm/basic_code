package cn.yl.day5_31_String;

public class StringConvert {
    public static void main(String[] args) {

        //转换为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);


        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        //字符串替换
        String str="hello";
        String str1=str.replace('l','d');
        System.out.println(str1);


        //字符串分割
        String str3="aaa,bbb,ccc";
        String[] array1 = str3.split(",");
        for (int i = 0; i <array1.length ; i++) {
            System.out.println(array1[i]);

        }
    }
}
