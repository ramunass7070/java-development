package customTasks;

public class Caesar_cypher {
    public static void main(String... args) {
        String inputString = "abcdefghijklmnopqrstuvwxy abc 123456789%n" +
                " Hello students, hello world! quite easy ot shift chars in ASCII chart.%n" +
                "Lenteleje simbolius stumti gan paprasta.%n" +
                "Spec simboliai isliks sifruojant pgl english alphabet. bet english pakeitus custom raktu, jau visai idomu pasidarytu";

        int shift = 1024;
        System.out.printf("Sifro raktas: %d%n" +
                "%nNesifruotas tekstas:%n%s%n", shift, inputString);
        System.out.printf("%n\"encryptCaesar\": (keicia visus simbolius)%n%s%n", encryptCaesar(inputString, shift));
        System.out.printf("%n\"encryptCaesarAlphabet\": (keicia tik english alphabet simbolius)%n%s%n", encryptCaesarAlphabet(inputString, shift));

    }

    public static String encryptCaesar(String inputString, int shift) {
        StringBuilder encoded = new StringBuilder();
        char[] arr = inputString.toCharArray();
        for (char i : arr) {
            encoded.append((char) (i + shift));
        }
        return encoded.toString();
    }

    public static String encryptCaesarAlphabet(String inputString, int shift) {
        StringBuilder encoded = new StringBuilder();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char temp;
        shift = shift % alphabet.length();

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            temp = inputString.charAt(i);
            for (int j = 0; j < alphabet.length(); j++) {
                if (temp == alphabet.charAt(j)) {
                    j = (j + shift) % alphabet.length();
                    temp = alphabet.charAt(j);
                    break;
                }
            }
            encoded.append(temp);
        }
        return encoded.toString();
    }

}
