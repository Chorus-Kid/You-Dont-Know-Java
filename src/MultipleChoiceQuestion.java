public class MultipleChoiceQuestion extends Question {
    private String choiceOne;
    private String choiceTwo;
    private String choiceThree;
    private String choiceFour;
    public MultipleChoiceQuestion(String question, String answer, int questionValue, String one, String two, String three, String four) {
        super(question, answer, questionValue);
        choiceOne = one;
        choiceTwo = two;
        choiceThree = three;
        choiceFour = four;
    }
    public String printQuestion() {
        return getQuestion();
    }

    public String getChoiceOne() {
        return choiceOne;
    }

    public String getChoiceTwo() {
        return choiceTwo;
    }

    public String getChoiceThree() {
        return choiceThree;
    }

    public String getChoiceFour() {
        return choiceFour;
    }

}
