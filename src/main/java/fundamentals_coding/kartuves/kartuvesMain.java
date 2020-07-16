package fundamentals_coding.kartuves;

import java.util.Scanner;

public class kartuvesMain {

    public static void main(String... args) {

        String wordToGuess;
        StringBuilder spellWord;

        System.out.println("kartuvesMain started...\nEnter word to guess:\n");
        wordToGuess = getInput();
        spellWord = encode(wordToGuess);
        System.out.printf("\nSpell the word: %s", spellWord);
        int j = decodeAll(wordToGuess, spellWord);
        System.out.printf("\n ->Finished!<-\nguess Counter: %d", j);

    }

    private static int decodeAll(String wordToGuess, StringBuilder spellWord) {
        int j = 0;
        while (spellWord.toString().contains("_")) {
            j++;
            System.out.printf("\nWhile counter %d", j);
            System.out.print("\nGuess a character:\n");

            try {
                String guess = getInput();
                if (guess.equals(wordToGuess)) {
                    System.out.printf("%nRevealed correct word: \"%s\"", guess);
                    break;
                }
                spellWord = decodeSingle(wordToGuess, spellWord, guess.charAt(0));    //decode
            } catch (Exception e) {
//                e.printStackTrace();
                System.err.print("Invalid char entered! Try again\n");
            }

            System.out.printf("\nCurrent Guess: %s", spellWord);
        }
        return j;
    }

    public static String getInput() {
        Scanner input = new Scanner(System.in);
        String output = input.nextLine();
        System.out.printf("getInput response: %s\n", output);
        return output;
    }

    public static StringBuilder encode(String wordToGuess) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char a : wordToGuess.toCharArray()) {
            stringBuilder.append("_");
        }
        return stringBuilder;
    }

    public static StringBuilder decodeSingle(String wordToGuess, StringBuilder currentGuess, char ch) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (ch == wordToGuess.charAt(i)) {
                output.append(ch);
            } else {
                output.append(currentGuess.charAt(i));
            }
        }
        return output;
    }

}


