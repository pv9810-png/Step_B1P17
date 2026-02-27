package PalindromeApp;

public class PalindromeUseCase3 {

    public static void looprev(){


        String input = "madam";

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Use Case 3: Reverse String with looping Check");
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Compare using equals()
        if (input.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME ");
        } else {
            System.out.println("Result: The string is NOT a palindrome ");
        }
    }
}
