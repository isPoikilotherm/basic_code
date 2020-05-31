package cn.yl.day5_31_String;

public class Demo01String {
    public static void main(String[] args) {
//       空参构造
        String str1=new String();

//        根据字符数组创建字符串
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);

//        根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);

//        直接创建
        String str4="hello";


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
