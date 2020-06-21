package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_1_2.txt");
        //fw.write(97);//写入单个字符


        char[] chars={'a','b','c','d'};
        fw.write(chars);//写入整个字符数组


        char[] chars1={'a','b','c','d'};
        fw.write(chars1,1,3);//写入字符数组某一部分，off是数组的开始索引，len是写入的个数


        fw.write("写入整个字符串");//写入整个字符串


        fw.write("写入部分字符串",2,2);//写入部分字符串，off是字符串的开始索引，len是写入的字符个数

        fw.flush();
        fw.close();
    }
}
