package cn.yl;

public class Customer extends Thread{
    private BaoZi baoZi;

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.isState()) {
                    System.out.println("吃包子");
                    try {
                        baoZi.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baoZi.setState(false);
                    baoZi.notify();
                } else {
                    try {
                        System.out.println("快做包子");
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
