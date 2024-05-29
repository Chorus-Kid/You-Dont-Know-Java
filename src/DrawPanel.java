import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Scanner;
import java.util.Timer;
import java.util.ArrayList;


public class DrawPanel extends JPanel implements KeyListener {
    private int bling;
    private boolean peekaboo;
    private boolean onIntro;
    private boolean onSignIn;
    private boolean hereComesTheBoiiii;
    private Player cookieNotCookie;
    private boolean getReadyForSomeFunItsTimeForQuestionOne;
    private final MultipleChoiceQuestion beeeeaaaammmm;
    private boolean twoJustTwo;
    private boolean gibbewishKweshtwinUwU;
    private boolean yayyyQuestionFour;
    private boolean streetMurder;
    private boolean goinLostGoldStyleHere;
    private boolean jakkuAttakku;

    private String userName;

    public DrawPanel() {
        this.addKeyListener(this);
        setFocusable(true);
        requestFocus();
        onIntro = true;
        onSignIn = false;
        userName = "";
        bling = 3000;
        beeeeaaaammmm = new MultipleChoiceQuestion("If the coding language was named after the X in APCSP-X, what coding language would people learn from APCSP-X?", "2", 1000, "1. X#", "2. Xython", "3. Xava", "4. Xcratch");
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Scanner s = new Scanner(System.in);
        if (onIntro) {
            intro(g);
        }
        else if (onSignIn) {
            signInScreen(g);
        }
        else if (hereComesTheBoiiii) {
            helloBoi(g);
        }
        else if (getReadyForSomeFunItsTimeForQuestionOne) {
            Q1(g);
        }
    }

    public void intro(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 255, 255, 255));
        g.setFont(new Font("Impact", Font.BOLD, 125));
        g.drawString("YOU DON'T KNOW", 500, 250);
        g.setFont(new Font("Impact", Font.BOLD, 425));
        g.drawString("JACK", 490, 610);
        g.setFont(new Font("Monospaced", Font.PLAIN, 40));
        g.drawString("Press space to continue", 650, 700);
    }
    public void signInScreen(Graphics g) {
        g.setColor(new Color(100));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 165, 0));
        g.setFont(new Font("Courier New", Font.BOLD, 50));
        g.drawString("Enter name: ", 100, 100);
        g.drawRect(100, 125, 750, 50);
        g.setFont(new Font("Courier New", Font.BOLD, 40));
        g.drawString(userName, 101, 160);
    }

    public void helloBoi(Graphics g) {
        g.setColor(new Color(100));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 165, 0));
        g.setFont(new Font("Courier New", Font.BOLD, 100));
        g.drawString(cookieNotCookie.printPlayer(), 290, 250);
        if (cookieNotCookie.getName().toLowerCase().contains("cookie")) {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString("Cookie Masterson?? Is that you??", 350, 350);
            g.drawString("What an honor!", 350, 400);
        }
        else if (cookieNotCookie.getName().toLowerCase().contains("wonderhoy") || cookieNotCookie.getName().toLowerCase().contains("emu")) {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString("Wan waaaannn...", 350, 350);
            g.setFont(new Font("Courier New", Font.BOLD, 75));
            g.drawString("WONDERHOY!!!!", 350, 450);
        }
        else {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString("What a fine name you have, " + cookieNotCookie.getName(), 350, 350);
        }
        g.setFont(new Font("Monospaced", Font.PLAIN, 50));
        g.drawString("(Press space to continue)", 350, 750);
    }

    public void Q1(Graphics g) {
        g.setColor(new Color(0));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(0xFFFFFF));
        g.setFont(new Font("Monospace", Font.BOLD, 100));
        g.drawString("01", 50, 100);
        g.drawString("$1000", 1610, 100);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 50));
        g.drawString("*proceeds to invoke apscp flashbacks*", 450, 100);
        g.setColor(new Color(0xFFFFFFFF, true));
        g.setFont(new Font("Comic Sans", Font.PLAIN, 75));
        g.drawString("If the coding language was named after", 250, 200);
        g.drawString("the X in APCSP-X, what coding language", 250, 300);
        g.drawString("would people have to learn if they take the class?", 200, 400);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 60));
        g.drawString(beeeeaaaammmm.getChoiceOne(), 250, 500);
        g.drawString(beeeeaaaammmm.getChoiceTwo(), 250, 600);
        g.drawString(beeeeaaaammmm.getChoiceThree(), 250, 700);
        g.drawString(beeeeaaaammmm.getChoiceFour(), 250, 800);
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("Monospace", Font.PLAIN, 40));
        g.drawString("(Type the number you think is correct)", 250, 900);
    }



    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == ' ' && onIntro) {
            onIntro = false;
            onSignIn = true;
        }

        if (onSignIn) {
            if ((int)e.getKeyChar() == 8) {
                userName = userName.substring(0 , userName.length() - 1);
            }

            else {
                userName += e.getKeyChar();
            }
            if ((int)e.getKeyChar() == 10) {
                cookieNotCookie = new Player(userName);
                onSignIn = false;
                hereComesTheBoiiii = true;
            }
        }
        if (hereComesTheBoiiii) {
            if (e.getKeyChar() == ' ') {
                hereComesTheBoiiii = false;
                getReadyForSomeFunItsTimeForQuestionOne = true;
            }
        }
        if (getReadyForSomeFunItsTimeForQuestionOne) {
            System.out.println("SCREAM");
            if (beeeeaaaammmm == null) {
                System.out.println("Gegu");
            }
            if (e.getKeyChar() == (Integer.parseInt(beeeeaaaammmm.getAnswer()))) {
                cookieNotCookie.setMoney(beeeeaaaammmm.getQuestionValue() + cookieNotCookie.getMoney());
                cookieNotCookie.printPlayer();
            }
            else if (!(e.getKeyChar() == (Integer.parseInt(beeeeaaaammmm.getAnswer())))) {
                cookieNotCookie.setMoney(cookieNotCookie.getMoney() - beeeeaaaammmm.getQuestionValue());
                cookieNotCookie.printPlayer();
            }
            getReadyForSomeFunItsTimeForQuestionOne = false;
            peekaboo = true;
        }


    }
   /** public String showOnScreen(KeyEvent e, Graphics g) {
        if (onSignIn) {
            String name = "";
            String letter = String.valueOf(e.getKeyChar());
            int startingPosition = 100;
            int plusSpace = 25;
            while (e.getKeyCode() != KeyEvent.VK_ENTER) {
                g.drawString(letter, startingPosition + plusSpace, 100);
                name = name + letter;
                plusSpace = plusSpace + 25;
            }
            return name;
        }

    }
    **/

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

}
