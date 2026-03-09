package PalindromeApp;

public class PalindromeUseCase13 {

    public static void comparePerformance(String input) {

        long start, end;

        System.out.println("\n========== UC13 Performance Comparison ==========");

        // UC1
        start = System.nanoTime();
        PalindromeUseCase1.welcome();
        end = System.nanoTime();
        System.out.println("UC1 Time: " + (end - start) + " ns");

        // UC2
        start = System.nanoTime();
        PalindromeUseCase2.hardcoded();
        end = System.nanoTime();
        System.out.println("UC2 Time: " + (end - start) + " ns");

        // UC3
        start = System.nanoTime();
        PalindromeUseCase3.looprev();
        end = System.nanoTime();
        System.out.println("UC3 Time: " + (end - start) + " ns");

        // UC4
        start = System.nanoTime();
        PalindromeUseCase4.isPalindromeUsingCharArray(input);
        end = System.nanoTime();
        System.out.println("UC4 Time: " + (end - start) + " ns");

        // UC5
        start = System.nanoTime();
        PalindromeUseCase5.isPalindromeUsingStack(input);
        end = System.nanoTime();
        System.out.println("UC5 Time: " + (end - start) + " ns");

        // UC6
        start = System.nanoTime();
        PalindromeUseCase6.isPalindromeUsingQueueAndStack(input);
        end = System.nanoTime();
        System.out.println("UC6 Time: " + (end - start) + " ns");

        // UC7
        start = System.nanoTime();
        PalindromeUseCase7.isPalindromeUsingDeque(input);
        end = System.nanoTime();
        System.out.println("UC7 Time: " + (end - start) + " ns");

        // UC8
        start = System.nanoTime();
        PalindromeUseCase8.isPalindromeUsingLinkedList(input);
        end = System.nanoTime();
        System.out.println("UC8 Time: " + (end - start) + " ns");

        // UC9
        start = System.nanoTime();
        PalindromeUseCase9.isPalindromeRecursive(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("UC9 Time: " + (end - start) + " ns");

        // UC10
        start = System.nanoTime();
        PalindromeUseCase10.isPalindromeIgnoreSpacesAndCase(input);
        end = System.nanoTime();
        System.out.println("UC10 Time: " + (end - start) + " ns");

        // UC11
        start = System.nanoTime();
        PalindromeUseCase11.checkPalindrome(input);
        end = System.nanoTime();
        System.out.println("UC11 Time: " + (end - start) + " ns");

        // UC12 Strategy Pattern
        PalindromeUseCase12_4 context = new PalindromeUseCase12_4();

        start = System.nanoTime();
        context.setStrategy(new PalindromeUseCase12_2());
        context.execute(input);
        end = System.nanoTime();
        System.out.println("UC12 Stack Strategy Time: " + (end - start) + " ns");

        start = System.nanoTime();
        context.setStrategy(new PalindromeUseCase12_3());
        context.execute(input);
        end = System.nanoTime();
        System.out.println("UC12 Deque Strategy Time: " + (end - start) + " ns");

        System.out.println("==================================================");
    }
}