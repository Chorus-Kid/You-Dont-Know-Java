import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        File bwomp = new File("sfx/boowomp.wav");
        AudioInputStream bwoomp = AudioSystem.getAudioInputStream(bwomp);
        Clip clip = AudioSystem.getClip();
        clip.open(bwoomp);
        clip.setFramePosition(0);
        clip.loop(0);
        clip.start();
        System.out.println("bwomp");

    }
}