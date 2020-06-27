package sda.other_excercises;
import java.util.*;

public class LotteryRandom {

    public static void main(String[] args) {
        System.out.println("LotteryRandom started...");
//        ranIntArray(50);
        int luckyNum = pickRandom(25);
        int[] randArr = ranIntArray(100);
        System.out.println("today we have winner: " + isThereWinner(luckyNum, randArr));
    }

    public static boolean isThereWinner(int a, int[] arr) {
        boolean isWinner = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("lucky number today is " + arr[i] + "\n it's index in random array is " + i);
                isWinner = true;
            }
//        System.out.println("this time there is no winner, try once again");
        }
        return isWinner;
    }

    public static int pickRandom(int limit) {
        Random ran = new Random();
        int j = ran.nextInt(limit);
        System.out.println("\nlucky random number is " + j);
        return j;
    }


    public static int[] ranIntArray(int size){
        Random ran = new Random();
        int[] benga = new int[ran.nextInt(size)];
        for (int i = 0; i < benga.length; i++){
            benga[i] = ran.nextInt(size);
            System.out.println(i + " " + benga[i]);
        }
        System.out.printf("size of array %d\n", size);
//        System.out.printf("array:\n");
//        for (int j = 0 ; j < benga.length ; j++ ) {
//            System.out.print(benga[j] + " ");
//        }
        return benga;
    }
}
