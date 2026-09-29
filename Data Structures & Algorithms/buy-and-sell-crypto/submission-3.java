class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];

            if (curr < min) {
                min = curr;
            } else {
                int diff = curr - min;
                if (diff > profit) {
                    profit = diff;
                }
            }
        }

        return profit;
    }
}