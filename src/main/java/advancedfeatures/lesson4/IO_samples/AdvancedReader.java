package advancedfeatures.lesson4.IO_samples;

import java.io.*;

public class AdvancedReader {

    public static void main(String[] args) {


        File file = new File("./src/main/java/advancedfeatures/lesson4/IO_samples/text.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
