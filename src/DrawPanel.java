import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Scanner;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements KeyListener {
    public DrawPanel() {
        this.addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Scanner s = new Scanner(System.in);
        intro(g);

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
        g.drawString("Press Enter to continue", 135, 300);
    }
    public void signInScreen(Graphics g) {
        g.setColor(new Color(100));
        g.fillRect(0, 0, 500, 500);
        g.setColor(new Color(255, 165, 0));
        g.setFont(new Font("Courier New", Font.BOLD, 25));
        g.drawString("Please enter name: ", 150, 100);
    }
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Yahoo!!");
        }
    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}
