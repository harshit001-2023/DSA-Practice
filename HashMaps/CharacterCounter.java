import java.util.HashMap;

public class CharacterCounter {

    public static void main(String[] args) {
        String text = "hello world";
        HashMap<Character, Integer> frequencyMap = countCharacters(text);

        System.out.println("Original string: " + text);
        System.out.println("Character counts: " + frequencyMap);
    }

    public static HashMap<Character, Integer> countCharacters(String text) {
        // 1. Create an empty HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // 2. Loop through each character of the string
        for (char character : text.toCharArray()) {

            // This is your logic block!
            if (map.containsKey(character)) {
                // If we've seen it, increment the count
                map.put(character, map.get(character) + 1);
            } else {
                // If it's new, add it with a count of 1
                map.put(character, 1);
            }
        }

        // 3. Return the completed map
        return map;
    }
}