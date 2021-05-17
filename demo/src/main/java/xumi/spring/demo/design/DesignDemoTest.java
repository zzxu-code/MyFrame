package xumi.spring.demo.design;

import xumi.spring.demo.design.single.SingleDemo;

import javax.xml.xpath.*;
import java.util.Calendar;
import java.util.EnumSet;

/**
 * @author: zzxu
 * @date: 2021/5/6 11:10
 * @description: 单例模式
 */
public class DesignDemoTest {

    public static void main(String [] args){

        XPathFactory factory = XPathFactory.newInstance();


        //单列模式
        SingleDemo.getInstance().test();


    }
}
