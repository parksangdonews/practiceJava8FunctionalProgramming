package com.parksangdo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Function Type : apply , identity

        final Function<String, Integer> toInt = s -> Integer.parseInt(s);
        final Integer number = toInt.apply("100");
        System.out.println(number);

        //final Function<Integer, Integer> identity = Function.identity();
        final Function<Integer, Integer> identity = t -> t;
        System.out.println(identity.apply(999));

        final Consumer<String> print = s -> System.out.println(s);
        print.accept("to print blah blah");

        // Predicate ( return boolean )
        Predicate<Integer> isPostive = integer -> integer > 0;

        System.out.println(isPostive.test(-1));
        System.out.println(isPostive.test(0));
        System.out.println(isPostive.test(1));

        List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        List<Integer> positiveNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if(isPostive.test(num)) {
                positiveNumbers.add(num);
            }
        }



        Predicate<Integer> lessThan3 = i -> i < 3;

       for (Integer num : numbers) {
            if(lessThan3.test(num)) {
                positiveNumbers.add(num);
            }
        }





    }
}

