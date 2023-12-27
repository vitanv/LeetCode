class Solution {
    public int minCost(String colors, int[] neededTime) {
        int answer = 0, left = 0, right = 0;
        while(right < neededTime.length){
            int total = 0, max = 0;
            while(right < neededTime.length && colors.charAt(right) == colors.charAt(left)){
                total += neededTime[right];
                max = Math.max(max, neededTime[right]);
                right++;
            }
            answer += total - max;
            left = right;
        }
        return answer;
    }
}