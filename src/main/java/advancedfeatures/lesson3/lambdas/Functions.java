package advancedfeatures.lesson3.lambdas;

import java.util.function.Function; // functional interface

public class Functions {

    public static void main(String[] args) {

        Function<String, Integer> lengthFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(lengthFunction.apply("City"));   // "funkcine paradigma"


        Function<Integer, String> function = integer -> {
            if (integer == 1) {
                return "mango";
            } else {
                return "mangoes";
            }
        };

        System.out.println(function.apply(2));

        int arg = 0;

        Function<Integer, Integer> numFn = x -> x * 10; //only or executes last
        System.out.println(" x -> x * 10; arg:" + arg);
        System.out.println(numFn.apply(arg));

        // funkcijos gali buti chaininamos pries (before) ir poto ()

        numFn = numFn.compose(x -> x + 20); // executes before last

        System.out.println(" x -> x + 20; arg:" + arg);
        System.out.println(numFn.apply(arg));

        numFn = numFn.compose(x -> x - 50); // executes first

        System.out.println(" x -> x - 50; arg:" + arg);
        System.out.println(numFn.apply(arg));


        System.out.println("======use of andThen =======");
        // Function interface, use of "andThen" executes in reverse order related to "compose" impl.

        int arg2 = 10;

        Function<Integer, Integer> numFn2 = x -> x * 10; //only or executes last
        System.out.println(" x -> x * 10; arg:" + arg2);
        System.out.println(numFn2.apply(arg2));

        // funkcijos gali buti chaininamos pries (before) ir poto ()

        numFn2 = numFn2.andThen(x -> x + 20); // executes before last

        System.out.println(" x -> x + 20; arg:" + arg2);
        System.out.println(numFn2.apply(arg2));

        numFn2 = numFn2.andThen(x -> x - 50); // executes first

        System.out.println(" x -> x - 50; arg:" + arg2);
        System.out.println(numFn2.apply(arg2));
    }
}
