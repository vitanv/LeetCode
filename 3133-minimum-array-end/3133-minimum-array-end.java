class Solution {
    public long minEnd(int n, int x) {
        long answer = x;
        while(--n > 0){
            answer = (answer + 1) | x;
        }
        return answer;
    }
}