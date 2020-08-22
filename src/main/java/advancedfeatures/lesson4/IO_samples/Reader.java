package advancedfeatures.lesson4.IO_samples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {

        File file = new File(
                "./src/main/java/advancedfeatures/lesson4/IO_samples/text.txt");

//        if (!file.exists()) {
//            System.out.println("file missing");
//            return;
//        }

        try (FileReader fileReader = new FileReader(file)) { // readeri uzdaro sitas try

            int data;

            while ((data = fileReader.read()) != -1) { // -1 reiskia kad jau nera ka skaityti "THE END"
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("could not read");
        }
    }
}
