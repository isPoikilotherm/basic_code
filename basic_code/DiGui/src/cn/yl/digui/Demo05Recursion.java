package cn.yl.digui;

import java.io.File;


/*
* 文件格式过滤
* */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File(File.separator + "home" + File.separator + "yangliu" + File.separator +
                "IdeaProjects" + File.separator + "basic_code" + File.separator + "111");
        getallfile(file);
    }

    private static void getallfile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                getallfile(file1);
            }
            /*
            * 只要.txt结尾的文件
            * */
            //将file1转换为字符串
            String fileName = file1.getName();
            //使用String中的endwith方法判断是否以.txt结尾
            if (fileName.endsWith(".txt")){
                System.out.println(file1);
            }

        }
    }
}
