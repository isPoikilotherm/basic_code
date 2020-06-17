package OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 追加写/续写：使用两个参数的构造方法
*      FileOutputStream（String name, boolean oppend）创建一个向具有指定name的文件中写入数据的输出文件流
*      FileOutputStream（File file, boolean oppend）创建一个向指定file对象表示的文件中写入数据的输出文件流
* 参数：
*    String name，File file：写入数据的目的地
*    boolean append：追加写开关  true：创建对象不会覆盖原文件，继续在文件的末尾追加写数据
*                              false：创建一个新文件，覆盖原文件
*
*
* 写换行：写换行符号
*     windows：\r\n
*     Linux:\n
*     Mac:/r
* */

public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_4.txt",true);
        fos.write("\n".getBytes());//换行
        fos.write("你好".getBytes());
        fos.close();
    }

}
