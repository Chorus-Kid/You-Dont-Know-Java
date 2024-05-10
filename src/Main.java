import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;



public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        TheAction theGame = new TheAction("The GAME ");

        System.out.println("What's your name?");
        System.out.print("(Type in your name): ");
        String playerName = s.nextLine();
        Player cookieNotCookie = new Player(playerName);
        if (playerName.equals("Cookie") || playerName.equals("Cookie Masterson")) {
            System.out.println("Heyyy!! Cookie actually showed up! Sorry I can't host as good as you, but hope you enjoy the game regardless!");
        }
        FlickerplishRestquinn ticklish = new FlickerplishRestquinn("Now, I will give you $3000 if you answer this next question right.\nWhat does the following gibberish phrase rhyme with?\n'Kerblom day'", "Your mom gay", "ur", "mom", "gay", 3000);
        System.out.println(ticklish.printGibberish());
        System.out.print("Press space if you know what it is...");

        /**
        System.out.println(cookieNotCookie.printPlayer());
        MultipleChoiceQuestion test = new MultipleChoiceQuestion("Miku Miku ni shite Ageru\nHow many words are in the snippet of that song?1. Three2. Four3. Five4. 39", "3", 1);
        System.out.println(test.printMultipleChoice());
        System.out.print("Type the number choice: ");
        String playerChoice = s.nextLine();
        test.checkQuestion(cookieNotCookie, playerChoice);
        System.out.println(cookieNotCookie.printPlayer());
         **/
    }
}