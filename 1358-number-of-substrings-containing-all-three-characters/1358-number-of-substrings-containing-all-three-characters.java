class Solution {
    public int numberOfSubstrings(String s) {
        int answer = 0, n = s.length();
        int[] last = {-1, -1 ,-1};
        for(int i = 0; i < n; i++){
            last[s.charAt(i) - 'a'] = i;
            answer += 1 + Math.min(last[0], Math.min(last[1], last[2]));
        }
        return answer;
    }
}