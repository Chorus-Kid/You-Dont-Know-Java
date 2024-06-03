import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Scanner;
import java.util.Timer;
import java.util.ArrayList;


public class DrawPanel extends JPanel implements KeyListener {
    private int bling;
    private int choice;
    private String[] theRoasting;
    private String[] theSimping;
    private boolean peekaboo;
    private boolean getWarpedLmao;
    private boolean ready;
    private boolean onIntro;
    private boolean onSignIn;
    private boolean hereComesTheBoiiii;
    private Player cookieNotCookie;
    private boolean getReadyForSomeFunItsTimeForQuestionOne;
    private MultipleChoiceQuestion beeeeaaaammmm;
    private MultipleChoiceQuestion peepeeHehe;
    private FlickerplishRestquinn roverCodedDumbStructor;
    private boolean twoJustTwo;
    private boolean checkPointOne;
    private boolean checkPointTwo;
    private boolean gibbewishKweshtwinUwU;
    private boolean checkPointThree;
    private boolean yayyyQuestionFour;
    private boolean streetMurder;
    private boolean goinLostGoldStyleHere;
    private boolean jakkuAttakku;

    private String userName;
    private String jibrishAnser;

    public DrawPanel() {
        this.addKeyListener(this);
        setFocusable(true);
        requestFocus();
        onIntro = true;
        onSignIn = false;
        userName = "";
        bling = 3000;
        theRoasting = new String[]{"pay up bub", "LMAOOOOOO this game isn't that hard", "bro does NOT know Jack", "git gud", "How does one get a negative score in a game show"};
        theSimping = new String[]{"woah no way you're rich now", "bro's actually a genius wtf", "wow you're so rich!!!!!", "", "Mmmmmoney for you"};
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
        else if (peekaboo) {
            money(g);
        }
        else if (getWarpedLmao) {
            backrooms(g);
        }
        else if (twoJustTwo) {
            Q2(g);
        }
        else if (gibbewishKweshtwinUwU) {
            Q3(g);
        }
    }

