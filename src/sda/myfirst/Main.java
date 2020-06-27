package sda.myfirst;//package sda.myfirst.lesson1.day1;

/* multi line comments
 2nd line of comment*/



public class Main {
    public static void printHello() {
        System.out.println("Hello JAVA main method, thiss is massage from method \"Hello\"");
    }
    public static void main(String[] args) {
        // write your code here
        //
        printHello();
        System.out.println("Hello SDA\nHow are you?\nMy name is Lord");
        System.out.println("   J    a    V     V   a");
        System.out.println("   J   a a    V   V   a a");
        System.out.println("J  J  aaaaa    V V   aaaaa");
        System.out.println(" JJ  a     a    V   a     a");
        System.out.println("---------------");

//        System.out.printf(String.format("%%%ds", space), "hi")); //use identation right, left, spacing ir dar kzkks.
//        System.out.printf( "%-15s %15s %n", str1, str2 );

        String a = new String();
        a = "LAZY FOX JUMPS OVER THE LAZY DOG";
        System.out.println(a.toLowerCase());
        System.out.println("hello world in " +
                args[0] + " " +
                args[1] + " " +
                args[2] + " " +
                args[3] + " " +
                args[4]);
        String exc4 = new String();
        exc4 = "avaJ";
        System.out.println(exc4.toCharArray()[3] + " " + exc4.toCharArray()[2] + " " + exc4.toCharArray()[1] + " " + exc4.toCharArray()[0]);


        }
}