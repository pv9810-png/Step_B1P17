package PalindromeApp;

import java.util.Stack;

public class PalindromeUseCase12_2 implements PalindromeUseCase12_1{

    @Override
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                System.out.println("UC12 StackStrategy: Not a palindrome");
                return false;
            }
        }

        System.out.println("UC12 StackStrategy: It is a palindrome");
        return true;
    }
}