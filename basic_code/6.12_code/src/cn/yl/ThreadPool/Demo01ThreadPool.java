package cn.yl.ThreadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        //生产线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //sunmit方法传递线程任务，开启线程，执行run方法
        es.submit(new RunnableImpl());//pool-1-thread-1创建了一个新的线程执行
        es.submit(new RunnableImpl());//pool-1-thread-1创建了一个新的线程执行
        es.submit(new RunnableImpl());//pool-1-thread-2创建了一个新的线程执行

        es.shutdown();

    }


}
