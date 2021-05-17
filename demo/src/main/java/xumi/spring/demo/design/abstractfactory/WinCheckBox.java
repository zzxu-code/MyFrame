package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:29
 * @description:
 */
public class WinCheckBox implements CheckBoxInterface{
    @Override
    public void paint() {
        System.out.println("WinCheckBox");
    }
}
