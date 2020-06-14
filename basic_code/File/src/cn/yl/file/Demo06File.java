package cn.yl.file;

/*
* File遍历目录功能
*   public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或者目录
*   public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或者目录
* 注意：
*   list方法和listFiles方法遍历的是构造方法给出的目录
*   如果构造方法中给出的目录的路径不存在，会抛出异常
*   如果构造方法中给出的目录的路径不是一个目录，会抛出空指针异常
*
*
*
* */

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
    *  public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或者目录
    * 遍历构造方法给出的目录，会获取目录中所有文件，把文件封装成File对象，多个File对象存储到一个File类型的数组中
    * */

    private static void show02() {
        File file = new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        File[] files = file.listFiles();
        for (File s : files) {
            System.out.println(s);
        }

    }



    /*
    *  public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或者目录
    * 遍历构造方法给出的目录，会获取目录中所有文件的名称，把获取到的名称存储到一个String类型的数组中
    * */
    private static void show01() {
        File file = new File(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

    }
}
