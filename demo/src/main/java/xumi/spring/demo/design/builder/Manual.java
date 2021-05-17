package xumi.spring.demo.design.builder;

/**
 * @author: zzxu
 * @date: 2021/5/12 16:13
 * @description:
 */
public class Manual {

    private String a;

    private String b;

    public Manual() {
    }

    public Manual(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
