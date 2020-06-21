package Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_1.txt");
//        int read=0;
//        while ((read=fr.read())!=-1){
//            System.out.println((char) read);
//        }


        char[] chars=new char[12];
        int read=0;
        while ((read=fr.read(chars))!=-1){
            System.out.println((new String(chars,0,read)));//String类的构造方法：String（char【】 calue）
                                                    //String（char【】 calue，int offset,int count）:把字符数组的一部分转换为字符串 offset是开始索引，count是个数
        }

        fr.close();

    }
}
