package advancedfeatures.lesson1.homework.encapsulation.pocket;

public class Pocket {

    private int money;

    private Pocket() {
    }

    public Pocket(int money) {
        this();
        this.money = money;
    }

    public int getMoney() {
        if (money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    public void addMoney(int money) {
        if (money > 0 && money < 3000) {
            setMoney(this.money + money);
        } else if (money > 3000) {
            System.out.printf("I don't have that much space in my pocket! you want to give me %d $\n", money);
        } else if (money <= 0) {
            System.out.printf("It is not a money to put into my pocket! (%d $)\n", money);
        }
    }

    private void setMoney(int money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Pocket{" +
                "money=" + money +
                '}';
    }
}
