package advancedfeatures.lesson4.streams.iterations_with_stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterationsWithStream {

    public static void main(String[] args) {

//        for ciklas su stream ir lambda ir oohoooho

        Stream.iterate(1, i -> i + 1)
                .filter(num -> num % 5 == 0)
                .limit(5)
                .forEach(num -> System.out.println(num));

        System.out.println("===  ===  ===");
        Map<String, Integer> result = Stream.iterate(10, i -> i + 2)
                .filter(num -> num % 5 == 0)
                .limit(12)
                .collect(Collectors.toMap(num -> "number " + num, num -> num));

        System.out.println(result);
    }
}
