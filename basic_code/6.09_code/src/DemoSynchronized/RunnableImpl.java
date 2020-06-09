package DemoSynchronized;

import java.util.Objects;

public class RunnableImpl implements Runnable {
    private int ticket=100;


    Object object =new Object();


    @Override
    public void run() {
        while (true){
          synchronized (object /*this  也可以，不用新建对象*/){
              if (ticket>0){
                  System.out.println("线程"+Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                  ticket--;
              }else {
                  break;
              }
          }
        }

    }
}
