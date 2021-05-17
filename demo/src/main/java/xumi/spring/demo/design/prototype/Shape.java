package xumi.spring.demo.design.prototype;

/**
 * @author: zzxu
 * @date: 2021/5/17 17:27
 * @description:
 */
public abstract class Shape {

    public Shape(){

    }

    public Shape(Shape shape){
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public Shape(int x,int y,String color){
        this();
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape clone();

    private int x;

    private int y;

    private String color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
