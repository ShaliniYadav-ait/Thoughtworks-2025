package July02;

import java.util.function.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;

public class FunctionalDemo {
    private static Logger logger = Logger.getLogger("Demo");

    public static void print(Object obj){logger.log(Level.INFO, obj.toString());}
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("Hello!");

        Consumer<String> c2 = System.out::print;
        c2.accept("World!");

        Predicate<Integer> positive = (x)->x>=0;
        System.out.println(positive.test(-5));
        System.out.println(positive.test(9));

        Predicate<Integer> even = (x) -> x%2 == 0;
        System.out.println(even.test(3));
        System.out.println(even.test(4));

        BiPredicate<String, String> contain = (s1,s2) -> s1.contains(s2);
        System.out.println(contain.test("Hello","a"));
        System.out.println(contain.test("Hello","l"));

        Function<Integer,Integer> square = (x) -> x*x;
        System.out.println(square.apply(5));

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a+b;
        System.out.println(sum.apply(9,6));
    }
}
