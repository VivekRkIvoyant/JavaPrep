package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maps {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("vivek", "virat", "Rahul");
        List<String> lowerCased = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerCased);
        List<Integer> integerList = Arrays.asList(122, 123, 124, 125, 126, 127);
        long count = integerList.stream().filter(x -> x < 0).count();

        System.out.println(count);


        List<Integer> comparedList = integerList.stream()
                .map(x -> x.compareTo(124))
                .collect(Collectors.toList());
        System.out.println(comparedList);
        List<String> stringList = Arrays.asList("vivek", "rohit", "abhi");
        List<Integer> nameLengths = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(nameLengths);


        List<String> upperCased = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCased);
        List<String> greetings = stringList.stream()
                .map(name -> name)
                .collect(Collectors.toList());
        System.out.println(greetings);
    }
}