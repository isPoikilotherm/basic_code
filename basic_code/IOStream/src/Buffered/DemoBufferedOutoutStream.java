package Buffered;

/*
* 构造方法;
*    BufferedOutputStream(OutoutStream out)创建一个新的缓存输出流，以将数据写入底层的输出流
*    BufferedOutputStream(OutoutStream out，int size)创建一个新的缓存输出流，以将具有制定缓存区大小的数据写入底层的输出流
*  参数：
*      OutoutStream out：字节输出流，可以传递FileOutputStream，缓存流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
*      int size：指定缓冲流内部缓存区的大小，不指定就默认
*
* */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBufferedOutoutStream {
    public static void main(String[] args) {

        try {
            FileOutputStream fos=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                    "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"112_4.txt",true);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            bos.write(97);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
