package advancedfeatures.lesson3.collection_samples;

import java.util.LinkedList;
import java.util.Queue;

public class Queuex {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Marry");
        queue.add("Sue");
        queue.add("Tim");
        queue.add("Smith");
        queue.add("Zith");
        queue.add("Agness");

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue);


//        System.out.println(queue.remove()); // jei queue is empty, meta excpetion
//        System.out.println(queue);

        String toProcess = queue.remove();

        System.out.println(queue);

        toProcess = queue.poll();
        queue.offer("John");

        for (String name : queue) {
            System.out.println(name);
        }


    }
}
