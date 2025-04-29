package java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        Stream<String> a = Stream.of("a", "b");

        Stream<Integer> generated = Stream.generate(() -> 1).limit(5);
        generated.forEach(System.out::println);

        Stream<Integer> iterated = Stream.iterate(1, x -> x + 1).limit(5);
        iterated.forEach(System.out::println);
        List<String> list1 = Arrays.asList("Vivek", "Virat", "Rohit", "Sachin");
        long count = list1.stream().filter(x -> x.startsWith("V")).count();
        System.out.println(count);

        List<Integer> squared = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squared);
        List<Integer> evens = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evens);


        List<String> sortedNames = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctList = listWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);



        List<Integer> limited = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(limited);

        List<Integer> skipped = list.stream().skip(2).collect(Collectors.toList());
        System.out.println(skipped);

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );
        List<String> flatMapped = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatMapped);
        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Map<String, Integer> nameLengthMap = list1.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(nameLengthMap);



        boolean anyEven = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyEven);

        boolean allPositive = list.stream().allMatch(x -> x > 0);
        System.out.println(allPositive);
        boolean noneNegative = list.stream().noneMatch(x -> x < 0);
        System.out.println(noneNegative);



        Optional<Integer> first = list.stream().findFirst();
        first.ifPresent(value -> System.out.println(value));


        Optional<Integer> any = list.stream().findAny();
        any.ifPresent(value -> System.out.println(value));
        int parallelSum = list.parallelStream().reduce(0, Integer::sum);
        System.out.println(parallelSum);


        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
