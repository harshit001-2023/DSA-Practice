import java.util.HashMap;

public class FruitStand {
    public static void main(String[] args) {
        // You created the map perfectly
        HashMap<String, Integer> map = new HashMap<>();

        // Your .put() calls were correct
        map.put("Apple", 12);
        map.put("Banana", 24);
        map.put("Coconut", 2);

        // Here's how you get the value and print it
        int appleQuantity = map.get("Apple");
        System.out.println("The quantity of apples is: " + appleQuantity);
    }
}