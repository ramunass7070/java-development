package advancedfeatures.lesson4.IO_samples;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(
                    "./src/main/java/advancedfeatures/lesson4/IO_samples/text.txt");

            String text = "This is text to write";

            fileWriter.append(text);     // overwrites whatever is in file without even asking

            fileWriter.append("\n2nd line of text");

            fileWriter.close();

        } catch (IOException e) {
            System.out.println("IO exception " + e.getMessage());
        }

    }
}
