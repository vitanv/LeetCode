class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int answer = 0;
        Arrays.sort(costs);
        for(int cost : costs){
            if(coins - cost < 0) break;
            coins -= cost;
            answer++;
        }
        return answer;
    }
}