class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int answer = 0, left = 0, right = tokens.length - 1;
        Arrays.sort(tokens);
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                answer++;
                left++;
            }else if(left < right && answer > 0){
                power += tokens[right];
                answer--;
                right--;
            }else{
                return answer;
            }
        }
        return answer;
    }
}