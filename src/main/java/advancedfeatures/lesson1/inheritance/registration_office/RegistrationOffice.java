package advancedfeatures.lesson1.inheritance.registration_office;

public class RegistrationOffice {

    public static void main(String[] args) {

        Worker worker = new Worker("John Smith", "987-asd-ee78");

        Human human = new Human();

        human.move();

        worker.move();

        worker.work();

        System.out.println("=====================");

        Human workingHuman = new Worker("Tom Black", "785-64s-888");

        workingHuman.move();

        if (worker instanceof Worker) {
            //-------------------------------
            Worker worker1 = (Worker) workingHuman;

            worker1.move();
            //-------------------------------
            ((Worker) workingHuman).work();
        }
    }

}
