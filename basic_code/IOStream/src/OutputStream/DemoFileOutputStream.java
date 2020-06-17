package OutputStream;

import java.io.*;
import java.util.Arrays;

public class DemoFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_4.txt");
        fos.write(97);//写一个字节 a


        /*FileOutputStream fos1=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_4.txt");*/
        /*
        * 一次写多个字节的方法：
        * public void write(byte[] b):将b.length字节从指定的字节数组中写入此输出流
        * public void write(byte[] b，int off，int len):将指定的字节数组写入len字节，从偏移量off开始输出到此输出流
        *
        public void write(byte[] b):将b.length字节从指定的字节数组中写入此输出流
        * 一次写多个字节：
        *        如果写的第一个字节是这个正数（0-127），那么显示的时候会查询ASCII表
        *        如果写的第一个字节是负数，那么第一个字节会和第二个字节组成一个中文显示，查询系统默认码表（GBK）
        * */
        byte[] bytes={65,66,67,68,69};//ABCDE
        byte[] bytes1={-65,-66,-67,68,69};//¿¾½DE

        //fos.write(bytes1);//写多个字节*/

        /*
        * public void write(byte[] b，int off，int len):把字节数组的一部分写入到文件中
        *        int off：开始索引
        *        int len：写几个字节
        * */
        fos.write(bytes,1,2);

        /*
        写入字符串的方法：可以使用String类中的方法把字符串转换为字符数组
             byte[] getBytes()  把字符串转换为字节数组

         * */
        byte[] bytes2 = "你好".getBytes();
       /* for (byte b : bytes2) {
            System.out.println(b);
        }*/
        //System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);


        fos.close();
    }

}
