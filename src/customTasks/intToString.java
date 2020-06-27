package customTasks;

public class intToString {

    public static void numToStr(int input) {
        int thousands = input / 1000; //skaiciavimas simtai -> bet koki skaiciu skaidome;
        int hundreds = (input % 1000) / 100; //skaiciavimas simtai -> bet koki skaiciu skaidome;
        int tens = (input % 100) / 10; // desimtis
        int ones = (input % 100 % 10); // vienetai
        String[] decades = {"", "ten", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety"};
        String[] teens = {" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
        String[] nums = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"};
        StringBuilder output = new StringBuilder();
        if (thousands > 0) {
            output.append(nums[thousands]).append(" thousand");
        }
        if (hundreds > 0) {
            output.append(nums[hundreds]).append(" hundred");
        }
        if (tens >= 2) {
            output.append(decades[tens]);
            output.append(nums[ones]);
        } else if (tens == 1) {
            output.append(teens[ones]);
        } else {
            output.append(nums[ones]);
            output.append(decades[tens]);
        }
        System.out.printf("%d, %s%n", input, output);
    }

//    public static void numToStr2(int input) {
//        System.out.format(Locale.ENGLISH, input);
//    }

    public static void main(String... args) {
//        for (int i = 955; i < 960; i++) {
//            numToStr(i);
//        }
//        for (int i = 8; i < 17; i++) {
//            numToStr(i);
//        }
//        for (int i = 3998; i < 4025; i++) {
//            numToStr(i);
//        }
        numToStr(9999);
//        numToStr2(9999);
        numToStr(34);
        numToStr(20);
        numToStr(22);
        numToStr(17);
//        numToStr(11);   //problems as it is unique
//        numToStr(12);   //problems as it is unique
//        numToStr(13);   //problems as it is unique
//        numToStr(14);   //problems as it is unique
//        numToStr(15);   //problems as it is unique
//        numToStr(2);
//        numToStr(38);

    }
}
