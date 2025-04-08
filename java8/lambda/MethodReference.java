package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("vivek","virat");
        list.forEach(System.out::println);

        Function<Integer,Integer> function = (x)-> x.compareTo(20);
        System.out.println(function.apply(20));

        Consumer<String> con = (System.out::println);
        con.accept("vivek");

    }
}

