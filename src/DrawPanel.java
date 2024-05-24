import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;


public class DrawPanel extends JPanel implements KeyListener {
    private boolean onIntro;
    private boolean onSignIn;
    private boolean hereComesTheBoiiii;
    private Player cookieNotCookie;
    private boolean getReadyForSomeFunItsTimeForQuestionOne;
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
        if (cookieNotCookie.getName().contains("Cookie")) {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString("Cookie Masterson?? Is that you??", 350, 350);
            g.drawString("What an honor!", 350, 400);
        }
        else {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString("What a fine name you have, " + cookieNotCookie.getName(), 350, 350);
        }
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
