package fundamentals;

public class LoopsExcercises {
    public static void multiplicationChart(long... input) {
        long iter = 10;
        try {
            iter = input[1];
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (long i = 0; i < iter; i++) {
            System.out.printf("%n%d * %d = %d", input[0], (i + 1), (input[0] * (i + 1)));
        }
    }

    public static void evenNumsList() {
        for (int i = 0; i <= 100; i++) {
            if ((i != 0) & (i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void integerPrint(int input) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("give me integer:\n");
//        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input);
            }
            System.out.print(", ");
        }
    }

    public static void dividedByThreeOrFour() {
        StringBuilder div3 = new StringBuilder("divided by 3: ");
        StringBuilder div5 = new StringBuilder("divided by 5: ");
        StringBuilder div3n5 = new StringBuilder("divided by 3 and 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                div3.append(i);
                div3.append(", ");
            }

            if (i % 5 == 0) {
                div5.append(i);
                div5.append(", ");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                div3n5.append(i);
                div3n5.append(", ");
            }
        }
        System.out.println(div3);
        System.out.println(div5);
        System.out.println(div3n5);
    }

    public static void powersUnderHundred(int input) {

        for (int output = input; output < 100; output = output * input) {
            System.out.print(" " + output + ",");

        }
    }

    public static void fibonaciSequence(int n) {
        int currentFibonaciNumber = 0;
        int nextFibonaciNumber = 1;
        int nextNextFibonaciNumber = 1;
        for (int i = 1; i <= n; i++) {
            System.out.printf("seq %d\t - %d%n", i, currentFibonaciNumber);
            nextNextFibonaciNumber = currentFibonaciNumber + nextFibonaciNumber;
            currentFibonaciNumber = nextFibonaciNumber;
            nextFibonaciNumber = nextNextFibonaciNumber;
            if ((nextFibonaciNumber + currentFibonaciNumber) < currentFibonaciNumber) {
                System.out.println("Warning: MAX VARIABLE VALUE REACHED!!! seq " + i + " is overloaded!!!");
                break;
            }
        }
    }

    public static void pyramid(int rows) { // absoliuciai nera StringBuilder
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * i) + 1); j++) {
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }


    public static void primeNumbers(int qty) {
        System.out.printf("First %d prime numbers: %n", qty);
        int i = 2;
        int j = 0;
        while (j < qty) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                j++;
            }
            i++;
        }
    }

    public static boolean isPrime(int num) { // uzstriges buvau ilgai; matematiskai kaip ir suprantu. taciau spr nera labai geras.
        for (int i = 2; i < num; i++) {         // atmetineti reiktu visus kurie dalinasi is prime numbers ! 2 ir yra prime.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void incrementNumbers(int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + ((i + 1) * n) + " ");
            j++;
        }
        System.out.println("\ntotal components " + j);
    }

    public static void factorial(int num) {
        long output = 1;
        for (int i = 0; i < num; i++) {
            output *= (i + 1);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {

        System.out.println("\n-----ex1--multiplication table----");
        multiplicationChart(13, 10);

        System.out.println("\n-----ex2--even-numbers-list----");
        evenNumsList();

        System.out.println("\n-----ex3--n-nn-nnn-nnnn-nnnnn----");
        integerPrint(3);

        System.out.println("\n-----ex4--1-100 dividible-by3-by5-by3&5---");
        dividedByThreeOrFour(); // could be improved

        System.out.println("\n-----ex5--all-powers-of-number-under-100----");
        powersUnderHundred(3);

        System.out.println("\n-----ex6--Fibonaci-series----");
        fibonaciSequence(20);

        System.out.println("\n-----ex7--pyramid-of-strings-----");
        pyramid(5);

        System.out.println("\n-----ex8--first-n-prime-numbers----");
        primeNumbers(1000);

        System.out.println("\n-----ex9--first-n-numbers-with-an-n-increment----");
        incrementNumbers(1);

        System.out.println("\n-----ex10-factorial-value-of-given-number-----");
        factorial(5);
    } //main end brace

} // class closing brace
