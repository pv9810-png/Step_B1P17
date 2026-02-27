package PalindromeApp;

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeUseCase7 {

    public static boolean isPalindromeUsingDeque(String input) {

        Deque<Character> deque = new ArrayDeque<>();
        System.out.println("Use Case 7: Using Dequeue");


        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Remove first & last and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                System.out.println("Result: Not a palindrome");
                return false;
            }
        }

        System.out.println("Result: It is a palindrome");
        return true;
    }
}