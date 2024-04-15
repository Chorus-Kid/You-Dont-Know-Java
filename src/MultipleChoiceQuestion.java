public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String question, String answer, int questionValue) {
        super(question, answer, questionValue);
    }
    public String printMultipleChoice() {
        String theWholeQuestion = "";
        String questionPrompt = getQuestion().substring(0, getQuestion().indexOf("?"));
        theWholeQuestion = questionPrompt;
        String optionOne = getQuestion().substring(getQuestion().indexOf("1"), getQuestion().indexOf("2"));
        theWholeQuestion = theWholeQuestion + "\n" + optionOne;
        String optionTwo = getQuestion().substring(getQuestion().indexOf("2"), getQuestion().indexOf("3"));
        theWholeQuestion = theWholeQuestion + "\n" + optionTwo;
        String optionThree = getQuestion().substring(getQuestion().indexOf("3"), getQuestion().indexOf("4"));
        theWholeQuestion = theWholeQuestion + "\n" + optionThree;
        String optionFour = getQuestion().substring(getQuestion().indexOf("4"));
        theWholeQuestion = theWholeQuestion + "\n" + optionFour;
        return theWholeQuestion;
    }

}
