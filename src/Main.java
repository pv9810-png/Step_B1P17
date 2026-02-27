import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        usecase1.welcome();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input! Please enter a valid string.");
        } else {
            System.out.println("\nResults:");

            System.out.println("Basic Check: " +
                    PalindromeChecker.isPalindromeBasic(input));

            System.out.println("Ignore Case Check: " +
                    PalindromeChecker.isPalindromeIgnoreCase(input));

            System.out.println("Advanced Check: " +
                    PalindromeChecker.isPalindromeAdvanced(input));
        }

        scanner.close();
    }
}