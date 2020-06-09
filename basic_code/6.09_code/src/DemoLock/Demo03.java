package DemoLock;

public class Demo03 {
    public static void main(String[] args) {


        RunnableImpl2 runnable=new RunnableImpl2();

        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);


        thread.start();
        thread1.start();
        thread2.start();

    }
}
