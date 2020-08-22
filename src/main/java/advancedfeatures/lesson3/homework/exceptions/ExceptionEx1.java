package advancedfeatures.lesson3.homework.exceptions;

import java.util.Scanner;

public class ExceptionEx1 {
    public static void main(String[] args) {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
            Integer outputInt = Integer.parseInt(input);

            System.out.printf("int -> %d\n", outputInt);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

    }
}

