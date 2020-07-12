package fundamentals_coding.mobile;

import java.util.Random;

public class TestMobile {
    public static void main(String... args) {
        Mobile[] mobiles = initMobileArray(105);
        System.out.println("All mobiles:");
        printMobiles(mobiles);
        System.out.println("\nMost pricey mobile:\t\t");
        Util.findMostPricey(mobiles).printMobile();
        beginsWith(mobiles, "A");
    }

    public static void beginsWith(Mobile[] mobiles, String start) {
        System.out.printf("\nMobile model begins with \"%s\"%n", start);
        for (Mobile mobile : mobiles) {
            if (mobile.getModel().startsWith(start)) {
                System.out.printf("\t\t");
                mobile.printMobile();
            }
        }
    }

//    public static Mobile findMostPricey(Mobile[] mobiles) {
//        Mobile mostPricey = mobiles[0];
////        double maxPrice = mobiles[0].getPrice();
//        for (Mobile mobile : mobiles) {
//            if (mobile.getPrice() > mostPricey.getPrice()) {
//                mostPricey = mobile;
//            }
//        }
//        return mostPricey;
//    }

    private static void printMobiles(Mobile[] mobiles) {
        for (Mobile mobile : mobiles) {
            mobile.printMobile();
        }
    }

    public static Mobile[] initMobileArray(int size) {
        Mobile[] mobiles = new Mobile[size];
        for (int i = 0; i < size; i++) {
            mobiles[i] = new Mobile(createRandomModel(), getRandomManufacturer(), createRandomPrice(2000));
        }
        return mobiles;
    }

    public static String createRandomModel() {
        StringBuilder modelBuilder = new StringBuilder();
        Random random = new Random();
        modelBuilder.append((char) (65 + random.nextInt(24)));
        for (int i = 0; i < (3 + random.nextInt(4)); i++) {
            modelBuilder.append(1 + random.nextInt(8));
        }
        return modelBuilder.toString();
    }

    public static String getRandomManufacturer() {
        Random random = new Random();
        String[] strings = {"Apple", "BLU Products", "Caterpillar", "Firefly", "Garmin", "Google", "HP",
                "InFocus", "InfoSonics", "Motorola Mobility Subsidiary of Lenovo", "Obi Worldphone", "Nextbit", "Purism", "SPC"};
        return strings[random.nextInt(strings.length)];
    }

    public static double createRandomPrice(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue) - random.nextDouble(); //next double padarys kaina su random verte po kablelio
    }
}
