class Solution {
    public int reverseDegree(String s) {
        int answer = 0;
        for(int i = 1; i <= s.length(); i++){
            answer += (26 - (s.charAt(i - 1) - 'a')) * i;
        }
        return answer;
    }
}