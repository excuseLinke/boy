package ncom.example.EffiectiveJava;

import com.example.EffiectiveJava.A;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by linke on 2017/11/26.
 */
public class d {
    public static void main(String[] args) {
        //cc(System.out::println);
        Stream<Integer> stream =Stream.of(1,2,3,4);
        Optional<Integer> optional = stream.reduce(Integer::sum);
        System.out.println(optional.get());


    }
    static void cc(A aa){
        aa.get("123");
    }
}
