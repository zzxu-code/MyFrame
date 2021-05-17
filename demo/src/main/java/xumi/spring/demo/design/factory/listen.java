package xumi.spring.demo.design.factory;

/**
 * @author: zzxu
 * @date: 2021/4/20 14:20
 * @description: 工厂模式
 */
public class listen {

    /***
     * windows
     */
    public static final String WINDOWS_TYPE = "windows";
    /***
     * linux
     */
    public static final String LINUX_TYPE = "linux";

    public static void main(String [] args){
       listen liste= new listen();
       Listeners listeners = liste.test(listen.LINUX_TYPE);
        listeners.handle(":");
    }

    public Listeners test(String config){
        Listeners listeners = null;
        if(config.equals(listen.WINDOWS_TYPE)){
            listeners = new TestAb();
        }else if (config.equals(listen.LINUX_TYPE)){
            listeners = new TestAc();
        }else {
            System.out.println("错误");
        }

      return listeners;

    }
    //子类AB
  class TestAb extends AbstaractPub{
    @Override
    protected void handle() {
        System.out.println("testAb");
    }
  }
    //子类AC
    class TestAc extends AbstaractPub{
        @Override
        protected void handle() {
            System.out.println("TestAc");
        }
    }
}
