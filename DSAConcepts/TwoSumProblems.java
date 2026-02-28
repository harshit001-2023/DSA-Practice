void main() {
    int[] arr = {1,2,8,5,7,6,3,5,4,8};
    int target = 4;
    IO.println(Arrays.toString(arr));


    IO.println(Arrays.toString(TwoPointers(arr, target)));

}

public static int[] TwoPointers(int[] arr, int target) {
    for(int i = 0; i < arr.length; i++){
        for (int j =  i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
}