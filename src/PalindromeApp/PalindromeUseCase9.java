package PalindromeApp;

public class PalindromeUseCase9 {

    public static boolean isPalindromeRecursive(String input, int start, int end) {

        // Base condition (VERY IMPORTANT)
        if (start >= end) {
            System.out.println("UC9 Result: It is a palindrome");
            return true;
        }

        // Compare characters
        if (input.charAt(start) != input.charAt(end)) {
            System.out.println("UC9 Result: Not a palindrome");
            return false;
        }

        // Recursive call with updated indices
        return isPalindromeRecursive(input, start + 1, end - 1);
    }
}