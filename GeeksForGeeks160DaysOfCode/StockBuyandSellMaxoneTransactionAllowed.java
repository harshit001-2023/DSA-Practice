// Problem Url: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2

// Using Single or One Pass Approach

/*
Stock Buy and Sell – Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 142K+Points: 2Average Time: 10m
Given an array prices[] of non-negative integers, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
Constraint:
1 ≤  prices.size() ≤  105
0 ≤  prices[i] ≤  104

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

void main() {
    int[] prices = {7, 10, 1, 3, 6, 9, 2};
}

public int maxProfit(int[] prices) {
    if (prices == null || prices.length < 2) return 0;

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];  // Track the lowest price seen so far
        } else {
            // Calculate profit if we sell at current price
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
    }

    return maxProfit;
}


/*
// My approach, I was using two pointers approach two solve this problem which was partially correct because
//it was not tracking max value before today seen

    public int maxProfit(int[] prices) {
        // Code here
        if(prices.length < 1) return 0;

        int left = 0, right = prices.length-1;
        int min = 0, max = 0, minIndex = 0, maxIndex = 0;

        while(left < right){
            if(prices[left] < prices[right]){
                min = prices[left];
                minIndex = left;
                right--;
            }else if(prices[left] > prices[right]){
                max = prices[right];
                maxIndex = right;
                left++;
            }
        }

        if(minIndex < maxIndex) {
            return prices[maxIndex] - prices[minIndex];
        }else return 0;
    }
*/