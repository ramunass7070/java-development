package advancedfeatures.lesson1.encapsulation;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
//
//        player.newPlayer();
        player.setName("PLayer2");

        System.out.println(player.getName());

        System.out.println(player.getHealth());

        player.takeDamage(120);

        System.out.println(player.getHealth());

    }
}
