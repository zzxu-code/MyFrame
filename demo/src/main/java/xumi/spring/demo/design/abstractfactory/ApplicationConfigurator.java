package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 17:00
 * @description:
 */
public class ApplicationConfigurator {

    private GuiInterface factory;

    public static void main(String [] args){
        ApplicationConfigurator configurator = new ApplicationConfigurator();
        configurator.config("mac");
    }

    public void config(String type){
        if(type.equals("windows")){
            factory = new WinFactory();
        }else if(type.equals("mac")){
            factory = new MacFactory();
        }else{
            System.out.println("未知的操作系统");
        }

        ApplicationFactory app = new ApplicationFactory(factory);
        app.createCreateButton();
        app.createCreateCheckBox();

        app.buttonPaint();
        app.checkBoxPaint();
    }
}
