package advancedfeatures.lesson3.exceptions;

import java.util.Scanner;

public class ExceptionSample {

    public static void main(String... args) {
        System.out.println("\n===============pvz su array ir index bound array exception========================");
        int[] arr = new int[2];

        arr[0] = 1;

        try {
            arr[3] = 0; // bandom irasyti i index 3 pozicija
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("unexpected index out of bounds arr");
        }

        System.out.println("====after=try=catch===block======");

//toliau pvz su string array ir null pointer
        System.out.println("\n===============pvz su string array ir null pointer========================");

        String[] arrStr = new String[2];

        arrStr[0] = "1";
        arrStr[1] = null;

        // sekancias dvi eilutes bandom paleisti su try catch ir be
//        arrStr[3] = "0"; // bandom irasyti i index 3 pozicija
//        System.out.println(arrStr[1].toUpperCase());

        try {
            arrStr[3] = "0"; // bandom irasyti i index 3 pozicija
            System.out.println(arrStr[1].toUpperCase());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("unexpected index out of bounds" + indexOutOfBoundsException.getMessage());
        } catch (NullPointerException nullPointerException) {
            System.out.println("null pointer exception" + nullPointerException.getMessage());
        } catch (Exception e) {
            System.out.println("\n==unexpected index out of bounds at arrSTR==");
            System.out.println(e.toString());
        }

        System.out.println("====after=2nd=try-catch===block======");

        System.out.println("\n===============division by 0========================");
        // bandom dalyba is 0

        try {
            int answer = 5 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmeticException found: " + arithmeticException.getMessage());
        }

        System.out.println("\n===========savadarbis exception===========================");
        // pabandom patys ismesti exception su tam tikrom salygom ir patys pagaunam. by default Java ismeta exception, o
//        mes tik gaudom ir jeigu buvo ismesta, pagaunam :)

        int width = 7;
        int height = 1;

        try {
            int answer = width * height;
            if (answer == 0) {
                throw new ArithmeticException("widht and height must be above 0");
            }
            System.out.println(answer);
            System.out.println("line after exception thrown. will not be printed, if above exception is thrown");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=========Multi exception catch, Scanner, parseInt ===========================");
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            int answer = 44 / num;
            System.out.println("answer: " + answer);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("bad input");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("\n========= Scanner autoclose, with try===========================");

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
        } finally {
            System.out.println("thanks for using our calc");
        }


// gera praktika yra uzdaryti Scanneri panaudojus, antraip lieka atviras port (atidaras failas ar kt.)
        System.out.println("program ended");

    }

}
