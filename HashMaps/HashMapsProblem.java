import java.util.HashMap;
import java.util.Scanner;

public class HashMapsProblem{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Integer, String> map = new HashMap<>();
    System.out.println("Enter Hash Map Element as Integer, String");
    while(sc.hasNextInt()){
        int num = sc.nextInt();
        String string = sc.next();
        map.put(num, string);
    }

    // The keys are Integers, so our loop variable must be an Integer
    for (int key : map.keySet()) {
        // Inside the loop, we use that 'key' to get the value
        String value = map.get(key);
        System.out.println("Key: " + key + ", Value: " + value);
    }

    System.out.println(map);

}
}