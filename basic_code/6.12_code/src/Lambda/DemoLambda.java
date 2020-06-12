package Lambda;

public class DemoLambda {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();

        Thread thread = new Thread(runnable);

        thread.start();

      /*  Runnable runnable1 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        };*/
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();
    }
}
