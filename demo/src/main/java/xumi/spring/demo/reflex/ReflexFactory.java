package xumi.spring.demo.reflex;

import xumi.spring.demo.exception.ChannelException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: zzxu
 * @date: 2021/4/14 10:09
 * @description:
 */
public class ReflexFactory<T>{

/*    private final Constructor<T> constructor;
    public ReflexFactory(Class<T> clazz) {
        if(clazz == null){
            throw new NullPointerException("class");
        }
        try {
            this.constructor = clazz.getConstructor();
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("class");
        }
    }*/
    public ReflexFactory(){}



    public void test(){
        try {
            Method method = this.getClass().getDeclaredMethod("temps",String.class);
            method.setAccessible(true);
            method.invoke(this,"testsssssss");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void temps(String test){
        System.out.println("temps成功"+test);
    }

    public static void main(String [] args){
        new ReflexFactory<>().test();
    }

/*    @Override
    public T newInstance() {
        try {
            return constructor.newInstance();
        } catch (Throwable e) {
            return null;
            //throw new ChannelException("Unable to create Channel from class " + constructor.getDeclaringClass(), t);
        }
    }*/
}
