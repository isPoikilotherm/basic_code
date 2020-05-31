package cn.yl.day5_31_ArrayList;

import cn.yl.day5_31_1.Student;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();

        Student s1=new Student("迪丽热巴",25);
        Student s2=new Student("古力娜扎",26);
        Student s3=new Student("马尔扎哈",100);
        Student s4=new Student("哇啦哇啦",30);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
