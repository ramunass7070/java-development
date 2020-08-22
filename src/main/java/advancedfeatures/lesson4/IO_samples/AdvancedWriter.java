package advancedfeatures.lesson4.IO_samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdvancedWriter {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/advancedfeatures/lesson4/IO_samples/text.txt");
//Atidaro file obj. ikala viena symb. uzdaro pasiima kt symb. atsidaro file obj. iraso . izdaro. ima kt symb. ir t.t.t
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//Sukaupia bisk simboliu(duomenu ir) vienu
//ir vienu ipu suraso i faila ka sukaupes buvo

            String data = "text to write with buffered writer, more text to use more resources";
            bufferedWriter.write(data);


            bufferedWriter.append("\nsmth new appended");

            // uzdarinejam bufferi, paskui faila, ne atvirksciai!!!

            bufferedWriter.flush(); // reiktu praleisti pries uzdarant bufferedWriter
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException eIO) {
            System.out.println("eIO cought " + eIO.getMessage());
        }


        //"./src/main/java/advancedfeatures/lesson4/IO_samples/text.txt"

    }
}
