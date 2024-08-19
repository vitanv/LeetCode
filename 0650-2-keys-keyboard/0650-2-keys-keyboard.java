class Solution {
    public int minSteps(int n) {
        int answer = 0, div = 2;
        while(n > 1){
            while(n % div == 0){
                answer += div;
                n /= div;
            }
            div++;
        }
        return answer;
    }
}