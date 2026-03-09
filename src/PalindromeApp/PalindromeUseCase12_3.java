package PalindromeApp;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeUseCase12_3 implements PalindromeUseCase12_1 {

    @Override
    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                System.out.println("UC12 DequeStrategy: Not a palindrome");
                return false;
            }
        }

        System.out.println("UC12 DequeStrategy: It is a palindrome");
        return true;
    }
}