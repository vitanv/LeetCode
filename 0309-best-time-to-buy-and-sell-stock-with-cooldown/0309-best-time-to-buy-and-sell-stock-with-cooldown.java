class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int sell = 0, buy = Integer.MIN_VALUE, prevSell = sell, prevBuy = buy;
        for(int price : prices){
            prevBuy = buy;
            buy = Math.max(prevSell - price, buy);
            prevSell = sell;
            sell = Math.max(prevBuy + price, sell); 
        }
        return sell;
    }
}