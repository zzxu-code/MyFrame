package xumi.spring.demo.thread;

import java.util.concurrent.*;

/**
 * @author: zzxu
 * @date: 2021/3/29 9:31
 * @description:
 */
public class ThreadStudy {

    public static final int corePoolSize = 2;
    public static final int maxPoolSize = 5;
    public static final long keepAliveTime = 0L;
    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            corePoolSize,
            maxPoolSize,
            keepAliveTime,
            TimeUnit.MICROSECONDS,
            new ArrayBlockingQueue<>(3),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy());


    public static void main(String [] args){
        for (int i=0;i<20;i++){
            poolExecutor.execute(new WorkThreadTtest(i));
        }
        poolExecutor.shutdown();

    }
}