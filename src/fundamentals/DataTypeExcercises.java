package fundamentals;

public class DataTypeExcercises {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static int sumsTwoNumbers(int firstNo, int secondNo) {
        return firstNo + secondNo;
    }

    public static String dividesTwoNums(int arg, int divider) {
        int x = arg / divider;
        int y = arg % divider;
        print(arg + "/" + divider + " = " + x + " remainder " + y);
//        print(y);
        return "output";
    }

    public static void numsEx3() {
        print("- 5 + 8 * 6 = " + (-5 + 8 * 6));
        print("( 55 + 9 ) % 9 = " + ((55 + 9) % 9));
        print("20 + ((-3 * 5) / 8) = " + (20 + ((-3 * 5) / 8)));
        print("5 + (15 / (3 * 2)) - (8 % 3) =" + (5 + ((15 / 3) * 2) - (8 % 3)));
    }

    public static void computing() {
        double a, b, c, d, e;
        a = 25.5f;
        b = 3.5f;
        c = 40.5f;
        d = 4.5f;
        print("computing: " + (((a * b) - (b * b)) / (c - d)));
        print((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); // checkup
    }

    public static void circleAreaPerimeter(double radius) {
        System.out.println("-----ex.5---circle---area---perimeter----");
        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;
        print("Circle area is : " + area + "; Perimeter is " + perimeter);  //reiktu su printf sukalti
    }

    public static double averageOfInput(double... inputNumbers) {
        double output = 0;
        int i = 0;
        for (double inputNumber : inputNumbers) {
            i++;
            output = (output + inputNumber);
        }
        return output / i;
    }

    public static void rectangleAreaPerimeter(double width, double height) {
        System.out.println("-----ex.7---rect---area---perimeter----");
        double rectangleArea;
        rectangleArea = width * height;
        double rectanglePerimeter;
        rectanglePerimeter = 2 * (width + height);
        print("rectArea: " + rectangleArea + "; RectPerimeter: " + rectanglePerimeter);
    }

    public static void swapVars(Object a, Object b) {
        print(a.getClass() + " a: " + a);
        print(b.getClass() + " b: " + b);
        Object c = a;
        a = b;
        b = c;
        print("-----Swaped----");
        print(a.getClass() + " a: " + a);
        print(b.getClass() + " b: " + b);
    }

    public static void compareTwoNumbers(int a, int b) {
        if (a != b) {
            System.out.printf("%d != %d%n", a, b);

            if (a > b) {
                System.out.printf("%d > %d", a, b);
            } else if (a < b) {
                System.out.printf("%d < %d", a, b);
            }
        } else if (a == b) {
            System.out.printf("%d == %d", a, b);
        }
        System.out.println();
        System.out.println();
        return;
    }

    public static int sumOfNumDigits(Integer input) {
        char[] arr = input.toString().toCharArray();
        int sum = 0;
        for (int digit : arr) {
            sum += digit - 48; // 0 is 48th symbol in unicode chart; following chars of numbers are in increasing order
        }
        return sum;
    }

    /**
    public static int sumOfNumDigits2(Integer input) {
        char[] arr = input.toString().toCharArray();
        int sum = 0;
        for (int digit : arr) {
            sum += digit - 48; // 0 is 48th symbol in unicode chart; following chars of numbers are in increasing order
        }
        return sum;
    }*/

    public static void main(String... args) {
        print("---ex.1----sums--two--given--nums----");
        {
            print(sumsTwoNumbers(74, 36));
        }
        print("---ex.2----divides--two--nums--prints--res--&--remainder----");
        {
            dividesTwoNums(50, 3);
        }
        print("---ex.3------------");
        {
            numsEx3();
        }
        print("---ex.4-----Computing-specified-expr.-------");
        {
            computing();
        }
        print("---ex.5-----circle--Area--Perimeter--------");
        {
            circleAreaPerimeter(7.5d);
        }
        print("---ex.6-----average--Of--Input--------");
        {
            print("average output: " + averageOfInput(10, 50, 60, 30, 70, 100, 30, 40, 20));
            print("average output: " + averageOfInput(10, 20, 30));
        }
        print("---ex.7-----rectAreaPerimeter--------");
        {
            rectangleAreaPerimeter(5.5, 8.5);
        }
        print("---ex.8-----swapTwoNumbers---- made--to--swap--any--two--given--objects--------");
        {
            String g = "it is a string to swap55";
            float c = 3.3f; // another thing to be swaped
            swapVars(g, c);
        }
        print("---ex.9-----compareTwoNumbers--------");
        {
            compareTwoNumbers(15, 25);
            compareTwoNumbers(88, 88);
            compareTwoNumbers(88, 100);
            compareTwoNumbers(100, 88);
            compareTwoNumbers(-4, 4);
            compareTwoNumbers(-4, 0);
            compareTwoNumbers(0, 4);
            compareTwoNumbers(4, -4);
        }
        print("---ex.10----integer digits sum---------");
        {
            print(sumOfNumDigits(103925));
        }
    }
}
