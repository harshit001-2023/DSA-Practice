import java.util.Arrays;

public class MaxArrayElement {
    public static void main(String[] ags){
        int[] arr = {1, 2, 21,8, 10, 44, 2, 30};

        Arrays.sort(arr);
        System.out.println("The greatest number in he aa is " +arr[arr.length - 1]);
    }
}
