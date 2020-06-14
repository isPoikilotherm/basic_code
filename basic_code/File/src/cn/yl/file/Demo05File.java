package cn.yl.file;

/*
* public boolen createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹
* public boolen delete（）： 删除由此File表示的文件或目录
* public boolen mkdir（）： 创建由此File表示的目录
* public boolen mkdirs（）： 创建由此File表示的目录，包括任何必须但不存在的父目录
* */

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
       // show01();
        //show02();
        show03();
    }


    /*
    * public boolen delete（）： 删除由此File表示的文件或目录
    * 此方法，可以删除构造方法路径中给出的文件/文件夹
    * 返回值：
     *      true：文件删除成功，返回true
     *      false：文件夹中有内容，不会删除，返回false；构造方法中路径不存在返回False
     * 注意：
     *    delete方法是直接在硬盘中删除，不走回收站，删除要谨慎
     *    创建文件的路径必须存在，否则会抛异常
    * */
    private static void show03() {
        File file1=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111");
        boolean b = file1.delete();
        System.out.println(b);
    }

    /*
    * public boolen mkdir（）： 创建由此File表示的目录
    * 单级空文件夹
    * public boolen mkdirs（）： 创建由此File表示的目录，包括任何必须但不存在的父目录
    * 可以单级也可以双级
    * 返回值：
    *      true：文件不存在，创建文件，返回true
    *      false：文件存在，不会创建，返回false；构造方法中给出的路径不存在返回false
    * 注意：
    *
    *    此方法只能创建文件夹，不能创建文件
    * */
    private static void show02() {
        File file=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111");
        boolean b = file.mkdir();
        System.out.println(b);//true

        File file1=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111"+File.separator+"111"+File.separator+"111");
        boolean b1= file1.mkdir();
        System.out.println(b1);//false

        File file2=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111"+File.separator+"111"+File.separator+"111");
        boolean b2= file2.mkdirs();
        System.out.println(b2);//true


    }


    /*
    * public boolen createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹
    * 创建文件的路径和名称在构造方法中给出
    * 返回值：
    *      true：文件不存在，创建文件，返回true
    *      false：文件存在，不会创建，返回false
    * 注意：
    *    此方法只能创建文件，不能创建文件夹
    *    创建文件的路径必须存在，否则会抛异常
    * */
    private static void show01() throws IOException {

        File file=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_3.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);  //true
    }
}
