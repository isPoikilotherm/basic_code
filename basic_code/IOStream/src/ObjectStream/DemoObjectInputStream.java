package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/home/yangliu/IdeaProjects/basic_code/111/111_3.txt"));
        Object p = ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
