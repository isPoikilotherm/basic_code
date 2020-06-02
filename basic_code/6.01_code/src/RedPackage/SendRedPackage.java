package RedPackage;

import java.util.ArrayList;

public class SendRedPackage {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100.0);

        Member one= new Member("张三",0.0);
        Member two= new Member("李四",0.0);
        Member three= new Member("王五",0.0);


        ArrayList<Double> list=manager.send(13.3,3);

        one.receive(list);
        two.receive(list);
        three.receive(list);

    }
}
