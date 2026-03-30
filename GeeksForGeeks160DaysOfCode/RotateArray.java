/*Rotate Array
Difficulty: MediumAccuracy: 37.06%Submissions: 635K+Points: 4Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
Constraints:
1 <= arr.size(), d <= 105
0 <= arr[i] <= 105

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)*/
void main(){
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int d = 2;
    rotateArr(arr, d);
    rotateArr1(arr, d);
    rotateArr2(arr, d);
}

static void rotateArr(int[] arr, int d) {
    int n = arr.length;
    d = d%n;

    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);

    System.out.println(Arrays.toString(arr));

}

private static void reverse(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

static void rotateArr1(int[] arr, int d) {
    int n = arr.length;
    d = d%n;

    int[] temp = new int[n];

    for(int i = 0; i < n; i++){
        temp[i] = arr[(d+i) % n];
    }

    System.out.println(Arrays.toString(arr));
}

static void rotateArr2(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    int[] temp = new int[n];

    // Copy elements from index d to end into the beginning of temp
    for (int i = 0; i < n - d; i++) {
        temp[i] = arr[d + i];
    }

    // Copy elements from 0 to d-1 to the end of temp
    for (int i = 0; i < d; i++) {
        temp[n - d + i] = arr[i];
    }

    // Copy temp back to original array
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }

    System.out.println(Arrays.toString(arr));
}

static void rotateArr3(int[] arr, int d) {
    int n = arr.length;
    d = d%n;
    int[] temp = new int[n];

    if (n - d >= 0) System.arraycopy(arr, d, temp, 0, n - d);

    if (d >= 0) System.arraycopy(temp, 0, arr, n - d, d);

    System.arraycopy(temp, 0, arr, 0, n);

    System.out.println(Arrays.toString(arr));
}
