class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] answer = new int[n];
        answer[0] = pref[0];
        for(int i = 1; i < n; i ++){
            answer[i] = pref[i] ^ pref[i - 1];
        }
        return answer;
    }
}