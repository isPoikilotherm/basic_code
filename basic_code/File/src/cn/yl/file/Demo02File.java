package cn.yl.file;

/*
* 路径：
*       绝对路径：是一个完整的路径，以盘符开始的路径
*       相对路径：是一个简化的路径，相对于当前项目的根目录，如果使用当前项目的根目录，路径可以简化，省略项目的根目录
*
* 注意：
*      1.路径不区分大小写
*      3.路径文件中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
* */

import java.io.File;

public class Demo02File {

    public static void main(String[] args) {
        /*
        * File类的构造方法
        * */

        //show02("home","111");
        show03();
    }


    //File(File parent,String child)
    private static void show03() {
        File parent =new File("home");
        File file = new File(parent,"111_1.txt");
        System.out.println(file);
    }




    //File(String parent,String child)
    private static void show02(String parent,String child) {
        File file=new File(parent,child);
        System.out.println(file);

    }


    /*
    * File(String pathname)
    * */
    private static void show01() {
        File f1=new File("home"+File.separator+"yangliu"+File.separator+"IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_1.txt");
        System.out.println(f1);

        File f2=new File("home"+File.separator+"yangliu"+File.separator+"IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        System.out.println(f1);
        File f3=new File("111_1.txt");
        System.out.println(f1);
    }
}
