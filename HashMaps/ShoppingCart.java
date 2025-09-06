import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Integer> cart = new HashMap<>();
        cart.put("Milk", 2);
        cart.put("Bread", 1);
        cart.put("Apples", 5);

        System.out.println("--- Shopping Cart ---");

        // Loop through each key ("item") in the keySet
        for (String item : cart.keySet()) {
            // Use the key ("item") to get the value (quantity)
            int quantity = cart.get(item);

            // Print in the desired format
            System.out.println("Item: " + item + ", Quantity: " + quantity);
        }
    }
}