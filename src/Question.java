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

    public void checkQuestion(Player player, String playerAnswer) {
        if (answer.equals(playerAnswer)) {
            //play sound effect, visual effect, and voice clip if necessary
            player.setMoney(player.getMoney() + questionValue);
        }
        else {
            player.setMoney(player.getMoney() - questionValue);
        }
    }
}
