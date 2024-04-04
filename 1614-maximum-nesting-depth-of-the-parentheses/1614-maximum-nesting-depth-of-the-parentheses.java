class Solution {
    public int maxDepth(String s) {
        int curr = 0, answer = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                curr++;
            }else if(c == ')'){
                curr--;
            }
            answer = Math.max(answer, curr);
            
        }
        return answer;
    }
}