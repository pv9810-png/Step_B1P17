package PalindromeApp;

import java.util.Stack;

public class PalindromeUseCase5 {

    public static boolean isPalindromeUsingStack(String input) {

        System.out.println("Use Case 5: Converting to Char Arrays");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                System.out.println("Result: Not a palindrome");
                return false;
            }
        }

        System.out.println("Result: It is a palindrome");
        return true;
    }
}