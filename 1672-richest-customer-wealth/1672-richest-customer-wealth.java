class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int money: account){
                sum+= money;
            }
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}