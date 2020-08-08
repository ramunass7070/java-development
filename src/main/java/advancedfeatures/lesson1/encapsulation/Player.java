package advancedfeatures.lesson1.encapsulation;

public class Player {

    private String name;
    private int health;

    public Player(String name) {
        this();
        this.name = name;
        health = 100;
    }

    public Player() {
        name = "new Player";
        health = 100;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health -= damage;
        }
        if (health <= 0) {
            System.out.println("game over");
        }
    }

    public void newPlayer() {
        name = "new Player";
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
