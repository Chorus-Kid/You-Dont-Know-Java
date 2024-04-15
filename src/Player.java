public class Player {
    private String name;
    private int money;

    public Player(String cookieMaybe) {
        name = cookieMaybe;
        money = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String printPlayer() {
        String playerName = name + ":";
        String amount = "$" + money;
        return playerName + "\n" + amount;
    }
}
