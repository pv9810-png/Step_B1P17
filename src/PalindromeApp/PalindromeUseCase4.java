package PalindromeApp;

public class PalindromeUseCase4 {

    public static boolean isPalindromeUsingCharArray(String input) {

        System.out.println("Use Case 4: Character array");
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                System.out.println("Result: Not a palindrome");
                return false;
            }
            start++;
            end--;
        }

        System.out.println("Result: It is a palindrome");
        return true;
    }
}