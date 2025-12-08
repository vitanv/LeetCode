class Solution {
    public int countTriples(int n) {
        int answer = 0;
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                int c = (int)Math.sqrt(a * a + b * b + 1.0);
                if(c > n) break;
                if(c * c == a * a + b * b) answer++;
            }
        }
        return answer;
    }
}