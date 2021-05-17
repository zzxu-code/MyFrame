package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:08
 * @description:
 */
public interface BuilderInterface {

    public void buildStepA(String temp);

    public void buildStepB(String temp);

    public void buildStepC();

    public void reset();
}
