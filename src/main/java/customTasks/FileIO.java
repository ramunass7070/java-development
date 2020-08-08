package customTasks;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String filePath = "./src/main/java/customTasks/dataset_91065.txt";
        countEvenOddInFile(filePath);

        String fileContent = readFileAsString(filePath);
        countEvenOdd(fileContent);
    }

    static String readFileAsString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get("./src/main/java/customTasks/dataset_91065.txt")));
    }

    static void countEvenOdd(String input) {
        Scanner scanner = new Scanner(input);
        int even = 0;
        int odd = 0;
        while (scanner.hasNextLine()) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num == 0) {
                    break;
                }
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }


    static void countEvenOddInFile(String path) {
        int total = 0;
        int even = 0;
        int odd = 0;
        File dataSet = new File(path);

        try {
            Scanner scanner = new Scanner(dataSet);
            while (scanner.hasNextLine()) {
                total++;
                try {
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num == 0) {
                        break;
                    }
                    if (num % 2 == 0) {
                        even++;
                    } else if (num % 2 == 1) {
                        odd++;
                    }
                } catch (Exception a) {
                    System.err.println("Parsing failed: " + a.getMessage());
                    System.out.println("Lines read before: " + total);
                }
            }
            System.out.printf("Total: %d\nEven: %d\nOdd: %d\n", total, even, odd);
        } catch (Exception e) {
            System.out.printf("error at reading file %s\nFilepath: %s\n", dataSet.getName(), dataSet.getAbsolutePath());
//            System.err.println(e.getMessage());
            System.err.println(e.toString());
        }
        System.out.println("<last line of countEvenOddInFile()>");
    }

}
