package xumi.spring.demo.thread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: zzxu
 * @date: 2021/3/29 9:51
 * @description:
 */
public class MyRejectedExecutorHandle implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        try {
            WorkThreadTtest test = (WorkThreadTtest) r;
            System.out.println(test.getId()+"被丢弃");
            executor.getQueue().put(r);//将线程放回队列
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
