package advancedfeatures.lesson3.collection_samples;

import java.util.Stack;

public class Stackx {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        stack.push(7);
        stack.push(8);
        stack.push(33);
        stack.push(35);
        stack.push(40);
        stack.push(440);
        stack.push(4110);
        stack.push(15);

        System.out.println(stack);

        System.out.println(stack.peek()); //gives last element (next to be poped) 15
        System.out.println(stack.pop()); // 15
        System.out.println(stack);

        int searched = 440;
        boolean contains = stack.contains(searched);

        if (contains) {
            int position = stack.search(searched);
            System.out.println(searched + " found at " + position);
        }
    }

}