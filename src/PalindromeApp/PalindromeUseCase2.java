package PalindromeApp;

public class PalindromeUseCase2 {

    public static void hardcoded(){

        String input = "madam";

        System.out.println("Use Case 2: Hardcoded Palindrome Check");
        System.out.println("Input String: " + input);

        boolean isPalindrome = PalindromeChecker.isPalindromeBasic(input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}