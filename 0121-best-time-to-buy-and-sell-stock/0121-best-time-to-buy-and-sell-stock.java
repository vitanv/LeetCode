class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], answer = 0;
        for(int i = 1; i < prices.length; i++){
            answer = Math.max(answer, prices[i] - min);
            if(prices[i] < min) min = prices[i];
        }
        return answer;
    }
}