package cn.yl;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();

        phone.brand="华为";
        phone.color="black";
        phone.price=3999;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.call("小明");
        phone.sendMessage();
        System.out.println(phone);

    }
}
 