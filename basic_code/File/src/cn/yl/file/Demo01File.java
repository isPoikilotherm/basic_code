package cn.yl.file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {


        /*
        file:///home/yangliu/IdeaProjects/basic_code/111
        "home"+File.separator+"yangliu"+File.separator+"IdeaProjects"+File.separator+"basic_code"+File.separator+"111"


        */

        String path= File.pathSeparator;
        System.out.println(path);//路径分隔符  Windows是分号 Linux是冒号


        String separator=File.separator;
        System.out.println(separator);//文件名称分隔符   windows是反斜杠\  Linux是正斜杠/
    }
}
