package advancedfeatures.lesson4.threads;

public class ResourceManagement {
    static int counter = 0;

    public static void main(String... args) {
        Thread counterIncrease = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
            System.out.println("thread counterIncrease finished "+ counter);
        });

        Thread counterIncrease1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
                counter++;
                        counter--;
            }
            System.out.println("thread counterIncrease1 finished "+ counter);
        });

        counterIncrease.start();
        counterIncrease1.start();

    }
}
