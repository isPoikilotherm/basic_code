package DemoSynchronizedMethod;

public class RunnableImpl1 implements Runnable {
    private int ticket=100;


    //Object object =new Object();


    @Override
    public void run() {
        while (ticket>0){
            method();
        }

    }

    public synchronized void method(){
       //while (true){
           if (ticket>0) {
               System.out.println("线程" + Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
               ticket--;
           }
     //      }else {
         //      break;
        //   }
       }
}

