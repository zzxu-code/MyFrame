package xumi.spring.demo.design.single;

/**
 * @author: zzxu
 * @date: 2021/5/6 11:06
 * @description:
 */
public class SingleDemo {

    private static SingleDemo singleDemo;

    public static SingleDemo getInstance(){
        if(singleDemo == null){
            synchronized(SingleDemo.class){
                if(singleDemo == null){
                    singleDemo = new SingleDemo();
                }
            }
        }
        return singleDemo;
    }

    public void test(){
        System.out.println("单列模式测试，双重校验机制");
    }
}
