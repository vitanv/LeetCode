class Solution {
    public int integerBreak(int n) {
        if(n <= 3) return n - 1;
        int answer = 1;
        while(n > 4){
            answer *=3;
            n -= 3;
        }
        return answer * n;
    }
}