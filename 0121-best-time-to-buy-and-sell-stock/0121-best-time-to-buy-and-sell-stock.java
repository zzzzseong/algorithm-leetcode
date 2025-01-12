class Solution {
    public int maxProfit(int[] prices) {

        int idx = 0, max = 0;
        for(int i=1; i<prices.length; i++) {
            int price = prices[i]-prices[idx];

            if(price < 0) idx = i;

            max = Math.max(max, price);
        }

        return max;
    }
}