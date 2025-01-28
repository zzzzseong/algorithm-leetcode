class Solution {
    public int maxProfit(int[] prices) {
        
        int answer = 0;
        int minPrice = prices[0];

        int n = prices.length;
        for(int i=1; i<n-1; i++) {
            int price = prices[i];
            
            /* if - price[i]가 min보다 작다면 */
            /* min을 price[i]로 바꾼다 */
            minPrice = Math.min(minPrice, price);

            /* if - price[i]가 min 보다 크다면 */
            /* price[i+1]이 price[i]보다 크거나 같다면 > 판매하지 않는다 */
            /* price[i+1]이 price[i]보다 작다면 > 판매한다 > answer에 price[i]-min을 더한다 > min을 price[i+1]로 세팅한다 */
            if(price > minPrice && prices[i+1] < price) {
                answer += price - minPrice;
                minPrice = prices[i+1];
            }
        }

        /* 마지막날 주식 판매 */
        if(prices[n-1] > minPrice) answer += prices[n-1]-minPrice;

        return answer;
    }
}