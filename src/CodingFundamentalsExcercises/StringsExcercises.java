package CodingFundamentalsExcercises;


public class StringsExcercises {
    // ex.1
    public static void hello(String name) {
        System.out.printf("Hello\n%s", name);
        System.out.println();
    }

    //ex.2
    public static void javaPattern() {
        System.out.println("Java");
        for (int i = 0; i < 1; i++) {
            System.out.printf("   J    a    V     V    a\n" +
                    "   J   a a    V   V    a a\n" +
                    "J  J  aaaaa    V V    aaaaa\n" +
                    " JJ  a     a    V    a     a\n");

        }
    }

    //ex.3 to uppercase
    public static void stringToLowerCaseEx(String str) {
        System.out.println(str.toLowerCase());
    }

    //ex.4 reverse string symbols
    public static void reverseSymbols(String str) {
        char[] strseq = str.toCharArray();
        for (int i = strseq.length - 1; i >= 0; i--) {
            System.out.print(strseq[i]);
        }
    }

    //ex.5
    public static String firstHalfOfGivenString(String input) {
        char[] inputChars = input.toCharArray();
        StringBuilder stBld = new StringBuilder();
        for (int i = 0; i < inputChars.length / 2; i++) {
            System.out.printf("%n\"%s\" char aded to output", inputChars[i]); // indication line
            stBld.append(inputChars[i]);
        }
        System.out.println();
        return stBld.toString();

    }

    //ex.5+ other option
    public static String firstHalfOfGivenString2(String input) {
        String output = input.substring(0, input.length() / 2);
        return output;
    }

    //ex.6 concatenate strings without their first letters
    public static StringBuilder concatenateWithoutFirstLetters(String... inputStrings) {
        StringBuilder output = new StringBuilder();
        for (String inputString : inputStrings) {
            System.out.println("System input parameter is: " + inputString);
            output.append(inputString.substring(1, inputString.length()));
        }
        return output;
    }

    //ex.6+ concatenate strings without their first letters
    public static String concatenateWithoutFirstLetters2(String... inputStrings) {
        String output = "";
        for (String inputString : inputStrings) {
            System.out.println("System input parameter is: " + inputString);
            output = output.concat(inputString.substring(1, inputString.length()));
        }
        return output;
    }

    //ex.7 gives string length
    public static int getStringLength(String input) {
        return input.length();
    }

    //    ex.8 checks if given strings are lexicographically equal
    public static boolean areStringsEqual(String... inputStrings) {
        boolean output = false;
        for (String inputString : inputStrings) {
            System.out.println(inputString);
        }
        for (int i = 0; i < inputStrings.length; i++) {
            for (int j = i + 1; j < inputStrings.length; j++) {
                if (inputStrings[i].equals(inputStrings[j])) {
                    output = true;
                } else {
                    output = false;
                    return output;
                }
            }
        }
        return output;
    }

    //ex.9 checks if first string end with second;
    public static boolean stringEndsWith(String inputString, String ending) {
        boolean b = false;
        String insubstr = inputString.substring((inputString.length() - ending.length()), inputString.length());
        if (insubstr.equals(ending)) {
            b = true;
        }
        return b;
    }

    //ex.9+ checks if first string end with second;
    public static boolean stringEndsWith2(String inputString, String ending) {
        if (inputString.endsWith(ending)) {
            return true;
        }
        return false;
    }

    //ex.10 counts symbols in given string
    public static void countSymbolsInString(String inputString) {
        int defined = 0;
        int lettersOrDigits = 0;
        int letters = 0;
        int digits = 0;
        int whitespaces = 0;
        int othChars = 0;
        int notDefined = 0;
        for (char m : inputString.toCharArray()) {
//            System.out.print(m);
            if (Character.isDefined(m)) {
                defined++;
//                System.out.println(" is Defined");
                if (Character.isLetterOrDigit(m)) {
                    lettersOrDigits++;
//                    System.out.println(" is LetterOrDigit");
                    if (Character.isDigit(m)) {
                        digits++;
//                        System.out.println(" is Digit");
                    }
                    if (Character.isLetter(m)) {
                        letters++;
//                        System.out.println(" is Letter");
                    }
                } else if (Character.isWhitespace(m)) {
                    whitespaces++;
//                    System.out.println(" is whitespace");
                } else {
                    othChars++;
//                    System.out.println(" is other character;");
                }
            } else {
                notDefined++;
//                System.out.println(" is not defined");
            }
//        System.out.println();
        }
        System.out.printf("%n%d total; %d letters&digits; %d letters; %d numbers; %d spaces; " +
                        "%d other; %d undefined",
                defined, lettersOrDigits, letters, digits, whitespaces, othChars, notDefined);
    }

    public static void main(String[] args) {
//  String ex.1
        hello("Joniukas");
//  String ex. 2
        javaPattern();
//  String ex. 3
        stringToLowerCaseEx("THE QUICK BROWN FOX\n" +
                "JUMPS OVER THE LAZY DOG");
//  String ex. 4
        reverseSymbols("Java");
//  String ex. 5
        System.out.println(firstHalfOfGivenString("Programmer"));
        System.out.println(firstHalfOfGivenString2("Programmer"));
//  String ex 6.
        System.out.println(concatenateWithoutFirstLetters("Java", "Fundamentals"));
        System.out.println(concatenateWithoutFirstLetters2("Java", "Fundamentals"));
        System.out.println();
//  String ex. 7
        {
            String input = "This is Java!";
            System.out.printf("The length of given string -- %s -- is: %d", input, getStringLength(input));
        }
//  String ex. 8 - lexicographical comparison
        System.out.println();
        System.out.println();
        {
            System.out.println("------lexicographical comparison------");
            String input1 = "This is a comparison";
            String input2 = "THIS is A Comparison";

            System.out.printf("input strings are lexicographicaly equal: %b", areStringsEqual(input1, input2));
        }
//  String ex. 9
        System.out.println();
        System.out.println("------'Java exercises' ends with 'ses'------");
        {
            String input1 = "Java excercises";
            String input2 = "ses";
            System.out.println(stringEndsWith(input1, input2));
            System.out.println(stringEndsWith2(input1, input2));
        }
        System.out.println();
//   String ex. 10 count symbol types;
        {
            System.out.println("------count letters, digits, spaces and other characters------");
            String inputLine = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
            countSymbolsInString(inputLine);
        }
    }

}
