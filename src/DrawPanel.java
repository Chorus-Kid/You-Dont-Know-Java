import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Font;
public class DrawPanel extends JPanel implements KeyListener {
    public DrawPanel() {
        this.addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}
