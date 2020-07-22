package ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("张三",15));
        list.add(new Person("李四",16));
        list.add(new Person("王五",17));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("111/111_list.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("111/111_list.txt"));
        Object object = ois.readObject();
        ArrayList<Person> list1=(ArrayList<Person>)object;
        for (Person person : list1) {
            System.out.println(person);
        }
        ois.close();
       // System.out.write(97);


    }
}