    public void intro(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 255, 255, 255));
        g.setFont(new Font("Impact", Font.BOLD, 125));
        g.drawString("YOU DON'T KNOW", 500, 250);
        g.setFont(new Font("Impact", Font.BOLD, 445));
        g.drawString("JAVA", 500, 625);
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

    public void money(Graphics g) {
        g.setColor(new Color(100));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 165, 0));
        g.setFont(new Font("Courier New", Font.BOLD, 100));
        g.drawString(cookieNotCookie.printPlayer(), 290, 250);
        if (cookieNotCookie.getMoney() > 0) {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString(theSimping[choice], 350, 350);
            System.out.println(theSimping[choice]);
        }
        if (cookieNotCookie.getMoney() < 0) {
            g.setFont(new Font("Courier New", Font.PLAIN, 50));
            g.drawString(theRoasting[choice], 350, 350);
            System.out.println(theRoasting[choice]);
        }
    }

    public void backrooms(Graphics g) {
        g.drawString("AYE YOU'RE NOT SUPPOSED TO HERE", 350, 350);
        g.drawString("GET OUT", 350, 400);
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
        beeeeaaaammmm = new MultipleChoiceQuestion("If the coding language was named after the X in APCSP-X, what coding language would people learn from APCSP-X?", "2", 1000, "1. X#", "2. Xython", "3. Xava", "4. Xcratch");
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

    public void Q2(Graphics g) {
        g.setColor(new Color(0));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(0xFFFFFF));
        g.setFont(new Font("Monospace", Font.BOLD, 100));
        g.drawString("02", 50, 100);
        g.drawString("$2000", 1610, 100);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 50));
        g.drawString("*chug chug*", 600, 100);
        peepeeHehe = new MultipleChoiceQuestion("pee pee poo poo", "1", 2000, "1. Brazil", "2. Colombia", "3. Vietnam", "4. Tunisia");
        g.setFont(new Font("Comic Sans", Font.PLAIN, 75));
        g.drawString("Say all the java developers moved to", 270, 200);
        g.drawString("the country that produces the most java.", 240, 300);
        g.drawString("If you were looking to have someone make", 250, 400);
        g.drawString("your program, which country would you go to?", 200, 500);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 60));
        g.drawString(peepeeHehe.getChoiceOne(), 250, 600);
        g.drawString(peepeeHehe.getChoiceTwo(), 250, 700);
        g.drawString(peepeeHehe.getChoiceThree(), 250, 800);
        g.drawString(peepeeHehe.getChoiceFour(), 250, 900);
    }

    public void Q3(Graphics g) {
        g.setColor(new Color(0));
        g.fillRect(0, 0, 5000, 5000);
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("Monospace", Font.BOLD, 100));
        g.drawString("03", 50, 100);
        g.drawString("$3500", 1610, 100);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 50));
        g.drawString("Get Ready to Rhyme!", 500, 100);
        roverCodedDumbStructor = new FlickerplishRestquinn("Rover Coded Dumb Structor", "overloaded constructor", "It's when you want to make a thing", "similar to another thing", "I need more than one constructor", 3500);
        g.setFont(new Font("Monospace", Font.PLAIN, 40));
        g.drawString("(Press enter when you're ready to enter!)", 250, 600);
        if (ready) {
            long timeStart = System.currentTimeMillis();

            g.setColor(new Color(0));
            g.fillRect(0, 600, 5000, 5000);
            g.drawString(jibrishAnser, 250, 600);
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
        if (hereComesTheBoiiii) {
            if (e.getKeyChar() == ' ') {
                hereComesTheBoiiii = false;
                getReadyForSomeFunItsTimeForQuestionOne = true;
            }
        }
        if (getReadyForSomeFunItsTimeForQuestionOne) {
            if (e.getKeyChar() == beeeeaaaammmm.getAnswer().charAt(0)) {
                cookieNotCookie.setMoney(beeeeaaaammmm.getQuestionValue() + cookieNotCookie.getMoney());
                cookieNotCookie.printPlayer();
            }
            else if (!(e.getKeyChar() == beeeeaaaammmm.getAnswer().charAt(0))) {
                cookieNotCookie.setMoney(cookieNotCookie.getMoney() - beeeeaaaammmm.getQuestionValue());
                cookieNotCookie.printPlayer();
            }
            choice = (int)(Math.random() * 4);
            checkPointOne = true;
            getReadyForSomeFunItsTimeForQuestionOne = false;
            peekaboo = true;
        }
        if (peekaboo) {
            if (e.getKeyChar() == ' ') {
                if(checkPointOne) {
                    checkPointOne = false;
                    peekaboo = false;
                    twoJustTwo = true;
                }
                if(checkPointTwo) {
                    checkPointTwo = false;
                    peekaboo = false;
                    gibbewishKweshtwinUwU = true;
                }
            }
        }

        if (twoJustTwo) {
            if (e.getKeyChar() == peepeeHehe.getAnswer().charAt(0)) {
                cookieNotCookie.setMoney(peepeeHehe.getQuestionValue() + cookieNotCookie.getMoney());
                cookieNotCookie.printPlayer();
            }
            else if (!(e.getKeyChar() == peepeeHehe.getAnswer().charAt(0))) {
                cookieNotCookie.setMoney(cookieNotCookie.getMoney() - peepeeHehe.getQuestionValue());
                cookieNotCookie.printPlayer();
            }
            choice = (int)(Math.random() * 4);
            twoJustTwo = false;
            checkPointTwo = true;
            peekaboo = true;
        }
        if (gibbewishKweshtwinUwU) {
            ready = false;
            if (!ready && (int)e.getKeyChar() == 10) {
                ready = true;
            }
            if ((int)e.getKeyChar() == 8) {
                jibrishAnser = jibrishAnser.substring(0 , jibrishAnser.length() - 1);
            }

            else {
                jibrishAnser += e.getKeyChar();
            }
            if (ready && (int)e.getKeyChar() == 10) {
                if (jibrishAnser.toLowerCase().equals(roverCodedDumbStructor.getAnswer())) {
                    cookieNotCookie.setMoney(roverCodedDumbStructor.getQuestionValue() + cookieNotCookie.getMoney());
                    cookieNotCookie.printPlayer();
                }
                else if (!jibrishAnser.toLowerCase().equals(roverCodedDumbStructor.getAnswer())) {
                    cookieNotCookie.setMoney(cookieNotCookie.getMoney() - roverCodedDumbStructor.getQuestionValue());
                    cookieNotCookie.printPlayer();
                }
            }
            gibbewishKweshtwinUwU = false;
            checkPointThree = true;
            peekaboo = true;
        }

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

}
