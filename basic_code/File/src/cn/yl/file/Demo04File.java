package cn.yl.file;

/*
* public boolean exists(): 此file表示的文件或目录是否实际存在
* public boolean isDirectory(): 此file表示的是否为目录
* public boolean isFile(): 此file表示的是否为文件
*
* */

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {

       // show01();
        show02();

    }

    /*
    * public boolean isDirectory(): 此file表示的是否为目录
    * public boolean isFile(): 此file表示的是否为文件
    * */
    private static void show02() {
        File file=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_2.png");
        System.out.println(file.isDirectory()); //false
        System.out.println(file.isFile());  //true

        File file1=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        System.out.println(file1.isDirectory());  //true
        System.out.println(file1.isFile());  //false
    }

    /*
    * public boolean exists(): 此file表示的文件或目录是否实际存在
    * */
    private static void show01() {
        File file=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_2.png");
        System.out.println(file.exists());

        File file1=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"222"+File.separator+"111_2.png");
        System.out.println(file1.exists());

    }
}
