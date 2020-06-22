package OutputStreamWriter;


/*
* java.io.OutputStreamWriter extends Writer
* OutputStreamWriter:是字符流通向字节流的桥梁：可使用指定的charset将要写入流中的字符编码为字节。
* 继承方法：
*      void close()：关闭流，但是会先刷新
       void flush()：刷新该流的缓冲
       void write(char[] cbuf)：写入字符数组
       abstract void write(char[] cbuf, int off, int len)：写入字符数组的一部分，off数组的开始索引，len写的字符个数
       void write(int c)：写入单个字符
       void write(String str)：写入字符串
       void write(String str, int off, int len)：写入字符串的一部分，off字符串的开始索引，len写的字符个数
       *
  构造方法：
  * OutputStreamWriter(OutputStream out)：创建使用默认字符编码的OutputStreamWriter
  * OutputStreamWriter(OutputStream out, String charsetName)：创建使用制定字符集的OutputStreamWriter
  * 参数：
  *    OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
  *    String charsetName ：指定的编码表名称，不区分大小写，不指定默认使用UTF-8
  *
  *
* */


import java.io.*;

/*
* 练习：转变文件编码格式
* */
public class DemoOutputStreamWriter {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_5.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
        InputStreamReader ism=new InputStreamReader(new FileInputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_5.txt"));
        osw.write("你好");
        osw.close();
        int c;
        while ((c=ism.read())!=-1){
            System.out.println((char)c);
        }
        ism.close();



    }
}
