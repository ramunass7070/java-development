package fundamentals_coding.grocery_chopping;

import java.util.Scanner;

public class GroceryShoppingMain {


    public static void main(String[] args) {
        Product[] products = initializeProducts(2);

        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        System.out.println(totalPrice);
    }

    private static Product[] initializeProducts(int size) {
        Product[] products = new Product[size];

        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {

            System.out.println("Iveskite produkto pavadinima");
            String productName = inputScanner.nextLine();

            System.out.println("Iveskite produkto kaina");
            double productPrice = inputScanner.nextDouble();

            inputScanner.nextLine();
            products[i] = new Product(productName, productPrice);
        }
        return products;
    }

}

