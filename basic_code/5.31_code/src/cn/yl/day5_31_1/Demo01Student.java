package cn.yl.day5_31_1;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("杨柳");
        stu1.setAge(20);
        System.out.println("姓名："+stu1.getName()+"，年龄："+stu1.getAge());

        System.out.println("=====================");

        Student stu2=new Student("敖吉",26);
        System.out.println("姓名："+stu2.getName()+"，年龄："+stu2.getAge());

        stu2.setAge(30);
        System.out.println("姓名："+stu2.getName()+"，年龄："+stu2.getAge());
    }
}
