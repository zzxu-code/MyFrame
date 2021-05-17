package xumi.spring.demo.design.prototype;

import java.util.List;

/**
 * @author: zzxu
 * @date: 2021/5/17 17:39
 * @description:
 */
public class Circle extends Shape{

    private int radius;

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(){}


    public Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        super.toString();
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
