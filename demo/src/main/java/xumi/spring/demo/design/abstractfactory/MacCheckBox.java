package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:30
 * @description:
 */
public class MacCheckBox implements CheckBoxInterface{
    @Override
    public void paint() {
        System.out.println("MacCheckBox");
    }
}
