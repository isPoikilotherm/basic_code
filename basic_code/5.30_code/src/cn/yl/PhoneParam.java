package cn.yl;

public class PhoneParam {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="苹果";
        phone.price=5999;
        phone.color="红色";

        method(phone);


    }

    public static void method(Phone phone) {
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

    }
}
