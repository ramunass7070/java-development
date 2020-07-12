package fundamentals_coding.Excercises;

public class ListOfExcercises {
    public static void main(String[] args) {
        ex1(123.123, 12.2222);
        ex2(15, 7);
        ex3();
//        ### Flow control, loops and arrays
        flow1(12);
        flow1(32);
        flow1(30);
    }

    public static void ex1(double a, double b) {
        //1. Enter any value with several digits after the decimal point and assign it to variable
        //of type double. Display the given value rounded to two decimal places.
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
        System.out.printf("%nex1; Values entered and rounded; %.2f, %.2f", a, b);
    }

    public static void ex2(int a, int b) {
//        2. Enter two values of type int. Display their division casted to the double type and rounded to
//        the third decimal point.
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        System.out.printf("%nex2; Values entered %d, %d, output %.3f", a, b, (double) a / b);

    }

    public static void ex3() {
//        3. Sum two integer variables initialized with maximal values for that type.
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.printf("%nex3; MAX Values %d, %d; Sum equals %d", a, b, a + b);
    }

    //### Flow control, loops and arrays
    public static void flow1(int a ) {
//        1. Write an application that will show if entered value is greater, equal or lower than 30.
        int b = 30;
        if (a < b) {
            System.out.println("entered value " + a + "is lower than" + b);
        } else if (a > b) {
            System.out.println("entered value " + a + " is higher than" + b);
        } else if (a==b) {
            System.out.println("entered value is equal to" + b);
        } else {
            System.out.println("entered value cannot be compared");
        }
    }


}
