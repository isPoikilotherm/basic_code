package RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Users {
    public Member(String name, Double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> red){
        Random random=new Random();
        int i=random.nextInt(red.size());
        double money=red.remove(i);
        super.setMoney(super.getMoney()+money);
        System.out.println("我叫："+super.getName()+",我抢了"+money+"的红包，"+"我现在有钱："+super.getMoney());
    }
}
