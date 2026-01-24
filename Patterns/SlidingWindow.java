static void main() {
    int[] nums = {1, 2, 3, 4, 6};
    int k = 3;
    IO.println(fixedSize(nums, k));
}
public static int fixedSize(int[] nums, int k){
    // Fixed-size window
    int windowSum = 0;
    int n = nums.length - 1, result = 0;
    for (int i = 0; i < n; i++) {
        windowSum += nums[i];
        if (i >= k - 1) {
            // process window
            result = Math.max(result, windowSum);
            windowSum -= nums[i - k + 1];
        }
    }
    return windowSum;
}
/*
public static int variable(int[] nums, int k){
    int windowSum = 0;
    int n = nums.length - 1, result = 0;
    // Variable-size window
    int left = 0;
    for (int right = 0; right < n; right++) {
        // expand window by including nums[right]

        while (window_condition_violated) {
            // shrink window from left
            left++;
        }

        // update result
    }
}
*/
