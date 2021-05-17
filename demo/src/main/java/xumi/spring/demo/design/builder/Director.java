package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:08
 * @description:
 */
public class Director {

    public void makeSuv(BuilderInterface builder){
        builder.buildStepA("22");
        builder.buildStepB("11");
    }
}
