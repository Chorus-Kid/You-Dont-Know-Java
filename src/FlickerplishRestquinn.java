import java.util.Timer;
import java.util.TimerTask;

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

    public void giveHints() {

    }
}
