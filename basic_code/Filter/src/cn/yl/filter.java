package cn.yl;


import java.io.File;

/*
 * 在File类中有两个和listFiles重载的方法，方法的参数传递的就是过滤器
 * File【】 listFiles（FileFilter filtre）
 *java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
 *    作用：用来过滤文件
 *    抽象方法：用来过滤文件的方法
 *        boolean accept（File pathname）测试制定抽象路径名是否应该包含在某个路径名列表中
 *
 * File【】 listFiles（FilenameFilter filtre）
 * java.io.FilenameFilter接口：用于过滤文件名称
 *    抽象方法：用来过滤文件的方法
 *        boolean accept（File dir，String name）测试指定文件是否应该包含在某一文件列表中
 *        参数：
 *             File dir：构造方法中传递的被遍历的目录
 *             String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
 *
 * 注意事项;
 *    两个过滤器接口没有实现类，需要自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 *
 * */
public class filter {
    public static void main(String[] args) {
        File file = new File(File.separator + "home" + File.separator + "yangliu" + File.separator +
                "IdeaProjects" + File.separator + "basic_code" + File.separator + "111");
        getallfile(file);
    }

    private static void getallfile(File file) {
        File[] files = file.listFiles(new FileFilterImpl());

        for (File file1 : files) {
            if (file1.isDirectory()) {
                getallfile(file1);
            } else {
                System.out.println(file1);
            }
            /*
             * 只要.txt结尾的文件
             * */
            //将file1转换为字符串
            //String fileName = file1.getName();
            //使用String中的endwith方法判断是否以.txt结尾
            //if (fileName.endsWith(".txt")) {
            // System.out.println(file1);
            // }
        }
    }
}
