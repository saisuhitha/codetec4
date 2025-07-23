import java.util.*;

public class four {

    public static void main(String[] args) {
        Map<String, List<String>> userPrefs = new HashMap<>();

        userPrefs.put("Alice", Arrays.asList("Apple", "Banana", "Grapes"));
        userPrefs.put("Bob", Arrays.asList("Banana", "Grapes", "Orange"));
        userPrefs.put("Charlie", Arrays.asList("Banana", "Orange", "Pineapple"));

        String targetUser = "Alice";

        Set<String> recommendations = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : userPrefs.entrySet()) {
            if (!entry.getKey().equals(targetUser)) {
                for (String item : entry.getValue()) {
                    if (!userPrefs.get(targetUser).contains(item)) {
                        recommendations.add(item);
                    }
                }
            }
        }

        System.out.println("Recommendations for " + targetUser + ": " + recommendations);
    }
}