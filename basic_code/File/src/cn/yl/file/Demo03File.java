package cn.yl.file;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
       // show01();   //public String getAbsolutePath(): 返回此file的绝对路径名字字符串
       // show02();   //public String getPath()
        //show03();   //public String getName() : 返回由此File表示的文件或目录的名称
        //show04();  //public Long lenght(): 返回由file表示的文件的长度
    }

    /*
    * public Long lenght(): 返回由file表示的文件的长度
    * 获取的是构造方法指定的文件的大小，以字节为单位
    * 注意：
    *     文件夹没有大小的概念，能不能获取文件夹的大小
    *     如果构造方法中的路径是不存在的，那么返回0
    * */
    private static void show04() {
        File f1=new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_2.png");
        long length = f1.length();
        System.out.println(length);// 51719

    }

    /*
    * public String getName() : 返回由此File表示的文件或目录的名称
    * 获取的就是构造方法床传递路径的结尾部分（文件/文件夹）
    * */
    private static void show03() {
        File f1=new File( File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        String name = f1.getName();
        System.out.println(name);// 111
    }


    /*
    * public String getPath()
    * 获取的是构造方法中传递的路径
     * 若获取的路径是绝对的返回的就是绝对路径
     * 若获取的路径是相对的返回的就是相对路径
    * */
    private static void show02() {
        File f1=new File( File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        String path1 = f1.getPath();
        System.out.println(path1);//  /home/yangliu/IdeaProjects/basic_code/111

        File f2=new File("111_1.txt");
        String path2 = f2.getPath();
        System.out.println(path2);   //  111_1.txt
    }




    /*
    * public String getAbsolutePath(): 返回此file的绝对路径名字字符串
    * 获取的是构造方法中传递的路径
    * 无论路径是绝对的还是相对的，返回的都是绝对路径
    * */
    private static void show01() {
        File f1=new File( File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);//  /home/yangliu/IdeaProjects/basic_code/111

        File f2=new File("111_1.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);   //  /home/yangliu/IdeaProjects/basic_code/111_1.txt
    }
}
