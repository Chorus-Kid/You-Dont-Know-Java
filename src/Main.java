import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your name?");
        System.out.print("(Type in your name): ");
        String playerName = s.nextLine();
        Player cookieNotCookie = new Player(playerName);
        System.out.println(cookieNotCookie.getName() + ":");
        System.out.println("$" + cookieNotCookie.getMoney());
        MultipleChoiceQuestion test = new MultipleChoiceQuestion("Miku Miku ni shite Ageru\nHow many words are in the snippet of that song?1. Three2. Four3. Five4. 39", "3", 1);
        System.out.println(test.printMultipleChoice());
        System.out.print("Type the number choice: ");
        String playerChoice = s.nextLine();
        test.checkQuestion(cookieNotCookie, playerChoice);
        System.out.println(cookieNotCookie.printPlayer());
    }
}