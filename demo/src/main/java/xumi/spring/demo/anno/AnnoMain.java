package xumi.spring.demo.anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: zzxu
 * @date: 2021/4/22 11:50
 * @description:
 */
public class AnnoMain {

    public static void main(String [] args){
        test();
    }

    public static void test(){
        try {
            Class cls = Class.forName("xumi.spring.demo.anno.AnnoDemoImpl");
            Method stdy = cls.getDeclaredMethod("test",null);

            Method privt = cls.getDeclaredMethod("privet",null);
            privt.setAccessible(true);
            if(stdy.isAnnotationPresent(Service.class)){
                System.out.println("test这个类已经配置了注解");
                Service service = stdy.getAnnotation(Service.class);
                System.out.println("name " + service.name() + "test" + service.age());
                stdy.invoke(cls.newInstance(),null);

                privt.invoke(cls.newInstance(),null);
            }else{
                System.out.println("这个类没有注解");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
