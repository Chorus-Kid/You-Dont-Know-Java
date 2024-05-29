public class Question {
    private String question;
    private String answer;
    private int questionValue;

    public Question(String prompt, String right, int money) {
        question = prompt;
        answer = right;
        questionValue = money;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getQuestionValue() {
        return questionValue;
    }


}
