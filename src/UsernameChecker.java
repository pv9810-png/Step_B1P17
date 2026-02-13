import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class UsernameChecker {
    private ConcurrentHashMap<String, Integer> userMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Integer> attemptFrequency = new ConcurrentHashMap<>();

    public boolean checkAvailability(String username) {
        attemptFrequency.merge(username, 1, Integer::sum);
        return !userMap.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        suggestions.add(username + "1");
        suggestions.add(username + "2");
        suggestions.add(username.replace("_", "."));
        return suggestions;
    }

    public String getMostAttempted() {
        return attemptFrequency.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(e -> e.getKey() + " (" + e.getValue() + " attempts)")
                .orElse("No attempts yet");
    }

    public void register(String username, int userId) {
        userMap.put(username, userId);
    }

    // Main method inside the same file
    public static void main(String[] args) {
        UsernameChecker checker = new UsernameChecker();

        checker.register("john_doe", 1);

        System.out.println(checker.checkAvailability("john_doe"));   // false
        System.out.println(checker.checkAvailability("jane_smith")); // true
        System.out.println(checker.suggestAlternatives("john_doe")); // [john_doe1, john_doe2, john.doe]
        System.out.println(checker.getMostAttempted());              // john_doe (1 attempts)
    }
}
