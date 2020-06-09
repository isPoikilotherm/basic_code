package DemoLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl2 implements Runnable {
    private int ticket=100;

    Lock lock=new ReentrantLock();


    //Object object =new Object();


    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0) {
                System.out.println("线程" + Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
                lock.unlock();
            }else {
                break;
            }
//            lock.unlock();
        }

    }

/*    public synchronized void method(){
       //while (true){
           if (ticket>0) {
               System.out.println("线程" + Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
               ticket--;
           }
     //      }else {
         //      break;
        //   }
       }*/
}

