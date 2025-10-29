class Solution {
    public int smallestNumber(int n) {
        int answer = 1;
        while(answer < n){
            answer = answer * 2 + 1;
        }
        return answer;
    }
}