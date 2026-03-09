package PalindromeApp;

import java.util.Stack;

public class PalindromeUseCase11 {

    // Public method exposed to other classes
    public static boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                System.out.println("UC11 Result: Not a palindrome");
                return false;
            }
        }

        System.out.println("UC11 Result: It is a palindrome");
        return true;
    }
}