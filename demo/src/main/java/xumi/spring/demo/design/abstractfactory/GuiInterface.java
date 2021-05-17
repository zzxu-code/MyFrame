package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:16
 * @description:
 */
public interface GuiInterface {

    ButtonInterface createButton();

    CheckBoxInterface createCheckBox();
}
