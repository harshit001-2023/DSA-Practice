import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {

    public static void main(String[] args) {
        // Create an example list with duplicates
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(4);
        originalList.add(1);

        System.out.println("Original list: " + originalList);

        // Call your method to get the list with unique elements
        List<Integer> uniqueList = removeDuplicates(originalList);

        System.out.println("List with duplicates removed: " + uniqueList);
    }

    /**
     * Takes a List of integers and returns a new List containing only the unique elements.
     * @param listWithDuplicates The original list that might have duplicates.
     * @return A new List with only unique elements.
     */
    public static List<Integer> removeDuplicates(List<Integer> listWithDuplicates) {
        // Step 1: Create a HashSet from the original list.
        // This automatically handles all the duplicate elements for you.
        HashSet<Integer> uniqueSet = new HashSet<>(listWithDuplicates);

        // Step 2: Create a new ArrayList from the HashSet.
        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        return listWithoutDuplicates;
    }
}