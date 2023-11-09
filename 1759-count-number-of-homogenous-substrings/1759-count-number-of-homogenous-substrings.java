class Solution {
    public int countHomogenous(String s) {
        int answer = 0, count = 0, mod = 1000000007;
        for(int i = 0; i < s.length(); i++){
            if(i == 0 || s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else{
                count = 1;
            }
            answer =(answer + count) % mod;
        }
        return answer;
    }
}