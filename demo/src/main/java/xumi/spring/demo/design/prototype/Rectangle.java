package xumi.spring.demo.design.prototype;

import org.w3c.dom.css.Rect;

/**
 * @author: zzxu
 * @date: 2021/5/17 17:30
 * @description:
 */
public class Rectangle extends Shape{

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }


    public Rectangle(){}

    public Rectangle(Rectangle source) {
        super(source);
        this.weight = source.weight;
        this.height = source.height;
    }

    private int weight;

    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        super.toString();
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
