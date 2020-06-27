package sda.myfirst;

public class Compare {
    public static void main(String[] args){
        String s1 = new String("Tom");
        String s2 = new String("Tom");
        String s3 = "Tom";
        String s4 = "Tom";
        System.out.println("s1 & s2 " + (s1 == s2));
        System.out.println("s1 & s3 "+ (s1 == s3));
        System.out.println("s3 & s4 "+ (s3 == s4));
    }
}
