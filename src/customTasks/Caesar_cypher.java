package customTasks;

public class Caesar_cypher {
    public static void main(String... args) {
        String inputString = "abcdefghijklmonprstuvwxyz   abc   1234567   Sveiki si uzduotis yra begalo idomi Aprasytas metodas uzsifruoja bet koki teksta gan paprastu sifru.";
        int shift = 5;
        System.out.printf("%n%nNesifruotas tekstas:%n<<\"%s\">>%n" +
                "%nSifruotas tekstas, pakeiciant abeceles raides per %d poziciju :%n%s%n", inputString, shift, encryptCaesar(inputString, shift));
        char j = 0X0021 + 5;
        System.out.println(j);
    }

    public static String encryptCaesar(String inputString, int shift) {
        StringBuilder encoded = new StringBuilder();
        char[] arr = inputString.toCharArray();
        for (char i : arr) {
            encoded.append((char) (i + shift));
        }
        return encoded.toString();
    }
}
