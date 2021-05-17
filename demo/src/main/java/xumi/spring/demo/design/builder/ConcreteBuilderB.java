package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:09
 * @description:
 */
public class ConcreteBuilderB implements BuilderInterface{

    private Car car;

    public ConcreteBuilderB(){
        this.reset();
    }

    @Override
    public void buildStepA(String temp) {
        car.setA(temp);
    }

    @Override
    public void buildStepB(String temp) {
        car.setB(temp);
    }

    @Override
    public void buildStepC() {

    }

    @Override
    public void reset() {
        car = new Car();
    }

    public Car getResult(){
        return car;
    }
}
