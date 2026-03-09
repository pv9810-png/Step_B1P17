package PalindromeApp;

public class PalindromeUseCase10 {

    public static boolean isPalindromeIgnoreSpacesAndCase(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                System.out.println("UC10 Result: Not a palindrome");
                return false;
            }
            start++;
            end--;
        }

        System.out.println("UC10 Result: It is a palindrome");
        return true;
    }
}