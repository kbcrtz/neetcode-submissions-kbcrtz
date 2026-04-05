class Solution {
    public int maxProfit(int[] prices) {
        int[] cache = new int[prices.length];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            cache[i] = min;
        }
        for(int i = 0; i < prices.length; i++){
            int profit = prices[i] - cache[i];
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}