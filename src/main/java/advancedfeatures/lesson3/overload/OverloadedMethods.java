package advancedfeatures.lesson3.overload;

public class OverloadedMethods {

    public static int add(int num, int num1) {
        return num + num1;
    }

    public static int add(int num, int num1, int num2) {
        return num + num1 + num2;
    }

    public static int add(int num, int num1, int num2, int num3) {
        return num + num1 + num2 + num3;
    }

    public static String add(int num, int num1, int num2, String num3) {
        return num + num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 2));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 2, "text info"));
    }
}

