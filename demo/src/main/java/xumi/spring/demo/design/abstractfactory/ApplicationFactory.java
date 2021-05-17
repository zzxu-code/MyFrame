package xumi.spring.demo.design.abstractfactory;

import org.springframework.context.ApplicationContextAware;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:54
 * @description:
 */
public class ApplicationFactory {
    private GuiInterface guiInterface;

    private ButtonInterface button;
    private CheckBoxInterface checkBox;

    public ApplicationFactory(GuiInterface factory){
        this.guiInterface = factory;
    }

    public void createCreateButton(){
        this.button = this.guiInterface.createButton();
    }

    public void createCreateCheckBox(){
        this.checkBox = this.guiInterface.createCheckBox();
    }

    public void buttonPaint(){
        this.button.paint();
    }

    public void checkBoxPaint(){
        this.checkBox.paint();
    }
}
