package ObjectStream;


/*
* ObjectOutputStream:把对象以流的方式写入文件
*
* */

import java.io.*;

public class DemoObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/home/yangliu/IdeaProjects/basic_code/111/111_3.txt"));
        Person person=new Person("杨柳",22);
        oos.writeObject(person);
        oos.flush();


        oos.close();




    }
}
