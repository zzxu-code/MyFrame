package xumi.spring.demo.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zzxu
 * @date: 2021/5/17 17:42
 * @description:
 */
public class PrototypeDemo {

    public static void main(String [] args){
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        circle.setY(10);
        circle.setX(23);
        circle.setRadius(30);
        shapes.add(circle);

        Circle another = (Circle) circle.clone();
        shapes.add(another);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWeight(20);
        shapes.add(rectangle);

        shapes.stream().forEach(s ->{
            System.out.println(s.toString());
        });
    }
}
