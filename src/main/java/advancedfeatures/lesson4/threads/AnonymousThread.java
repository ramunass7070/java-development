package advancedfeatures.lesson4.threads;

public class AnonymousThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("this is not a main thread");
                    }
                }
        );

        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("this is another thread");
        });

        t2.start();

        new Thread(() -> {
            System.out.println("short definition of thread");
        }).start();

        RunnableThing runnableThing = new RunnableThing();

        Thread t3 = new Thread(runnableThing);
        t3.start();
    }
}
