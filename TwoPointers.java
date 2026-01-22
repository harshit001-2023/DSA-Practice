/*
* Two Sum II : find two numbers in a sorted array that add to a target value.
* Return their indices.
* Input: nums = [1, 2, 3, 4, 6], target = 6
* Output: [1, 3] (indices of 2 and 4)
* */

void main() {
    int[] nums = {1, 2, 3, 4, 6};
    int target = 6;

    IO.println(Arrays.toString(TwoPointers(nums, target)));
}

public static int[] TwoPointers(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
            // Return the indices (not values)
            return new int[]{left, right};
        } else if (sum < target) {
            // Sum too small, move left pointer right
            left++;
        } else {
            // Sum too large, move right pointer left
            right--;
        }
    }

    // Return empty array or null if no pair found
    return new int[0]; // or return null;
}