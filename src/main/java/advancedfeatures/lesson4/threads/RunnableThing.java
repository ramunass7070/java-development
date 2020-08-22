package advancedfeatures.lesson4.threads;

public class RunnableThing implements Runnable {

    @Override
    public void run() {
        System.out.println("this is my runnable thing");
    }
}
