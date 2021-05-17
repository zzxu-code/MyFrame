package xumi.spring.demo.utils;

import xumi.spring.demo.domian.ClientUser;

import java.util.Optional;

/**
 * @author: zzxu
 * @date: 2021/4/27 14:03
 * @description:
 */
public class OptionalDemo {

    public static void main(String [] args){
        String val = null;
        Optional<String> str = Optional.ofNullable(val);
        str.orElse("tes");
        str.ifPresent(System.out::println);

        ClientUser user = new ClientUser(null,"描述");
        String temp = Optional.ofNullable(user).map(u -> u.getName()).map(p -> p.toUpperCase()).orElse(null);

        System.out.println(temp);

        /*Optional.ofNullable(val).ifPresent(e->{
            System.out.println(e);
        });*/
    }
}
