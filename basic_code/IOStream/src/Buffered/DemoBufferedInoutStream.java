package Buffered;

/*
* 构造方法;
 *    BufferedInoutStream(InoutStream in)创建一个新的缓存输入流，以将数据写入底层的输入流
 *    BufferedInoutStream(InoutStream in，int size)创建一个新的缓存输入流，以将具有制定缓存区大小的数据写入底层的输入流
 *  参数：
 *      OutoutStream out：字节输出流，可以传递FileOutputStream，缓存流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
 *      int size：指定缓冲流内部缓存区的大小，不指定就默认
* */

import java.io.*;

public class DemoBufferedInoutStream {
    public static void main(String[] args) {

        try {
            FileInputStream fis= new FileInputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                    "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"112_4.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            int read = bis.read();
            System.out.println((char)read);
            // bis.flush();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
