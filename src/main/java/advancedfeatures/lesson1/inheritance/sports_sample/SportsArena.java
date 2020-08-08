package advancedfeatures.lesson1.inheritance.sports_sample;

public class SportsArena {

    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[4];

        sportsmen[0] = new BasketballPlayer();
        sportsmen[1] = new FootballPlayer();
        sportsmen[2] = new Runner();
        sportsmen[3] = new Thrower();
//        sportsmen[4] = new Sportsman();

        for (Sportsman sportsman : sportsmen) {
            sportsman.doSports();
        }

    }

}
