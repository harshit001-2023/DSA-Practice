/*
    Prefix Sum logic
    Input: nums = [1, 2, 3, 4, 5, 6], i = 1, j = 3
    Output: sum = 6


    // Problem: Range Sum Query: Given an array nums,
    answer multiple queries about the sum of elements within a specific range [i, j].
    */

void main() {
    int[] nums = {1,2,3};
    int a = 2, b = 0;

    IO.println(prefixSum(nums, a, b)+" "+prefixSum1(nums,a,b));
}

public static int prefixSum(int[] nums, int a, int b) {
    int n = nums.length;
    int[] prefix = new int[n + 1];

    // Build prefix array
    for(int i = 0; i < n; i++) {
        prefix[i + 1] = prefix[i] + nums[i];
    } // prefix[] = [0, 1, 3, 6, 10, 15, 21]

    // Return sum from a to b (inclusive)
    return prefix[b + 1] - prefix[a];
}

// Alternative Implementation (Without Extra Array):
// This is simpler for single queries but slower for multiple queries.
public static int prefixSum1(int[] nums, int a, int b) {
    int sum = 0;
    for(int i = a; i <= b; i++) {
        sum += nums[i];
    }
    return sum;
}