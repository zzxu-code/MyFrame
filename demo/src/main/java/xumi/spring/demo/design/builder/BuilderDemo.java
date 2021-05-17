package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:07
 * @description: 生成器
 */
public class BuilderDemo {
    public static void main(String [] args){
        Director director = new Director();
        ConcreteBuilderA a = new ConcreteBuilderA();
        director.makeSuv(a);
        Manual car = a.getResult();
        System.out.println(car.toString());
    }


}
