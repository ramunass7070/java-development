package sda.myfirst;

public class Zirniai {

    public static void main(String[] args) {
        //int a = 15;
        //int b = 25;
        // System.out.println("zirniai: " + a + "\tpupos: " + b);
        // {
        //    int c = a;
        //  a = b;
        //b = c;
        //}
        //System.out.println("\npersukus:\t zirniai: " + ++a + "\tpupos :" + ++b);
        //int x = 5 * 2 + 4 * 2 - 5;
        //int y = 5 * ((2 + 4) * 2 - 5);
        //System.out.println( x + "-<x; y ->" + y);
//        int x = 0;
//        System.out.println(x); //0
//        System.out.println(++x); //1
//        System.out.println(x); //1
//        System.out.println(x--); //1
//        System.out.println(x); //0
//        int a = ++x + x-- + x++ - --x;
//        System.out.println(a); //2
//        int A, B;
//        A = 112;
//        B = 88;
        printGreater(88, 122);
        printIsOddOrEven(22);
        isLeapYear(2000);
        isDividableBy3or5(321);
        exSumPairs(4);
        exStrings();
        char pi = 0X03C0;
        System.out.println(pi);
    }

    public static void printGreater(int a, int b) {
        System.out.println("Comparing numbers " + a + " & " + b);
        if (a > b) {
            System.out.println(a + " is greater one\n");
        } else {
            System.out.println(b + " is greater one\n");
        }
    }

    public static void printIsOddOrEven(int a) {
        System.out.println("IsOddOrEven: " + a);
        if (a % 2 == 0) {
            System.out.println(a + " is Even\n");
        } else {
            System.out.println(a + " is Odd\n");
        }
    }

    public static void isLeapYear(int a) {
        System.out.println("isLeapYear: " + a);
        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("year " + a + " is leap year\n");
        } else {
            System.out.println("year " + a + " is NOT a leap year\n");
        }
    }

    public static void isDividableBy3or5(int a) {
        if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.printf("%d fizzbuzz, dividable by 3 & 5", a);
            } else {
                System.out.printf("%d fizz, dividable by 3, but not 5", a);
            }
        } else if (a % 5 == 0) {
            System.out.printf("%d buzz, dividable by 5 but not 3", a);
        } else System.out.printf("%d is not dividable by 3 or 5", a);
        System.out.println();
    }


        public static void exSumPairs(int sum) {
        System.out.println("/n----exSumPairs:------");
        int[] arr = {1, 2, 7, 3, 10, 2, 9};
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j< arr.length -1; j++){
                    System.out.printf("\ncomparing num %d with num %d", arr[i], arr[j]);
                    if (arr[i] + arr[j] == sum){
                        System.out.printf("\n\tPair found: %d & %d\t sum is %d, array indexes:\t%d\t%d", arr[i], arr[j], sum, i, j);
                    }
                }
                System.out.println();
            }
            ;
        }

        public static void exStrings() {
            String x = "";
            for(char y = 'a'; y <= 'z'; y++){
                x += y;
                System.out.println(x);
            }
            System.out.println( x + "a");
            String y = new String();
            y = "new unique string line";
                    System.out.printf("x:\t%d, y:\t%d",y.length() , x.length());
            char[] z = x.toCharArray();
            y.lastIndexOf(x);
            System.out.println("\n");
            System.out.println(z);

    }
    /*
    for (Integer value : array) {
        sumOfArray = sumOfArray + value;
    }
    */
}
