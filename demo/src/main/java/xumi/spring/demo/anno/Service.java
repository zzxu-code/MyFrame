package xumi.spring.demo.anno;

import java.lang.annotation.*;

/**
 * @author: zzxu
 * @date: 2021/4/22 11:44
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {

    /***
     * 姓名
     * @return
     */
     String name();

    /***
     * 年龄
     * @return
     */
    int age();

}
