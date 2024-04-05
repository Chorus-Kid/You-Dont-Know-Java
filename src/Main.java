import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        File boowomp = new File("sfx/boowomp.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(boowomp);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        System.out.println("Press any key to boowomp");
        String answer = s.nextLine();
        if (answer.length() > 0) {
            clip.start();
        }
        System.out.println("bwomp");

    }
}