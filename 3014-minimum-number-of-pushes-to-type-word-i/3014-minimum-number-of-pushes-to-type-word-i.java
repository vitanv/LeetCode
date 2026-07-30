class Solution {
    public int minimumPushes(String word) {
        int answer = 0, n = word.length();
        for (int i = 0; i < n; i++) {
            answer += i / 8 + 1;
        }
        return answer;
    }
}