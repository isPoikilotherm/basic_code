package InputStream;


/*
*  abstract int read()  从输入流中读取数据的下一个字节
             int read(byte[] b)  从输入流中读取一定数量的字节，并将其存储在缓存区数组中b中
             * 1、
             int read(byte[] b, int off, int len)   从输入流中读取最多len个字节的数据到一个字节数组中。


  FileInputStream(String name)
  FileInputStream(File file)

* */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_4.txt");
       /* int read = fis.read();//读取文件中的一个字节并返回，读到末尾返回-1，读完指针后移一位，可以继续读
        System.out.println(read);*/

       byte[] bytes=new byte[3];
        int i = fis.read(bytes);
        System.out.println(i);//3
        System.out.println(Arrays.toString(bytes));//[97, 66, 67]
        System.out.println(new String(bytes));//aBC


        fis.close();


    }
}
