import java.util.HashMap;
import java.util.Map;

public class Exercise12 {
    public static void main(String args[]) {
        String input = "hello world welcome to programming";
        int result = findWordWithMaxRepeatedLetter(input);
        if (result != -1) {
            System.out.println("Word with highest no of repeated letter: " + input.split(" ")[result]);
        } else {
            System.out.println("No word with repeated letters found");
        }
    }

    public static int findWordWithMaxRepeatedLetter(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        String[] words = str.split(" ");
        int maxRepeatedLetters = 0;
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // corrected typo
            int repeatedCount = countRepeatedLetters(word); // corrected typo
            if (repeatedCount > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedCount;
                index = i;
            }
        }
        return index;
    }

    public static int countRepeatedLetters(String word) {
        Map<Character, Integer> letterCountMap = new HashMap<>(); // corrected syntax for Map

        for (char ch : word.toCharArray()) {
            letterCountMap.put(ch, letterCountMap.getOrDefault(ch, 0) + 1);
        }
        int maxCount = 0; // corrected variable name
        for (int count : letterCountMap.values()) {
            if (count > 1 && count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
