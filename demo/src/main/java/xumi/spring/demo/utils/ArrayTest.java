package xumi.spring.demo.utils;

import xumi.spring.demo.domian.ClientUser;

import java.util.Arrays;
import java.util.List;

/**
 * @author: zzxu
 * @date: 2021/3/31 10:13
 * @description:
 */
public class ArrayTest {

    public static void main(String [] args){
        /*List<ClientUser> test = allUser();
        System.out.println(Arrays.toString(test.toArray()));*/
        System.out.println(Arrays.equals(arraysFill(),arraysSort()));
    }

    /***
     * Arrays.sort赋值
     * @return
     */
    public static int [] arraysSort(){
        int [] array = new int[]{4, 4, 4, 0, 4};
        Arrays.sort(array);
        return array;
    }

    /***
     * Arrays.fill赋值
     * @return
     */
    public static int [] arraysFill(){
        int [] array = new int[5];
        Arrays.fill(array,1,5,4);
        return array;
    }

    /***
     * Arrays.asList
     * @return
     */
    public static List<ClientUser> allUser(){
        return Arrays.asList(new ClientUser("test","aaaaaa"),new ClientUser("test12","fffff"));
    }


}
