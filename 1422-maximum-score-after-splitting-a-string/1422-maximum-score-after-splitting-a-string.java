class Solution {
    public int maxScore(String s) {
        int answer = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '1') answer++;
        }
        if(s.charAt(0) == '0') answer++;
        int curr = answer;
        for(int i = 1; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                curr++;
            }else{
                curr--;
            }
            answer = Math.max(answer, curr);
        }
        return answer;
    }
}