import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;



public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        TheAction theGame = new TheAction("The GAME ");

        FlickerplishRestquinn ticklish = new FlickerplishRestquinn("Now, I will give you $3000 if you answer this next question right.\nWhat does the following gibberish phrase rhyme with?\n'Kerblom day'", "Your mom gay", "ur", "mom", "gay", 3000);
        System.out.println(ticklish.printGibberish());
        System.out.print("Press space if you know what it is...");

    }
}