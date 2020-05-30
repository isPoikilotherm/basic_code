package cn.yl;
import cn.yl.Student;


public class DemoStudent {

    public static void main(String[] args) {
        /*
         * 创建对象*/
        Student stu=new Student();


        /*
         * 使用成员变量*/
        stu.name="赵丽颖";
        stu.age=23;


        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.sleep();
        stu.study();
    }


}
