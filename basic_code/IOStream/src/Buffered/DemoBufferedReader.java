package Buffered;


import java.io.*;

/*
*
 * 构造方法：
 *     BufferedReader（Reader in）：创建一个使用默认大小的输出缓存区字符输入流
 *     BufferedReader（Reader in，nt size）：创建一个使用给定大小的输出缓存区字符输出流
 *   参数：
 *     Writer out：字符输出流，可以传递FileWriter，缓存流会给FileWriter增加一个缓冲区，提高 FileWriter 的写入效率
 *     int size：指定缓冲流内部缓存区的大小，不指定就默认
 *
 *  特有方法：
 *      String readLine（）：读取一个文本行，读取一行数据
* */
public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/yangliu/IdeaProjects/basic_code/111/111_5.txt");
        BufferedReader bw=new BufferedReader(fileReader);
        String str;//读一行内容
        while ((str=bw.readLine()).equals(null)){
            System.out.println(str);

        }

       /* char[] chars=new char[12];
        int i = bw.read(chars);
        System.out.println(new String(chars,0,i));*/

        bw.close();
    }
}
