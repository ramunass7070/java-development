package fundamentals_coding.house.using_enums;

import java.util.Random;

public class TestHouse {

    public static void main(String[] args) {

        House[] houses = initializeHouses(305);
        printAllHouses(houses);
        printNewestHouse(houses);
        printFittedHouses(houses);
        printSmallestHouse(houses);
    }

//  House object initiator with random data
    public static House[] initializeHouses(int quantity) {
        Random random = new Random();
        House[] houses = new House[quantity];
        int oldest = 1935;
        int newest = 2020;
        int smallestArea = 22;
        int areaDeviationBound = 50;
//        String[] conditions = {"not finished", "partitially finished", "finished"};       // naudojau kai nebuvo enums
//        String[] districts = {"Fabijoniskes", "Justiniskes", "Riese", "Naujininkai", "Zapyskis", "Centras"};  // nuadojau kai nebuvo enums
        HouseCondition[] conditions = {HouseCondition.FITTED, HouseCondition.NOT_FINISHED, HouseCondition.PARTIALLY_FINISHED};
        HouseDistrict[] districts = {HouseDistrict.ANTAVILIAI, HouseDistrict.FABIJONISKES, HouseDistrict.GIEDRAICIAI, HouseDistrict.JUSTINISKES,
                HouseDistrict.RIESE, HouseDistrict.SAULETEKIAI,HouseDistrict.SAULETEKIS,HouseDistrict.SESKINE, HouseDistrict.CENTRAS, HouseDistrict.ZAPYSKIS,};

        for (int i = 0; i < quantity; i++) {
            double randomArea = smallestArea + random.nextDouble() * 100 + random.nextInt(areaDeviationBound);
            int randomYear = oldest + random.nextInt(newest + 1 - oldest);
            HouseDistrict district = districts[random.nextInt(districts.length)];
            HouseCondition condition = conditions[random.nextInt(conditions.length)];
            houses[i] = new House(randomArea, district, randomYear, condition);
        }

        return houses;
    }

    public static void printAllHouses(House[] houses) {
        System.out.println("All houses:");
        for (House house : houses) {
            house.printHouse();
        }
        System.out.println("");
    }

    public static void printNewestHouse(House[] houses) {
        int builtYear = houses[0].getBuiltYear();
        int maxYear = builtYear;
        for (House house : houses) {
            builtYear = house.getBuiltYear();
            if (builtYear > maxYear) {
                maxYear = builtYear;
            }
        }
        System.out.printf("\nThe last houses were built on year %d:\n", maxYear);
        for (House house : houses) {
            if (house.getBuiltYear() == maxYear) {
                System.out.print("\t\t\t\t\t");
                house.printHouse();
            }
        }
        System.out.println("");
    }

    public static void printFittedHouses(House[] houses) {
        System.out.println("\nFollowing are all fitted/finished houses");
        for (House house : houses) {
            if (house.getCondition() == HouseCondition.FITTED) {
                System.out.printf("\t\t\t\t\t");
                house.printHouse();
            }
        }
    }

    public static void printSmallestHouse(House[] houses) {
        double minArea = houses[0].getHouseArea();
        for (House house : houses) {
            if (minArea > house.getHouseArea()) {
                minArea = house.getHouseArea();
            }
        }
        for (House house : houses) {
            if (house.getHouseArea() == minArea) {
                System.out.printf("%nSmallest area house:%n");
                System.out.print("\t\t\t\t\t");
                house.printHouse();
            }
        }
    }


}

//  CamelCase
//  kebab-case
//  snake_case