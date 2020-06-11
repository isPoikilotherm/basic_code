package cn.yl;
import cn.yl.BaoZi;

public class Shop extends Thread  {
    private  BaoZi baoZi;

    public Shop(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.isState()) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    baoZi.setState(true);
                    try {
                        baoZi.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了");
                    baoZi.notify();
                }
            }
        }
    }
}
