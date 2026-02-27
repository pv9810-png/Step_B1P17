package PalindromeApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PalindromeUseCase1.welcome();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean basic = PalindromeChecker.isPalindromeBasic(input);
        boolean ignoreCase = PalindromeChecker.isPalindromeIgnoreCase(input);
        boolean advanced = PalindromeChecker.isPalindromeAdvanced(input);

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input! Please enter a valid string.");
        } else {
            System.out.println("\nResults:");

            System.out.println("Basic Check: " + basic);

            System.out.println("Ignore Case Check: " + ignoreCase);

            System.out.println("Advanced Check: " + advanced);
        }
        if (basic && ignoreCase && advanced) {
            System.out.println("\nFinal Result: It is a PALINDROME ");
        } else {
            System.out.println("\nFinal Result: It is NOT a palindrome");
        }
        System.out.println("======================================");
        PalindromeUseCase2.hardcoded();
        scanner.close();
        System.out.println("======================================");
        PalindromeUseCase3.looprev();
        System.out.println("======================================");
        PalindromeUseCase4.isPalindromeUsingCharArray(input);
        System.out.println("======================================");
        PalindromeUseCase5.isPalindromeUsingStack(input);
        System.out.println("======================================");
        PalindromeUseCase6.isPalindromeUsingQueueAndStack(input);
        System.out.println("======================================");
        PalindromeUseCase7.isPalindromeUsingDeque(input);



    }
}