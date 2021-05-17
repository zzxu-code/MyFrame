package xumi.spring.demo.design.factory;

/**
 * @author: zzxu
 * @date: 2021/4/20 14:17
 * @description:
 */
public abstract class AbstaractPub implements Listeners{




    @Override
    public void handle(String msg) {
        System.out.println("Listeners");
        handle();
    }

    protected abstract void handle();


}
