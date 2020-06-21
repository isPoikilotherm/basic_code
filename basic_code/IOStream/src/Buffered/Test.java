package Buffered;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> map=new HashMap<>();
        FileReader fr=new FileReader("/home/yangliu/IdeaProjects/basic_code/111/112_4.txt");
        FileWriter fw=new FileWriter("/home/yangliu/IdeaProjects/basic_code/111/112_4_copy.txt");
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        String string;
        while ((string=br.readLine())!=null){
            String[] strings=string.split("\\.");
            map.put(Integer.parseInt(strings[0]),strings[1]);
        }
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            String str=entry.getKey()+entry.getValue();
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
