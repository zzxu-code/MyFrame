package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:18
 * @description:
 */
public class MacFactory implements GuiInterface{


    @Override
    public ButtonInterface createButton() {
        return new MacButton();
    }

    @Override
    public CheckBoxInterface createCheckBox() {
        return new MacCheckBox();
    }
}
