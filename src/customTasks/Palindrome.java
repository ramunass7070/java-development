package customTasks;

public class Palindrome {
    public static void main(String... args) {
        String inputString = "abca";
        System.out.printf("String \"%s\" is palindrome?\t\t %b", inputString, isPalindrome(inputString));
    }

    public static boolean isPalindrome(String input) {
        StringBuilder output = new StringBuilder();
        output.append(input).reverse();
        return output.toString().equals(input);
    }
}
