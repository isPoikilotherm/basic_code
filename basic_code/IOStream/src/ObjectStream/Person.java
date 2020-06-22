package ObjectStream;

import java.io.Serializable;

public class Person implements Serializable {//想要进行序列化或者反序列化，需要实现Serializable借口（标记型接口）
    private static final long serialVersionUID=53L;//手动添加serialVersionUID，类发生改变后不会报ID不同异常
    private String name;
    private int age;




    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
