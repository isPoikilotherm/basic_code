package OutputStream;

import java.io.*;

public class DemoFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(File.separator+"home"+File.separator+"yangliu"+File.separator+
                "IdeaProjects"+File.separator+"basic_code"+File.separator+"111"+File.separator+"111_4.txt");
        fos.write(97);
        fos.close();
    }

}
