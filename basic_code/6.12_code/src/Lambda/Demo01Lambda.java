package Lambda;

public class Demo01Lambda {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();




        //Lambda表达式
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();



        //Lambda表达式省略
        new Thread(()->
            System.out.println(Thread.currentThread().getName() + "新线程创建了1")
        ).start();





    }


    //Lambda表达式

}

