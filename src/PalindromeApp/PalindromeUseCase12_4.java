package PalindromeApp;

public class PalindromeUseCase12_4 {

    private PalindromeUseCase12_1 strategy;

    public void setStrategy(PalindromeUseCase12_1 strategy) {
        this.strategy = strategy;
    }

    public void execute(String input) {
        strategy.checkPalindrome(input);
    }
}