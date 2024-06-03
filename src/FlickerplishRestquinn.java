import java.util.Timer;
import java.awt.event.KeyEvent;

public class FlickerplishRestquinn extends Question{
    private String firstHint;
    private String secondHint;
    private String thirdHint;
    public FlickerplishRestquinn(String question, String answer, String hintOne, String hintTwo, String hintThree, int questionValue) {
        super(question, answer, questionValue);
        firstHint = hintOne;
        secondHint = hintTwo;
        thirdHint = hintThree;
    }
    public String printGibberish() {
        return getQuestion();
    }


    public String getFirstHint() {
        return firstHint;
    }

    public String getSecondHint() {
        return secondHint;
    }

    public String getThirdHint() {
        return thirdHint;
    }

}
