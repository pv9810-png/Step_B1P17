package PalindromeApp;

public class PalindromeUseCase9 {

    public static boolean isPalindromeRecursive(String input,int start, int end) {

        // Base condition
        if (start >= end) {
            System.out.println("UC9 Result: It is a palindrome");
            return true;
        }

        // Compare characters
        if (input.charAt(start) != input.charAt(end)) {
            System.out.println("UC9 Result: Not a palindrome");
            return false;
        }

        // Recursive call
        return PalindromeUseCase9.isPalindromeRecursive(input, 0, input.length() - 1);
    }
}