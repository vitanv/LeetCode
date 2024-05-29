class Solution {
    public int numSteps(String s) {
        int answer = 0, carry = 0;
        for(int i = s.length() - 1; i > 0; i--){
            answer++;
            if(s.charAt(i) - '0' + carry == 1){
                carry = 1;
                answer++;
            } 
        }
        return answer + carry;
    }
}