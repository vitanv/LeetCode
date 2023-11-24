class Solution {
    public int maxCoins(int[] piles) {
        int left = 0, right = piles.length - 2, answer = 0;
        Arrays.sort(piles);
        while(left < right){
            answer += piles[right];
            left++;
            right -= 2;
        }
        return answer;
    }
}