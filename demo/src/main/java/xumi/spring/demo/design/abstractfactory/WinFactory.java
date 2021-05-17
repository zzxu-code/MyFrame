package xumi.spring.demo.design.abstractfactory;

import javafx.scene.control.Button;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:17
 * @description:
 */
public class WinFactory implements GuiInterface {

    @Override
    public ButtonInterface createButton() {
        return new WinButton();
    }

    @Override
    public CheckBoxInterface createCheckBox() {
        return new WinCheckBox();
    }
}
