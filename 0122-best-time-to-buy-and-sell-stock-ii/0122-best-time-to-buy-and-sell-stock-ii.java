class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        
        int answer = 0;
        for(int i=1; i<prices.length; i++) {
            int price = prices[i];
            if(i == prices.length-1 && price > minPrice) {
                answer += price-minPrice;
                break;
            }
            
            /* if - price[i]가 min보다 작다면 */
            /* min을 price[i]로 바꾼다 */
            minPrice = Math.min(minPrice, price);

            /* if - price[i]가 min 보다 크다면 */
            /* price[i+1]이 price[i]보다 크거나 같다면 > 판매하지 않는다 */
            /* price[i+1]이 price[i]보다 작다면 > 판매한다 > answer에 price[i]-min을 더한다 > min을 price[i+1]로 세팅한다 */
            if(price > minPrice) {
                int nextPrice = prices[i+1];
                
                // if(nextPrice >= price) //판매하지 않는다.
                if(nextPrice < price) {
                    //판매한다.
                    answer += price - minPrice;
                    minPrice = nextPrice;
                }
                
            }
        }

        return answer;
    }
}