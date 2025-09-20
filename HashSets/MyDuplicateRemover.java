import java.util.ArrayList;
import java.util.HashSet;

public class MyDuplicateRemover {
    public static void main(String[] args) {
        // 1. You created the original list with duplicates
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        // 2. You used a loop and a HashSet to get the unique items
        HashSet<Integer> set = new HashSet<>();
        for (int item : list) {
            set.add(item);
        }

        // 3. You created a new list from the set
        ArrayList<Integer> newList = new ArrayList<>(set);

        // 4. You printed the final list
        System.out.println("List with duplicates removed: " + newList);
    }
}