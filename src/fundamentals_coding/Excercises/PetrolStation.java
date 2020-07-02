package fundamentals_coding.Excercises;

import fundamentals_coding.petrol_station.Petrol;

import java.util.Scanner;

public class PetrolStation {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPaid = 0;
        double amountFilled = 0;
        double fuelPrice = 1.25;
        String input = "continue";

        while (input == "continue") {

            System.out.println("enter fuel amount");
            amountFilled += scanner.nextDouble();

            System.out.println("enter money given");
            moneyPaid += scanner.nextDouble();

            System.out.println("continue?");
            input = scanner.next();
        }

        double totalCost = amountFilled*Petrol.getPrice();

        System.out.printf("money paid %.2f%n", moneyPaid);
        System.out.printf("amountFilled %.2f%n", amountFilled);
        System.out.printf("fuel filled costs %.3f%n", moneyPaid );

        if (totalCost > moneyPaid) {
            System.out.printf("please pay difference %.2f%n", totalCost - moneyPaid);
        }

        if (totalCost < moneyPaid) {
            System.out.printf("paid too much; there is a change of%n %.2f%n", moneyPaid-totalCost);
        }

        if (totalCost == moneyPaid) {
            System.out.printf("paid exact amount of $$$ %.2f%n", totalCost - moneyPaid);
        }

    }

    public static void refuel(double amount, double money) {

    }

//    public static void refuel(double amount, double money) {
//
//    }

//    public static void refuel(double amount, double money) {
//
//    }


}
