package InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileCopy {
    public static void main(String[] args) throws IOException {
        long starttime=System.currentTimeMillis();
        FileInputStream fisr=new FileInputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_1.jpg");
        FileOutputStream fisw=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_7.jpg");
        //byte[] bytes=new byte[1024];
       /* int len=0;
        while (( len=fisr.read())!=-1){
            fisw.write(len);
        }*/   //一次读取一个字节，速度慢
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fisr.read(bytes))!=-1){
            fisw.write(bytes,0,len);
        }

        fisw.close();
        fisr.close();
        long endtime=System.currentTimeMillis();
        System.out.println(endtime-starttime);

    }
}
