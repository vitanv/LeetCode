class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int answer = 0, total = 0;
        for(int i = satisfaction.length - 1; i>= 0 && satisfaction[i] > -total; i--){
            total += satisfaction[i];
            answer += total;
        }
        return answer;
    }
}