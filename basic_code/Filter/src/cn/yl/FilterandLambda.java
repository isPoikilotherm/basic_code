package cn.yl;

import java.io.File;
import java.io.FileFilter;

public class FilterandLambda {
    public static void main(String[] args) {
        File file =new File(File.separator + "home" + File.separator + "yangliu" + File.separator +
                "IdeaProjects" + File.separator + "basic_code" + File.separator + "111");
        getallfile(file);
    }

    private static void getallfile(File file) {
        File[] files=file.listFiles(pathname->{
                if (pathname.toString().endsWith(".txt")||pathname.isDirectory()){
                    return true;
                }else {
                    return false;
                }
        });
        for (File file1 : files) {
            if (file1.isDirectory()){
                getallfile(file1);
            }else {
                System.out.println(file1);
            }

        }

    }
}
