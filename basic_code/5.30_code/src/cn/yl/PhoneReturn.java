package cn.yl;

public class PhoneReturn {
    public static void main(String[] args) {

        Phone phone_1=getPhone();
        System.out.println(phone_1.brand);
        System.out.println(phone_1.price);
        System.out.println(phone_1.color);


    }
    public static Phone getPhone(){
        Phone phone=new Phone();
        phone.brand="华为";
        phone.price=1236.2;
        phone.color="红色";

        return phone;

    }
}
