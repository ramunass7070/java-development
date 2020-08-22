package advancedfeatures.lesson3.exceptions;

import java.util.Scanner;

public class DoubleScanner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }

        System.out.println("\n========= Scanner autoclose, with try() catch() blcok===========================");

//        // autoclose 5vyksta jeigu try() bloke sliaustuose ikisi norima uzdaryti objekta
        System.out.println("enter number: ");
        try (Scanner scanner1 = new Scanner(System.in)) {
            String input1 = scanner1.nextLine();
            int num2 = Integer.parseInt(input1);
            int answer2 = 44 / num2;
            System.out.println("answer: " + answer2);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("bad input");
            System.out.println(e.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("thanks for using our calc");
        }
    }
}
