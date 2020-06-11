package DemoWaitAndNotify;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object object=new Object();

        //创建一个线程1（消费者）
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要用同步技术
               /* try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                synchronized (object){

                    System.out.println("要求1");
                    try {

                        object.wait(5000);
                        // System.out.println("=========");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("满足要求1");
                }
            }
        }.start();


        //创建一个线程2（消费者）
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要用同步技术
               /* try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                synchronized (object){

                    System.out.println("要求2");
                    try {

                        object.wait(5000);
                        // System.out.println("=========");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("满足要求2");
                }
            }
        }.start();



        //创建一个线程3（生产者）
        new Thread(){
            @Override
            public void run() {
              /*  try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                synchronized (object){
                    System.out.println("满足要求的过程");
                    //object.notify(); //随机唤醒一个线程
                    object.notifyAll();  //唤醒所有线程
                }

            }
        }.start();
    }

    }

