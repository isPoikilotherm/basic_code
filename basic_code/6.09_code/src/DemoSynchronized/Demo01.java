package DemoSynchronized;

public class Demo01 {
    public static void main(String[] args) {


        RunnableImpl runnable=new RunnableImpl();

        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);


        thread.start();
        thread1.start();
        thread2.start();

    }
}
