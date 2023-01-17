class Solution {
    public int minFlipsMonoIncr(String s) {
        int count = 0, answer = 0;
        for(char c : s.toCharArray()){
            if(c == '0') count++;
        }
        answer = count;
        for(char c : s.toCharArray()){
            if(c == '0'){
                count--;
                answer = Math.min(count, answer);
            }else{
                count++;
            }
        }
        return answer;
    }
}