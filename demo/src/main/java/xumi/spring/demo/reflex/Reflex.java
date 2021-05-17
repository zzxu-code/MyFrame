package xumi.spring.demo.reflex;

/**
 * @author: zzxu
 * @date: 2021/4/14 10:35
 * @description:
 */
public interface Reflex<T> {
    public T newInstance();
}
