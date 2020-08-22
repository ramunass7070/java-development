package advancedfeatures.lesson4.threads;

public class MainThread {
    public static void main(String[] args) {

        ParallelThread parallelThread = new ParallelThread();

        parallelThread.start();

        System.out.println("Hello");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");

            e.printStackTrace();
        }

        System.out.println(" Bye ");


    }
}
