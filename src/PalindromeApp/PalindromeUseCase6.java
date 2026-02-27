package PalindromeApp;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeUseCase6 {

    public static boolean isPalindromeUsingQueueAndStack(String input) {

        System.out.println("Use Case 6:Using Queue and Stack");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Compare dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                System.out.println("Result: Not a palindrome");
                return false;
            }
        }

        System.out.println("Result: It is a palindrome");
        return true;
    }
}