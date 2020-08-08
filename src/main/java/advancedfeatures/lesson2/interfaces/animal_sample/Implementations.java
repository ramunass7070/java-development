package advancedfeatures.lesson2.interfaces.animal_sample;

public interface Implementations {

    int STEP_LENGTH = 8;
    float PI = 3.14f;

    void walk();

    // interface galima aprasyti ir metodu implementacijas. defautl metodu nebutina aprasyti klasese, kuriose bus implementintas interface.
    default void breath() {
        System.out.println("\"breath()\" is written in interface Implementations");
    }

    // bei statinius metodus, nors interface pirmine funkcija nera ta. pagrinde turetume tik nurodyti metodus, o implementacijas aprasyti klasese.
    static void drink() {
        System.out.println("\"drink()\" is written in interface Implementations");
    }

}
