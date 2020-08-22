package advancedfeatures.lesson4.IO_samples.audio_player;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class AudioPlayer {

    public static void main(String[] args) throws Exception {

        File file = new File("./src/main/java/advancedfeatures/lesson4/IO_samples/audio_player/audio.wav");

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String command;
        long trackPosition = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (command.equals("start")) {
                clip.setMicrosecondPosition(trackPosition);
                clip.start();
            } else if (command.equals("pause")) {
                trackPosition = clip.getMicrosecondPosition();
                clip.stop();
            }
        } while (!command.equals("exit"));
    }
}
