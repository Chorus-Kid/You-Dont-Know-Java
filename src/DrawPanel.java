import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;


public class DrawPanel extends JPanel implements KeyListener {
    private boolean onIntro;
    private boolean onSignIn;
    private boolean getReadyForSomeFunItsTimeForQuestionOne;
    private boolean twoJustTwo;
    private boolean gibbewishKweshtwinUwU;
    private boolean yayyyQuestionFour;
    private boolean streetMurder;
    private boolean goinLostGoldStyleHere;
    private boolean jakkuAttakku;

    public DrawPanel() {
        this.addKeyListener(this);
        setFocusable(true);
        requestFocus();
        onIntro = true;
        onSignIn = false;
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
        g.drawString("[insert name here]", 101, 160);

    }



    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == ' ' && onIntro) {
            onIntro = false;
            onSignIn = true;
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
