class Solution {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            minimum = Math.min(minimum, price);
            profit = Math.max(profit, price - minimum);
        }
        return profit;
    }
}
// Time: O(n) | Space: O(1)
