package java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Basic extends Thread{

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            System.out.println("Hello World");
        });
        t1.start();

        MathOperations addOperation = (a,b)-> a+b;
        MathOperations subOperations = (a,b)-> a-b;
        MathOperations mulOperations = (a,b)-> a*b;
        MathOperations divOperations = (a,b)-> b/a;

        System.out.println(addOperation.operate(2,2));
        System.out.println(subOperations.operate(2,2));
        System.out.println(mulOperations.operate(2,2));
        System.out.println(divOperations.operate(2,2));

        Predicate<Integer> predicate = x-> x % 2 == 0;
        System.out.println(predicate.test(4));

        Predicate<String> pred = x-> x.startsWith("v");
        System.out.println(pred.test("vivek"));

        Function<Integer,Integer> doubleIt = x -> 2 * x;
        Function<Integer,Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(100));

        Predicate<Integer> predicate1 = x -> x % 2==0;
        Function<Integer,Integer> fun = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate1.test(supplier.get())){
            consumer.accept(fun.apply(supplier.get()));
        }

        Supplier<String> supply = () -> "Ranjit";
        System.out.println(supply.get());
    }
}


@FunctionalInterface
interface MathOperations {
    int operate (int a,int b);
}

@FunctionalInterface
interface StringOperations{
    String checkString(String str);
}
