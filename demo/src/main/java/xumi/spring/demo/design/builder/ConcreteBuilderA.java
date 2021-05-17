package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:09
 * @description:
 */
public class ConcreteBuilderA implements BuilderInterface{
    
    public ConcreteBuilderA(){
        this.reset();
    }

    private Manual manual;


    @Override
    public void buildStepA(String temp) {
        manual.setB(temp);
    }

    @Override
    public void buildStepB(String temp) {
        manual.setA(temp);
    }

    @Override
    public void buildStepC() {

    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    public Manual getResult(){
        return manual;
    }
}
