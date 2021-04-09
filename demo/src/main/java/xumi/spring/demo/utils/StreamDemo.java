package xumi.spring.demo.utils;

import com.sun.xml.internal.stream.buffer.stax.StreamWriterBufferProcessor;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: zzxu
 * @date: 2021/3/26 16:43
 * @description:
 */
public class StreamDemo {

    public static List<String> field =  new ArrayList<>();
    static {
        field = Arrays.asList("aaaaaaaaaa","abbbbbbbbbbbbb","accccccccccc","addddddddddd","aaadsadasdsa");
    }

    public static void main(String [] args){
        Boolean result = anymatch();
       String temp =  field.stream().filter(e -> e.startsWith("a")).findAny().get();
        System.out.println(temp);
    }

    public static boolean allmatch(){
        Boolean result = field.stream().allMatch(e -> {
            return !StringUtils.isEmpty(e);
        });
        return result;
    }

    public static boolean anymatch(){
        Boolean result = field.stream().anyMatch(e -> {
            return !StringUtils.isEmpty(e);
        });
        return result;
    }
}
