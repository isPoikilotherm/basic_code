package Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
* 构造方法：
*     BufferedWriter（Writer out）：创建一个使用默认大小的输出缓存区字符输出流
*     BufferedWriter（Writer out，nt size）：创建一个使用给定大小的输出缓存区字符输出流
*   参数：
 *     Writer out：字符输出流，可以传递FileWriter，缓存流会给FileWriter增加一个缓冲区，提高 FileWriter 的写入效率
 *     int size：指定缓冲流内部缓存区的大小，不指定就默认
 *
 *  特有方法：
 *   void newLine（）：写入一个换行符，会根据不同的操作系统，获取不同的行分隔符
* */
public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter =new FileWriter("/home/yangliu/IdeaProjects/basic_code/111/111_5.txt");
        BufferedWriter bw=new BufferedWriter(fileWriter);
        bw.write("a,b,c,d");
        bw.newLine();
        bw.write("e,f,g,h");
        bw.close();
    }


}
