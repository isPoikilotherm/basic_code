package RedPackage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Manager extends Users {
    public Manager(String name, Double money) {
        super(name, money);
    }

    public ArrayList<Double> send(double totalmoney,int count){
        ArrayList<Double> red=new ArrayList<>();


        double recentmoney=super.getMoney();
        if (totalmoney>recentmoney){
            System.out.println("余额不足");
            return red;
        }
        double onemoney = totalmoney/count;
        BigDecimal bg = new BigDecimal(onemoney);
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
        super.setMoney(recentmoney-totalmoney);
        for (int i = 0; i < count; i++) {
            if (i==count-1){
                BigDecimal bg1 = new BigDecimal(totalmoney-(f1*(count-1)));
                double one = bg1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.println(one);
                red.add(one);
            }else {
                red.add(f1);
            }

        }
        System.out.println("我发了"+count+"个红包，一共"+totalmoney+"块钱,我现在还有"+super.getMoney());
        return red;

    }
}
