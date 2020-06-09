package DemoSynchronizedMethod;

public class Demo02 {
    public static void main(String[] args) {


        RunnableImpl1 runnable=new RunnableImpl1();

        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);


        thread.start();
        thread1.start();
        thread2.start();

    }
}
