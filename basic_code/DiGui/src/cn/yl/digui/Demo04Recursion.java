package cn.yl.digui;

import java.io.File;

public class Demo04Recursion {
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
            System.out.println(file1);
        }
    }
}
