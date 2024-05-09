import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
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
    private boolean frickItsSix;
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
        g.fillRect(0, 0, 500, 500);
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("Impact", Font.BOLD, 25));
        g.drawString("YOU DON'T KNOW", 150, 100);
        g.setFont(new Font("Impact", Font.BOLD, 90));
        g.drawString("JACK", 145, 180);
        g.setFont(new Font("Monospaced", Font.PLAIN, 15));
        g.drawString("Press Space to continue", 135, 300);
    }
    public void signInScreen(Graphics g) {
        g.setColor(new Color(100));
        g.fillRect(0, 0, 500, 500);
        g.setColor(new Color(255, 165, 0));
        g.setFont(new Font("Courier New", Font.BOLD, 25));
        g.drawString("Please enter name: ", 100, 100);
        String ;

    }



    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == ' ' && onIntro) {
            onIntro = false;
            onSignIn = true;
        }
        if(onSignIn) {

        }

    }
    public String showOnScreen(KeyEvent e, Graphics g) {
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

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

}
