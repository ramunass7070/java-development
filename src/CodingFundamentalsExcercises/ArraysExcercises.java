package CodingFundamentalsExcercises;

import java.awt.*;
import java.util.Arrays;

public class ArraysExcercises {
    public static void sumValuesOfArray(int[] input) {
        long output = 0;
        for (int value : input
        ) {
            output += value;
        }
        System.out.print(output);
    }

    public static void averageValueOfArray(int[] input) {
        int sum = 0;
        for (int value : input) {
            sum += value;
        }
        float output = sum / (float) input.length;
        System.out.printf("%.3f", output);
    }

    public static void printAllOddNumbers(int[] input) {
//        int odd = 0;
        for (int value : input) {
            if (value % 2 != 0) {
//                odd+;
                System.out.print(value + ", ");
            }
        }
    }

    public static void findMinMaxValuesOfArray(int[] input) {
        int min = input[0];
        int max = input[0];
        for (int value : input) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.printf("Min=%d, Max=%d", min, max);
    }

    public static void reverseArray(int[] input) {
        int[] output = new int[input.length];
        int i = output.length - 1;
        for (int value : input) {
            output[i] = value;
            i--;
        }
//        for (int val : output) {
//            System.out.print(val + ", ");
//        }
        for (int val : output) {
            System.out.print(val + ", ");

        }
    }

    public static void numberOfEvenAndOddNumber(int[] input) {
        int odd = 0;
        int even = 0;
        for (int value : input) {
            if (value % 2 != 0) {
                odd++;
            } else even++;
        }
        System.out.printf("Odd=%d, Even=%d", odd, even);
    }

    public static void insertNumAtPosition(int[] arr, int num, int pos) {
        int[] output = new int[arr.length];
        System.arraycopy(arr, 0, output, 0, arr.length);
//                Arrays.copyOf(arr, arr.length + 1);
        if (output.length - 1 - pos >= 0) {
            System.arraycopy(output, pos, output, pos + 1, output.length - 1 - pos);
        }
        output[pos] = num;
        for (int value : output) {
            System.out.print(value + " ");
        }
    }

    public static void findDuplicateValues(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                if (input[i] == input[j]) {
                    System.out.print(input[i] + ", ");

                }
            }
        }
    }

    public static void secondLargestElement(int[] input) {
        int min = input[0];
        int max = input[0];
        for (int value : input) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        int secondMin = max;
        int secondMax = min;

        for (int value : input
        ) {
            if (value > secondMax & value < max) {
                secondMax = value;
            }
            if (value < secondMin && value > min) {
                secondMin = value;
            }
        }
        System.out.printf("Min=%d, 2ndMin=%d, 2ndMax=%d, Max=%d ", min, secondMin, secondMax, max);

    }

    public static void pairsOfElementsWhoseSumIs(int[] inputArr, int sum) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length - 1; j++) {
                if ((inputArr[i] + inputArr[j]) == sum) {
                    System.out.printf("%d-%d ", inputArr[i], inputArr[j]);
                }
            }
        }
    }

    public static void main(String... args) {
        int[] input = {1, 7, 3, 10, 9};
//        int[] input = {10, 127, 13, 310, 13};
//        int[] input = {5, 7, 11, 23, 31};
        System.out.println("\n---------ex1-------sum of an array-------");
        sumValuesOfArray(input);
        System.out.println("\n---------ex2-------average value off array-------");
        averageValueOfArray(input);
        System.out.println("\n---------ex3-------print all odd numbers-------");
        printAllOddNumbers(input);
        System.out.println("\n---------ex4-------Find min max values-------");
        findMinMaxValuesOfArray(input);
        System.out.println("\n---------ex5-------Reverse array-------");
        reverseArray(input);
        System.out.println("\n---------ex6-------number of even and odd number------");
        numberOfEvenAndOddNumber(input);
        System.out.println("\n---------ex7-------insert element at spec position-------");
        insertNumAtPosition(input, 0, 4);
        System.out.println("\n---------ex8-------find duplicate values-------");
        {
            int[] input1 = {1, 7, 4, 7, 10, 1, 9};
            findDuplicateValues(input1);
        }
        System.out.println("\n---------ex9-------second Largest element_____-------");
        secondLargestElement(input);
        System.out.println("\n---------ex10-------pairs of elements whose sum is equal to spec num-------");
        {
            int[] input1 = {1, 2, 7, 3, 10, 2, 9};
            pairsOfElementsWhoseSumIs(input1, 8);
        }
    }
}
