package advancedfeatures.lesson2.enums.country_code_sample;

import java.util.Scanner;

public class CountryCodeMain {

    public static void main(String[] args) {

        for (CountryCode code : CountryCode.values()) {
            System.out.print(code.name());
            System.out.print(code.getCode());
            System.out.print("\n");
        }

        System.out.println("please select country");

        Scanner scanner = new Scanner(System.in);

        String countryName = scanner.nextLine();

        CountryCode selected = CountryCode.valueOf(countryName.toUpperCase());

        System.out.println("please enter telephone number: ");

        System.out.print(selected.getCode());
        String telephone = scanner.next();

        System.out.println("your telephone number is: " + selected.getCode() + telephone);


    }
}
