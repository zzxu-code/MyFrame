package xumi.spring.demo.thread;

/**
 * @author: zzxu
 * @date: 2021/3/29 9:48
 * @description:
 */
public class WorkThreadTtest implements Runnable{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkThreadTtest(int id) {
        super();
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("正常执行"+id);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
