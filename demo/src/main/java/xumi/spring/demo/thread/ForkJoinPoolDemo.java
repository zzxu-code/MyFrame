package xumi.spring.demo.thread;

import sun.misc.Unsafe;

/**
 * @author: zzxu
 * @date: 2021/4/15 14:30
 * @description:
 */
public class ForkJoinPoolDemo{


    public static void main(String [] args){

        String text = "test";
        Unsafe unsafe =Unsafe.getUnsafe();
        long temp = unsafe.allocateMemory(21);
        unsafe.putChar(20,'王');

    }

}
