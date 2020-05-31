package cn.yl.day5_31_String;

public class StringGet {
    public static void main(String[] args) {

        String str="edewfrhgtegrf";
        int len=str.length();//获取字符串中字符的个数，拿到字符长度
        System.out.println(len);


        String str1="abc";
        String str2="def";
        String str3=str1.concat(str2);//concata:字符串拼接
        System.out.println(str3);



        char ch="hello".charAt(1);//查找制定索引位置的字符
        System.out.println(ch);


        String str4="helloword";
        int i = str4.indexOf("llo");//查找参数字符串再本来的字符串中出现的第一次索引位置，若没有则返回-1
        System.out.println(i);



        String str5=str4.substring(5);//截取字符串，从参数位置到字符串末尾
        System.out.println(str5);
        String str6=str4.substring(4,7);//截取参数范围内的字符串
        System.out.println(str6);
    }
}
