package cn.yl.day5_31;


public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();

        stu.setName("敖吉");
        stu.setAge(24);
        stu.setMale(true);


        System.out.println("姓名:"+stu.getName());
        System.out.println("年龄:"+stu.getAge());
        System.out.println("是不是男人："+stu.isMale());

    }
}
