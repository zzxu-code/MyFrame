package xumi.spring.demo.anno;

/**
 * @author: zzxu
 * @date: 2021/4/22 11:47
 * @description:
 */
public class AnnoDemoImpl {

    @Service(name = "徐米",age = 23)
    public void test(){
        System.out.println("study annotion");
    }

    private void privet(){
        System.out.println("这是一个私有方法");
    }

}
